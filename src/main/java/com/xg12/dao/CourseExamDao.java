package com.xg12.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.xg12.entity.CourseExam;
import com.xg12.entity.CourseExamCriteria;

public interface CourseExamDao {
	int countByExample(CourseExamCriteria example);

	int deleteByExample(CourseExamCriteria example);

	int insert(CourseExam record);

	int insertSelective(CourseExam record);

	List<CourseExam> selectByExample(CourseExamCriteria example);

	int updateByExampleSelective(@Param("record") CourseExam record,
			@Param("example") CourseExamCriteria example);

	int updateByExample(@Param("record") CourseExam record,
			@Param("example") CourseExamCriteria example);
}