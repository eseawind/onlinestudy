package com.xg12.manager;

import com.xg12.entity.Section;
import com.xg12.entity.SectionCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SectionManager {
    int countByExample(SectionCriteria example);

    int deleteByExample(SectionCriteria example);

    int deleteByPrimaryKey(Integer sectionId);

    int insert(Section record);

    int insertSelective(Section record);

    List<Section> selectByExample(SectionCriteria example);

    Section selectByPrimaryKey(Integer sectionId);

    int updateByExampleSelective(@Param("record") Section record, @Param("example") SectionCriteria example);

    int updateByExample(@Param("record") Section record, @Param("example") SectionCriteria example);

    int updateByPrimaryKeySelective(Section record);

    int updateByPrimaryKey(Section record);
}