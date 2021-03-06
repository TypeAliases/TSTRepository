package com.sust.service.impl;

import java.util.Comparator;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sust.bean.TBulletin;
import com.sust.bean.TBulletinExample;
import com.sust.bean.TLog;
import com.sust.bean.TBulletinExample.Criteria;
import com.sust.dao.TBulletinMapper;
import com.sust.service.IBulletinServcie;
@Service
public class BulletinImpl implements IBulletinServcie{
	@Autowired
	private TBulletinMapper  tBulletinMapper;
	@Override
	public void insertBulletin(TBulletin tBulletin) throws Exception {
		tBulletinMapper.insertSelective(tBulletin);
	}

	@Override
	public void deleteBulletin(int id) throws Exception{
		tBulletinMapper.deleteTBulletinById(id);
	}

	@Override
	public void updateBulletin(TBulletin tBulletin) throws Exception{
		TBulletinExample tBulletinExample=new TBulletinExample();
		tBulletinExample.createCriteria().andIdEqualTo(tBulletin.getId());
		tBulletinMapper.updateByExampleSelective(tBulletin, tBulletinExample);
	}

	@Override
	public List<TBulletin> selectAllBulletins() throws Exception{
		TBulletinExample tBulletinExample=new TBulletinExample();
		tBulletinExample.createCriteria().andIdIsNotNull();
		List<TBulletin> listTBulletins = tBulletinMapper.selectByExampleWithBLOBs(tBulletinExample);
		for (TBulletin tBulletin : listTBulletins) {
			System.out.println(tBulletin.getViews());
		}
		listTBulletins.sort(new Comparator<TBulletin>() {
			@Override
			public int compare(TBulletin o1, TBulletin o2) {
				return o2.getViews()-o1.getViews();
			}
		});
		return listTBulletins;
	}

	@Override
	public TBulletin selecTBulletinbyId(int id) throws Exception {
		TBulletinExample tBulletinExample=new TBulletinExample();
		tBulletinExample.createCriteria().andIdEqualTo(id);
		List<TBulletin> selectTBulletinById = tBulletinMapper.selectByExampleWithBLOBs(tBulletinExample);
		TBulletin tBulletin = selectTBulletinById.get(0);		
		return tBulletin;
	}

	@Override
	public PageInfo<TBulletin> selectAllBulletinPage(int curpage, int row) {
		PageHelper.startPage(curpage, row);
		TBulletinExample tBulletinExample=new TBulletinExample();
		tBulletinExample.createCriteria().andIdIsNotNull();
		List<TBulletin> listTBulletins = tBulletinMapper.selectByExampleWithBLOBs(tBulletinExample);
		PageInfo<TBulletin> pageInfo = new PageInfo<TBulletin>(listTBulletins);
		return pageInfo;
	}
	//模糊查询公告的标题
	@Override
	public List<TBulletin> selectTBulletinByName(String name) throws Exception {
		TBulletinExample tBulletinExample=new TBulletinExample();
		tBulletinExample.createCriteria().andTitleLike("%"+name+"%");
		List<TBulletin> selectTBulletinLike = tBulletinMapper.selectByExampleWithBLOBs(tBulletinExample);
		return selectTBulletinLike;
	}

	@Override
	public List<TBulletin> selectTBulletinByDate(Date date) throws Exception {
		TBulletinExample tBulletinExample=new TBulletinExample();
		tBulletinExample.createCriteria().andDateBetween(new Date(), date);
		List<TBulletin> selectTBulletinLike = tBulletinMapper.selectByExampleWithBLOBs(tBulletinExample);
		return selectTBulletinLike;
	}

	
}
