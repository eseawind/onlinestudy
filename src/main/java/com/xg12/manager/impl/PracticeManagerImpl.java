package com.xg12.manager.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xg12.entity.Practice;
import com.xg12.entity.PracticeCriteria;
import com.xg12.manager.BaseManager;
import com.xg12.manager.PracticeManager;

@Service
@Transactional
public class PracticeManagerImpl extends BaseManager implements PracticeManager {

	public int countByExample(PracticeCriteria example) {
		return practiceDao.countByExample(example);
	}

	public int deleteByExample(PracticeCriteria example) {
		return practiceDao.deleteByExample(example);
	}

	public int deleteByPrimaryKey(Integer practiceId) {
		return practiceDao.deleteByPrimaryKey(practiceId);
	}

	public int insert(Practice record) {
		return practiceDao.insert(record);
	}

	public int insertSelective(Practice record) {
		return practiceDao.insertSelective(record);
	}

	public List<Practice> selectByExample(PracticeCriteria example) {
		return practiceDao.selectByExample(example);
	}

	public Practice selectByPrimaryKey(Integer practiceId) {
		return practiceDao.selectByPrimaryKey(practiceId);
	}

	public int updateByExampleSelective(Practice record, PracticeCriteria example) {
		return practiceDao.updateByExample(record, example);
	}

	public int updateByExample(Practice record, PracticeCriteria example) {
		return practiceDao.updateByExample(record, example);
	}

	public int updateByPrimaryKeySelective(Practice record) {
		return practiceDao.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(Practice record) {
		return practiceDao.updateByPrimaryKey(record);
	}
	
}