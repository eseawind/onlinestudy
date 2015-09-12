package com.xg12.dao;

import com.xg12.entity.Student;
import com.xg12.entity.criteria.StudentCriteria;

import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
 * --------------------------个人声明-----------------------------
 * 
 * @Project: onlinestudy
 * @File: StudentDao.java
 * @Date: 2015年9月12日 下午5:27:50
 * @Author: ZHUANGZHIXUAN
 */
public interface StudentDao {
	int countByExample(StudentCriteria example);

	int deleteByExample(StudentCriteria example);

	int deleteByPrimaryKey(Integer studentId);

	int insert(Student record);

	int insertSelective(Student record);

	List<Student> selectByExample(StudentCriteria example);

	Student selectByPrimaryKey(Integer studentId);

	int updateByExampleSelective(@Param("record") Student record,
			@Param("example") StudentCriteria example);

	int updateByExample(@Param("record") Student record,
			@Param("example") StudentCriteria example);

	int updateByPrimaryKeySelective(Student record);

	int updateByPrimaryKey(Student record);
}