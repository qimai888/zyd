package com.qm.serviceImpl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qm.dao.AreaDao;
import com.qm.entity.Area;
import com.qm.service.AreaService;



@Service
public class AreaServiceImpl implements AreaService {
	@Autowired
	AreaDao areaDao;
	
	@Override
	public int deleteByPrimaryKey(Long id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(Area record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertSelective(Area record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Area selectByPrimaryKey(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateByPrimaryKeySelective(Area record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(Area record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertForeach(List<Area> list) {
		
		return areaDao.insertForeach(list);
	}
	
	
}
