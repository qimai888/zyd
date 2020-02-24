package com.qm.dao;

import java.util.List;

import com.qm.entity.CloudSaleOrder;

public interface CloudSaleOrderDao {
    int deleteByPrimaryKey(Long id);

    int insert(CloudSaleOrder record);

    int insertSelective(CloudSaleOrder record);

    CloudSaleOrder selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CloudSaleOrder record);

    int updateByPrimaryKey(CloudSaleOrder record);
    // 根据条件获取列表 illegalId违规类型必填
    List <CloudSaleOrder> getList(CloudSaleOrder record);
    //判断是否存在本公司数据
    int selectByEnterpriseId(Long enterpriseId);
    //查询前删除本公司数据
    int deleteByEnterpriseId(Long enterpriseId);
    //根据违规类型统计数量
    int countByIllegalId(Long illegalId);
}