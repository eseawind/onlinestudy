package com.xg12.dao;

import com.xg12.entity.TopicTopicAnswer;
import com.xg12.entity.criteria.TopicTopicAnswerCriteria;

import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
 * --------------------------个人声明-----------------------------
 * 
 * @Project: onlinestudy
 * @File: TopicTopicAnswerDao.java
 * @Date: 2015年9月12日 下午5:28:51
 * @Author: ZHUANGZHIXUAN
 */
public interface TopicTopicAnswerDao {
	int countByExample(TopicTopicAnswerCriteria example);

	int deleteByExample(TopicTopicAnswerCriteria example);

	int insert(TopicTopicAnswer record);

	int insertSelective(TopicTopicAnswer record);

	List<TopicTopicAnswer> selectByExample(TopicTopicAnswerCriteria example);

	int updateByExampleSelective(@Param("record") TopicTopicAnswer record,
			@Param("example") TopicTopicAnswerCriteria example);

	int updateByExample(@Param("record") TopicTopicAnswer record,
			@Param("example") TopicTopicAnswerCriteria example);
}