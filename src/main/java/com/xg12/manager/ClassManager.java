package com.xg12.manager;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.xg12.entity.Class;
import com.xg12.entity.ClassCriteria;

public interface ClassManager {
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