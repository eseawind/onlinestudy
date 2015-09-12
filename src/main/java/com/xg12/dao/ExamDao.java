package com.xg12.dao;

import com.xg12.entity.Exam;
import com.xg12.entity.criteria.ExamCriteria;

import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
--------------------------个人声明-----------------------------
* @Project: onlinestudy
* @File: ExamDao.java
* @Date: 2015年9月12日 下午5:26:49
* @Author: ZHUANGZHIXUAN 
*/
public interface ExamDao {
	int countByExample(ExamCriteria example);

	int deleteByExample(ExamCriteria example);

	int deleteByPrimaryKey(Integer examId);

	int insert(Exam record);

	int insertSelective(Exam record);

	List<Exam> selectByExample(ExamCriteria example);

	Exam selectByPrimaryKey(Integer examId);

	int updateByExampleSelective(@Param("record") Exam record,
			@Param("example") ExamCriteria example);

	int updateByExample(@Param("record") Exam record,
			@Param("example") ExamCriteria example);

	int updateByPrimaryKeySelective(Exam record);

	int updateByPrimaryKey(Exam record);
}