package com.xg12.dao;

import com.xg12.entity.Studenclass;
import com.xg12.entity.criteria.StudenclassCriteria;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface StudenclassMapper {
    int countByExample(StudenclassCriteria example);

    int deleteByExample(StudenclassCriteria example);

    int insert(Studenclass record);

    int insertSelective(Studenclass record);

    List<Studenclass> selectByExample(StudenclassCriteria example);

    int updateByExampleSelective(@Param("record") Studenclass record, @Param("example") StudenclassCriteria example);

    int updateByExample(@Param("record") Studenclass record, @Param("example") StudenclassCriteria example);
}