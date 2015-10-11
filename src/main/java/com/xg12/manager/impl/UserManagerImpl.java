package com.xg12.manager.impl;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import com.xg12.entity.User;
import com.xg12.entity.UserCriteria;
import com.xg12.manager.BaseManager;
import com.xg12.manager.UserManager;

/**
 * @Project: onlinestudy
 * @File: UserManagerImpl.java
 * @Date: 2015年9月28日下午8:16:22
 * @Author: ZHUANGZHIXUAN
 */

@Service
@Transactional
public class UserManagerImpl extends BaseManager implements UserManager{

	public int countByExample(UserCriteria example){
		return userDao.countByExample(example);
	}

	public int deleteByExample(UserCriteria example){
		return userDao.deleteByExample(example);
	}

	public int deleteByPrimaryKey(Integer userId){
		return userDao.deleteByPrimaryKey(userId);
	}

	public int insert(User record){
		return userDao.insert(record);
	}

	public int insertSelective(User record){
		return userDao.insert(record);
	}

	public List<User> selectByExample(UserCriteria example){
		return userDao.selectByExample(example);
	}

	public User selectByPrimaryKey(Integer userId){
		return userDao.selectByPrimaryKey(userId);
	}

	public int updateByExampleSelective(@Param("record") User record,
			@Param("example") UserCriteria example){
		return userDao.updateByExample(record, example);
	}

	public int updateByExample(@Param("record") User record,
			@Param("example") UserCriteria example){
		return userDao.updateByExample(record, example);
	}

	public int updateByPrimaryKeySelective(User record){
		return userDao.updateByPrimaryKey(record);
	}

	public int updateByPrimaryKey(User record){
		return userDao.updateByPrimaryKey(record);
	}

	public User getUniqueUserByUserName(String username){
		UserCriteria userCriteria = new UserCriteria();
		userCriteria.setDistinct(true);
		userCriteria.createCriteria().andUsernameEqualTo(username);
		
		// 获取筛选结果
		List<User> userList = userDao.selectByExample(userCriteria);

		// 筛选结果为0，返回null
		if(userList == null || userList.size() == 0)
			return null;
		
		return userList.get(0);
	}

	public boolean checkUsernameIsExist(String username) {
		// 用户名为空认为存在
		if(StringUtils.isEmpty(username)){
			return true;
		}
		
		// 从数据库中数据对应的user判断是否为null
		User user = this.getUniqueUserByUserName(username);
		if(user == null){
			return false;
		}else{
			return true;
		}
	}

}
