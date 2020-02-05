package com.sust.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sust.bean.BuildImage;
import com.sust.bean.BuildImageExample;
import com.sust.bean.MakeImage;
import com.sust.bean.MakeImageExample;
import com.sust.dao.BuildImageMapper;
import com.sust.dao.MakeImageMapper;
import com.sust.service.IImageService;
import com.sust.service.IMakeImageService;
@Service
public class MakeImageServiceImpl implements IMakeImageService {
	@Autowired
	private MakeImageMapper dao;
	
	@Override
	public void saveMakeImage(MakeImage makeImage) {
		// TODO Auto-generated method stub
		dao.insert(makeImage);
	}
	@Override
	public List<MakeImage> findAllById(Integer id) {
		// TODO Auto-generated method stub
		MakeImageExample example = new MakeImageExample();
		example.createCriteria().andMakeIdEqualTo(id);
		List<MakeImage> list = dao.selectByExample(example);
		return list;
	}
	

}
