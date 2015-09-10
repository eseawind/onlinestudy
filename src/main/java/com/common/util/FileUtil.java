package com.common.util;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.common.exception.AppException;

public class FileUtil {
	
	private static Logger logger = LoggerFactory.getLogger(FileUtil.class);
	
	public static String copy(String sourcePath, String destinationPath){
		//判断参数是否为空
		if("".equals(sourcePath) || sourcePath == null || "".equals(destinationPath) || destinationPath == null){
			logger.error("文件路径不能为空！");
			throw new NullPointerException("文件路径不能为空!");
		}
		//获取对应的文件
		File sourceFile = new File(sourcePath);
		File destinationFile = new File(destinationPath);
		
		//判断源路径是否为文件
		if(!sourceFile.isFile()){
			logger.error("源路径不能为文件！");
			throw new AppException("源路径不为文件");
		}	
		
		//判断目标路径是否为文件，如果是目录，则复制源文件的文件名存储
		if(!destinationFile.isFile()){
			try {
				destinationFile.mkdirs();
				destinationFile = new File(destinationFile + "/" + sourceFile.getName());
				destinationFile.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		//获取文件的输入输出流
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			logger.info("获取文件的输入输出流");
			fis = new FileInputStream(sourceFile);
			fos = new FileOutputStream(destinationFile);
			logger.info("开始进行文件的复制");
			//将输入流复制给输出流
			byte[] b = new byte[512];
			int len = 0;
			while((len = fis.read(b)) != -1)
				fos.write(b, 0, len);
		} catch (FileNotFoundException e) {
			logger.error("没有找到文件");
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			//关闭流
			try{
				logger.info("关闭所有流");
				if(fis != null)
					fis.close();
				if(fos != null)
					fos.close();
			}catch (Exception e){
				e.printStackTrace();
			}
		}
		logger.info("文件复制成功，对应的目标地址 为：{}", destinationFile.getAbsolutePath());
		return destinationFile.getAbsolutePath();
	}
	
	public static void readFile(String sourcePath){
		//判断sourcepPath是否为空
		if("".equals(sourcePath) || sourcePath == null){
			logger.error("路径不能为空！");
			throw new AppException("路径不能为空");
		}
		File file = new File(sourcePath);
		//判断该路径是否为文件
		if(!file.isFile()){
			logger.error("找不到对应的文件");
			throw new AppException("找不到对应的路径");
		}
		
		FileInputStream fis = null;
		BufferedReader br = null;
		try{
			logger.info("获取输入流");
			//获取输入流
			fis = new FileInputStream(file);
			br = new BufferedReader(new InputStreamReader(fis));
			
			logger.info("开始读取文件内容");
			//循环输出每一行的信息
			String line = "";
			while((line = br.readLine()) != null){
				logger.info(line);
			}
			logger.info("读取文件结束");
		}catch (Exception e){
			e.printStackTrace();
		}finally{
			logger.info("关闭输入流");
			try{
				if(fis != null)
					fis.close();
			}catch (Exception e){
				e.printStackTrace();
			}
		}
	}
	
	/**
	 * 在目标目录遍历所有文件，获取包含对应后缀名的文件，复制到对应的目录
	 * @param sourcePath 需要检测的目录
	 * @param destinationPath 复制到对应的目录
	 * @param suffix 后缀名
	 */
	public static void copyFileBySuffix(String sourcePath, String destinationPath, String suffix){
		long startTime = System.currentTimeMillis();
		
		if("".equals(sourcePath) || sourcePath == null || "".equals(destinationPath) || destinationPath == null
				|| "".equals(suffix) || suffix == null){
			logger.error("请传入有效的参数");
		}
		
		//获取该目录下的所有子文件
		logger.info("获取{}文件夹下的所有文件", sourcePath);
		List<File> childrenFile = getChildrenFile(sourcePath);
		
		//计数
		int num = 0;
		//遍历所有的子文件
		for(File childFile : childrenFile){
			//如果包含特定的后缀名，则复制改文件到制定的目录下
			if(childFile.getName().contains(suffix)){
				num ++;
				logger.info("复制该格式：{}的文件", suffix);
				copy(childFile.getAbsolutePath(), destinationPath);
			}
		}
		
		long endTime = System.currentTimeMillis();
		logger.info("提取所有特定格式的文件结束，耗时：{}ms,共有{}个的文件", "" + (endTime - startTime), num);
	}
	
	/**
	 * 获取指定路径下包含的后缀名
	 * @param path
	 * @param suffix
	 * @return
	 */
	public static List<File> getChildrenFile(String path, String suffix){
		if("".equals(path) || path == null){
			logger.error("参数不能为空！");
		}
		//创建List用于存储File
		List<File> files = new ArrayList<File>();
		
		//生成File
		File file = new File(path);
		//如果是文件，则直接返回
		if(file.isFile()){
			logger.error("请传入对应的文件夹路径");
			return files;
		}else{//如果是目录则获取所有File，判断是否有文件，有文件存到files中，如果没有递归,直到所有的子路径下没有文件夹
			for(File childFile : file.listFiles()){
				if(childFile.isFile()){
					//判断是否为对应的后缀名
					if(childFile.getName().endsWith(suffix)){
						files.add(childFile);
					}
				}
				if(childFile.isDirectory())
					//递归
					files.addAll(getChildrenFile(childFile.getAbsolutePath()));
			}
			
		}
		return files;
	}
	
	/**
	 * 获取指定路径下的的所有文件
	 * @param path
	 * @return
	 */
	public static List<File> getChildrenFile(String path){
		return getChildrenFile(path, "");
	}
	
	public static String readString(DataInputStream dis) throws IOException {
		byte[] bytes = new byte[50];
		byte b = dis.readByte();
		int i = -1;
		StringBuilder sb = new StringBuilder();
		while (b != 32 && b != 10) {
			i++;
			bytes[i] = b;
			b = dis.readByte();
			if (i == 49) {
				sb.append(new String(bytes));
				i = -1;
				bytes = new byte[50];
			}
		}
		sb.append(new String(bytes, 0, i + 1));
		return sb.toString();
	}
	
	public static void main(String[] args){
//		String path = "D:\\word2vec\\vectors.bin";
//		copy("d:/io/test.txt","e:/io/");
//		readFile("D:\\word2vec\\vectors.bin");
//		copyFileBySuffix("E:/开发资料/java学习", "e:/doc", "doc");
//		
//		System.out.println(path.endsWith("bin"));
	}
}
