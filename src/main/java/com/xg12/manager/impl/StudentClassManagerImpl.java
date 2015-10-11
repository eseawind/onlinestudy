package com.xg12.manager.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xg12.entity.StudentClass;
import com.xg12.entity.StudentClassCriteria;
import com.xg12.manager.BaseManager;
import com.xg12.manager.StudentClassManager;

@Service
@Transactional
public class StudentClassManagerImpl extends BaseManager implements StudentClassManager {

	public int countByExample(StudentClassCriteria example) {
		return studentClassDao.countByExample(example);
	}

	public int deleteByExample(StudentClassCriteria example) {
		return studentClassDao.deleteByExample(example);
	}

	public int insert(StudentClass record) {
		return studentClassDao.insert(record);
	}

	public int insertSelective(StudentClass record) {
		return studentClassDao.insertSelective(record);
	}

	public List<StudentClass> selectByExample(StudentClassCriteria example) {
		return studentClassDao.selectByExample(example);
	}

	public int updateByExampleSelective(StudentClass record, StudentClassCriteria example) {
		return studentClassDao.updateByExample(record, example);
	}

	public int updateByExample(StudentClass record, StudentClassCriteria example) {
		return studentClassDao.updateByExample(record, example);
	}

	public void delteByUserId(Integer userId) {
		StudentClassCriteria example = new StudentClassCriteria	();
		example.createCriteria().andUserIdEqualTo(userId);
		
		studentClassDao.deleteByExample(example);
	}

}