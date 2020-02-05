package com.sust.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.sust.bean.TBuild;
import com.sust.bean.TMake;

public interface IMakeService {
	//查询全部的构造
	public List<TMake> selectAllMakes() throws Exception;
	//根据id查询构造
	public TMake selectMakeById(int id) throws Exception;
	//查询所有的构造信息并分页
	public PageInfo<TMake> selectAllMakePage(int curpage, int row);
	//根据id修改构造信息表
	public void updateMakeById(TMake make);
	//根据id删除构造信息表
	public void deleteMakeById(Integer id);
	//添加构造信息
	public void insertMake(TMake make);
	public TMake selectLast();
}
