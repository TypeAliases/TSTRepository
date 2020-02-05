package com.sust.service;

import java.util.List;

import com.sust.bean.BuildImage;

public interface IImageService {

	void saveBuildImage(BuildImage buildImage);
	
	List<BuildImage> findAllBuildById(Integer build_id);
}
