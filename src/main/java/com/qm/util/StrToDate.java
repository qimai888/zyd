package com.qm.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StrToDate {
	public   Date StrToDate(String str) throws ParseException { 
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
		Date date = null; 
		if(!str.equals(" ") &&  str != null) {
			String str1 = str.replace("T", " ");
			if(str1.indexOf(".")== -1) {
				date = format.parse(str1); 
				
			}else {
				String[] split = str1.split("\\.");
				
				date = format.parse(split[0]); 
			}
		}
		
		return date;
	}	
	/*public static void main(String[] args) throws ParseException {
		String str = "2019-05-21T16:39:37.44";
		StrToDate obj = new StrToDate();
		Date strToDate = obj.StrToDate(str);
		System.out.println(strToDate);
	}*/
}
