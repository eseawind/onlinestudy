package com.xg12.dao;

import com.xg12.entity.Topic;
import com.xg12.entity.TopicCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TopicMapper {
    int countByExample(TopicCriteria example);

    int deleteByExample(TopicCriteria example);

    int deleteByPrimaryKey(Integer topicId);

    int insert(Topic record);

    int insertSelective(Topic record);

    List<Topic> selectByExample(TopicCriteria example);

    Topic selectByPrimaryKey(Integer topicId);

    int updateByExampleSelective(@Param("record") Topic record, @Param("example") TopicCriteria example);

    int updateByExample(@Param("record") Topic record, @Param("example") TopicCriteria example);

    int updateByPrimaryKeySelective(Topic record);

    int updateByPrimaryKey(Topic record);
}