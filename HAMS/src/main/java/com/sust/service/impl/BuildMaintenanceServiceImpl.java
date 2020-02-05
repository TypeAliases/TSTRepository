package com.sust.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sust.bean.BuildMaintenance;
import com.sust.bean.BuildMaintenanceExample;
import com.sust.bean.BuildMaintenanceExample.Criteria;
import com.sust.bean.TMaintenance;
import com.sust.dao.BuildMaintenanceMapper;
import com.sust.service.IBuildMaintenanceService;
@Service
public class BuildMaintenanceServiceImpl implements IBuildMaintenanceService{
	@Autowired
	private BuildMaintenanceMapper dao;
	@Override
	public void addBuildMaintenance(BuildMaintenance buildMaintenance) {
		// TODO Auto-generated method stub
		dao.insert(buildMaintenance);
	}

	@Override
	public void deleteBuildMaintenance(Integer id) {
		// TODO Auto-generated method stub
		BuildMaintenanceExample example = new BuildMaintenanceExample();
		Criteria criteria = example.createCriteria();
		criteria.andIdEqualTo(id);
		dao.deleteByExample(example);
	}

	@Override
	public List<BuildMaintenance> selecetAllBuildMaintenance() {
		// TODO Auto-generated method stub
		BuildMaintenanceExample example = new BuildMaintenanceExample();
		Criteria criteria = example.createCriteria();
		criteria.andIdIsNotNull();
		List<BuildMaintenance> list = dao.selectByExample(example);
		return list;
	}

	@Override
	public BuildMaintenance selectBuildMaintenanceById(Integer id) {
		// TODO Auto-generated method stub
		BuildMaintenanceExample example = new BuildMaintenanceExample();
		Criteria criteria = example.createCriteria();
		criteria.andIdEqualTo(id);
		List<BuildMaintenance> list = dao.selectByExample(example);
		return list.get(0);
	}

	@Override
	public void updateBuildMaintenance(BuildMaintenance buildMaintenance) {
		// TODO Auto-generated method stub
		BuildMaintenanceExample example = new BuildMaintenanceExample();
		Criteria criteria = example.createCriteria();
		criteria.andBuildIdEqualTo(buildMaintenance.getId());
		dao.updateByExampleSelective(buildMaintenance, example);
	}

	@Override
	public void insertBuildMaintenance(BuildMaintenance buildMaintenance) {
		// TODO Auto-generated method stub
		dao.insertSelective(buildMaintenance);
		
	}

	@Override
	public PageInfo<BuildMaintenance> selectAllBuildMaintenancePage(int curpage, int row) {
		// TODO Auto-generated method stub
		PageHelper.startPage(curpage,row);
		BuildMaintenanceExample example = new BuildMaintenanceExample();
		Criteria criteria = example.createCriteria();
		criteria.andIdIsNotNull();
		List<BuildMaintenance> list = dao.selectByExample(example);
		PageInfo<BuildMaintenance> pageInfo = new PageInfo<BuildMaintenance>(list);
		return pageInfo;
	}

}
