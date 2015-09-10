package com.common.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StringUtil {
	
	private final Logger logger = LoggerFactory.getLogger(StringUtil.class);
	
	/**
	 * 首字母大写
	 * @param str
	 * @return 返回新的字符串，首字母大写
	 */
	public static String capitalize(String str){
		//参数判断
		if("".equals(str) || str == null)
			return "";
		return str.substring(0, 1).toUpperCase() + str.substring(1, str.length());
	}
}
