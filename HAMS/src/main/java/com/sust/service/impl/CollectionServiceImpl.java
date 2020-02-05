package com.sust.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sust.bean.TCollection;
import com.sust.dao.TCollectionMapper;
import com.sust.service.ICollectionService;
@Service
public class CollectionServiceImpl implements ICollectionService {

	@Autowired TCollectionMapper collectionMapper;
	@Override
	public void insertCollection(TCollection tcollection) throws Exception {
		collectionMapper.insert(tcollection);
	}

}
