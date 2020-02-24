package com.qm.service;



import javax.servlet.http.HttpServletResponse;

import com.github.pagehelper.PageInfo;

import com.qm.entity.CloudSaleOrder;


public interface CloudSaleOrderService {
	int deleteByPrimaryKey(Long id);

    int insert(CloudSaleOrder record);

    int insertSelective(CloudSaleOrder record);

    CloudSaleOrder selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CloudSaleOrder record);

    int updateByPrimaryKey(CloudSaleOrder record);
    
    // 根据条件获取列表 illegalId违规类型和公司id必填    
    PageInfo <CloudSaleOrder>getList(CloudSaleOrder record,int pageNum,int pageSize);
    //判断是否存在本公司数据
    int selectByEnterpriseId(Long enterpriseId);
    //查询前删除本公司数据
    int deleteByEnterpriseId(Long enterpriseId);
    //根据违规类型统计数量
    int countByIllegalId(Long illegalId);
    public String export(HttpServletResponse response,CloudSaleOrder record);
}
