package com.xg12.dao;

import com.xg12.entity.Topic;
import com.xg12.entity.criteria.TopicCriteria;

import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
 * --------------------------个人声明-----------------------------
 * 
 * @Project: onlinestudy
 * @File: TopicDao.java
 * @Date: 2015年9月12日 下午5:28:41
 * @Author: ZHUANGZHIXUAN
 */
public interface TopicDao {
	int countByExample(TopicCriteria example);

	int deleteByExample(TopicCriteria example);

	int deleteByPrimaryKey(Integer topicId);

	int insert(Topic record);

	int insertSelective(Topic record);

	List<Topic> selectByExample(TopicCriteria example);

	Topic selectByPrimaryKey(Integer topicId);

	int updateByExampleSelective(@Param("record") Topic record,
			@Param("example") TopicCriteria example);

	int updateByExample(@Param("record") Topic record,
			@Param("example") TopicCriteria example);

	int updateByPrimaryKeySelective(Topic record);

	int updateByPrimaryKey(Topic record);
}