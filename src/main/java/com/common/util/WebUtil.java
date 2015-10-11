package com.common.util;

import java.util.Collection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WebUtil {

	/** 日志 */
	private final static Logger LOGGER = LoggerFactory.getLogger(WebUtil.class);
	
	/**
	 * @param reponse 
	 * @param jsonStr 需要返回的json数据
	 */
	public static void returnJSON(HttpServletResponse response, String jsonStr){
		response.setContentType("application/json;charset=UTF-8");
		try{
			response.getWriter().write(jsonStr);
		} catch(Exception e){
			LOGGER.error("返回json数据发生错误",e);
		}
		
	}
	
	/**
	 * 对转换JSON做封装，考虑更改jar包方便，目前使用JSON-LIB<br>
	 * 将对象转成JSON
	 * @param obj
	 * @return
	 */
	public static String getJSON(Object obj){
		return JSONObject.fromObject(obj).toString();
	}
	
	/**
	 * 对转换JSON做封装，考虑更改jar包方便，目前使用JSON-LIB<br>
	 * 对数据类型进行转成JSON数据
	 * @param obj
	 * @return
	 */
	public static String getJSONFromArray(Class<? extends Collection<?>> obj){
		return JSONArray.fromObject(obj).toString();
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
