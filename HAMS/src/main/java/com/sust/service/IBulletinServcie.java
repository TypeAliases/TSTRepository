package com.sust.service;

import java.util.Date;
import java.util.List;

import com.github.pagehelper.PageInfo;
import com.sust.bean.TBulletin;
import com.sust.bean.TMaintenance;

public interface IBulletinServcie {
	//添加公告
	public void insertBulletin(TBulletin tBulletin) throws Exception;
	//删除公告
	public void deleteBulletin(int id) throws Exception;
	//修改公告
	public void updateBulletin(TBulletin tBulletin) throws Exception;
	//查询全部公告
	public List<TBulletin> selectAllBulletins() throws Exception;
	//根据id查询公告
	public TBulletin selecTBulletinbyId(int id) throws Exception;
	//通过分页查询所有公告记录
	PageInfo<TBulletin> selectAllBulletinPage(int curpage ,int row);
	//根据名字查询公告
	public List<TBulletin> selectTBulletinByName(String name) throws Exception;
	//根据日期查询对应的公告详情
	public List<TBulletin> selectTBulletinByDate(Date date) throws Exception;
	
}
