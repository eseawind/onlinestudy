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
		
		List<File> childrenFile = FileUtil.getChildrenFile("src/main/java/com/xg12/dao/");
		
		for(File file : childrenFile){
			File renameFile = new File(file.getAbsolutePath().replaceAll("Mapper", "Dao"));
			// rename
			file.renameTo(renameFile);
		}
	}
}
