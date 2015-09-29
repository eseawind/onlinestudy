package com.xg12.manager.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xg12.entity.Teacher;
import com.xg12.entity.TeacherCriteria;
import com.xg12.manager.BaseManager;
import com.xg12.manager.TeacherManager;

@Service
@Transactional
public class TeacherManagerImpl extends BaseManager implements TeacherManager {

	public int countByExample(TeacherCriteria example) {
		return teacherDao.countByExample(example);
	}

	public int deleteByExample(TeacherCriteria example) {
		return teacherDao.deleteByExample(example);
	}

	public int deleteByPrimaryKey(Integer teacherId) {
		return teacherDao.deleteByPrimaryKey(teacherId);
	}

	public int insert(Teacher record) {
		return teacherDao.insert(record);
	}

	public int insertSelective(Teacher record) {
		return teacherDao.insertSelective(record);
	}

	public List<Teacher> selectByExample(TeacherCriteria example) {
		return teacherDao.selectByExample(example);
	}

	public Teacher selectByPrimaryKey(Integer teacherId) {
		return teacherDao.selectByPrimaryKey(teacherId);
	}

	public int updateByExampleSelective(Teacher record, TeacherCriteria example) {
		return teacherDao.updateByExample(record, example);
	}

	public int updateByExample(Teacher record, TeacherCriteria example) {
		return teacherDao.updateByExample(record, example);
	}

	public int updateByPrimaryKeySelective(Teacher record) {
		return teacherDao.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(Teacher record) {
		return teacherDao.updateByPrimaryKey(record);
	}
	
}