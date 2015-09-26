package com.xg12.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.xg12.entity.Teacher;
import com.xg12.entity.TeacherCriteria;

public interface TeacherDao {
    int countByExample(TeacherCriteria example);

    int deleteByExample(TeacherCriteria example);

    int deleteByPrimaryKey(Integer teacherId);

	int insert(Teacher record);

    int insertSelective(Teacher record);

    List<Teacher> selectByExample(TeacherCriteria example);

    Teacher selectByPrimaryKey(Integer teacherId);

    int updateByExampleSelective(@Param("record") Teacher record, @Param("example") TeacherCriteria example);

    int updateByExample(@Param("record") Teacher record, @Param("example") TeacherCriteria example);

    int updateByPrimaryKeySelective(Teacher record);

    int updateByPrimaryKey(Teacher record);
}