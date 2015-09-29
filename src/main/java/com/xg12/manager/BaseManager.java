package com.xg12.manager;

import org.springframework.beans.factory.annotation.Autowired;

import com.xg12.dao.ClassCourseDao;
import com.xg12.dao.ClassDao;
import com.xg12.dao.CourseDao;
import com.xg12.dao.CourseExamDao;
import com.xg12.dao.CourseSectionDao;
import com.xg12.dao.ExamDao;
import com.xg12.dao.ExamTopicDao;
import com.xg12.dao.OperationDao;
import com.xg12.dao.PracticeAnswerDao;
import com.xg12.dao.PracticeDao;
import com.xg12.dao.RoleDao;
import com.xg12.dao.RoleOperationDao;
import com.xg12.dao.SectionDao;
import com.xg12.dao.StudentClassDao;
import com.xg12.dao.StudentDao;
import com.xg12.dao.TeacherCourseDao;
import com.xg12.dao.TeacherDao;
import com.xg12.dao.TermDao;
import com.xg12.dao.TopicAnswerDao;
import com.xg12.dao.TopicDao;
import com.xg12.dao.TopicTopicAnswerDao;
import com.xg12.dao.TopicTypeDao;
import com.xg12.dao.UserDao;
import com.xg12.dao.UserRoleDao;

/**
 * @Project: onlinestudy
 * @File: BaseManager.java
 * @Date: 2015年9月26日下午7:53:48
 * @Author: ZHUANGZHIXUAN
 */
public class BaseManager {
	
	@Autowired
	protected ClassCourseDao classCourseDao;
	@Autowired
	protected ClassDao classDao;
	@Autowired
	protected CourseDao courseDao;
	@Autowired
	protected CourseSectionDao courseSectionDao;
	@Autowired
	protected CourseExamDao courseExamDao;
	@Autowired
	protected ExamDao examDao;
	@Autowired
	protected ExamTopicDao examTopicDao;
	@Autowired
	protected OperationDao operationDao;
	@Autowired
	protected PracticeAnswerDao practiceAnswerDao;
	@Autowired
	protected PracticeDao practiceDao;
	@Autowired
	protected RoleDao roleDao;
	@Autowired
	protected RoleOperationDao roleOperationDao;
	@Autowired
	protected SectionDao sectionDao;
	@Autowired
	protected StudentClassDao studentClassDao;
	@Autowired
	protected StudentDao studentDao;
	@Autowired
	protected TeacherCourseDao teacherCourseDao;
	@Autowired
	protected TeacherDao teacherDao;
	@Autowired
	protected TermDao termDao;
	@Autowired
	protected TopicAnswerDao topicAnswerDao;
	@Autowired
	protected TopicDao topicDao;
	@Autowired
	protected TopicTopicAnswerDao topicTopicAnswerDao;
	@Autowired
	protected TopicTypeDao topicTypeDao;
	@Autowired
	protected UserDao userDao;
	@Autowired
	protected UserRoleDao userRoleDao;

}
