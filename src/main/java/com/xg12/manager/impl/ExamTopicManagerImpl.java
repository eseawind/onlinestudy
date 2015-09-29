package com.xg12.manager.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xg12.entity.ExamTopic;
import com.xg12.entity.ExamTopicCriteria;
import com.xg12.manager.BaseManager;
import com.xg12.manager.ExamTopicManager;

@Service
@Transactional
public class ExamTopicManagerImpl extends BaseManager implements ExamTopicManager {

	public int countByExample(ExamTopicCriteria example) {
		return examTopicDao.countByExample(example);
	}

	public int deleteByExample(ExamTopicCriteria example) {
		return examTopicDao.deleteByExample(example);
	}

	public int insert(ExamTopic record) {
		return examTopicDao.insert(record);
	}

	public int insertSelective(ExamTopic record) {
		return examTopicDao.insertSelective(record);
	}

	public List<ExamTopic> selectByExample(ExamTopicCriteria example) {
		return examTopicDao.selectByExample(example);
	}

	public int updateByExampleSelective(ExamTopic record, ExamTopicCriteria example) {
		return examTopicDao.updateByExample(record, example);
	}

	public int updateByExample(ExamTopic record, ExamTopicCriteria example) {
		return examTopicDao.updateByExample(record, example);
	}

}