package com.xg12.test.manager;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.xg12.entity.User;

public class TestUserManager extends TestBaseManager{
	
	/** 日志 */
	private final Logger logger = LoggerFactory.getLogger(getClass());
	
	@Test
	public void testUpdate(){
		logger.debug("Hello, Wolrd!");
		User user = userManager.selectByPrimaryKey(1);
		user.setUsername("zzx");
		userManager.updateByPrimaryKey(user);
	}
	
	@Test
	public void testSaveUser(){
		logger.debug("test save user");
		User user = new User();
		user.setUsername("zzx");
		user.setPassword("zzx");
		userManager.insert(user);
	}
	
	@Test
	public void testSelectUser(){
		User user = userManager.getUniqueUserByUserName("zzx");
		System.out.println(user);
		logger.info("user info:{}", user);
	}
	
}
