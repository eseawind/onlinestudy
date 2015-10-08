package com.xg12.web.login;

import static com.common.util.Constants.JSON_MESSAGE;
import static com.common.util.Constants.JSON_SIGN;
import static com.common.util.Constants.SESSION_USER;

import java.util.Date;
import java.util.HashMap;
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
import com.xg12.entity.User;
import com.xg12.web.BaseController;

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
				responseMap.put(JSON_MESSAGE, "登录成功");
				// 将用户存到session中
				httpSession.setAttribute(SESSION_USER, user);
				logger.info("用户名：{}，登录系统:{}", user.getUsername(), new Date());
			}else{
				responseMap.put(JSON_SIGN, false);
				responseMap.put(JSON_MESSAGE, "用户名或密码错误!");
			}
		}else{
			responseMap.put(JSON_SIGN, false);
			responseMap.put(JSON_MESSAGE, "该用户名不存在！");
		}
		
		// 返回JSON
		WebUtil.returnJson(response, JSONObject.fromObject(responseMap).toString());
	}
	
	@RequestMapping("logout")
	public String logout(HttpSession httpSession){
		// 移除httpSession中的user
		httpSession.removeAttribute(SESSION_USER);
		
		// 返回到登录页面
		return "redirect:/login";
	}

}
