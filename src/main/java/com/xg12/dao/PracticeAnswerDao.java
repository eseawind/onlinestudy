package com.xg12.dao;

import com.xg12.entity.PracticeAnswer;
import com.xg12.entity.criteria.PracticeAnswerCriteria;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface PracticeAnswerDao {
    int countByExample(PracticeAnswerCriteria example);

    int deleteByExample(PracticeAnswerCriteria example);

    int insert(PracticeAnswer record);

    int insertSelective(PracticeAnswer record);

    List<PracticeAnswer> selectByExample(PracticeAnswerCriteria example);

    int updateByExampleSelective(@Param("record") PracticeAnswer record, @Param("example") PracticeAnswerCriteria example);

    int updateByExample(@Param("record") PracticeAnswer record, @Param("example") PracticeAnswerCriteria example);
}