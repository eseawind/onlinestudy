package com.xg12.manager;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.xg12.entity.TeacherCourse;
import com.xg12.entity.TeacherCourseCriteria;

public interface TeacherCourseManager {
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