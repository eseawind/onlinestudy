package com.common.util;

import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WebUtil {

	/** 日志 */
	private final static Logger LOGGER = LoggerFactory.getLogger(WebUtil.class);
	
	/**
	 * @param reponse 
	 * @param jsonStr 需要返回的json数据
	 */
	public static void returnJson(HttpServletResponse response, String jsonStr){
		response.setContentType("application/json;charset=UTF-8");
		try{
			response.getWriter().write(jsonStr);
		} catch(Exception e){
			LOGGER.error("返回json数据发生错误",e);
		}
		
	}
}
