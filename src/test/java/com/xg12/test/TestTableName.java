package com.xg12.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

import org.junit.Test;

import com.common.util.StringUtil;


public class TestTableName {
	
	@Test
	public void getTableNameToMyBatisGeneratorConfig(){
		File file = new File("src/test/resources/tables.txt");
		
		FileInputStream fis = null;
		BufferedReader br = null;
		try{
			fis = new FileInputStream(file);
			br = new BufferedReader(new InputStreamReader(fis));
			
			String line = "";
			while((line = br.readLine()) != null){
				StringBuffer sb = new StringBuffer();
				sb.append("<table schema=\"");
				sb.append(line + "\"");
				
				sb.append(" tableName=\"" + line + "\"" + " domainObjectName=\"");
				//转成类名字
				//去掉t_
				String domainName = "";
				//根据_分割，余下的字符串首字母大写
				for(String str1 : line.replaceAll("t_", "").split("_", -1)){
					domainName += StringUtil.capitalize(str1);
				}
				
				sb.append(domainName + "\"/>");
				
//				System.out.println(sb.toString());
				
				
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				if(fis != null)
					fis.close();
				if(br != null)
					br = null;
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
	
	
}
