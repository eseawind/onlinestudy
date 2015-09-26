package com.xg12.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.xg12.entity.UserRole;
import com.xg12.entity.UserRoleCriteria;

public interface UserRoleDao {
	int countByExample(UserRoleCriteria example);

	int deleteByExample(UserRoleCriteria example);

	int insert(UserRole record);

	int insertSelective(UserRole record);

	List<UserRole> selectByExample(UserRoleCriteria example);

	int updateByExampleSelective(@Param("record") UserRole record,
			@Param("example") UserRoleCriteria example);

	int updateByExample(@Param("record") UserRole record,
			@Param("example") UserRoleCriteria example);
}