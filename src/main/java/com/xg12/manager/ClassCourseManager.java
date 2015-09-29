package com.xg12.manager;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.xg12.entity.ClassCourse;
import com.xg12.entity.ClassCourseCriteria;

public interface ClassCourseManager {
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