package com.xg12.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.xg12.entity.User;
import com.xg12.entity.UserCriteria;

public interface UserDao {
	int countByExample(UserCriteria example);

	int deleteByExample(UserCriteria example);

	int deleteByPrimaryKey(Integer userId);

	int insert(User record);

	int insertSelective(User record);

	List<User> selectByExample(UserCriteria example);

	User selectByPrimaryKey(Integer userId);

	int updateByExampleSelective(@Param("record") User record,
			@Param("example") UserCriteria example);

	int updateByExample(@Param("record") User record,
			@Param("example") UserCriteria example);

	int updateByPrimaryKeySelective(User record);

	int updateByPrimaryKey(User record);
	
	User getUniqueUserByUserName(String username);
	
	User login(@Param("username")String username, @Param("password")String password);
}