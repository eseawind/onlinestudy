package com.xg12.manager.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xg12.entity.Topic;
import com.xg12.entity.TopicCriteria;
import com.xg12.manager.BaseManager;
import com.xg12.manager.TopicManager;

@Service
@Transactional
public class TopicManagerImpl extends BaseManager implements TopicManager {

	public int countByExample(TopicCriteria example) {
		return topicDao.countByExample(example);
	}

	public int deleteByExample(TopicCriteria example) {
		return topicDao.deleteByExample(example);
	}

	public int deleteByPrimaryKey(Integer topicId) {
		return topicDao.deleteByPrimaryKey(topicId);
	}

	public int insert(Topic record) {
		return topicDao.insert(record);
	}

	public int insertSelective(Topic record) {
		return topicDao.insertSelective(record);
	}

	public List<Topic> selectByExample(TopicCriteria example) {
		return topicDao.selectByExample(example);
	}

	public Topic selectByPrimaryKey(Integer topicId) {
		return topicDao.selectByPrimaryKey(topicId);
	}

	public int updateByExampleSelective(Topic record, TopicCriteria example) {
		return topicDao.updateByExample(record, example);
	}

	public int updateByExample(Topic record, TopicCriteria example) {
		return topicDao.updateByExample(record, example);
	}

	public int updateByPrimaryKeySelective(Topic record) {
		return topicDao.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(Topic record) {
		return topicDao.updateByPrimaryKey(record);
	}
	
}