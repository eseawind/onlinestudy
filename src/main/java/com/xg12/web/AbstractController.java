package com.xg12.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;


/**
--------------------------个人声明-----------------------------
* @Project: onlinestudy
* @File: AbstractController.java
* @Date: 2015年9月12日 下午5:45:51
* @Author: ZHUANGZHIXUAN 
* 抽象的Controller
*/
public abstract class AbstractController {
	
	private final static Logger logger = LoggerFactory.getLogger(AbstractController.class);
	
	@ExceptionHandler
	@ResponseBody
	public String exception(Exception e){
		logger.error("发生未知错误:{}", e.getMessage());
		e.printStackTrace();
		return "error";
	}
}
