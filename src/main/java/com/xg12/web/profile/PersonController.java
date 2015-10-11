package com.xg12.web.profile;

import static com.common.util.Constants.JSON_MESSAGE;
import static com.common.util.Constants.JSON_SIGN;
import static com.common.util.Constants.SESSION_USER;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import net.sf.json.JSONObject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.common.util.WebUtil;
import com.xg12.entity.User;
import com.xg12.web.BaseController;

/**
 * @Project: onlinestudy
 * @File: PersonController.java
 * @Date: 2015年10月10日下午7:40:41
 * @Author: ZHUANGZHIXUAN
 */

@Controller
public class PersonController extends BaseController{
	
	public final Logger logger = LoggerFactory.getLogger(getClass());
	
	@RequestMapping(value="profile/person", method = RequestMethod.GET)
	public void profile(HttpSession httpSession){
		
	}
	
	@RequestMapping(value="/profile/person", method = RequestMethod.POST)
	public void updateProfile(HttpSession httpSession, User userToUpdate, HttpServletResponse response){
		// 获取当前登录的对象
		User user = (User)httpSession.getAttribute(SESSION_USER);
		
		// 获取数据库最新的user
		user = userManager.getUniqueUserByUserName(user.getUsername());
		
		user.setName(userToUpdate.getName());
		// 如果为空则不修改
		if(!StringUtils.isEmpty(userToUpdate.getPassword())){
			user.setPassword(userToUpdate.getPassword());
		}
		
		userManager.updateByPrimaryKey(user);
		
		// 覆盖session中的user
		httpSession.setAttribute(SESSION_USER, user);
		
		Map<String, Object> responseMap = new HashMap<String, Object>();
		responseMap.put(JSON_SIGN, true);
		responseMap.put(JSON_MESSAGE, "修改成功!");
		
		WebUtil.returnJson(response, JSONObject.fromObject(responseMap).toString());
	}
}
