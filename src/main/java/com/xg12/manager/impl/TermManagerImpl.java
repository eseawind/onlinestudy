package com.xg12.manager.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xg12.entity.Term;
import com.xg12.entity.TermCriteria;
import com.xg12.manager.BaseManager;
import com.xg12.manager.TermManager;

@Service
@Transactional
public class TermManagerImpl extends BaseManager implements TermManager {

	public int countByExample(TermCriteria example) {
		return termDao.countByExample(example);
	}

	public int deleteByExample(TermCriteria example) {
		return termDao.deleteByExample(example);
	}

	public int deleteByPrimaryKey(Integer termId) {
		return termDao.deleteByPrimaryKey(termId);
	}

	public int insert(Term record) {
		return termDao.insert(record);
	}

	public int insertSelective(Term record) {
		return termDao.insertSelective(record);
	}

	public List<Term> selectByExample(TermCriteria example) {
		return termDao.selectByExample(example);
	}

	public Term selectByPrimaryKey(Integer termId) {
		return termDao.selectByPrimaryKey(termId);
	}

	public int updateByExampleSelective(Term record, TermCriteria example) {
		return termDao.updateByExample(record, example);
	}

	public int updateByExample(Term record, TermCriteria example) {
		return termDao.updateByExample(record, example);
	}

	public int updateByPrimaryKeySelective(Term record) {
		return termDao.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(Term record) {
		return termDao.updateByPrimaryKey(record);
	}
	
}