package com.xg12.test.spring;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xg12.manager.UserManager;
import com.xg12.manager.impl.UserManagerImpl;

/**
 * @Project: onlinestudy
 * @File: TestSpring.java
 * @Date: 2015年9月28日下午5:24:10
 * @Author: ZHUANGZHIXUAN
 */
public class TestSpring {
	
	/** logger 日志 */
	private final Logger logger = LoggerFactory.getLogger(getClass());

	/** Spring 容器 */
	private ApplicationContext ctx;
	
	@Before
	public void init(){
		ctx = new ClassPathXmlApplicationContext("classpath:application*.xml");
		logger.debug("Spring 容器：{}", ctx);
	}
	
	@Test
	public void test(){
		UserManager userManager = ctx.getBean(UserManagerImpl.class);
		logger.info("userDao :{}", userManager);
	}

}
