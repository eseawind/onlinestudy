package com.common.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jdk.nashorn.internal.ir.RuntimeNode.Request;

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
	
	/**
	 * 获取请求路径在这个项目中的相对路径
	 * @param request
	 * @return
	 */
	public static String getURI(HttpServletRequest request){
		return request.getRequestURI().replaceAll(request.getContextPath(), "");
	}
}
