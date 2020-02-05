package com.sust.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.sust.bean.TLog;
import com.sust.bean.TMaintenance;

public interface IMaintenanceService {
	// 插入维修记录
	public void insertMaintenance(TMaintenance tMaintenance) throws Exception;

	// 根据id查询维修记录
	public TMaintenance selecTMaintenance(int id) throws Exception;

	// 查询所有维修记录
	public List<TMaintenance> selectAllMaintenances() throws Exception;

	// 修改维修记录
	public void updateTMaintenance(TMaintenance tMaintenance) throws Exception;

	// 删除维修记录
	public void deleteTMaintenance(int id) throws Exception;

	public TMaintenance selectTMaintenanceByBuildId(Integer buildId);

	// 查询最后一条记录
	TMaintenance selectLast();
	//通过分页查询所有维修记录
	PageInfo<TMaintenance> selectAllMaintenancePage(int curpage ,int row);
}
