package com.xg12.dao;

import com.xg12.entity.RoleOperation;
import com.xg12.entity.RoleOperationCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoleOperationMapper {
    int countByExample(RoleOperationCriteria example);

    int deleteByExample(RoleOperationCriteria example);

    int insert(RoleOperation record);

    int insertSelective(RoleOperation record);

    List<RoleOperation> selectByExample(RoleOperationCriteria example);

    int updateByExampleSelective(@Param("record") RoleOperation record, @Param("example") RoleOperationCriteria example);

    int updateByExample(@Param("record") RoleOperation record, @Param("example") RoleOperationCriteria example);
}