package com.xg12.manager.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xg12.entity.UserRole;
import com.xg12.entity.UserRoleCriteria;
import com.xg12.manager.BaseManager;
import com.xg12.manager.UserRoleManager;

@Service
@Transactional
public class UserRoleManagerImpl extends BaseManager implements UserRoleManager {

	public int countByExample(UserRoleCriteria example) {
		return userRoleDao.countByExample(example);
	}

	public int deleteByExample(UserRoleCriteria example) {
		return userRoleDao.deleteByExample(example);
	}

	public int insert(UserRole record) {
		return userRoleDao.insert(record);
	}

	public int insertSelective(UserRole record) {
		return userRoleDao.insertSelective(record);
	}

	public List<UserRole> selectByExample(UserRoleCriteria example) {
		return userRoleDao.selectByExample(example);
	}

	public int updateByExampleSelective(UserRole record, UserRoleCriteria example) {
		return userRoleDao.updateByExample(record, example);
	}

	public int updateByExample(UserRole record, UserRoleCriteria example) {
		return userRoleDao.updateByExample(record, example);
	}

}