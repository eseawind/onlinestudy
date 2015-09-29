package com.xg12.manager.impl;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xg12.entity.ClassCourse;
import com.xg12.entity.ClassCourseCriteria;
import com.xg12.manager.BaseManager;
import com.xg12.manager.ClassCourseManager;

@Service
@Transactional
public class ClassCourseManagerImpl extends BaseManager implements ClassCourseManager{
	public int countByExample(ClassCourseCriteria example){
		return classCourseDao.countByExample(example);
	}

	public int deleteByExample(ClassCourseCriteria example){
		return classCourseDao.deleteByExample(example);
	}

	public int insert(ClassCourse record){
		return classCourseDao.insert(record);
	}

	public int insertSelective(ClassCourse record){
		return classCourseDao.insertSelective(record);
	}

	public List<ClassCourse> selectByExample(ClassCourseCriteria example){
		return classCourseDao.selectByExample(example);
	}

	public int updateByExampleSelective(@Param("record") ClassCourse record,
			@Param("example") ClassCourseCriteria example){
		return classCourseDao.updateByExampleSelective(record, example);
	}

	public int updateByExample(@Param("record") ClassCourse record,
			@Param("example") ClassCourseCriteria example){
		return classCourseDao.updateByExample(record, example);
	}
}