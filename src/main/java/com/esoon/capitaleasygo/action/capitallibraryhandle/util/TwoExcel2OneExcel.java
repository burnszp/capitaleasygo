package com.esoon.capitaleasygo.action.capitallibraryhandle.util;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//两个Excel根据设计编码生成一个新的Excel
public class TwoExcel2OneExcel {
	private static List<ComponentModel> mergedComponentList;
	private static File mergedExcelFile;
	public static File twoExcelMergeOneExcel(String khExcelFilePath, String jkExcelFilePath) {
		try {
			ReadExcel readExcel = new ReadExcel();
			//获得客户提供的数据信息
			List<ComponentModel> kehuComponents = readExcel.readExcel(khExcelFilePath);
			//获得建库提供的数据信息
			List<ComponentModel> jiankuCOmponnets = readExcel.readExcel(jkExcelFilePath);
			Map<String, ComponentModel> jkMap = new HashMap<String, ComponentModel>();
			if(jiankuCOmponnets != null && jiankuCOmponnets.size()>0){
				for (ComponentModel componentModel : jiankuCOmponnets) {
					jkMap.put(componentModel.getSjbm(), componentModel);
				}
			}
			//合并两个数据信息
			merge2List(kehuComponents,jkMap);
			//输出到一个Excel表中
			mergedExcelFile = new File(PropertieUtil.getPropertieUtil().getValue(ConstantsUtil.MERGE_XLS_PATH).split("\\.")[0] +System.currentTimeMillis()+ ".xls");
			if(!mergedExcelFile.exists()){
				mergedExcelFile.createNewFile();
			}
			PoiUtil.getPoiUtil().writeList2Excel2("元器件信息", PropertieUtil.getExcelHeaders_ZH(), mergedComponentList,mergedExcelFile );
			return mergedExcelFile;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}

	private static void merge2List(List<ComponentModel> kehuComponents,
			Map<String, ComponentModel> jkMap) {
		mergedComponentList = new ArrayList<ComponentModel>();
//		if(kehuComponents.size() == jkMap.size()){
			int row = kehuComponents.size();
			for (int i = 0; i < row; i++) {
				ComponentModel kh = kehuComponents.get(i);
				String sjbm = kh.getSjbm();//获得客户的设计编码
				ComponentModel jk = jkMap.get(sjbm);
				if(jk!= null){
					//开始合并每个元器件
					kh.setGroupName(jk.getGroupName());
					kh.setPartNumber(jk.getPartNumber());
				}
				mergedComponentList.add(kh);
			}
//		}
	}

	public static File getMergedExcelFile() {
		return mergedExcelFile;
	}

	public static void setMergedExcelFile(File mergedExcelFile) {
		TwoExcel2OneExcel.mergedExcelFile = mergedExcelFile;
	}
}
