package com.xg12.manager.impl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xg12.entity.Role;
import com.xg12.entity.RoleCriteria;
import com.xg12.entity.UserRole;
import com.xg12.entity.UserRoleCriteria;
import com.xg12.manager.BaseManager;
import com.xg12.manager.RoleManager;

@Service
@Transactional
public class RoleManagerImpl extends BaseManager implements RoleManager {

	public int countByExample(RoleCriteria example) {
		return roleDao.countByExample(example);
	}

	public int deleteByExample(RoleCriteria example) {
		return roleDao.deleteByExample(example);
	}

	public int deleteByPrimaryKey(Integer roleId) {
		return roleDao.deleteByPrimaryKey(roleId);
	}

	public int insert(Role record) {
		return roleDao.insert(record);
	}

	public int insertSelective(Role record) {
		return roleDao.insertSelective(record);
	}

	public List<Role> selectByExample(RoleCriteria example) {
		return roleDao.selectByExample(example);
	}

	public Role selectByPrimaryKey(Integer roleId) {
		return roleDao.selectByPrimaryKey(roleId);
	}

	public int updateByExampleSelective(Role record, RoleCriteria example) {
		return roleDao.updateByExample(record, example);
	}

	public int updateByExample(Role record, RoleCriteria example) {
		return roleDao.updateByExample(record, example);
	}

	public int updateByPrimaryKeySelective(Role record) {
		return roleDao.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(Role record) {
		return roleDao.updateByPrimaryKey(record);
	}

	public List<Role> getRoleListByUserId(Integer userId) {
		UserRoleCriteria userRoleCriteria = new UserRoleCriteria();
		userRoleCriteria.createCriteria().andUserIdEqualTo(userId);
		
		List<UserRole> userRoleList = userRoleDao.selectByExample(userRoleCriteria);
		
		// 获取该用户的所有权限
		List<Role> roleList = new ArrayList<Role>();
		for(UserRole userRole :userRoleList){
			roleList.add(roleDao.selectByPrimaryKey(userRole.getRoleId()));
		}
		
		return roleList;
	}
	
}