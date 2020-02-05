package com.sust.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sust.bean.BuildTechnique;
import com.sust.bean.BuildTechniqueExample;
import com.sust.bean.TBuild;
import com.sust.bean.TTechnique;
import com.sust.dao.BuildTechniqueMapper;
import com.sust.service.IBuildTechniqueService;
@Service
public class BuildTechniqueServiceImpl implements IBuildTechniqueService {
	@Autowired
	private BuildTechniqueMapper dao;

	@Override
	public void insertBuildTechnique(BuildTechnique technique) {
		// TODO Auto-generated method stub
		dao.insertSelective(technique);
	}

	@Override
	public void deleteBuildTechniqueById(Integer id) {
		// TODO Auto-generated method stub
		dao.deleteBuildTechniqueByTId(id);
		
	}

	@Override
	public void updateBuildTechnique(BuildTechnique technique) {
		// TODO Auto-generated method stub
		BuildTechniqueExample example = new BuildTechniqueExample();
//		example.createCriteria().andIdEqualTo(technique.getId());
		dao.updateByExampleSelective(technique, example);
		
	}

	@Override
	public BuildTechnique selectById(Integer id) {
		BuildTechniqueExample example = new BuildTechniqueExample();
//		example.createCriteria().andIdEqualTo(id);
		List<BuildTechnique> list = dao.selectByExample(example);
		return list.get(0);

	}

	@Override
	public PageInfo<BuildTechnique> selectAllBuildTechniquePage(int curpage, int row) {
		// TODO Auto-generated method stub
		PageHelper.startPage(curpage,row);
		BuildTechniqueExample example = new BuildTechniqueExample();
//		example.createCriteria().andIdIsNotNull();
		List<BuildTechnique> list = dao.selectByExample(example);
		PageInfo<BuildTechnique> pageInfo = new PageInfo<>(list);
		
		return pageInfo;
	}

	@Override
	public PageInfo<BuildTechnique> selectAllByBuildIdPage(int curPage, int buildId) {
		// TODO Auto-generated method stub
		PageHelper.startPage(curPage,10);
		List<BuildTechnique> list = dao.selectBuildTechniqueByBuildId(buildId);
		/*
		 * for (BuildTechnique buildTechnique : list) { TTechnique techniques =
		 * buildTechnique.getTechniques(); }
		 */
		PageInfo<BuildTechnique> pageInfo = new PageInfo<>(list);
		if (list.size()==0) {
			return null;
		}
		return pageInfo;
	}

	@Override
	public BuildTechnique selectAllByBuildId(int buildId) {
		// TODO Auto-generated method stub
		BuildTechniqueExample example = new BuildTechniqueExample();
		example.createCriteria().andBuildIdEqualTo(buildId);
		List<BuildTechnique> list = dao.selectByExample(example);
		if (list.size()==0) {
			return null;
		}
		return list.get(0);
	}

	@Override
	public List<TBuild> selectTechniqueByBuildId(int id) {
		List<TBuild> selectTechniqueByBuildId = dao.selectTechniqueByBuildId(id);
		
		return selectTechniqueByBuildId;
	}

	@Override
	public List<BuildTechnique> selectBuildTechniqueByTechniqueId(int id) {
		List<BuildTechnique> selectBuildTechniqueByTechniqueId = dao.selectBuildTechniqueByTechniqueId(id);
		return selectBuildTechniqueByTechniqueId;
	}

}
