package com.xg12.web.manager;

import static com.common.util.WebUtil.getJSON;
import static com.common.util.WebUtil.returnJSON;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.xg12.entity.User;
import com.xg12.web.BaseController;

/**
 * @Project: onlinestudy
 * @File: UserController.java
 * @Date: 2015年10月11日下午2:08:44
 * @Author: ZHUANGZHIXUAN
 */
@Controller
public class UserController extends BaseController{
	
	/** 日志 */
	public final Logger logger = LoggerFactory.getLogger(getClass());
	
	@RequestMapping(value="/user/all", method=RequestMethod.GET)
	public String listUser(ModelMap modelMap){
		// 获取所有的用户
		List<User> userList = userManager.selectByExample(null);
		modelMap.put("userList", userList);
		return "/manager/allUser";
	}
	
	@RequestMapping(value="/user/{userId}", method=RequestMethod.GET)
	public void user(@PathVariable("userId")Integer userId){
		
	}
	
	/**
	 * 确定该用户名是否存在
	 * @param username
	 */
	@RequestMapping(value="/user/username/{username}", method=RequestMethod.POST)
	public void checkUserNameIsExist(@PathVariable("username")String username, HttpServletResponse response){
		
		logger.debug("确认是否有该用户名：{}", username);
		
		if(StringUtils.isEmpty(username)){
			Map<String, Object> responseMap = getBaseResponseMap(false, "用户名不能为空！");
			
			returnJSON(response, getJSON(responseMap));
			return;
		}
		
		if(userManager.checkUsernameIsExist(username)){
			Map<String, Object> responseMap = getBaseResponseMap(false, "该用户名已经被占用!");
			
			returnJSON(response, getJSON(responseMap));
			return;
		}else{
			Map<String, Object> responseMap = getBaseResponseMap(true, "该用户名可以使用!");
			
			returnJSON(response, getJSON(responseMap));
			return;
		}
		
		
	}
	
	@RequestMapping(value="/user", method=RequestMethod.POST)
	public String addUser(User user){
		// 对uesr进行规范处理
		user.setUserId(null);
		// 新建用户默认有效
		user.setStatus(true);
		
		userManager.insert(user);
		return "redirect:/user/all";
	}

	@RequestMapping(value="/user/delete/{userId}", method=RequestMethod.DELETE)
	public String deleteUser(@PathVariable("userId")Integer userId){
		logger.info("删除用户,id:{}", userId);
		
		// 删除关联的数据
		userRoleManager.deleteByUserId(userId);
		studentClassManager.delteByUserId(userId);
		teacherCourseManager.deleteByUserId(userId);
		userRoleManager.deleteByUserId(userId);
		
		// 删除user
		userManager.deleteByPrimaryKey(userId);
		
		return "redirect:/user/all";
	}
	
	@RequestMapping(value="user", method=RequestMethod.PUT)
	public String updateUser(User userToUpdate, HttpServletResponse response){
		logger.debug("修改用户的id:{}", userToUpdate.getUserId());
		
		// 获取数据库最新的user
		User user = userManager.selectByPrimaryKey(userToUpdate.getUserId());
		
		user.setUsername(userToUpdate.getUsername());
		user.setName(userToUpdate.getName());
		// 如果为空则不修改
		if(!StringUtils.isEmpty(userToUpdate.getPassword())){
			user.setPassword(userToUpdate.getPassword());
		}
		user.setAddress(userToUpdate.getAddress());
		user.setMail(userToUpdate.getMail());
		user.setMobile(userToUpdate.getMobile());
		user.setSignature(userToUpdate.getSignature());
		
		userManager.updateByPrimaryKey(user);
		
		return "redirect:/user/all";
	}
}
