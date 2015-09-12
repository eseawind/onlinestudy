package com.xg12.dao;

import com.xg12.entity.ClassCourse;
import com.xg12.entity.criteria.ClassCourseCriteria;

import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
--------------------------个人声明-----------------------------
* @Project: onlinestudy
* @File: ClassCourseDao.java
* @Date: 2015年9月12日 下午5:26:19
* @Author: ZHUANGZHIXUAN 
*/
public interface ClassCourseDao {
	int countByExample(ClassCourseCriteria example);

	int deleteByExample(ClassCourseCriteria example);

	int insert(ClassCourse record);

	int insertSelective(ClassCourse record);

	List<ClassCourse> selectByExample(ClassCourseCriteria example);

	int updateByExampleSelective(@Param("record") ClassCourse record,
			@Param("example") ClassCourseCriteria example);

	int updateByExample(@Param("record") ClassCourse record,
			@Param("example") ClassCourseCriteria example);
}