package com.qm.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;
import com.qm.dao.CloudSaleOrderDao;
import com.qm.entity.CloudSaleOrder;
import com.qm.service.CloudSaleOrderService;
import com.qm.util.ExcelUtil;


@RestController
@RequestMapping("/sale")
public class SaleOrderController {
	@Autowired
	CloudSaleOrderService cloudSaleOrderService;	
	//获取违规列表
	@RequestMapping("/getReceivelist")
	public PageInfo <CloudSaleOrder> getReceivelist(String FMaterialName,String FMaterialNumber,String FSPECIFICATION,String pageNum,String pageSize) {
		System.out.println("hello");
		CloudSaleOrder cloudSaleOrder = new CloudSaleOrder();
		System.out.println(FMaterialName);
		System.out.println(FMaterialNumber);
		System.out.println(FSPECIFICATION);
		cloudSaleOrder.setIllegalId(1l);
		cloudSaleOrder.setEnterpriseId(1l);
		cloudSaleOrder.setFMaterialName(FMaterialName);
		cloudSaleOrder.setFMaterialNumber(FMaterialNumber);
		cloudSaleOrder.setFSPECIFICATION(FSPECIFICATION);		
		PageInfo <CloudSaleOrder> list =cloudSaleOrderService.getList(cloudSaleOrder,Integer.parseInt(pageNum),Integer.parseInt(pageSize));				
		return list;
	}
	//根据违规类型统计销售订单违规数量
	@RequestMapping("/countOrder")
	public int countOrderByIllegalId(String illegalId) {
		System.out.println(111);
		return cloudSaleOrderService.countByIllegalId(Long.valueOf(illegalId));
	}
	@RequestMapping("/getReceivelist2")
	public Map<String,Object> getReceivelist2(String IllegalId,String FMaterialName,String FMaterialNumber,String FSPECIFICATION,String page){
		System.out.println("进入getReceivelist2方法");
		CloudSaleOrder cloudSaleOrder = new CloudSaleOrder();
		System.out.println(FMaterialName);
		System.out.println(FMaterialNumber);
		System.out.println(FSPECIFICATION);
		cloudSaleOrder.setIllegalId(1l);
		cloudSaleOrder.setEnterpriseId(1l);
		cloudSaleOrder.setFMaterialName(FMaterialName);
		cloudSaleOrder.setFMaterialNumber(FMaterialNumber);
		cloudSaleOrder.setFSPECIFICATION(FSPECIFICATION);
		PageInfo <CloudSaleOrder> list =cloudSaleOrderService.getList(cloudSaleOrder,Integer.parseInt(page),100);
		int countx=cloudSaleOrderService.selectByEnterpriseId(1l);
		Map<String ,Object> map=new HashMap<String, Object>();
		map.put("status",0);
		map.put("msg","Get Data Success!");
		map.put("count",countx);
		map.put("rows",list);
		System.out.println("11");
		return map;
	}
	
	
	@RequestMapping("/getReceivelistLayui")
	public Map<String, Object> getReceivelistLayui(long IllegalId,String FMaterialName,String FMaterialNumber,String FSPECIFICATION,String page,Integer limit
			/*@RequestParam(value = "page",defaultValue = "0") Integer page,
            @RequestParam(value = "limit",defaultValue = "20") Integer limit*/) {
		System.out.println("进入getReceivelist3方法");
		Map<String, Object> map = new HashMap<String, Object>();
		 map.put("code", 200); 
		CloudSaleOrder cloudSaleOrder = new CloudSaleOrder();
		cloudSaleOrder.setIllegalId(IllegalId);
		cloudSaleOrder.setEnterpriseId(1l);
		cloudSaleOrder.setFMaterialName(FMaterialName);
		cloudSaleOrder.setFMaterialNumber(FMaterialNumber);
		cloudSaleOrder.setFSPECIFICATION(FSPECIFICATION);		
		PageInfo <CloudSaleOrder> list =cloudSaleOrderService.getList(cloudSaleOrder,Integer.parseInt(page),limit);
		int countx=cloudSaleOrderService.getList(cloudSaleOrder,0,0).getSize();
		map.put("data", list.getList());
		map.put("count", countx);
		map.put("msg", "获取成功");
		map.put("rows",list);
		//System.out.println("A:"+list.getList().get(0).getFCREATORName());
		return map;
	}
	@RequestMapping(value = "/export",produces = {"application/vnd.ms-excel;charset=UTF-8"})
    public String export(HttpServletResponse response,String FMaterialNumber,String FMaterialName,String FSPECIFICATION){
		  System.out.println(111);
		  CloudSaleOrder cloudSaleOrder = new CloudSaleOrder();
		  cloudSaleOrder.setEnterpriseId(1l);
		  cloudSaleOrder.setIllegalId(1l);
		  cloudSaleOrder.setFMaterialName(FMaterialName);
		  cloudSaleOrder.setFMaterialNumber(FMaterialNumber);
		  cloudSaleOrder.setFSPECIFICATION(FSPECIFICATION);
		  return cloudSaleOrderService.export(response, cloudSaleOrder);
    }	
	

    
}
