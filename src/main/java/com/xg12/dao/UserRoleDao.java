package com.xg12.dao;

import com.xg12.entity.UserRole;
import com.xg12.entity.criteria.UserRoleCriteria;

import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
 * --------------------------个人声明-----------------------------
 * 
 * @Project: onlinestudy
 * @File: UserRoleDao.java
 * @Date: 2015年9月12日 下午5:29:07
 * @Author: ZHUANGZHIXUAN
 */
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