package com.xg12.manager.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xg12.entity.TopicAnswer;
import com.xg12.entity.TopicAnswerCriteria;
import com.xg12.manager.BaseManager;
import com.xg12.manager.TopicAnswerManager;

@Service
@Transactional
public class TopicAnswerManagerImpl extends BaseManager implements TopicAnswerManager {

	public int countByExample(TopicAnswerCriteria example) {
		return topicAnswerDao.countByExample(example);
	}

	public int deleteByExample(TopicAnswerCriteria example) {
		return topicAnswerDao.deleteByExample(example);
	}

	public int deleteByPrimaryKey(Integer topicAnswerId) {
		return topicAnswerDao.deleteByPrimaryKey(topicAnswerId);
	}

	public int insert(TopicAnswer record) {
		return topicAnswerDao.insert(record);
	}

	public int insertSelective(TopicAnswer record) {
		return topicAnswerDao.insertSelective(record);
	}

	public List<TopicAnswer> selectByExample(TopicAnswerCriteria example) {
		return topicAnswerDao.selectByExample(example);
	}

	public TopicAnswer selectByPrimaryKey(Integer topicAnswerId) {
		return topicAnswerDao.selectByPrimaryKey(topicAnswerId);
	}

	public int updateByExampleSelective(TopicAnswer record, TopicAnswerCriteria example) {
		return topicAnswerDao.updateByExample(record, example);
	}

	public int updateByExample(TopicAnswer record, TopicAnswerCriteria example) {
		return topicAnswerDao.updateByExample(record, example);
	}

	public int updateByPrimaryKeySelective(TopicAnswer record) {
		return topicAnswerDao.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(TopicAnswer record) {
		return topicAnswerDao.updateByPrimaryKey(record);
	}
	
}