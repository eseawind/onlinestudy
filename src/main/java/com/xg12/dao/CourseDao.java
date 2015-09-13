package com.xg12.dao;

import com.xg12.entity.Course;
import com.xg12.entity.criteria.CourseCriteria;

import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
--------------------------个人声明-----------------------------
* @Project: onlinestudy
* @File: CourseDao.java
* @Date: 2015年9月12日 下午5:26:41
* @Author: ZHUANGZHIXUAN 
*/
public interface CourseDao {
	int countByExample(CourseCriteria example);

	int deleteByExample(CourseCriteria example);

	int deleteByPrimaryKey(Integer courseId);

	int insert(Course record);

	int insertSelective(Course record);

	List<Course> selectByExample(CourseCriteria example);

	Course selectByPrimaryKey(Integer courseId);

	int updateByExampleSelective(@Param("record") Course record,
			@Param("example") CourseCriteria example);

	int updateByExample(@Param("record") Course record,
			@Param("example") CourseCriteria example);

	int updateByPrimaryKeySelective(Course record);

	int updateByPrimaryKey(Course record);
}