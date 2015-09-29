package com.xg12.manager.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xg12.entity.Section;
import com.xg12.entity.SectionCriteria;
import com.xg12.manager.BaseManager;
import com.xg12.manager.SectionManager;

@Service
@Transactional
public class SectionManagerImpl extends BaseManager implements SectionManager {

	public int countByExample(SectionCriteria example) {
		return sectionDao.countByExample(example);
	}

	public int deleteByExample(SectionCriteria example) {
		return sectionDao.deleteByExample(example);
	}

	public int deleteByPrimaryKey(Integer sectionId) {
		return sectionDao.deleteByPrimaryKey(sectionId);
	}

	public int insert(Section record) {
		return sectionDao.insert(record);
	}

	public int insertSelective(Section record) {
		return sectionDao.insertSelective(record);
	}

	public List<Section> selectByExample(SectionCriteria example) {
		return sectionDao.selectByExample(example);
	}

	public Section selectByPrimaryKey(Integer sectionId) {
		return sectionDao.selectByPrimaryKey(sectionId);
	}

	public int updateByExampleSelective(Section record, SectionCriteria example) {
		return sectionDao.updateByExample(record, example);
	}

	public int updateByExample(Section record, SectionCriteria example) {
		return sectionDao.updateByExample(record, example);
	}

	public int updateByPrimaryKeySelective(Section record) {
		return sectionDao.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(Section record) {
		return sectionDao.updateByPrimaryKey(record);
	}
	
}