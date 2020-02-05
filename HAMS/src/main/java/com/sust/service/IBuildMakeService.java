package com.sust.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.sust.bean.BuildImage;
import com.sust.bean.BuildMake;
import com.sust.bean.TBuild;

public interface IBuildMakeService {
	//增加构造信息
	public void insertBuildMake(BuildMake buildMake);
	//删除构造信息
	public void deleteBuildMakeById(Integer id);
	//修改构造信息
	public void updateBuildMake(BuildMake buildMake);
	//通过id查找构造信息
	public BuildMake selectById(Integer id);
	//查找全部的构造信息
	public BuildMake selectAll();
	//通过分页查询所有构造信息
	PageInfo<BuildMake> selectAllBuildMakePage(int curpage ,int row);
	//通过建筑的id查找构造信息并分页
	public PageInfo<BuildMake> selectByBuildId(int curPage,Integer id);
	
	public List<TBuild> selectByBuildId(Integer id);
	public List<BuildImage> selectImageByBuildId(Integer id);
	
	public List<BuildMake> selectByMakeIdWithBuild(Integer id);
	
	//删除构造信息
	public void deleteBuildMakeByMakeId(Integer id);
}
