package com.xg12.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController extends AbstractController{
	
	private static Logger logger = LoggerFactory.getLogger(TestController.class);

	@RequestMapping("test")
	@ResponseBody
	public String test() throws Exception{
		logger.info("welcome");
		throw new Exception("bug");
	}
}
