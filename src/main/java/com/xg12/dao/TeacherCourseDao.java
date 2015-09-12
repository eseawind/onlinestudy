package com.xg12.dao;

import com.xg12.entity.TeacherCourse;
import com.xg12.entity.criteria.TeacherCourseCriteria;

import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
 * --------------------------个人声明-----------------------------
 * 
 * @Project: onlinestudy
 * @File: TeacherCourseDao.java
 * @Date: 2015年9月12日 下午5:28:05
 * @Author: ZHUANGZHIXUAN
 */
public interface TeacherCourseDao {
	int countByExample(TeacherCourseCriteria example);

	int deleteByExample(TeacherCourseCriteria example);

	int insert(TeacherCourse record);

	int insertSelective(TeacherCourse record);

	List<TeacherCourse> selectByExample(TeacherCourseCriteria example);

	int updateByExampleSelective(@Param("record") TeacherCourse record,
			@Param("example") TeacherCourseCriteria example);

	int updateByExample(@Param("record") TeacherCourse record,
			@Param("example") TeacherCourseCriteria example);
}