package com.xg12.mapper;

import com.xg12.entity.StudentClass;
import com.xg12.entity.StudentClassCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StudentClassMapper {
    int countByExample(StudentClassCriteria example);

    int deleteByExample(StudentClassCriteria example);

    int insert(StudentClass record);

    int insertSelective(StudentClass record);

    List<StudentClass> selectByExample(StudentClassCriteria example);

    int updateByExampleSelective(@Param("record") StudentClass record, @Param("example") StudentClassCriteria example);

    int updateByExample(@Param("record") StudentClass record, @Param("example") StudentClassCriteria example);
}