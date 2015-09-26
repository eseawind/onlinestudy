package com.xg12.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.xg12.entity.TopicTopicAnswer;
import com.xg12.entity.TopicTopicAnswerCriteria;

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