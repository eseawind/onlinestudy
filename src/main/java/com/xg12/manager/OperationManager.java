package com.xg12.manager;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.xg12.entity.Operation;
import com.xg12.entity.OperationCriteria;

public interface OperationManager {
	int countByExample(OperationCriteria example);

	int deleteByExample(OperationCriteria example);

	int deleteByPrimaryKey(Integer operationId);

	int insert(Operation record);

	int insertSelective(Operation record);

	List<Operation> selectByExample(OperationCriteria example);

	Operation selectByPrimaryKey(Integer operationId);

	int updateByExampleSelective(@Param("record") Operation record,
			@Param("example") OperationCriteria example);

	int updateByExample(@Param("record") Operation record,
			@Param("example") OperationCriteria example);

	int updateByPrimaryKeySelective(Operation record);

	int updateByPrimaryKey(Operation record);
}