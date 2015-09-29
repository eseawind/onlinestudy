package com.xg12.manager.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xg12.entity.Student;
import com.xg12.entity.StudentCriteria;
import com.xg12.manager.BaseManager;
import com.xg12.manager.StudentManager;

@Service
@Transactional
public class StudentManagerImpl extends BaseManager implements StudentManager {

	public int countByExample(StudentCriteria example) {
		return studentDao.countByExample(example);
	}

	public int deleteByExample(StudentCriteria example) {
		return studentDao.deleteByExample(example);
	}

	public int deleteByPrimaryKey(Integer studentId) {
		return studentDao.deleteByPrimaryKey(studentId);
	}

	public int insert(Student record) {
		return studentDao.insert(record);
	}

	public int insertSelective(Student record) {
		return studentDao.insertSelective(record);
	}

	public List<Student> selectByExample(StudentCriteria example) {
		return studentDao.selectByExample(example);
	}

	public Student selectByPrimaryKey(Integer studentId) {
		return studentDao.selectByPrimaryKey(studentId);
	}

	public int updateByExampleSelective(Student record, StudentCriteria example) {
		return studentDao.updateByExample(record, example);
	}

	public int updateByExample(Student record, StudentCriteria example) {
		return studentDao.updateByExample(record, example);
	}

	public int updateByPrimaryKeySelective(Student record) {
		return studentDao.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(Student record) {
		return studentDao.updateByPrimaryKey(record);
	}
	
}