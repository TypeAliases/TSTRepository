package com.sust.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sust.bean.BuildImage;
import com.sust.bean.BuildMake;
import com.sust.bean.BuildMakeExample;
import com.sust.bean.TBuild;
import com.sust.bean.TBulletin;
import com.sust.bean.TBulletinExample;
import com.sust.bean.TImage;
import com.sust.bean.TMake;
import com.sust.dao.BuildImageMapper;
import com.sust.dao.BuildMakeMapper;
import com.sust.dao.BuildMakeMapper2;
import com.sust.dao.TMakeMapper;
import com.sust.service.IBuildMakeService;
@Service
public class BuildMakeServiceImpl implements IBuildMakeService{
	@Autowired
	private BuildMakeMapper dao;
	
	@Autowired
	private BuildImageMapper Imdao;
	
	@Autowired
	private TMakeMapper makeDao;
	@Override
	public void insertBuildMake(BuildMake buildMake) {
		dao.insertSelective(buildMake);
	}

	@Override
	public void deleteBuildMakeById(Integer id) {
		// TODO Auto-generated method stub
		BuildMakeExample example = new BuildMakeExample();
		example.createCriteria().andIdEqualTo(id);
		dao.deleteByExample(example);
		
	}


	@Override
	public BuildMake selectById(Integer id) {
		// TODO Auto-generated method stub
		BuildMakeExample example = new BuildMakeExample();
		example.createCriteria().andIdEqualTo(id);
		List<BuildMake> list = dao.selectByExample(example);
			for (BuildMake buildMake : list) {
				System.out.println("buildMake:"+buildMake.getMake());
			}
		return list.get(0);
	}

	@Override
	public BuildMake selectAll() {
		
		return null;
	}

	@Override
	public PageInfo<BuildMake> selectAllBuildMakePage(int curpage, int row) {
		// TODO Auto-generated method stub
		PageHelper.startPage(curpage,row);
		BuildMakeExample example = new BuildMakeExample();
		example.createCriteria().andIdIsNotNull();
		List<BuildMake> list = dao.selectByExample(example);
		PageInfo<BuildMake> pageInfo = new PageInfo<>(list);
		return pageInfo;
	}

	@Override
	public void updateBuildMake(BuildMake buildMake) {
		// TODO Auto-generated method stub
		BuildMakeExample example = new BuildMakeExample();
		example.createCriteria().andIdEqualTo(buildMake.getId());
		dao.updateByExampleSelective(buildMake, example);
		
	}

	@Override
	public PageInfo<BuildMake> selectByBuildId(int curPage,Integer id) {
		// TODO Auto-generated method stub
		PageHelper.startPage(curPage,10);
		List<BuildMake> list = dao.selectByBuildIdWithMake(id);
		if (list.size()==0) {
			return null;
		}
		PageInfo<BuildMake> pageInfo = new PageInfo<>(list);
		return pageInfo;
	}

	@Override
	public List<TBuild> selectByBuildId(Integer id) {
		List<TBuild> selectByBuildId = dao.selectByBuildId(id);
		return selectByBuildId;
	}

	@Override
	public List<BuildImage> selectImageByBuildId(Integer id) {
		List<BuildImage> selectImageByBuildId = Imdao.selectImageByBuildId(id);
		return selectImageByBuildId;
	}

	@Override
	public List<BuildMake> selectByMakeIdWithBuild(Integer id) {
		List<BuildMake> selectByMakeIdWithBuild = dao.selectByMakeIdWithBuild(id);
		return selectByMakeIdWithBuild;
	}

	@Override
	public void deleteBuildMakeByMakeId(Integer id) {
		dao.deleteBuildMakeByMakeId(id);
	}

	
}
