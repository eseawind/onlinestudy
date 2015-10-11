package com.xg12.mapper;

import com.xg12.entity.ExamTopic;
import com.xg12.entity.ExamTopicCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExamTopicMapper {
    int countByExample(ExamTopicCriteria example);

    int deleteByExample(ExamTopicCriteria example);

    int insert(ExamTopic record);

    int insertSelective(ExamTopic record);

    List<ExamTopic> selectByExample(ExamTopicCriteria example);

    int updateByExampleSelective(@Param("record") ExamTopic record, @Param("example") ExamTopicCriteria example);

    int updateByExample(@Param("record") ExamTopic record, @Param("example") ExamTopicCriteria example);
}