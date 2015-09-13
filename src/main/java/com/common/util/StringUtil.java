package com.common.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
--------------------------个人声明-----------------------------
* @Project: onlinestudy
* @File: StringUtil.java
* @Date: 2015年9月12日 下午5:32:56
* @Author: ZHUANGZHIXUAN 
*/
public class StringUtil {
	
	private final static Logger logger = LoggerFactory.getLogger(StringUtil.class);
	
	/**
	 * 首字母大写
	 * @param str
	 * @return 返回新的字符串，首字母大写
	 */
	public static String capitalize(String str){
		logger.debug("返回首字母大写的字符串");
		//参数判断
		if("".equals(str) || str == null)
			return "";
		return str.substring(0, 1).toUpperCase() + str.substring(1, str.length());
	}
}
