package com.sust.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.sust.bean.BuildMaintenance;
import com.sust.bean.TBuild;
import com.sust.bean.TMaintenance;

//维修记录表
public interface IBuildMaintenanceService {
	//添加维修记录
	void addBuildMaintenance(BuildMaintenance buildMaintenance);
	//通过id删除对应的维修记录
	void deleteBuildMaintenance(Integer id);
	//查询所有的维修记录
	List<BuildMaintenance> selecetAllBuildMaintenance();
	//通过维修记录的id查询对应的维修记录
	BuildMaintenance selectBuildMaintenanceById(Integer id);
	//通过id修改对应的维修记录表
	void updateBuildMaintenance(BuildMaintenance buildMaintenance);
	void insertBuildMaintenance(BuildMaintenance buildMaintenance);
	//通过分页查询所有维修记录
		PageInfo<BuildMaintenance> selectAllBuildMaintenancePage(int curpage ,int row);
	
}
