package com.esoon.capitaleasygo.action.capitallibraryhandle.util;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;

import javax.swing.JOptionPane;

public class PropertieUtil {

	private static PropertieUtil propertieUtil;
	private static final String PROPERTIESFILEPATH = "capital_8y_cs.properties";
	private static Properties properties;
	
	public static PropertieUtil getPropertieUtil(){
		if(propertieUtil == null){
			propertieUtil = new PropertieUtil();
			if(properties == null){
				properties = new Properties();
				File propertiesFile = new File(PROPERTIESFILEPATH);
				if(propertiesFile.exists()){
					try {
						InputStream is = new BufferedInputStream (new FileInputStream(propertiesFile));
						properties.load(new InputStreamReader(is, "UTF-8"));
//						FileInputStream input = new FileInputStream(propertiesFile);
//						properties.load(input);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}else{
					JOptionPane.showMessageDialog(null, "没有找到配置文件");
				}
				
			}
			
		}
		return propertieUtil;
	}
	
	public String getValue(String key){
		String value = null;
		try {
			value = (String) properties.get(key);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value.trim();
	}
	
	public static String[] getExcelHeaders_ZH(){
		PropertieUtil propertieUtil = PropertieUtil.getPropertieUtil();
		String excelHeader = propertieUtil.getValue(ConstantsUtil.EXCEL_HEADERS_ZH);
		String[] excelHeaders = excelHeader.split("\\|");
		for (int i=0;i<excelHeaders.length;i++) {
			System.out.println(i+": " + excelHeaders[i]);
		}
		return excelHeaders;
	}
	public static String[] getExcelHeaders_EN(){
		PropertieUtil propertieUtil = PropertieUtil.getPropertieUtil();
		String excelHeader = propertieUtil.getValue(ConstantsUtil.EXCEL_HEADERS_EN);
		String[] excelHeaders = excelHeader.split("\\|");
		for (int i=0;i<excelHeaders.length;i++) {
			System.out.println(i+": " + excelHeaders[i]);
		}
		return excelHeaders;
	}
	public static String[] getExcelHeaders_ZH_Property(){
		PropertieUtil propertieUtil = PropertieUtil.getPropertieUtil();
		String excelHeader = propertieUtil.getValue(ConstantsUtil.EXCEL_HEADERS_ZH);
		String[] excelHeaders = excelHeader.split("PART NUMBER");
		String[] excelHeaders_property = excelHeaders[0].split("\\|");
		String[] excelHeaders_propertyAndPartnumber = new String[excelHeaders[0].split("\\|").length+1];
		for (int i=0;i<excelHeaders_property.length;i++) {
//			System.out.println(i+": " + excelHeaders_property[i]);
			excelHeaders_propertyAndPartnumber[i] = excelHeaders_property[i];
		}
		excelHeaders_propertyAndPartnumber[excelHeaders_property.length] = "PART NUMBER";
		return excelHeaders_propertyAndPartnumber;
	}
	public static String[] getExcelHeaders_EN_Property(){
		PropertieUtil propertieUtil = PropertieUtil.getPropertieUtil();
		String excelHeader = propertieUtil.getValue(ConstantsUtil.EXCEL_HEADERS_EN);
		String[] excelHeaders = excelHeader.split("PART NUMBER");
		String[] excelHeaders_property = excelHeaders[0].split("\\|");
		String[] excelHeaders_propertyAndPartnumber = new String[excelHeaders[0].split("\\|").length+1];
		for (int i=0;i<excelHeaders_property.length;i++) {
//			System.out.println(i+": " + excelHeaders_property[i]);
			excelHeaders_propertyAndPartnumber[i] = excelHeaders_property[i];
		}
		excelHeaders_propertyAndPartnumber[excelHeaders_property.length] = "PART NUMBER";
		return excelHeaders_propertyAndPartnumber;
	}
	
	public static void main(String[] args) {
//		PropertieUtil propertieUtil = PropertieUtil.getPropertieUtil();
//		System.out.println("cis.port:" + propertieUtil.getValue("cis.port"));
		String[] headerEnProperty = getExcelHeaders_EN_Property();
		for (String string : headerEnProperty) {
			System.out.println(string);
		}
		String[] headerZHProperty = getExcelHeaders_ZH_Property();
		for (String string : headerZHProperty) {
			System.out.println(string);
		}
	}
}
