
package com.qm.util;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;

import com.qm.entity.Area;

public class ImportExcel {
	public List<Area> importXLS(){
		ArrayList<Area> list = new ArrayList<>();
		try {
			//1、获取文件输入流
			InputStream inputStream = new FileInputStream("C:/Users/xxxx/Desktop/区域数据.xls");
			//2、获取Excel工作簿对象
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
	        //5、关闭流
            workbook.close();
		}catch (IOException e) {
			 e.printStackTrace();
		}
		
		
		return list;
		
	}
	public static void main(String[] args) {
		ImportExcel importExcel = new ImportExcel();
		List<Area> list = importExcel.importXLS();
		System.out.println(list.size());
		for(int i = 0;i<list.size();i++) {
			
			System.out.println(list.get(i).getDistrict());
			System.out.println(list.get(i).getPostcode());
		}
		
		
	}
}
