package com.qm.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qm.dao.CloudMaterialDao;
import com.qm.entity.CloudMaterial;
import com.qm.service.CloudMaterialService;
@Service
public class CloudMaterialServiceImpl implements CloudMaterialService {
	@Autowired
	CloudMaterialDao cloudMaterialDao;
	@Override
	public int deleteByPrimaryKey(Long id) {
		// TODO Auto-generated method stub
		return cloudMaterialDao.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(CloudMaterial record) {
		
		return cloudMaterialDao.insertSelective(record);
	}

	@Override
	public int insertSelective(CloudMaterial record) {
		// TODO Auto-generated method stub
		return cloudMaterialDao.insertSelective(record);
	}

	@Override
	public CloudMaterial selectByPrimaryKey(Long id) {
		// TODO Auto-generated method stub
		return cloudMaterialDao.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKeySelective(CloudMaterial record) {
		// TODO Auto-generated method stub
		return cloudMaterialDao.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(CloudMaterial record) {
		// TODO Auto-generated method stub
		return cloudMaterialDao.updateByPrimaryKey(record);
	}

}
