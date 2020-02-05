package com.sust.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.sust.bean.BuildTechnique;
import com.sust.bean.TBuild;
import com.sust.bean.TTechnique;

public interface IBuildTechniqueService {
		//增加工艺信息
		public void insertBuildTechnique(BuildTechnique technique);
		//删除工艺信息
		public void deleteBuildTechniqueById(Integer id);
		//修改工艺信息
		public void updateBuildTechnique(BuildTechnique technique);
		//通过id查找工艺信息
		public BuildTechnique selectById(Integer id);
		//通过分页查询所有工艺信息	
		PageInfo<BuildTechnique> selectAllBuildTechniquePage(int curpage ,int row);
		PageInfo<BuildTechnique> selectAllByBuildIdPage(int curPage,int buildId);
		BuildTechnique selectAllByBuildId(int buildId);
		//
		List<TBuild> selectTechniqueByBuildId(int id);
		List<BuildTechnique> selectBuildTechniqueByTechniqueId(int id);
}
