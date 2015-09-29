package com.xg12.test;

import java.io.File;
import java.util.List;

import com.common.util.FileUtil;

/**
 * @Project: onlinestudy
 * @File: TestRename.java
 * @Date: 2015年9月26日下午2:59:11
 * @Author: ZHUANGZHIXUAN
 */
public class TestRename {
	
	public static void main(String[] args){
		
		List<File> childrenFile = FileUtil.getChildrenFile("src/main/java/com/xg12/manager/");
		
		for(File file : childrenFile){
			System.out.println("@Autowired");
			
			String name = file.getName().replaceAll(".java", "");
			
			System.out.print("private " + name + " ");
			name = (name.charAt(0) + "").toLowerCase() + name.substring(1);
			System.out.print(name + ";");
			
			System.out.println();
		}
	}
}
