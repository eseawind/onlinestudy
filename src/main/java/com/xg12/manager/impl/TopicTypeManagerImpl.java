package com.xg12.manager.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xg12.entity.TopicType;
import com.xg12.entity.TopicTypeCriteria;
import com.xg12.manager.BaseManager;
import com.xg12.manager.TopicTypeManager;

@Service
@Transactional
public class TopicTypeManagerImpl extends BaseManager implements TopicTypeManager {

	public int countByExample(TopicTypeCriteria example) {
		return topicTypeDao.countByExample(example);
	}

	public int deleteByExample(TopicTypeCriteria example) {
		return topicTypeDao.deleteByExample(example);
	}

	public int deleteByPrimaryKey(Integer topicTypeId) {
		return topicTypeDao.deleteByPrimaryKey(topicTypeId);
	}

	public int insert(TopicType record) {
		return topicTypeDao.insert(record);
	}

	public int insertSelective(TopicType record) {
		return topicTypeDao.insertSelective(record);
	}

	public List<TopicType> selectByExample(TopicTypeCriteria example) {
		return topicTypeDao.selectByExample(example);
	}

	public TopicType selectByPrimaryKey(Integer topicTypeId) {
		return topicTypeDao.selectByPrimaryKey(topicTypeId);
	}

	public int updateByExampleSelective(TopicType record, TopicTypeCriteria example) {
		return topicTypeDao.updateByExample(record, example);
	}

	public int updateByExample(TopicType record, TopicTypeCriteria example) {
		return topicTypeDao.updateByExample(record, example);
	}

	public int updateByPrimaryKeySelective(TopicType record) {
		return topicTypeDao.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(TopicType record) {
		return topicTypeDao.updateByPrimaryKey(record);
	}
	
}