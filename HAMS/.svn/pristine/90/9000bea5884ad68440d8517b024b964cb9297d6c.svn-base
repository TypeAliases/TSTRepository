package com.sust.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sust.bean.TMake;
import com.sust.bean.TMakeExample;
import com.sust.dao.TMakeMapper;
import com.sust.service.IMakeService;
@Service
public class MakeServiceImpl implements IMakeService{
	@Autowired
	private TMakeMapper tMakeMapper;
	@Override
	public List<TMake> selectAllMakes() throws Exception {
		TMakeExample tMakeExample=new TMakeExample();
		tMakeExample.createCriteria().andIdIsNotNull();
		List<TMake> selectAllMakes = tMakeMapper.selectByExampleWithBLOBs(tMakeExample);
		return selectAllMakes;
	}

	@Override
	public TMake selectMakeById(int id) throws Exception {
		TMakeExample tMakeExample=new TMakeExample();
		tMakeExample.createCriteria().andIdEqualTo(id);
		List<TMake> selectMakeById = tMakeMapper.selectByExampleWithBLOBs(tMakeExample);
		TMake tMake = selectMakeById.get(0);
		return tMake;
	}

	@Override
	public PageInfo<TMake> selectAllMakePage(int curpage, int row) {
		// TODO Auto-generated method stub
		PageHelper.startPage(curpage, row);
		TMakeExample tMakeExample=new TMakeExample();
		tMakeExample.createCriteria().andIdIsNotNull();
		List<TMake> selectAllMakes = tMakeMapper.selectByExampleWithBLOBs(tMakeExample);
		PageInfo<TMake> pageInfo = new PageInfo<>(selectAllMakes);
		return pageInfo;
	}

	@Override
	public void updateMakeById(TMake make) {
		// TODO Auto-generated method stub
		TMakeExample tMakeExample=new TMakeExample();
		tMakeExample.createCriteria().andIdEqualTo(make.getId());
		tMakeMapper.updateByExampleSelective(make, tMakeExample);
		
	}

	@Override
	public void deleteMakeById(Integer id) {
		// TODO Auto-generated method stub
		TMakeExample tMakeExample=new TMakeExample();
		tMakeExample.createCriteria().andIdEqualTo(id);
		tMakeMapper.deleteByExample(tMakeExample);
	}

	@Override
	public void insertMake(TMake make) {
		// TODO Auto-generated method stub
		tMakeMapper.insertSelective(make);
		
	}

	@Override
	public TMake selectLast() {
		// TODO Auto-generated method stub
		return tMakeMapper.selectLast();
	}
	
}
