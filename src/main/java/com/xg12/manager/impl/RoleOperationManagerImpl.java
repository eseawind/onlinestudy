package com.xg12.manager.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xg12.entity.RoleOperation;
import com.xg12.entity.RoleOperationCriteria;
import com.xg12.manager.BaseManager;
import com.xg12.manager.RoleOperationManager;

@Service
@Transactional
public class RoleOperationManagerImpl extends BaseManager implements RoleOperationManager {

	public int countByExample(RoleOperationCriteria example) {
		return roleOperationDao.countByExample(example);
	}

	public int deleteByExample(RoleOperationCriteria example) {
		return roleOperationDao.deleteByExample(example);
	}

	public int insert(RoleOperation record) {
		return roleOperationDao.insert(record);
	}

	public int insertSelective(RoleOperation record) {
		return roleOperationDao.insertSelective(record);
	}

	public List<RoleOperation> selectByExample(RoleOperationCriteria example) {
		return roleOperationDao.selectByExample(example);
	}

	public int updateByExampleSelective(RoleOperation record, RoleOperationCriteria example) {
		return roleOperationDao.updateByExample(record, example);
	}

	public int updateByExample(RoleOperation record, RoleOperationCriteria example) {
		return roleOperationDao.updateByExample(record, example);
	}

}