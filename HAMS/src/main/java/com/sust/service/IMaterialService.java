package com.sust.service;

import java.util.List;

import com.sust.bean.TMaterial;

public interface IMaterialService {
	//查询全部材料信息
	public List<TMaterial> selectAllMaterials();
	//根据id查询材料信息
	public TMaterial selectMaterialById(int id);
	
}
