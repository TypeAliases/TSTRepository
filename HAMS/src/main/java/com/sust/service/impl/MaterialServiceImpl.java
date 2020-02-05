package com.sust.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sust.bean.TMaterial;
import com.sust.bean.TMaterialExample;
import com.sust.bean.TMaterialExample.Criteria;
import com.sust.dao.TMakeMapper;
import com.sust.dao.TMaterialMapper;
import com.sust.service.IMaterialService;
@Service
public class MaterialServiceImpl implements IMaterialService{
	@Autowired
	TMaterialMapper tMaterialMapper;
	@Override
	public List<TMaterial> selectAllMaterials() {
		TMaterialExample tMaterialExample=new TMaterialExample();
		tMaterialExample.createCriteria().andIdIsNotNull();
		List<TMaterial> selectAllMaterials = tMaterialMapper.selectByExampleWithBLOBs(tMaterialExample);
		return selectAllMaterials;
	}

	@Override
	public TMaterial selectMaterialById(int id) {
		TMaterialExample tMaterialExample=new TMaterialExample();
		tMaterialExample.createCriteria().andIdEqualTo(id);
		List<TMaterial> selectTMaterialById = tMaterialMapper.selectByExampleWithBLOBs(tMaterialExample);
		TMaterial tMaterial = selectTMaterialById.get(0);
		return tMaterial;
	}

}
