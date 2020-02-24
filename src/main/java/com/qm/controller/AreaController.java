package com.qm.controller;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.qm.entity.Area;
import com.qm.service.AreaService;

@RestController
@RequestMapping("/area")
public class AreaController {
	@Autowired
	AreaService areaService;
	
	//excel上传
	@RequestMapping(value = "/upload", method = RequestMethod.POST)
	@ResponseBody
	public String uploadHeadPic(MultipartFile file/*@RequestParam("excelFile")MultipartFile file*/ ) {
		ArrayList<Area> list = new ArrayList<>();
		System.out.println("上传excel");
		//判断文件是否为空
		if (file.isEmpty()) {
            return "上传失败，请选择文件";
        }else {
        	//获取文件名
            String filename = file.getOriginalFilename();
            //获取文件的后缀名
            String suffix = filename.substring(filename.lastIndexOf(".") + 1);
            System.out.println(suffix);
            //判断是否为excel
            if(suffix.equals("xlsx") || suffix.equals("xls")) {
            	try {
        			//1、获取文件输入流
        			InputStream inputStream = file.getInputStream();
        			HSSFWorkbook workbook = new HSSFWorkbook(inputStream);
        			//3、得到Excel工作表对象
        	        HSSFSheet sheetAt = workbook.getSheetAt(0);
        	        //4、循环读取表格数据
        	        for (Row row : sheetAt) {
        	        	//首行（即表头）不读取
        	        	if (row.getRowNum() == 0) {
        	                 continue;
        	            }	        	
        	        	DataFormatter dataFormatter = new DataFormatter();
        	        	//DataFormatter通过formatCellValue方法获取任何格式的cell数据,可以解决读取数字报错的问题
        	        	String areaNum =dataFormatter.formatCellValue(row.getCell(0));
        	        	String province = dataFormatter.formatCellValue(row.getCell(1));
         	            String city = dataFormatter.formatCellValue(row.getCell(2));
         	            String district = dataFormatter.formatCellValue(row.getCell(3));
         	            String postcode = dataFormatter.formatCellValue(row.getCell(4));	        	
         	            Area area = new Area();
         	            area.setAreaNum(areaNum);
         	            area.setCity(city);
         	            area.setDistrict(district);
         	            area.setProvince(province);
         	            area.setPostcode(postcode);      
         	            list.add(area);    
         	            
        	        }
        	        int i = areaService.insertForeach(list);
     	           	System.out.println(i);
        	        //5、关闭流
                    workbook.close();
        		} catch (FileNotFoundException e) {
        			// TODO Auto-generated catch block
        			e.printStackTrace();
        		} catch (IOException e) {
        			// TODO Auto-generated catch block
        			e.printStackTrace();
        		}
            	return "导入成功";
            }else {
            	 return "上传失败，请选择Excel";
            }
        }
		
		
		
		
	}
}
