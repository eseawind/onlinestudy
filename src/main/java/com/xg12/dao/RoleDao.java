package com.xg12.dao;

import com.xg12.entity.Role;
import com.xg12.entity.criteria.RoleCriteria;

import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
 * --------------------------个人声明-----------------------------
 * 
 * @Project: onlinestudy
 * @File: RoleDao.java
 * @Date: 2015年9月12日 下午5:27:16
 * @Author: ZHUANGZHIXUAN
 */
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