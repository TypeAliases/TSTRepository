package com.sust.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sust.bean.TLog;
import com.sust.bean.TMaintenance;
import com.sust.bean.TMaintenanceExample;
import com.sust.bean.TMaintenanceExample.Criteria;
import com.sust.dao.TMaintenanceMapper;
import com.sust.service.IMaintenanceService;

@Service
public class MaintenanceServiceImpl implements IMaintenanceService{
	@Autowired
	TMaintenanceMapper tMaintenanceMapper;
	@Override
	public void insertMaintenance(TMaintenance tMaintenance) throws Exception {
		/*
		 * TMaintenanceExample tMaintenanceExample=new TMaintenanceExample();
		 * tMaintenanceExample.createCriteria().andIdEqualTo(tMaintenance.getId());
		 * List<TMaintenance> selectByExample =
		 * tMaintenanceMapper.selectByExample(tMaintenanceExample); if
		 * (selectByExample.size()!=0) { throw new Exception("已有这条维修记录"); }else {
		 * tMaintenanceMapper.insert(tMaintenance); }
		 */
		tMaintenanceMapper.insertSelective(tMaintenance);
	}

	@Override
	public TMaintenance selecTMaintenance(int id) throws Exception {
		TMaintenanceExample tMaintenanceExample=new TMaintenanceExample();
		tMaintenanceExample.createCriteria().andIdEqualTo(id);
		List<TMaintenance> selectTMaintenance = tMaintenanceMapper.selectByExample(tMaintenanceExample);
		TMaintenance tMaintenance = selectTMaintenance.get(0);
		return tMaintenance;
	}

	@Override
	public List<TMaintenance> selectAllMaintenances() throws Exception {
		TMaintenanceExample tMaintenanceExample=new TMaintenanceExample();
		tMaintenanceExample.createCriteria().andIdIsNotNull();
		List<TMaintenance> selectByExample = tMaintenanceMapper.selectByExample(tMaintenanceExample);
		return selectByExample;
	}

	@Override
	public void updateTMaintenance(TMaintenance tMaintenance) throws Exception {
		/*
		 * TMaintenanceExample tMaintenanceExample=new TMaintenanceExample();
		 * tMaintenanceExample.createCriteria().andIdEqualTo(tMaintenance.getId());
		 * tMaintenanceMapper.updateByExample(tMaintenance, tMaintenanceExample);
		 */
		tMaintenanceMapper.updateByPrimaryKeySelective(tMaintenance);
	}

	@Override
	public void deleteTMaintenance(int id) throws Exception {
		TMaintenanceExample tMaintenanceExample=new TMaintenanceExample();
		tMaintenanceExample.createCriteria().andIdEqualTo(id);
		tMaintenanceMapper.deleteByExample(tMaintenanceExample);
	}

	@Override
	public TMaintenance selectTMaintenanceByBuildId(Integer buildId) {
		// TODO Auto-generated method stub
		TMaintenanceExample tMaintenanceExample=new TMaintenanceExample();
		tMaintenanceExample.createCriteria().andBuildidEqualTo(buildId);
		List<TMaintenance> selectByExample = tMaintenanceMapper.selectByExample(tMaintenanceExample);
		return selectByExample.get(0);
	}

	@Override
	public TMaintenance selectLast() {
		// TODO Auto-generated method stub
		TMaintenance maintenance = tMaintenanceMapper.selectLast();
		return maintenance;
	}

	@Override
	public PageInfo<TMaintenance> selectAllMaintenancePage(int curpage, int row) {
		// TODO Auto-generated method stub
		PageHelper.startPage(curpage, row);
		TMaintenanceExample tMaintenanceExample=new TMaintenanceExample();
		tMaintenanceExample.createCriteria().andIdIsNotNull();
		List<TMaintenance> selectByExample = tMaintenanceMapper.selectByExample(tMaintenanceExample);
		PageInfo<TMaintenance> pageInfo = new PageInfo<TMaintenance>(selectByExample);
		return pageInfo;
	}
	
}
