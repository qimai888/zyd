package com.qm.serviceImpl;

import java.io.IOException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import com.qm.dao.CloudSaleOrderDao;
import com.qm.entity.CloudSaleOrder;
import com.qm.service.CloudSaleOrderService;
import com.qm.util.DocumentStatusToStr;
import com.qm.util.ExcelUtil;
@Service
public class CloudSaleOrderServiceImpl implements CloudSaleOrderService {
	@Autowired
	CloudSaleOrderDao cloudSaleOrderDao;
	@Override
	public int deleteByPrimaryKey(Long id) {
		// TODO Auto-generated method stub
		return cloudSaleOrderDao.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(CloudSaleOrder record) {
		// TODO Auto-generated method stub
		return cloudSaleOrderDao.insert(record);
	}

	@Override
	public int insertSelective(CloudSaleOrder record) {
		// TODO Auto-generated method stub
		return cloudSaleOrderDao.insertSelective(record);
	}

	@Override
	public CloudSaleOrder selectByPrimaryKey(Long id) {
		// TODO Auto-generated method stub
		return cloudSaleOrderDao.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKeySelective(CloudSaleOrder record) {
		// TODO Auto-generated method stub
		return cloudSaleOrderDao.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(CloudSaleOrder record) {
		// TODO Auto-generated method stub
		return cloudSaleOrderDao.updateByPrimaryKey(record);
	}

	
	
	@Override
	public int selectByEnterpriseId(Long enterpriseId) {
		// TODO Auto-generated method stub
		return cloudSaleOrderDao.selectByEnterpriseId(enterpriseId);
	}

	@Override
	public int deleteByEnterpriseId(Long enterpriseId) {
		// TODO Auto-generated method stub
		return cloudSaleOrderDao.deleteByEnterpriseId(enterpriseId);
	}

	@Override
	public PageInfo<CloudSaleOrder> getList(CloudSaleOrder record,int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		List<CloudSaleOrder> List = cloudSaleOrderDao.getList(record);
		PageInfo <CloudSaleOrder> pg = new PageInfo <CloudSaleOrder> (List);
		return pg;
	}

	@Override
	public int countByIllegalId(Long illegalId) {
		// TODO Auto-generated method stub
		return cloudSaleOrderDao.countByIllegalId(illegalId);
	}
	//导出Excel
		@Override
    public String export(HttpServletResponse response,CloudSaleOrder record) {
        try {
            
            String fileName="销售订单违规";
            List<Map<String,Object>> list=createExcelRecord(cloudSaleOrderDao.getList(record));
            String columnNames[] = {"单号","日期","负责人","单据状态","物料名称","物料编码","数量"};//列名
            String keys[] = {"FBillNo","FDate","FCREATORName","FDOCUMENTSTATUS","FMaterialName","FMaterialNumber","FQTY"};//map中的key
            ExcelUtil.downloadWorkBook(list,keys,columnNames,fileName,response);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "excel";
    }
	//创建Excel表中的记录
	private List<Map<String, Object>> createExcelRecord(List<CloudSaleOrder> list){
		
		List<Map<String, Object>> listmap = new ArrayList<Map<String, Object>>();
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("sheetName", "sheet1");
            listmap.add(map);
            for (int j = 0; j < list.size(); j++) {
            	CloudSaleOrder cloudSaleOrder = list.get(j);
                Map<String, Object> mapValue = new HashMap<String, Object>();
                mapValue.put("FBillNo",cloudSaleOrder.getFBillNo());
                SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String str=sdf.format(cloudSaleOrder.getFDate());                
                mapValue.put("FDate",str);
                mapValue.put("FCREATORName",cloudSaleOrder.getFCREATORName());                
                mapValue.put("FDOCUMENTSTATUS",DocumentStatusToStr.statusToStr(cloudSaleOrder.getFDOCUMENTSTATUS()));
                mapValue.put("FMaterialName",cloudSaleOrder.getFMaterialName());
                mapValue.put("FMaterialNumber",cloudSaleOrder.getFMaterialNumber());
                double d = Double.valueOf(cloudSaleOrder.getFQTY());                
                DecimalFormat df = new DecimalFormat(".00");                
                mapValue.put("FQTY",df.format(d));
                
               //mapValue.put("submitTime", DateTimeUtil.dateToStr(projectAuditListVo.getSubmitTime(),"yyyy-MM-dd"));
               //String attachmentURL = projectAuditListVo.getAttachment()==null?"无": FileUtil.getUploadPath()+projectAuditListVo.getAttachment();

                listmap.add(mapValue);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listmap;
	}

}
