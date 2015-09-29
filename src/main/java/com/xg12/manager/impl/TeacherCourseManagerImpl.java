package com.xg12.manager.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xg12.entity.TeacherCourse;
import com.xg12.entity.TeacherCourseCriteria;
import com.xg12.manager.BaseManager;
import com.xg12.manager.TeacherCourseManager;

@Service
@Transactional
public class TeacherCourseManagerImpl extends BaseManager implements TeacherCourseManager {

	public int countByExample(TeacherCourseCriteria example) {
		return teacherCourseDao.countByExample(example);
	}

	public int deleteByExample(TeacherCourseCriteria example) {
		return teacherCourseDao.deleteByExample(example);
	}

	public int insert(TeacherCourse record) {
		return teacherCourseDao.insert(record);
	}

	public int insertSelective(TeacherCourse record) {
		return teacherCourseDao.insertSelective(record);
	}

	public List<TeacherCourse> selectByExample(TeacherCourseCriteria example) {
		return teacherCourseDao.selectByExample(example);
	}

	public int updateByExampleSelective(TeacherCourse record, TeacherCourseCriteria example) {
		return teacherCourseDao.updateByExample(record, example);
	}

	public int updateByExample(TeacherCourse record, TeacherCourseCriteria example) {
		return teacherCourseDao.updateByExample(record, example);
	}

}