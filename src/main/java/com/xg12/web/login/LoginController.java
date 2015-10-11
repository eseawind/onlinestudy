package com.xg12.web.login;

import static com.common.util.Constants.*;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import net.sf.json.JSONObject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.common.util.WebUtil;
import com.mysql.jdbc.StringUtils;
import com.xg12.entity.Role;
import com.xg12.entity.User;
import com.xg12.web.BaseController;

/**
 * 登录controller
 * @Project: onlinestudy
 * @File: LoginController.java
 * @Date: 2015年10月9日上午10:14:37
 * @Author: ZHUANGZHIXUAN
*/
@Controller
public class LoginController extends BaseController {
	
	/** 日志 */
	private final Logger logger = LoggerFactory.getLogger(getClass());
	
	@RequestMapping(value="login", method=RequestMethod.GET)
	public String toLogin(){
		return "login";
	}
	
	@RequestMapping(value="login", method=RequestMethod.POST)
	public void loginAction(String username, String password, HttpServletResponse response, HttpSession httpSession){
		// 返回的JSON数据
		Map<String, Object> responseMap = new HashMap<String, Object>();
		
		if(StringUtils.isNullOrEmpty(username) || StringUtils.isNullOrEmpty(password)){
			responseMap.put(JSON_SIGN, false);
			responseMap.put(JSON_MESSAGE, "用户名或者密码不能为空！");
		}
		
		// 通过username筛选用户
		User user = userManager.getUniqueUserByUserName(username);
		if(user != null){
			if(password.equals(user.getPassword())){
				responseMap.put(JSON_SIGN, true);
				responseMap.put(JSON_MESSAGE, "登录成功，正在跳转中...");
				// 将用户存到session中
				httpSession.setAttribute(SESSION_USER, user);
				logger.info("用户名：{}，登录系统:{}", user.getUsername(), new Date());
				
				// 获取当前用户的权限信息
				List<Role> roleList = roleManager.getRoleListByUserId(user.getUserId());
				httpSession.setAttribute(SESSION_ROLES, roleList);
			}else{
				responseMap.put(JSON_SIGN, false);
				responseMap.put(JSON_MESSAGE, "用户名或密码错误!");
			}
		}else{
			responseMap.put(JSON_SIGN, false);
			responseMap.put(JSON_MESSAGE, "该用户名不存在！");
		}
		
		// 返回JSON
		WebUtil.returnJSON(response, JSONObject.fromObject(responseMap).toString());
	}
	
	@RequestMapping(value="logout", method=RequestMethod.GET)
	public String logout(HttpSession httpSession){
		// 移除httpSession中的user
		httpSession.removeAttribute(SESSION_USER);
		
		// 返回到登录页面
		return "redirect:/login";
	}

}
