package com.qm.util;

public class DocumentStatusToStr {
	public static String statusToStr (String status) {
		if(status.equals("A")) {
			return "创建";
		}else if(status.equals("B")) {
			return "提交";
		}else if(status.equals("C")) {
			return "已审核";
		}else if(status.equals("D")) {
			return "重新审核";
		}else if(status.equals("Z")) {
			return "暂存";
		}else {
			return "";
		}
		
	}
}
