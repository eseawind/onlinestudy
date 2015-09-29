package com.xg12.manager.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xg12.entity.TopicTopicAnswer;
import com.xg12.entity.TopicTopicAnswerCriteria;
import com.xg12.manager.BaseManager;
import com.xg12.manager.TopicTopicAnswerManager;

@Service
@Transactional
public class TopicTopicAnswerManagerImpl extends BaseManager implements TopicTopicAnswerManager {

	public int countByExample(TopicTopicAnswerCriteria example) {
		return topicTopicAnswerDao.countByExample(example);
	}

	public int deleteByExample(TopicTopicAnswerCriteria example) {
		return topicTopicAnswerDao.deleteByExample(example);
	}

	public int insert(TopicTopicAnswer record) {
		return topicTopicAnswerDao.insert(record);
	}

	public int insertSelective(TopicTopicAnswer record) {
		return topicTopicAnswerDao.insertSelective(record);
	}

	public List<TopicTopicAnswer> selectByExample(TopicTopicAnswerCriteria example) {
		return topicTopicAnswerDao.selectByExample(example);
	}

	public int updateByExampleSelective(TopicTopicAnswer record, TopicTopicAnswerCriteria example) {
		return topicTopicAnswerDao.updateByExample(record, example);
	}

	public int updateByExample(TopicTopicAnswer record, TopicTopicAnswerCriteria example) {
		return topicTopicAnswerDao.updateByExample(record, example);
	}
	
}