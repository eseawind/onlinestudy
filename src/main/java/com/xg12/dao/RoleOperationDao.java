package com.xg12.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.xg12.entity.RoleOperation;
import com.xg12.entity.RoleOperationCriteria;

public interface RoleOperationDao {
	int countByExample(RoleOperationCriteria example);

	int deleteByExample(RoleOperationCriteria example);

	int insert(RoleOperation record);

	int insertSelective(RoleOperation record);

	List<RoleOperation> selectByExample(RoleOperationCriteria example);

	int updateByExampleSelective(@Param("record") RoleOperation record,
			@Param("example") RoleOperationCriteria example);

	int updateByExample(@Param("record") RoleOperation record,
			@Param("example") RoleOperationCriteria example);
}