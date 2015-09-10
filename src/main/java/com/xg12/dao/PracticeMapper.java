package com.xg12.dao;

import com.xg12.entity.Practice;
import com.xg12.entity.PracticeCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PracticeMapper {
    int countByExample(PracticeCriteria example);

    int deleteByExample(PracticeCriteria example);

    int deleteByPrimaryKey(Integer practiceId);

    int insert(Practice record);

    int insertSelective(Practice record);

    List<Practice> selectByExample(PracticeCriteria example);

    Practice selectByPrimaryKey(Integer practiceId);

    int updateByExampleSelective(@Param("record") Practice record, @Param("example") PracticeCriteria example);

    int updateByExample(@Param("record") Practice record, @Param("example") PracticeCriteria example);

    int updateByPrimaryKeySelective(Practice record);

    int updateByPrimaryKey(Practice record);
}