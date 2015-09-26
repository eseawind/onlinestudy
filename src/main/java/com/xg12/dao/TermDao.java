package com.xg12.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.xg12.entity.Term;
import com.xg12.entity.TermCriteria;

public interface TermDao {
	int countByExample(TermCriteria example);

	int deleteByExample(TermCriteria example);

	int deleteByPrimaryKey(Integer termId);

	int insert(Term record);

	int insertSelective(Term record);

	List<Term> selectByExample(TermCriteria example);

	Term selectByPrimaryKey(Integer termId);

	int updateByExampleSelective(@Param("record") Term record,
			@Param("example") TermCriteria example);

	int updateByExample(@Param("record") Term record,
			@Param("example") TermCriteria example);

	int updateByPrimaryKeySelective(Term record);

	int updateByPrimaryKey(Term record);
}