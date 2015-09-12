package com.xg12.dao;

import com.xg12.entity.ExamTopic;
import com.xg12.entity.criteria.ExamTopicCriteria;

import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
--------------------------个人声明-----------------------------
* @Project: onlinestudy
* @File: ExamTopicDao.java
* @Date: 2015年9月12日 下午5:26:54
* @Author: ZHUANGZHIXUAN 
*/
public interface ExamTopicDao {
	int countByExample(ExamTopicCriteria example);

	int deleteByExample(ExamTopicCriteria example);

	int insert(ExamTopic record);

	int insertSelective(ExamTopic record);

	List<ExamTopic> selectByExample(ExamTopicCriteria example);

	int updateByExampleSelective(@Param("record") ExamTopic record,
			@Param("example") ExamTopicCriteria example);

	int updateByExample(@Param("record") ExamTopic record,
			@Param("example") ExamTopicCriteria example);
}