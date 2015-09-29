package com.xg12.manager.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xg12.entity.Operation;
import com.xg12.entity.OperationCriteria;
import com.xg12.manager.BaseManager;
import com.xg12.manager.OperationManager;

@Service
@Transactional
public class OperationManagerImpl extends BaseManager implements OperationManager {

	public int countByExample(OperationCriteria example) {
		return operationDao.countByExample(example);
	}

	public int deleteByExample(OperationCriteria example) {
		return operationDao.deleteByExample(example);
	}

	public int deleteByPrimaryKey(Integer operationId) {
		return operationDao.deleteByPrimaryKey(operationId);
	}

	public int insert(Operation record) {
		return operationDao.insert(record);
	}

	public int insertSelective(Operation record) {
		return operationDao.insertSelective(record);
	}

	public List<Operation> selectByExample(OperationCriteria example) {
		return operationDao.selectByExample(example);
	}

	public Operation selectByPrimaryKey(Integer operationId) {
		return operationDao.selectByPrimaryKey(operationId);
	}

	public int updateByExampleSelective(Operation record, OperationCriteria example) {
		return operationDao.updateByExample(record, example);
	}

	public int updateByExample(Operation record, OperationCriteria example) {
		return operationDao.updateByExample(record, example);
	}

	public int updateByPrimaryKeySelective(Operation record) {
		return operationDao.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(Operation record) {
		return operationDao.updateByPrimaryKey(record);
	}
	
}