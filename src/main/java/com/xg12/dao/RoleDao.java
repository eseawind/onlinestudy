package com.xg12.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.xg12.entity.Role;
import com.xg12.entity.RoleCriteria;

public interface RoleDao {
	int countByExample(RoleCriteria example);

	int deleteByExample(RoleCriteria example);

	int deleteByPrimaryKey(Integer roleId);

	int insert(Role record);

	int insertSelective(Role record);

	List<Role> selectByExample(RoleCriteria example);

	Role selectByPrimaryKey(Integer roleId);

	int updateByExampleSelective(@Param("record") Role record,
			@Param("example") RoleCriteria example);

	int updateByExample(@Param("record") Role record,
			@Param("example") RoleCriteria example);

	int updateByPrimaryKeySelective(Role record);

	int updateByPrimaryKey(Role record);
}