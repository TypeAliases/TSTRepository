package com.sust.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sust.bean.TTechnique;
import com.sust.bean.TTechniqueExample;
import com.sust.bean.TTechniqueExample.Criteria;
import com.sust.dao.TTechniqueMapper;
import com.sust.service.ITechniqueService;
@Service
public class TechniqueServiceImpl implements ITechniqueService{
	@Autowired  
	private TTechniqueMapper tTechniqueMapper;
	@Override
	public List<TTechnique> selectAllList() {
		TTechniqueExample techniqueExample=new TTechniqueExample();
		techniqueExample.createCriteria().andIdIsNotNull();
		List<TTechnique> selectAllTTechnique = tTechniqueMapper.selectByExample(techniqueExample);
		return selectAllTTechnique;
	}

	@Override
	public TTechnique selecTechniqueById(int id) {
		TTechniqueExample techniqueExample=new TTechniqueExample();
		techniqueExample.createCriteria().andIdEqualTo(id);
		List<TTechnique> selectByTTechnique = tTechniqueMapper.selectByExample(techniqueExample);
		TTechnique tTechnique = selectByTTechnique.get(0);
		return tTechnique;
	}

	@Override
	public void insertTechnique(TTechnique technique) {
		// TODO Auto-generated method stub
		tTechniqueMapper.insertSelective(technique);
		
	}

	@Override
	public void deleteTechnique(Integer id) {
		// TODO Auto-generated method stub
		TTechniqueExample techniqueExample=new TTechniqueExample();
		techniqueExample.createCriteria().andIdEqualTo(id);
		tTechniqueMapper.deleteByExample(techniqueExample);
	}

	@Override
	public void updateTechnique(TTechnique technique) {
		// TODO Auto-generated method stub
		//tTechniqueMapper.updateByPrimaryKeySelective(technique);
		TTechniqueExample example = new TTechniqueExample();
		example.createCriteria().andIdEqualTo(technique.getId());
		tTechniqueMapper.updateByExampleSelective(technique, example);
	}

	@Override
	public TTechnique selectLast() {
		// TODO Auto-generated method stub
	TTechnique last = tTechniqueMapper.selectLast();
		return last;
	}

}
