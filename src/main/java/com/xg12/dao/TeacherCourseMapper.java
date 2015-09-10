package com.xg12.dao;

import com.xg12.entity.TeacherCourse;
import com.xg12.entity.TeacherCourseCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TeacherCourseMapper {
    int countByExample(TeacherCourseCriteria example);

    int deleteByExample(TeacherCourseCriteria example);

    int insert(TeacherCourse record);

    int insertSelective(TeacherCourse record);

    List<TeacherCourse> selectByExample(TeacherCourseCriteria example);

    int updateByExampleSelective(@Param("record") TeacherCourse record, @Param("example") TeacherCourseCriteria example);

    int updateByExample(@Param("record") TeacherCourse record, @Param("example") TeacherCourseCriteria example);
}