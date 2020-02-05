package com.sust.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sust.bean.TLog;
import com.sust.bean.TLogExample;
import com.sust.dao.TLogMapper;
import com.sust.service.ILogServcie;

@Service
public class LogServcieImpl implements ILogServcie {
	@Autowired
	private TLogMapper tLogMapper;

	@Override
	public List<TLog> selectAllLogs() throws Exception {
		TLogExample tLogExample = new TLogExample();
		tLogExample.createCriteria().andIdIsNotNull();
		List<TLog> selectAlLogs = tLogMapper.selectByExample(tLogExample);
		return selectAlLogs;
	}

	@Override
	public PageInfo<TLog> selectAllLogsPage(int curpage ,int row) {
		// 获取第 1 页，10 条内容，默认查询总数 count   必须再查询之前设置。
		PageHelper.startPage(curpage, row);
		TLogExample tLogExample = new TLogExample();
		tLogExample.createCriteria().andIdIsNotNull();
		List<TLog> selectAlLogs = tLogMapper.selectByExample(tLogExample);
		// 用 PageInfo 对结果进行包装
		PageInfo<TLog> pageInfo = new PageInfo<TLog>(selectAlLogs);
		/*
		 * System.out.println(pageInfo.getTotal());//打印总条数
		 * System.out.println(pageInfo.getPages()); // 打印页数
		 * System.out.println(pageInfo.getPageNum()); //打印当前页数
		 * System.out.println(pageInfo.getPageSize()); //打印当前页数的记录数
		 */		return pageInfo;
	}
	
	@Override
	public void insertLog(TLog log) {
		tLogMapper.insert(log);
	}

}
