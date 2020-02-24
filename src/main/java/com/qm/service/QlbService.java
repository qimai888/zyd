package com.qm.service;

import com.github.pagehelper.PageInfo;
import com.qm.entity.Qlbwlfpmx;

public interface QlbService {
    int deleteByPrimaryKey(Long id);

    int insert(Qlbwlfpmx record);

    int insertSelective(Qlbwlfpmx record);

    Qlbwlfpmx selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Qlbwlfpmx record);

    int updateByPrimaryKey(Qlbwlfpmx record);

    // 根据条件获取列表 illegalId违规类型和公司id必填
    PageInfo<Qlbwlfpmx> getList(Qlbwlfpmx record, int pageNum, int pageSize);
    //判断是否存在本公司数据
    int selectByEnterpriseId(Long enterpriseId);
    //查询前删除本公司数据
    int deleteByEnterpriseId(Long enterpriseId);
    //根据违规类型统计数量
    int countByIllegalId(Long illegalId);
}
