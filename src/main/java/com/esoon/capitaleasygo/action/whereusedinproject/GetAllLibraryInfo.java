package com.esoon.capitaleasygo.action.whereusedinproject;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.dom4j.Element;

public class GetAllLibraryInfo {

	private Map<String, List<String>> partNumberMap;
	public List<Element> allPartList;
	public List<String> allPartNumberList;
	private Element root;
	public final String[] headers = { "器件型号", "器件名称", "器件类型", "管脚数", "器件描述",
			"颜色", "材料", "院物资编码", "所物资编码", "集团物资编码", "质量等级", "详细规范", "生产厂家" };

	public GetAllLibraryInfo() {
//		partNumberMap = new HashMap<String, List<String>>();
//		allPartList = new ArrayList<Element>();
//		allPartNumberList = new ArrayList<String>();
//		String xmlPath = PropertieUtil.getPropertieUtil().getValue(
//				Constants.LIBRARYPATH);
//		try {
//			SAXReader reader = new SAXReader();
//			Document document = reader.read(new FileInputStream(xmlPath));
//			root = document.getRootElement();
//			List<Element> elementsList2 = root.elements();
//
//			// System.out.println("根目录下的所有子节点个数：" + elementsList2.size());
//			for (Element element : elementsList2) {
//				if (element.getName().endsWith("part")) {
//					allPartNumberList.add(element.attribute("partnumber")
//							.getValue());
//				}
//			}
//			System.out.println("partNumber个数有：" + allPartNumberList.size());
			Map<String, ComponentInfoModel2> componentInfoMap = ExportPartsUsedInLibrary
					.getComponentInfoByPartNumber2();
			writeMap2Excel(componentInfoMap);
//		} catch (Exception e) {
//
//			e.printStackTrace();
//		}

	}

	private void writeMap2Excel(
			Map<String, ComponentInfoModel2> componentInfoMap) {
		List<ComponentInfoModel2> eList = convertMap2ExcelModelList2(componentInfoMap);
		PropertieUtil propertieUtil = new PropertieUtil().getPropertieUtil();
		String allLibraryXLSPath = propertieUtil
				.getValue(Constants.ALLLIBRARYXLSPATH);
		File outFile = new File(allLibraryXLSPath);
		if (!outFile.exists()) {
			try {
				outFile.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		PoiUtil.getPoiUtil().writeList2Excel2("元器件信息使用情况", headers, eList,
				outFile);

	}

	private List<ComponentInfoModel2> convertMap2ExcelModelList2(
			Map<String, ComponentInfoModel2> componentInfoMap) {
		List<ComponentInfoModel2> eList = new ArrayList<ComponentInfoModel2>();
		for (String partNumber : componentInfoMap.keySet()) {
			eList.add(componentInfoMap.get(partNumber));
		}
		return eList;
	}

	// public static void getPartNumberList(String elementName) {
	// // String elementName = convertGroupName2XMLPart(groupName);
	// if (elementName != null) {
	// List<Element> elementList = root.elements(elementName);
	// System.out.println(elementName + "共有元素个数：" + elementList.size());
	// List<String> partNumberList = new ArrayList<String>();
	// for (Element e : elementList) {
	// Attribute partNumberAttribute = e.attribute("partnumber");
	// String partNumber = partNumberAttribute.getValue();
	// partNumberList.add(partNumber);
	// System.out.println(partNumber);
	// }
	// partNumberMap.put(elementName, partNumberList);
	// }
	// }
}
