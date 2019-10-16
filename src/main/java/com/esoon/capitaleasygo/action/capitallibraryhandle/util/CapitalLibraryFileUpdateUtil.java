package com.esoon.capitaleasygo.action.capitallibraryhandle.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

import com.acconsys.capital.lib.entity.DocumentBase;
import com.acconsys.capital.lib.entity.LibraryPartBaseType;

public class CapitalLibraryFileUpdateUtil {

	public void importDesign2(String xmlFilePath, String updateDesignName,
			String updateRevision, String designNode) throws Exception {
		// 1将设计文件经过适当的修改，变为可用，具体为：
		/**
		 * 1.1在表头<?xml version="1.0" encoding="UTF-8"?>后面添加 <!DOCTYPE project
		 * PUBLIC "-//Mentor Graphics Corporation//Project 2014.1//EN"
		 * "E:/MentorGraphics/Capital2014.1/dtd/project.dtd">
		 */
		SAXReader saxReader = new SAXReader();
		Document document = saxReader.read(new File(xmlFilePath));
		document.addDocType("project",
				"-//Mentor Graphics Corporation//Project 2014.1//EN",
				"E:/MentorGraphics/Capital2014.1/dtd/project.dtd");

		/**
		 * 1.2根节点project下的dtdversion属性去掉。
		 */
		Element root = document.getRootElement();
		Attribute dtdversionAttr = root.attribute("dtdversion");
		String dtdversionValue = dtdversionAttr.getValue();
		System.out.println("当前dtdversion的值为：" + dtdversionValue);
		boolean removeResult = root.remove(dtdversionAttr);
		if (removeResult) {
			System.out.println("project根目录下的dtdversion属性删除成功");
		}

		// 2、把设计名称和设计版本替换掉文件中存在的设计名称和设计版本。
		List<Element> designList = root.element("designmgr").elements(
				designNode);
		if (designList != null && designList.size() == 1) {
			Element designElement = designList.get(0);
			Attribute nameAttr = designElement.attribute("name");
			System.out.println("之前的名字是：" + nameAttr.getValue());
			nameAttr.setValue(updateDesignName);

			Attribute revisionAttr = designElement.attribute("version");
			System.out.println("之前的版本是：" + revisionAttr.getValue());
			revisionAttr.setValue(updateRevision);

			// 3、全部修改完毕后，把修改过的内容写入新的文件中，为导入做准备：
			String newXmlPath = new File(xmlFilePath).getParent() + "/"
					+ updateDesignName + "[" + updateRevision + "]" + ".xml";

			try {
				/** 将document中的内容写入文件中 */
				XMLWriter writer = new XMLWriter(new FileWriter(new File(
						newXmlPath)));
				writer.write(document);
				writer.close();
				System.out.println("文件修改完成！文件位置是： " + newXmlPath);
				/** 执行成功,需返回1 */
			} catch (Exception ex) {
				ex.printStackTrace();
			}

			// 4、开始导入设计源文件
			// String payload = "<import designprojectname=\""
			// + currentProjectName + "\"/>";
			// CisServer service = new CisServer("127.0.0.1", 49901);
			// URL serviceUrl = service.getDesignImporterService();
			// CHSRequest request = new CHSRequest();
			// request.setUsername("test");
			// request.setPassword("test");
			// request.setPayload(payload);
			// request.build(true, newXmlPath);
			// SOAPClient client = new SOAPClient();
			// client.callService(request, serviceUrl);
		}
		//

	}

