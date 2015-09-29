package com.xg12.manager.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xg12.entity.Class;
import com.xg12.entity.ClassCriteria;
import com.xg12.manager.BaseManager;
import com.xg12.manager.ClassManager;

@Service
@Transactional
public class ClassManagerImpl extends BaseManager implements ClassManager {

	public int countByExample(ClassCriteria example) {
		return classDao.countByExample(example);
	}

	public int deleteByExample(ClassCriteria example) {
		return classDao.deleteByExample(example);
	}

	public int deleteByPrimaryKey(Integer classId) {
		return classDao.deleteByPrimaryKey(classId);
	}

	public int insert(Class record) {
		return classDao.insert(record);
	}

	public int insertSelective(Class record) {
		return classDao.insertSelective(record);
	}

	public List<Class> selectByExample(ClassCriteria example) {
		return classDao.selectByExample(example);
	}

	public Class selectByPrimaryKey(Integer classId) {
		return classDao.selectByPrimaryKey(classId);
	}

	public int updateByExampleSelective(Class record, ClassCriteria example) {
		return classDao.updateByExample(record, example);
	}

	public int updateByExample(Class record, ClassCriteria example) {
		return classDao.updateByExample(record, example);
	}

	public int updateByPrimaryKeySelective(Class record) {
		return classDao.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(Class record) {
		return classDao.updateByPrimaryKey(record);
	}
	
}