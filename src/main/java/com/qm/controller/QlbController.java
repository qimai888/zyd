package com.qm.controller;


import com.github.pagehelper.PageInfo;
import com.qm.entity.CloudSaleOrder;
import com.qm.entity.Qlbwlfpmx;
import com.qm.service.QlbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/qlb")
public class QlbController {

    @Autowired
    QlbService qlbService;
    @RequestMapping("/getqlbwlfpmx")
    public Map<String, Object> getqlbwlfpmx(String FMaterialName, String FMaterialNumber, String FBILLNO, String page, Integer limit
			/*@RequestParam(value = "page",defaultValue = "0") Integer page,
            @RequestParam(value = "limit",defaultValue = "20") Integer limit*/) {
        System.out.println("进入getqlbwlfpmx方法");
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("code", 200);
        System.out.println(FMaterialName);
        System.out.println(FMaterialNumber);
        System.out.println(FBILLNO);
        System.out.println(page);
        System.out.println(limit);
        Qlbwlfpmx qlbwlfpmx = new Qlbwlfpmx();
        //qlbwlfpmx.setIllegalId(IllegalId);
//        qlbwlfpmx.setEnterpriseId(1l);
        qlbwlfpmx.setFMATERIALNAME(FMaterialName);
        qlbwlfpmx.setFMATERIALNUMBER(FMaterialNumber);
        qlbwlfpmx.setFBILLNO(FBILLNO);
        PageInfo<Qlbwlfpmx> list =qlbService.getList(qlbwlfpmx,Integer.parseInt(page),limit);
        int countx=qlbService.getList(qlbwlfpmx,0,0).getSize();
        map.put("data", list.getList());
        map.put("count", countx);
        map.put("msg", "获取成功");
        map.put("rows",list);
        //System.out.println("A:"+list.getList().get(0).getFCREATORName());
        return map;
    }
}
