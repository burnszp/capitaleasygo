package com.esoon.capitaleasygo.action.capitallibraryhandle.util;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import com.esoon.capitaleasygo.action.capitallibraryhandle.entity.Attribute;

public class CustomerPropertiesExcel2Xml {
//	public static final String[] fieldNames = {
//			CapitalConstants.BMYXJB, CapitalConstants.SYFW,
//			CapitalConstants.BMZT, CapitalConstants.BMLX,
//			CapitalConstants.FLDM, CapitalConstants.FLMC,
//			CapitalConstants.SJBM, CapitalConstants.GROUPNAME,
//			CapitalConstants.MC, CapitalConstants.JC,
//			CapitalConstants.XH, CapitalConstants.XHGG,
//			CapitalConstants.GYSQC, CapitalConstants.ZLDJ,
//			CapitalConstants.ZGF, CapitalConstants.XXGF,
//			CapitalConstants.FZXS, CapitalConstants.WXCC,
//			CapitalConstants.ZYTJ, CapitalConstants.FJXY,
//			CapitalConstants.SFJK, CapitalConstants.JLDW,
//			CapitalConstants.SSML, CapitalConstants.SJLY,
//			CapitalConstants.PART_NUMBER, 
////			CapitalConstants.MS,
////			CapitalConstants.KTH,
////			CapitalConstants.CTCONN_CZCONF,
////			CapitalConstants.XPT, CapitalConstants.CST,
////			CapitalConstants.SPECIFICATION,
////			CapitalConstants.ZPMALE_KSFEMALE,
////			CapitalConstants.MATING,
////			CapitalConstants.BZ,
////			CapitalConstants.YL1, CapitalConstants.YL2
//			};
//	public static final String[] attrNames = { "编码优选级别", "适用范围", "编码状态",
//			"编码类型", "元器件分类编号", "分类名称", "设计编码", "连接器类型", "元器件名称", "元器件简称", "型号", "规格型号",
//			"供应商全称", "质量等级", "总规范", "详细规范", "封装形式", "外形尺寸", "专用条件", "附加协议",
//			"是否进口", "计量单位", "所属目录", "数据来源", "PART NUMBER",
////			"描述", "壳体号",
////			"插头CONN/插座CONF", "型谱图", "侧视图", "specification", "针Pmale/孔Sfemale",
////			"mating", 
////			"备注", "预留1", "预留2" 
//			};
//	public static final String[] attrNames = { "编码优选级别", "适用范围", "编码状态",
//		"编码类型", "分类代码", "分类名称", "设计编码", "元器件分类", "名称", "简称", "型号", "型号规格",
//		"供应商全称", "质量等级", "总规范", "详细规范", "封装形式", "外形尺寸", "专用条件", "附加协议",
//		"是否进口", "计量单位", "所属目录", "数据来源", "PART NUMBER",
//			"描述", "壳体号",
//			"插头CONN/插座CONF", "型谱图", "侧视图", "specification", "针Pmale/孔Sfemale",
//			"mating", 
//		"备注", "预留1", "预留2" };

	public static boolean customerPropertiesExcel2Xml(String mergedExcelFilePath) throws Exception {
		// 获得Excel中的数据
		List<String[]> componentArrList = GetExcelDataUtil.getComponentArrs(mergedExcelFilePath);

		List<List<Attribute>> listList = arrList2AttList(componentArrList);
		show(listList);

		LibraryPartImporter liraryPartImporter = new LibraryPartImporter();
		if(liraryPartImporter.liraryPartInsertOrUpdate(listList)){
			 JOptionPane.showMessageDialog(null, "用户自定义数据Excel格式转换成Xml成功!");
			 return true;
		}else{
			JOptionPane.showMessageDialog(null, "用户自定义数据Excel格式转换成Xml失败!");
			return false;
		}
	}

	private static void show(List<List<Attribute>> listList) {
		for (int i=0;i<listList.size();i++) {
			System.out.println(i+": ");
			List<Attribute> attrs = listList.get(i);
			for (Attribute attr : attrs) {
				System.out.print(attr.getAttrName()+"===");
				System.out.print(attr.getFieldName()+"===");
				System.out.print(attr.getAttrValue()+"===");
				System.out.println();
			}
			System.out.println("---------------------------------------");
		}
	}

	public static List<List<Attribute>> arrList2AttList(
			List<String[]> componentArrList) {
		List<List<Attribute>> lists = new ArrayList<List<Attribute>>();
		for (String[] strings : componentArrList) {
			List<Attribute> attrList = new ArrayList<Attribute>();
			for (int i = 0; i < strings.length; i++) {
				Attribute att = new Attribute();
				att.setFieldName(PropertieUtil.getExcelHeaders_EN_Property()[i]);
				att.setAttrName(PropertieUtil.getExcelHeaders_ZH_Property()[i]);
				att.setAttrValue(strings[i]);
				attrList.add(att);
			}
			lists.add(attrList);
		}
		return lists;
	}
}
