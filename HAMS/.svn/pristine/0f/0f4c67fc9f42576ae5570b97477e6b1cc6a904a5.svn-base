package com.sust.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sust.bean.TLog;
import com.sust.bean.TUser;
import com.sust.bean.TUserExample;
import com.sust.dao.TUserMapper;
import com.sust.service.IUserService;
@Service
public class UserImpl implements IUserService{
	@Autowired
	TUserMapper tUserMapper;
	@Override
	public TUser login(String account,String password) throws Exception {
		TUserExample tUserExample = new TUserExample();
		tUserExample.createCriteria().andAccountEqualTo(account);
		
		List<TUser> listUser = tUserMapper.selectByExample(tUserExample);
		if (listUser.size()==0) {
			throw new Exception("用户未注册");
		}else {
			TUser tUser3 = listUser.get(0);
			if ("0".equals(tUser3.getFlag())) {
				throw new Exception("该账号不可用，请联系管理员");
			}
			if (tUser3.getPassword().equals(password)) {
				return tUser3;
			}else {
				throw new Exception("用户名密码错误");
			}
		}
	}

	@Override
	public void register(TUser user) throws Exception {
		TUserExample userExample=new TUserExample();
		userExample.createCriteria().andAccountEqualTo(user.getAccount());
		List<TUser> userList = tUserMapper.selectByExample(userExample);
		if (userList.size()==0) {
			tUserMapper.insert(user);
		}else {
			throw new Exception("该账户名已经被使用！");	
		}
	}

	@Override
	public void updateUser(TUser user) throws Exception {
			tUserMapper.updateByPrimaryKeySelective(user);
	}
	
	@Override
	public void changeUserFlag(String flag, int id) throws Exception {
			TUserExample userExample=new TUserExample();
			userExample.createCriteria().andIdEqualTo(id);
			TUser tUser = tUserMapper.selectByPrimaryKey(id);
			tUser.setFlag(flag);
			tUserMapper.insert(tUser);
	}

	@Override
	public TUser selectTUserById(int id) throws Exception {
		TUserExample tUserExample = new TUserExample();
		tUserExample.createCriteria().andIdEqualTo(id);
		TUser tUser = tUserMapper.selectByPrimaryKey(id);
		return tUser;
	}

	@Override
	public List<TUser> selectAllUser() throws Exception {
		TUserExample tUserExample = new TUserExample();
		tUserExample.createCriteria().andIdIsNotNull();
		List<TUser> allTUsers = tUserMapper.selectByExample(tUserExample);
		return allTUsers;
	}

	@Override
	public PageInfo<TUser> selectAllUserPage(int curpage, int row) {
		PageHelper.startPage(curpage, row);
		TUserExample tUserExample = new TUserExample();
		tUserExample.createCriteria().andIdIsNotNull();
		List<TUser> allTUsers = tUserMapper.selectByExample(tUserExample);
		PageInfo<TUser> pageInfo = new PageInfo<TUser>(allTUsers);
		return pageInfo;
	}


}
