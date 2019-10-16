package com.esoon.capitaleasygo.action.capitallibraryhandle.util;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.dom4j.Element;

import com.esoon.capitaleasygo.action.capitallibraryhandle.entity.ComponentInfoModel;

public class GetAllLibraryInfo {

	private Map<String, List<String>> partNumberMap;
	public List<Element> allPartList;
	public List<String> allPartNumberList;
	private Element root;
	// public final String[] headers = {
	// "编码优选级别","编码状态","编码类型","所属目录","数据来源","备注","预留1","预留2","器件型号", "器件名称",
	// "器件类型", "管脚数", "器件描述",
	// "颜色", "材料", "院物资编码", "所物资编码", "集团物资编码", "质量等级", "详细规范", "生产厂家" };
	// public final String[] headers = { "编码优选级别", "适用范围", "编码状态", "编码类型",
	// "分类代码",
	// "分类名称", "设计编码", "元器件分类", "名称", "简称", "型号", "型号规格", "供应商全称", "质量等级",
	// "总规范", "详细规范", "封装形式", "外形尺寸", "专用条件", "附加协议", "是否进口", "计量单位",
	// "所属目录", "数据来源", "PART NUMBER", "描述", "插头CONN/插座CONF", "型谱图/侧视图",
	// "specification", "针Pmale/孔Sfemale", "mating", "备注", "预留1", "预留2" };
	private File returnOutFile;

	public  GetAllLibraryInfo(String jkXmlPath, String compType) {
		Map<String, ComponentInfoModel> componentInfoMap = ExportPartsUsedInLibrary
				.getComponentInfoByXml(jkXmlPath,compType);
		writeMap2Excel(componentInfoMap);

	}

//	public GetAllLibraryInfo(String jkXmlPath, String compType) {
//		PropertieUtil propertieUtil = PropertieUtil.getPropertieUtil();
//		if(ConstantsUtil.EMPTY.equals(compType)){
//			new GetAllLibraryInfo(jkXmlPath);
//		}else if((propertieUtil.getValue(ConstantsUtil.CONNECTOR)).equals(compType)){
//			
//		}
//	}

	private void writeMap2Excel(Map<String, ComponentInfoModel> componentInfoMap) {
		List<ComponentInfoModel> eList = convertMap2ExcelModelList2(componentInfoMap);
		PropertieUtil propertieUtil = PropertieUtil.getPropertieUtil();
		
		String allLibraryXLSPath = propertieUtil
				.getValue(ConstantsUtil.JIANKU_XML2Excel_PATH).split("\\.")[0] +ConstantsUtil.UNDERLINE+ System.currentTimeMillis() + ".xls";
		System.out.println(allLibraryXLSPath);
		File outFile = new File(allLibraryXLSPath);
		if (!outFile.exists()) {
			try {
				outFile.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		returnOutFile = PoiUtil.getPoiUtil().writeList2Excel("元器件信息使用情况",
				PropertieUtil.getExcelHeaders_ZH(), eList, outFile);

	}

	private List<ComponentInfoModel> convertMap2ExcelModelList2(
			Map<String, ComponentInfoModel> componentInfoMap) {
		List<ComponentInfoModel> eList = new ArrayList<ComponentInfoModel>();
		for (String partNumber : componentInfoMap.keySet()) {
			eList.add(componentInfoMap.get(partNumber));
		}
		return eList;
	}

	public File getReturnOutFile() {
		return returnOutFile;
	}

	public void setReturnOutFile(File returnOutFile) {
		this.returnOutFile = returnOutFile;
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
