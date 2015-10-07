package com.xg12.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xg12.manager.*;


/**
 * --------------------------个人声明-----------------------------
 * 
 * @Project: onlinestudy
 * @File: AbstractController.java
 * @Date: 2015年9月12日 下午5:45:51
 * @Author: ZHUANGZHIXUAN 抽象的Controller
 */
public abstract class BaseController {

	/** 日志 */
	protected final Logger logger = LoggerFactory.getLogger(BaseController.class);

	/** 访问数据库的Manager */
	@Autowired
	protected ClassCourseManager classCourseManager;
	@Autowired
	protected ClassManager classManager;
	@Autowired
	protected CourseExamManager courseExamManager;
	@Autowired
	protected CourseManager courseManager;
	@Autowired
	protected CourseSectionManager courseSesiontManager;
	@Autowired
	protected ExamManager examManager;
	@Autowired
	protected ExamTopicManager examTopicManager;
	@Autowired
	protected OperationManager operationManager;
	@Autowired
	protected PracticeAnswerManager practiceAnswerManager;
	@Autowired
	protected PracticeManager practiceManager;
	@Autowired
	protected RoleManager roleManager;
	@Autowired
	protected RoleOperationManager roleOperationManager;
	@Autowired
	protected StudentClassManager studentClassManager;
	@Autowired
	protected SectionManager sectionManager;
	@Autowired
	protected StudentManager studentManager;
	@Autowired
	protected TeacherCourseManager teacherCourseManager;
	@Autowired
	protected TeacherManager teacherManager;
	@Autowired
	protected TermManager termManager;
	@Autowired
	protected TopicAnswerManager topicAnswerManager;
	@Autowired
	protected TopicManager topicManager;
	@Autowired
	protected TopicTopicAnswerManager topicTopicAnswerManager;
	@Autowired
	protected TopicTypeManager topicTypeManager;
	@Autowired
	protected UserManager userManager;
	@Autowired
	protected UserRoleManager userRoleManager;

	@ExceptionHandler
	@ResponseBody
	/**
	 * 返回错误提示
	 * @param e
	 * @return
	 */
	public String exception(Exception e) {
		logger.error("发生未知错误:", e);
		return "error";
	}
}
