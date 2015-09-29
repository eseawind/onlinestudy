package com.xg12.web;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xg12.entity.User;

/**
--------------------------个人声明-----------------------------
* @Project: onlinestudy
* @File: TestController.java
* @Date: 2015年9月12日 下午6:09:31
* @Author: ZHUANGZHIXUAN 
*/
@Controller
public class TestController extends AbstractController{
	
	/** 日志 */
	private static Logger logger = LoggerFactory.getLogger(TestController.class);

	@RequestMapping("test")
	@ResponseBody
	public void test(){
		logger.info("welcome");
	}
	
	@RequestMapping("test/bootstrap")
	public String testBootstrap(HttpSession httpSession){
		logger.debug("===============================");
		logger.debug("进入测试bootstrap页面");
		logger.debug("===============================");
		return "test/bootstrap";
	}
	
	@RequestMapping("test/save/user")
	public void testSaveUser(ModelMap modelMap){
		User user = userManager.selectByPrimaryKey(1);
		user.setPassword("lalala");
		userManager.updateByPrimaryKey(user);
		logger.info("userDao :{}", userManager);
		logger.info("test save user");
	}
}
