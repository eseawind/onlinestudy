package com.xg12.dao;

import com.xg12.entity.Teacher;
import com.xg12.entity.criteria.TeacherCriteria;

import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
 * --------------------------个人声明-----------------------------
 * 
 * @Project: onlinestudy
 * @File: TeacherDao.java
 * @Date: 2015年9月12日 下午5:28:10
 * @Author: ZHUANGZHIXUAN
 */
public interface TeacherDao {
	int countByExample(TeacherCriteria example);

	int deleteByExample(TeacherCriteria example);

	int deleteByPrimaryKey(Integer teacherId);

	int insert(Teacher record);

	int insertSelective(Teacher record);

	List<Teacher> selectByExample(TeacherCriteria example);

	Teacher selectByPrimaryKey(Integer teacherId);

	int updateByExampleSelective(@Param("record") Teacher record,
			@Param("example") TeacherCriteria example);

	int updateByExample(@Param("record") Teacher record,
			@Param("example") TeacherCriteria example);

	int updateByPrimaryKeySelective(Teacher record);

	int updateByPrimaryKey(Teacher record);
}