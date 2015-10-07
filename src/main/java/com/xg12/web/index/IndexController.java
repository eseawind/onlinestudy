package com.xg12.web.index;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xg12.web.BaseController;

/**
 * @Project: onlinestudy
 * @File: IndexController.java
 * @Date: 2015年10月6日 下午4:57:58
 * @Author: ZHUANGZHIXUAN 
 */

@Controller
public class IndexController extends BaseController{

	@RequestMapping("index")
	public void index(HttpSession httpSession, ModelMap modelMap){
		
	}
}
