package com.qm.dao;

import com.qm.entity.CloudMaterial;

public interface CloudMaterialDao {
    int deleteByPrimaryKey(Long id);

    int insert(CloudMaterial record);

    int insertSelective(CloudMaterial record);

    CloudMaterial selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CloudMaterial record);

    int updateByPrimaryKey(CloudMaterial record);
}