	/**
	 * 给capital library 库文件(xml格式)中所有的元器件的partnumber属性添加后缀
	 * 
	 * @param xmlFilePath
	 * @param suffix
	 * @return
	 * @throws Exception
	 */
	public static File xmlUpdate1(String xmlFilePath, String suffix)
			throws Exception {
		// 1将设计文件经过适当的修改，变为可用，具体为：
		/**
		 * 1.1在表头<?xml version="1.0" encoding="UTF-8"?>后面添加 <!DOCTYPE project
		 * PUBLIC "-//Mentor Graphics Corporation//Project 2014.1//EN"
		 * "E:/MentorGraphics/Capital2014.1/dtd/project.dtd">
		 */
		SAXReader saxReader = new SAXReader();
		Document document = saxReader.read(new File(xmlFilePath));
		// document.addDocType("project",
		// "-//Mentor Graphics Corporation//Project 2014.1//EN",
		// "E:/MentorGraphics/Capital2014.1/dtd/project.dtd");

		/**
		 * 1.2根节点project下的dtdversion属性去掉。
		 */

		List list = document.selectNodes("//@partnumber");
		Iterator iter = list.iterator();
		File newXmlFile = null;
		while (iter.hasNext()) {
			Attribute attribute = (Attribute) iter.next();
			System.out.println("partnumber之前为： " + attribute.getValue());
			attribute.setValue(attribute.getValue() + suffix);
			System.out.println("partnumber添加后缀后为： " + attribute.getValue());
		}
		// 3、全部修改完毕后，把修改过的内容写入新的文件中，为导入做准备：
		String newXmlPath = new File(xmlFilePath).getParent() + "/"
				+ System.currentTimeMillis() + ".xml";
		newXmlFile = new File(newXmlPath);
		try {
			/** 将document中的内容写入文件中 */
			XMLWriter writer = new XMLWriter(new FileOutputStream(newXmlFile));
			writer.write(document);
			writer.close();
			System.out.println("文件修改完成！文件位置是： " + newXmlPath);
			/** 执行成功,需返回1 */
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return newXmlFile;

	}

	/**
	 * 
	 * @param xmlFilePath
	 * @param suffix
	 * @return
	 * @throws Exception
	 */

	public static File xmlUpdate2(String xmlFilePath, String suffix)
			throws Exception {
		// Map<String,List<String>> partnumberMap = new TreeMap<String,
		// List<String>>();
		System.out.println(xmlFilePath+"============");
		File xmlFile = new File(xmlFilePath);
		File xmlFileParentDir = xmlFile.getParentFile();
		String importTempXml = xmlFileParentDir.getAbsolutePath()+"\\"+"importTempXmlAddedSuffix8Y.xml";
		String importReplacedXml = xmlFileParentDir.getAbsolutePath()+"\\"+ "importReplacedXmlAddedSuffix8Y.xml";

		DocumentBase documentBase = ParseXmlTest.getXml4TypeComp(xmlFilePath);
		for (LibraryPartBaseType libraryPartBaseType : ParseXmlTest
				.getLibraryPartBaseTypeList()) {
			String newPartnumber = libraryPartBaseType.getPartnumber() + suffix;
			if (newPartnumber.length() > 30) {
				libraryPartBaseType.setPartnumber(newPartnumber
						.substring(0, 30));
			}else{
				libraryPartBaseType.setPartnumber(newPartnumber);
			}
			// String length = String.valueOf(partnumber.length());
			// if(partnumberMap.get(length) == null){
			// List<String> partnumberList = new ArrayList<String>();
			// partnumberList.add(partnumber);
			// partnumberMap.put(length, partnumberList);
			// }else{
			// partnumberMap.get(length).add(partnumber);
			// }

		}
		// for (String length : partnumberMap.keySet()) {
		// System.out.println("长度为:=="+length+"的元器件共有"+partnumberMap.get(length).size());
		// }

		JAXBElement<DocumentBase> je = new JAXBElement<DocumentBase>(new QName(
				"http://www.mentor.com/harness/Schema/LibrarySchema",
				"chssystem"), DocumentBase.class, documentBase);
		System.out.println("第一步");
		JAXBUtils.object2Xml(je, importTempXml);
		System.out.println("第二步");
		JAXBUtils.contentReplace(importTempXml, importReplacedXml);
		return new File(importReplacedXml);

	}

	/**
	 * 对Excel表格的partnumber列添加后缀
	 * 
	 * @param trim
	 * @param suffix
	 * @return
	 */
	public static File excelUpdate2(String excelFilePath, String suffix) {
		// 3、全部修改完毕后，把修改过的内容写入新的文件中，为导入做准备：
		String newXmlPath = new File(excelFilePath).getParent() + "/"
				+ System.currentTimeMillis() + ".xls";
		File newXmlFile = new File(newXmlPath);
		HSSFWorkbook workbook = null;
		try {
			workbook = new HSSFWorkbook(new FileInputStream(excelFilePath));
			HSSFSheet sheet = workbook.getSheetAt(0);
			for (int i = 1; i <= sheet.getLastRowNum(); i++) {
				HSSFRow row = sheet.getRow((short) i);
				if (null == row) {
					continue;
				} else {
					HSSFCell cell = row.getCell(24);
					if (null == cell) {
						continue;
					} else {
						StringBuffer sb = new StringBuffer(
								cell.getStringCellValue());
						System.out.println("Excel中之前的PART NUMBER为:"
								+ sb.toString());
						sb.append(suffix);
						System.out.println("Excel中之后的PART NUMBER为:"
								+ sb.toString());
						cell.setCellValue(sb.toString());
					}
				}
			}

			FileOutputStream fileOut = new FileOutputStream(newXmlFile);
			workbook.write(fileOut);
			fileOut.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return newXmlFile;
	}
}
