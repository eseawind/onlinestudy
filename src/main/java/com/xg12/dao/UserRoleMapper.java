package com.xg12.dao;

import com.xg12.entity.UserRole;
import com.xg12.entity.UserRoleCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserRoleMapper {
    int countByExample(UserRoleCriteria example);

    int deleteByExample(UserRoleCriteria example);

    int insert(UserRole record);

    int insertSelective(UserRole record);

    List<UserRole> selectByExample(UserRoleCriteria example);

    int updateByExampleSelective(@Param("record") UserRole record, @Param("example") UserRoleCriteria example);

    int updateByExample(@Param("record") UserRole record, @Param("example") UserRoleCriteria example);
}