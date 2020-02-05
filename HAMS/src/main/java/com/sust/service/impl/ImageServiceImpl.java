package com.sust.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sust.bean.BuildImage;
import com.sust.bean.BuildImageExample;
import com.sust.dao.BuildImageMapper;
import com.sust.service.IImageService;
@Service
public class ImageServiceImpl implements IImageService {
	@Autowired
	private BuildImageMapper buildImageMapper;
	@Override
	public void saveBuildImage(BuildImage buildImage) {
		buildImageMapper.insert(buildImage);
	}
	@Override
	public List<BuildImage> findAllBuildById(Integer build_id) {
		BuildImageExample example  = new BuildImageExample();
		example.createCriteria().andBuildIdEqualTo(build_id);
	List<BuildImage> list = buildImageMapper.selectByExample(example);
		return list;
	}
	

}
