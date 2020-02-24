package com.qm.service;

import java.util.List;

import com.qm.entity.Area;

public interface AreaService {
    int deleteByPrimaryKey(Long id);

    int insert(Area record);

    int insertSelective(Area record);

    Area selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Area record);

    int updateByPrimaryKey(Area record);
    //批量插入数据
    int insertForeach(List<Area> list);	
}
