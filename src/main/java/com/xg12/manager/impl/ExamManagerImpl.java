package com.xg12.manager.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xg12.entity.Exam;
import com.xg12.entity.ExamCriteria;
import com.xg12.manager.BaseManager;
import com.xg12.manager.ExamManager;

@Service
@Transactional
public class ExamManagerImpl extends BaseManager implements ExamManager {

	public int countByExample(ExamCriteria example) {
		return examDao.countByExample(example);
	}

	public int deleteByExample(ExamCriteria example) {
		return examDao.deleteByExample(example);
	}

	public int deleteByPrimaryKey(Integer examId) {
		return examDao.deleteByPrimaryKey(examId);
	}

	public int insert(Exam record) {
		return examDao.insert(record);
	}

	public int insertSelective(Exam record) {
		return examDao.insertSelective(record);
	}

	public List<Exam> selectByExample(ExamCriteria example) {
		return examDao.selectByExample(example);
	}

	public Exam selectByPrimaryKey(Integer examId) {
		return examDao.selectByPrimaryKey(examId);
	}

	public int updateByExampleSelective(Exam record, ExamCriteria example) {
		return examDao.updateByExample(record, example);
	}

	public int updateByExample(Exam record, ExamCriteria example) {
		return examDao.updateByExample(record, example);
	}

	public int updateByPrimaryKeySelective(Exam record) {
		return examDao.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(Exam record) {
		return examDao.updateByPrimaryKey(record);
	}
	
}