package com.qm.serviceImpl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qm.dao.QlbwlfpmxDao;
import com.qm.entity.Qlbwlfpmx;
import com.qm.service.QlbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QlbServiceImpl implements QlbService {

    @Autowired
    QlbwlfpmxDao qlbwlfpmxDao;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return 0;
    }

    @Override
    public int insert(Qlbwlfpmx record) {
        return 0;
    }

    @Override
    public int insertSelective(Qlbwlfpmx record) {
        return 0;
    }

    @Override
    public Qlbwlfpmx selectByPrimaryKey(Long id) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(Qlbwlfpmx record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Qlbwlfpmx record) {
        return 0;
    }

    @Override
    public PageInfo<Qlbwlfpmx> getList(Qlbwlfpmx record, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<Qlbwlfpmx> List = qlbwlfpmxDao.getList(record);
        PageInfo <Qlbwlfpmx> pg = new PageInfo <Qlbwlfpmx> (List);
        return pg;
    }

    @Override
    public int selectByEnterpriseId(Long enterpriseId) {
        return 0;
    }

    @Override
    public int deleteByEnterpriseId(Long enterpriseId) {
        return 0;
    }

    @Override
    public int countByIllegalId(Long illegalId) {
        return 0;
    }
}
