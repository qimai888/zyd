package com.qm.dao;

import com.qm.entity.Qlbwlfpmx;

import java.util.List;

public interface QlbwlfpmxDao {
    int deleteByPrimaryKey(Long id);

    int insert(Qlbwlfpmx record);

    int insertSelective(Qlbwlfpmx record);

    Qlbwlfpmx selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Qlbwlfpmx record);

    int updateByPrimaryKeyWithBLOBs(Qlbwlfpmx record);

    int updateByPrimaryKey(Qlbwlfpmx record);
    // 根据条件获取列表 illegalId违规类型必填
    List<Qlbwlfpmx> getList(Qlbwlfpmx record);
}