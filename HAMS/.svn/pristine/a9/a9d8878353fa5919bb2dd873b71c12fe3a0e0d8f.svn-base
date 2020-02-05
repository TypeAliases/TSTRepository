package com.sust.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.sust.bean.TLog;

public interface ILogServcie {
	//查询全部的日志
	public List<TLog> selectAllLogs() throws Exception;
	//插入日志
	public void insertLog(TLog log);
	//通过分页查询所有日志
	PageInfo<TLog> selectAllLogsPage(int curpage ,int row);
}
