package com.sust.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sust.bean.TMaintenanceExample;
import com.sust.bean.TMaterial;
import com.sust.bean.TMaterialExample;
import com.sust.dao.TMaterialMapper;
import com.sust.service.ITMaterialService;
@Service
public class ITMaterialServiceImpl implements ITMaterialService {
	@Autowired
	TMaterialMapper dao;
	@Override
	public void insertTMaterial(TMaterial material) {
		// TODO Auto-generated method stub
		dao.insertSelective(material);
	}

	@Override
	public void deleteTMaterial(Integer id) {
		// TODO Auto-generated method stub
		TMaterialExample example = new TMaterialExample();
		example.createCriteria().andIdEqualTo(id);
		dao.deleteByExample(example);
	}

	@Override
	public void updateTMaterial(TMaterial material) {
		// TODO Auto-generated method stub
		TMaterialExample example = new TMaterialExample();
		example.createCriteria().andIdEqualTo(material.getId());
		dao.updateByExampleSelective(material, example);
	}

	@Override
	public List<TMaterial> selectAllList() {
		// TODO Auto-generated method stub
		TMaterialExample example = new TMaterialExample();
		example.createCriteria().andIdIsNotNull();
		List<TMaterial> list = dao.selectByExample(example);
		return list;
	}

	@Override
	public TMaterial selecTMaterialById(int id) {
		// TODO Auto-generated method stub
		TMaterialExample example = new TMaterialExample();
		example.createCriteria().andIdEqualTo(id);
		List<TMaterial> list = dao.selectByExample(example);
		return list.get(0);
	}

}
