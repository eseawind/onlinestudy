package com.xg12.dao;

import com.xg12.entity.Class;
import com.xg12.entity.criteria.ClassCriteria;

import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
--------------------------个人声明-----------------------------
* @Project: onlinestudy
* @File: ClassDao.java
* @Date: 2015年9月12日 下午5:26:35
* @Author: ZHUANGZHIXUAN 
*/
public interface ClassDao {
	int countByExample(ClassCriteria example);

	int deleteByExample(ClassCriteria example);

	int deleteByPrimaryKey(Integer classId);

	int insert(Class record);

	int insertSelective(Class record);

	List<Class> selectByExample(ClassCriteria example);

	Class selectByPrimaryKey(Integer classId);

	int updateByExampleSelective(@Param("record") Class record,
			@Param("example") ClassCriteria example);

	int updateByExample(@Param("record") Class record,
			@Param("example") ClassCriteria example);

	int updateByPrimaryKeySelective(Class record);

	int updateByPrimaryKey(Class record);
}