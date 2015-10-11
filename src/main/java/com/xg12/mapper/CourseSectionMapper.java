package com.xg12.mapper;

import com.xg12.entity.CourseSection;
import com.xg12.entity.CourseSectionCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CourseSectionMapper {
    int countByExample(CourseSectionCriteria example);

    int deleteByExample(CourseSectionCriteria example);

    int insert(CourseSection record);

    int insertSelective(CourseSection record);

    List<CourseSection> selectByExample(CourseSectionCriteria example);

    int updateByExampleSelective(@Param("record") CourseSection record, @Param("example") CourseSectionCriteria example);

    int updateByExample(@Param("record") CourseSection record, @Param("example") CourseSectionCriteria example);
}