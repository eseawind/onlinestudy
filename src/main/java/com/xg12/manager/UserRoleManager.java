package com.xg12.manager;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.xg12.entity.UserRole;
import com.xg12.entity.UserRoleCriteria;

public interface UserRoleManager {
	int countByExample(UserRoleCriteria example);

	int deleteByExample(UserRoleCriteria example);

	int insert(UserRole record);

	int insertSelective(UserRole record);

	List<UserRole> selectByExample(UserRoleCriteria example);

	int updateByExampleSelective(@Param("record") UserRole record,
			@Param("example") UserRoleCriteria example);

	int updateByExample(@Param("record") UserRole record,
			@Param("example") UserRoleCriteria example);

	// 删除userId对应的数据
	void deleteByUserId(Integer userId);
}