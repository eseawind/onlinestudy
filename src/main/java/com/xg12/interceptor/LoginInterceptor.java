package com.xg12.interceptor;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.common.util.Constants;
import com.common.util.WebUtil;

/**
 * 登录拦截器
 * 没有登录的用户需要先登录
 * @Project: onlinestudy
 * @File: LoginInterceptor.java
 * @Date: 2015年10月6日 下午9:39:16
 * @Author: ZHUANGZHIXUAN 
 */
public class LoginInterceptor implements HandlerInterceptor{
	
	/** 日志 */
	private final Logger logger = LoggerFactory.getLogger(getClass());
	
	private List<String> excludeUrls;

	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object object, Exception e)
			throws Exception {
		
	}

	public void postHandle(HttpServletRequest request, HttpServletResponse response,
			Object object, ModelAndView modelAndView) throws Exception {
		
	}

	public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
			Object object) throws Exception {
		logger.debug("IP：{} 试图访问：{} 地址", request.getRemoteAddr(), WebUtil.getURI(request));
		// 判断session是否有user对象
		HttpSession httpSession = request.getSession();
		// TODO 对于不进行拦截的链接需要采取另外的方式
		if(!isExclude(request) && 
				httpSession.getAttribute(Constants.SESSION_USER) == null){
			logger.debug("需要先登录,ip：{}", request.getRemoteAddr());
			// 跳转到项目的路径 + 登录路径
			response.sendRedirect(request.getContextPath() + "/login");
			return false;
		};
		return true;
	}
	
	/**
	 * 当前请求路径是否在排除的链接之内
	 * @param request HttpServletRequest 当前的请求
	 * @return
	 */
	public boolean isExclude(HttpServletRequest request){
		// 遍历需要排除的链接
		for(String uri : excludeUrls){
			if(uri.equals(WebUtil.getURI(request))){
				return true;
			}
		}
		return false;
	}

	public List<String> getExcludeUrls() {
		return excludeUrls;
	}

	public void setExcludeUrls(List<String> excludeUrls) {
		this.excludeUrls = excludeUrls;
	}
}
