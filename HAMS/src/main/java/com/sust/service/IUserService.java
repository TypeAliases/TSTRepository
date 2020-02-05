package com.sust.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.sust.bean.TLog;
import com.sust.bean.TUser;

public interface IUserService {
	//用户通过账号登录
	TUser login(String account,String password) throws Exception;
	//用户注册
	void register(TUser user) throws Exception;
	//修改用户信息
	void updateUser(TUser user) throws Exception;
	//通过id来改变用户的状态
	void changeUserFlag(String flag,int id) throws Exception;
	//通过id查询用户对象
	TUser selectTUserById(int id) throws Exception;
	//查询所有用户
	List<TUser> selectAllUser() throws Exception;
	//通过分页查询所有用户
	PageInfo<TUser> selectAllUserPage(int curpage ,int row);

}
