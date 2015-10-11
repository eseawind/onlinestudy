package com.xg12.manager;

import org.springframework.beans.factory.annotation.Autowired;

import com.xg12.mapper.ClassCourseMapper;
import com.xg12.mapper.ClassMapper;
import com.xg12.mapper.CourseExamMapper;
import com.xg12.mapper.CourseMapper;
import com.xg12.mapper.CourseSectionMapper;
import com.xg12.mapper.ExamMapper;
import com.xg12.mapper.ExamTopicMapper;
import com.xg12.mapper.OperationMapper;
import com.xg12.mapper.PracticeAnswerMapper;
import com.xg12.mapper.PracticeMapper;
import com.xg12.mapper.RoleMapper;
import com.xg12.mapper.RoleOperationMapper;
import com.xg12.mapper.SectionMapper;
import com.xg12.mapper.StudentClassMapper;
import com.xg12.mapper.TeacherCourseMapper;
import com.xg12.mapper.TermMapper;
import com.xg12.mapper.TopicAnswerMapper;
import com.xg12.mapper.TopicMapper;
import com.xg12.mapper.TopicTopicAnswerMapper;
import com.xg12.mapper.TopicTypeMapper;
import com.xg12.mapper.UserMapper;
import com.xg12.mapper.UserRoleMapper;

/**
 * @Project: onlinestudy
 * @File: BaseManager.java
 * @Date: 2015年9月26日下午7:53:48
 * @Author: ZHUANGZHIXUAN
 */
public class BaseManager {
	
	@Autowired
	protected ClassCourseMapper classCourseDao;
	@Autowired
	protected ClassMapper classDao;
	@Autowired
	protected CourseMapper courseDao;
	@Autowired
	protected CourseSectionMapper courseSectionDao;
	@Autowired
	protected CourseExamMapper courseExamDao;
	@Autowired
	protected ExamMapper examDao;
	@Autowired
	protected ExamTopicMapper examTopicDao;
	@Autowired
	protected OperationMapper operationDao;
	@Autowired
	protected PracticeAnswerMapper practiceAnswerDao;
	@Autowired
	protected PracticeMapper practiceDao;
	@Autowired
	protected RoleMapper roleDao;
	@Autowired
	protected RoleOperationMapper roleOperationDao;
	@Autowired
	protected SectionMapper sectionDao;
	@Autowired
	protected StudentClassMapper studentClassDao;
	@Autowired
	protected TeacherCourseMapper teacherCourseDao;
	@Autowired
	protected TermMapper termDao;
	@Autowired
	protected TopicAnswerMapper topicAnswerDao;
	@Autowired
	protected TopicMapper topicDao;
	@Autowired
	protected TopicTopicAnswerMapper topicTopicAnswerDao;
	@Autowired
	protected TopicTypeMapper topicTypeDao;
	@Autowired
	protected UserMapper userDao;
	@Autowired
	protected UserRoleMapper userRoleDao;

}
