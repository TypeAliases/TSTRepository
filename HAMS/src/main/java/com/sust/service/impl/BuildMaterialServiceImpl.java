package com.sust.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sust.bean.BuildMaterial;
import com.sust.bean.BuildMaterialExample;
import com.sust.bean.TBuild;
import com.sust.dao.BuildMaterialMapper;
import com.sust.service.IBuildMaterialService;
@Service
public class BuildMaterialServiceImpl implements IBuildMaterialService {
	@Autowired
	private BuildMaterialMapper dao;
	@Override
	public void insertBuildMaterial(BuildMaterial buildMaterial) {
		// TODO Auto-generated method stub
		dao.insertSelective(buildMaterial);

	}

	@Override
	public void deleteBuildMaterialById(Integer id) {
		// TODO Auto-generated method stub
		BuildMaterialExample example = new BuildMaterialExample();
		example.createCriteria().andIdEqualTo(id);
		dao.deleteByExample(example);
	}

	@Override
	public void updateBuildMaterial(BuildMaterial buildMaterial) {
		// TODO Auto-generated method stub
		BuildMaterialExample example = new BuildMaterialExample();
		example.createCriteria().andIdEqualTo(buildMaterial.getId());
		dao.updateByExampleSelective(buildMaterial, example);

	}

	@Override
	public BuildMaterial selectById(Integer id) {
		// TODO Auto-generated method stub
		BuildMaterialExample example = new BuildMaterialExample();
		example.createCriteria().andIdEqualTo(id);
		List<BuildMaterial> list = dao.selectByExample(example);
		return list.get(0);
	}

	@Override
	public PageInfo<BuildMaterial> selectAllBuildMaterialPage(int curpage, int row) {
		// TODO Auto-generated method stub
		PageHelper.startPage(curpage,row);
		BuildMaterialExample example = new BuildMaterialExample();
		example.createCriteria().andIdIsNotNull();
		List<BuildMaterial> list = dao.selectByExample(example);
		PageInfo<BuildMaterial> pageInfo = new PageInfo<>(list);
		return pageInfo;
	}

	@Override
	public List<TBuild> selectMaterialByBuildId(int id) {
		List<TBuild> selectMaterialByBuildId = dao.selectMaterialByBuildId(id);
		return selectMaterialByBuildId;
	}
    
}





