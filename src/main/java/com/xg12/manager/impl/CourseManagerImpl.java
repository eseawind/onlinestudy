package com.xg12.manager.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xg12.entity.Course;
import com.xg12.entity.CourseCriteria;
import com.xg12.manager.BaseManager;
import com.xg12.manager.CourseManager;

@Service
@Transactional
public class CourseManagerImpl extends BaseManager implements CourseManager {

	public int countByExample(CourseCriteria example) {
		return courseDao.countByExample(example);
	}

	public int deleteByExample(CourseCriteria example) {
		return courseDao.deleteByExample(example);
	}

	public int deleteByPrimaryKey(Integer courseId) {
		return courseDao.deleteByPrimaryKey(courseId);
	}

	public int insert(Course record) {
		return courseDao.insert(record);
	}

	public int insertSelective(Course record) {
		return courseDao.insertSelective(record);
	}

	public List<Course> selectByExample(CourseCriteria example) {
		return courseDao.selectByExample(example);
	}

	public Course selectByPrimaryKey(Integer courseId) {
		return courseDao.selectByPrimaryKey(courseId);
	}

	public int updateByExampleSelective(Course record, CourseCriteria example) {
		return courseDao.updateByExample(record, example);
	}

	public int updateByExample(Course record, CourseCriteria example) {
		return courseDao.updateByExample(record, example);
	}

	public int updateByPrimaryKeySelective(Course record) {
		return courseDao.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(Course record) {
		return courseDao.updateByPrimaryKey(record);
	}
	
}