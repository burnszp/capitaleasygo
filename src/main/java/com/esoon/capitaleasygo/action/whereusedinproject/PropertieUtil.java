package com.esoon.capitaleasygo.action.whereusedinproject;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

import javax.swing.JOptionPane;

public class PropertieUtil extends Object {

	private static PropertieUtil propertieUtil;
	private static final String PROPERTIESFILEPATH = "/WhereUsedInProject.properties";
	private static Properties properties;

	public PropertieUtil getPropertieUtil() {
		if (propertieUtil == null) {
			propertieUtil = new PropertieUtil();
			if (properties == null) {
				properties = new Properties();

				try {
					// FileInputStream input = new FileInputStream();
//					properties.load(getClass().getResourceAsStream(
//							"WhereUsedInProject.properties"));
					System.out.println(new File(System.getProperty("user.dir")+"/resources/WhereUsedInProject.WhereUsedInProject.properties").getAbsolutePath());
					properties.load(new FileInputStream(new File(System.getProperty("user.dir")+"/resources/WhereUsedInProject/WhereUsedInProject.properties")));
					
					// properties.load(input);
				} catch (Exception e) {
					e.printStackTrace();
					JOptionPane.showMessageDialog(null, "读取配置文件失败，请检查jar包中得配置文件【WhereUsedInProject.properties】");
				}

			}

		}
		return propertieUtil;
	}

	public String getValue(String key) {
		String value = null;
		try {
			value = (String) properties.get(key);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;
	}

}
