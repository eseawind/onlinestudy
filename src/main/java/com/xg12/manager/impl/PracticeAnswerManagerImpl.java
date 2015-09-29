package com.xg12.manager.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xg12.entity.PracticeAnswer;
import com.xg12.entity.PracticeAnswerCriteria;
import com.xg12.manager.BaseManager;
import com.xg12.manager.PracticeAnswerManager;

@Service
@Transactional
public class PracticeAnswerManagerImpl extends BaseManager implements PracticeAnswerManager {

	public int countByExample(PracticeAnswerCriteria example) {
		return practiceAnswerDao.countByExample(example);
	}

	public int deleteByExample(PracticeAnswerCriteria example) {
		return practiceAnswerDao.deleteByExample(example);
	}

	public int insert(PracticeAnswer record) {
		return practiceAnswerDao.insert(record);
	}

	public int insertSelective(PracticeAnswer record) {
		return practiceAnswerDao.insertSelective(record);
	}

	public List<PracticeAnswer> selectByExample(PracticeAnswerCriteria example) {
		return practiceAnswerDao.selectByExample(example);
	}

	public int updateByExampleSelective(PracticeAnswer record, PracticeAnswerCriteria example) {
		return practiceAnswerDao.updateByExample(record, example);
	}

	public int updateByExample(PracticeAnswer record, PracticeAnswerCriteria example) {
		return practiceAnswerDao.updateByExample(record, example);
	}

}