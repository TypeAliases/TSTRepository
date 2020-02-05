package com.sust.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sust.bean.BuildImage;
import com.sust.bean.BuildImageExample;
import com.sust.bean.TechniqueImage;
import com.sust.bean.TechniqueImageExample;
import com.sust.dao.BuildImageMapper;
import com.sust.dao.TechniqueImageMapper;
import com.sust.service.IImageService;
import com.sust.service.ITechniqueImageService;
import com.sust.service.ITechniqueService;
@Service
public class TechniqueImageServiceImpl implements ITechniqueImageService {
	@Autowired
	private TechniqueImageMapper dao;

	@Override
	public void saveTechniqueImage(TechniqueImage techniqueImage) {
		// TODO Auto-generated method stub
		dao.insert(techniqueImage);
	}

	@Override
	public List<TechniqueImage> findAllById(Integer id) {
		// TODO Auto-generated method stub
		TechniqueImageExample example = new TechniqueImageExample();
		example.createCriteria().andTechniqueIdEqualTo(id);
		List<TechniqueImage> list = dao.selectByExample(example);
		return list;
	}

}
