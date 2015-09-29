package com.xg12.manager.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xg12.entity.CourseSection;
import com.xg12.entity.CourseSectionCriteria;
import com.xg12.manager.BaseManager;
import com.xg12.manager.CourseSectionManager;

@Service
@Transactional
public class CourseSectionManagerImpl extends BaseManager implements CourseSectionManager {

	public int countByExample(CourseSectionCriteria example) {
		return courseSectionDao.countByExample(example);
	}

	public int deleteByExample(CourseSectionCriteria example) {
		return courseSectionDao.deleteByExample(example);
	}

	public int insert(CourseSection record) {
		return courseSectionDao.insert(record);
	}

	public int insertSelective(CourseSection record) {
		return courseSectionDao.insertSelective(record);
	}

	public List<CourseSection> selectByExample(CourseSectionCriteria example) {
		return courseSectionDao.selectByExample(example);
	}

	public int updateByExampleSelective(CourseSection record, CourseSectionCriteria example) {
		return courseSectionDao.updateByExample(record, example);
	}

	public int updateByExample(CourseSection record, CourseSectionCriteria example) {
		return courseSectionDao.updateByExample(record, example);
	}

}