package com.xg12.manager.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xg12.entity.CourseExam;
import com.xg12.entity.CourseExamCriteria;
import com.xg12.manager.BaseManager;
import com.xg12.manager.CourseExamManager;
@Service
@Transactional
public class CourseExamManagerImpl extends BaseManager implements CourseExamManager {

	public int countByExample(CourseExamCriteria example) {
		return courseExamDao.countByExample(example);
	}

	public int deleteByExample(CourseExamCriteria example) {
		return courseExamDao.deleteByExample(example);
	}

	public int insert(CourseExam record) {
		return courseExamDao.insert(record);
	}

	public int insertSelective(CourseExam record) {
		return courseExamDao.insertSelective(record);
	}

	public List<CourseExam> selectByExample(CourseExamCriteria example) {
		return courseExamDao.selectByExample(example);
	}

	public int updateByExampleSelective(CourseExam record,
			CourseExamCriteria example) {
		return courseExamDao.updateByExampleSelective(record, example);
	}

	public int updateByExample(CourseExam record, CourseExamCriteria example) {
		return courseExamDao.updateByExample(record, example);
	}
}