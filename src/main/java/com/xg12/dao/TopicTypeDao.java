package com.xg12.dao;

import com.xg12.entity.TopicType;
import com.xg12.entity.criteria.TopicTypeCriteria;

import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
 * --------------------------个人声明-----------------------------
 * 
 * @Project: onlinestudy
 * @File: TopicTypeDao.java
 * @Date: 2015年9月12日 下午5:29:01
 * @Author: ZHUANGZHIXUAN
 */
public interface TopicTypeDao {
	int countByExample(TopicTypeCriteria example);

	int deleteByExample(TopicTypeCriteria example);

	int deleteByPrimaryKey(Integer topicTypeId);

	int insert(TopicType record);

	int insertSelective(TopicType record);

	List<TopicType> selectByExample(TopicTypeCriteria example);

	TopicType selectByPrimaryKey(Integer topicTypeId);

	int updateByExampleSelective(@Param("record") TopicType record,
			@Param("example") TopicTypeCriteria example);

	int updateByExample(@Param("record") TopicType record,
			@Param("example") TopicTypeCriteria example);

	int updateByPrimaryKeySelective(TopicType record);

	int updateByPrimaryKey(TopicType record);
}