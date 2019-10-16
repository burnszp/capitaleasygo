package com.esoon.capitaleasygo.action.capitallibraryhandle.entity;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.esoon.capitaleasygo.action.capitallibraryhandle.util.Constants;
import com.esoon.capitaleasygo.action.capitallibraryhandle.util.ListUtil;
import com.esoon.capitaleasygo.action.capitallibraryhandle.util.PoiUtil;
import com.esoon.capitaleasygo.action.capitallibraryhandle.util.PropertieUtil;

public class ParseTest {

	private static String[] headers_zh;
	private static String[] headers_en;
//	private List<BaseModel> dataList;
	private File outFile;
	private BaseDocument_0830 baseDocument;
	private HashMap<String, String> chsUserPropertyPartMap;
	private HashMap<String, String> chsUserPropertyMap;
	private HashMap<String, String> connChsUserPropertyPartMap;
	private List<ChsUserPropertyPart> chsUserPropertyPartList;
	private ArrayList<ChsUserPropertyPart> usedChsUserPropertyPartList;
	private HashMap<String, String> backshellChsUserPropertyPartMap;
	private HashMap<String, String> otherChsUserPropertyPartMap;
	private HashMap<String, String> terminalChsUserPropertyPartMap;
	private List<LibraryComponentType> libraryComponentTypeList;
	private HashMap<String, String> libraryComponentTypeMap;
	private HashMap<String, List<String>> libraryGraphicMap;
	private List<LibraryGraphic> libraryGraphicList;
	private List<SupplierPartnumber> supplierPartnumberList;
	private HashMap<String, List<String>> supplierPartnumberMap;
	private List<LibraryCavity> libraryCavityList;
	private HashMap<String, List<String>> libraryCavityMap;
	private List<LibraryMating> libraryMatingList;
	private HashMap<String, List<String>> libraryMatingMap;
	private HashMap<String, String> allModelMap;

	public void testSAX(String xmlPath, String xlsPath) throws Exception {
		SaxParseService_0830 sax = new SaxParseService_0830();
		// InputStream input =
		// this.getClass().getClassLoader().getResourceAsStream("book.xml");
		InputStream input = new FileInputStream(new File(xmlPath));
		baseDocument = sax.getBaseDocument(input);


		/**
		 * 获得表格表头
		 */
//		headers = Constants.XLSHEADERS.split("\\|");
		headers_zh = PropertieUtil.getExcelHeaders_ZH();
		headers_en = PropertieUtil.getExcelHeaders_EN();

		/**
		 * 每个连接器封装自定义属性
		 */
		// 1.获得自定义属性的名字map集合
		chsUserPropertyMap = new HashMap<String, String>();
		List<ChsUserProperty> chsUserPropertyList = baseDocument.getBaseData()
				.getChsUserPropertyList();
		for (ChsUserProperty chsUserProperty : chsUserPropertyList) {
			chsUserPropertyMap.put(chsUserProperty.getChsuserproperty_id(),
					chsUserProperty.getUserpropertyname());
		}
		// 2.获得自定义属性值的map集合
		chsUserPropertyPartList = baseDocument.getBaseData()
				.getChsUserPropertyPartList();
		// typeCode集合map
		libraryComponentTypeList = baseDocument.getBaseData()
				.getLibraryComponentTypeList();
		libraryComponentTypeMap = new HashMap<String, String>();
		for (LibraryComponentType libraryComponentType : libraryComponentTypeList) {
			libraryComponentTypeMap.put(
					libraryComponentType.getLibrarycomponenttype_id(),
					libraryComponentType.getTypecode());
		}
		// symbol集合map
		libraryGraphicList = baseDocument.getBaseData().getLibraryGraphicList();
		libraryGraphicMap = new HashMap<String, List<String>>();
		for (LibraryGraphic libraryGraphic : libraryGraphicList) {
			String libraryObjectId = libraryGraphic.getLibraryobject_id();
			if (libraryGraphicMap.get(libraryObjectId) == null) {
				List<String> symbolList = new ArrayList<String>();
				symbolList.add(libraryGraphic.getSymbol_id());
				libraryGraphicMap.put(libraryGraphic.getLibraryobject_id(),
						symbolList);
			} else {
				libraryGraphicMap.get(libraryObjectId).add(
						libraryGraphic.getSymbol_id());
			}
		}
		// supplier的Specification集合map
		supplierPartnumberList = baseDocument.getBaseData()
				.getSupplierPartnumberList();
		supplierPartnumberMap = new HashMap<String, List<String>>();
		for (SupplierPartnumber supplierPartnumber : supplierPartnumberList) {
			String libraryObjectId = supplierPartnumber.getLibraryobject_id();
			if (supplierPartnumberMap.get(libraryObjectId) == null) {
				List<String> supplierPartnumberList = new ArrayList<String>();
				supplierPartnumberList.add(supplierPartnumber
						.getSpecification());
				supplierPartnumberMap.put(
						supplierPartnumber.getLibraryobject_id(),
						supplierPartnumberList);
			} else {
				supplierPartnumberMap.get(libraryObjectId).add(
						supplierPartnumber.getSpecification());
			}
		}

		// 针Pmale/孔Sfemale
		libraryCavityList = baseDocument.getBaseData().getLibraryCavityList();
		libraryCavityMap = new HashMap<String, List<String>>();
		for (LibraryCavity libraryCavity : libraryCavityList) {
			String graphicType = libraryCavity.getPingraphic();
			String libraryObjectId = libraryCavity.getLibrarypincontainer_id();
			if (libraryCavityMap.get(libraryObjectId) == null) {
				List<String> tempList = new ArrayList<String>();
				tempList.add(graphicType);
				libraryCavityMap.put(libraryObjectId, tempList);
			} else if (!libraryCavityMap.get(libraryObjectId).contains(
					graphicType)) {
				libraryCavityMap.get(libraryObjectId).add(graphicType);
			}
		}

		// mating
		libraryMatingList = baseDocument.getBaseData().getLibraryMatingList();
		libraryMatingMap = new HashMap<String, List<String>>();
		for (LibraryMating libraryMating : libraryMatingList) {
			String libraryObjectId = libraryMating.getLibraryobject_id();
			String matingLibraryObjectId = libraryMating.getMatedconnector_id();
			if (libraryMatingMap.get(libraryObjectId) == null) {
				List<String> tempList = new ArrayList<String>();
				tempList.add(matingLibraryObjectId);
				libraryMatingMap.put(libraryObjectId, tempList);
			} else if (!libraryMatingMap.get(libraryObjectId).contains(
					matingLibraryObjectId)) {
				libraryMatingMap.get(libraryObjectId)
						.add(matingLibraryObjectId);
			}
		}


		// 获得元器件UID和partnumber的映射map集合
		List<BaseModel> allModelList = baseDocument.getBaseModelList();
		allModelMap = new HashMap<String, String>();
		for (BaseModel baseModel : allModelList) {
			allModelMap.put(baseModel.getLibraryobject_id(),
					baseModel.getPartNumber());
		}
		// 3.1处理连接器
		for (BaseModel baseModel : allModelList) {
			connChsUserPropertyPartMap = new HashMap<String, String>();
			String connObjectId = baseModel.getLibraryobject_id();
			for (ChsUserPropertyPart chsUserPropertyPart : chsUserPropertyPartList) {
				usedChsUserPropertyPartList = new ArrayList<ChsUserPropertyPart>();
				if (connObjectId.equals(chsUserPropertyPart
						.getLibraryobject_id())) {
					String Chsuserproperty_id = chsUserPropertyPart
							.getChsuserproperty_id();
					String propertyName = chsUserPropertyMap
							.get(Chsuserproperty_id);
					String propertyValue = chsUserPropertyPart
							.getUserpropertyvalue();
					connChsUserPropertyPartMap.put(propertyName, propertyValue);
					usedChsUserPropertyPartList.add(chsUserPropertyPart);
				}
			}
			baseModel.setTypeCode(libraryComponentTypeMap.get(baseModel
					.getLibrarycomponenttype_id()));
			chsUserPropertyPartList.removeAll(usedChsUserPropertyPartList);
			baseModel.setCuppmMap(connChsUserPropertyPartMap);

			List<String> symbolId = libraryGraphicMap.get(connObjectId);
			if (ListUtil.isNotEmpty(symbolId)) {
				baseModel.setSymbolNameXPT(symbolId.get(0) == null ? ""
						: symbolId.get(0));
				StringBuilder sbCST = new StringBuilder();
				if (symbolId.size() > 1) {
					sbCST.append(symbolId.get(1) == null ? "" : symbolId.get(1));
					for (int i = 2; i < symbolId.size(); i++) {
						sbCST.append("|" + symbolId.get(i));
					}
				}
				baseModel.setSymbolNameCST(sbCST.toString());
			}

			// supplierSpecification
			List<String> supplierPartnumberList = supplierPartnumberMap
					.get(connObjectId);
			if (ListUtil.isNotEmpty(supplierPartnumberList)) {
				StringBuilder sbSupplierPartnumber = new StringBuilder(
						supplierPartnumberList.get(0) == null ? ""
								: supplierPartnumberList.get(0));
				if (supplierPartnumberList.size() > 1) {
					for (int i = 1; i < supplierPartnumberList.size(); i++) {
						sbSupplierPartnumber.append("|"
								+ supplierPartnumberList.get(i));
					}
				}
				baseModel.setSpecification(sbSupplierPartnumber.toString());
			}

			// //针Pmale/孔Sfemale
			if (libraryCavityMap.get(connObjectId) != null) {
				String maleOrFemale = ListUtil
						.getStringFromStringList(libraryCavityMap
								.get(connObjectId));
				baseModel.setMaleOrFemale(maleOrFemale);
			}
			// mating
			List<String> matingLibraryObjectIdList = libraryMatingMap
					.get(connObjectId);
			if (ListUtil.isNotEmpty(matingLibraryObjectIdList)) {
				StringBuilder sb = new StringBuilder();
				sb.append(allModelMap
						.get(matingLibraryObjectIdList.get(0) == null ? ""
								: matingLibraryObjectIdList.get(0)));
				if (matingLibraryObjectIdList.size() > 1) {
					for (int i = 1; i < matingLibraryObjectIdList.size(); i++) {
						sb.append("|"
								+ allModelMap.get(matingLibraryObjectIdList
										.get(i)));
					}
				}
				baseModel.setMating(sb.toString());
			}
		}
		// 3.2处理backshell
//		for (BaseModel baseModel : backShellModelList) {
//			backshellChsUserPropertyPartMap = new HashMap<String, String>();
//			String backshellObjectId = baseModel.getLibraryobject_id();
//			for (ChsUserPropertyPart chsUserPropertyPart : chsUserPropertyPartList) {
//				usedChsUserPropertyPartList = new ArrayList<ChsUserPropertyPart>();
//				if (backshellObjectId.equals(chsUserPropertyPart
//						.getLibraryobject_id())) {
//					String Chsuserproperty_id = chsUserPropertyPart
//							.getChsuserproperty_id();
//					String propertyName = chsUserPropertyMap
//							.get(Chsuserproperty_id);
//					String propertyValue = chsUserPropertyPart
//							.getUserpropertyvalue();
//					backshellChsUserPropertyPartMap.put(propertyName,
//							propertyValue);
//					usedChsUserPropertyPartList.add(chsUserPropertyPart);
//				}
//			}
//			chsUserPropertyPartList.removeAll(usedChsUserPropertyPartList);
//			baseModel.setCuppmMap(backshellChsUserPropertyPartMap);
//
//			List<String> symbolId = libraryGraphicMap.get(backshellObjectId);
//			if (ListUtil.isNotEmpty(symbolId)) {
//				baseModel.setSymbolNameXPT(symbolId.get(0) == null ? ""
//						: symbolId.get(0));
//				StringBuilder sbCST = new StringBuilder();
//				if (symbolId.size() > 1) {
//					sbCST.append(symbolId.get(1) == null ? "" : symbolId.get(1));
//					for (int i = 2; i < symbolId.size(); i++) {
//						sbCST.append("|" + symbolId.get(i));
//					}
//				}
//				baseModel.setSymbolNameCST(sbCST.toString());
//			}
//
//			// supplierSpecification
//			List<String> supplierPartnumberList = supplierPartnumberMap
//					.get(backshellObjectId);
//			if (ListUtil.isNotEmpty(supplierPartnumberList)) {
//				StringBuilder sbSupplierPartnumber = new StringBuilder(
//						supplierPartnumberList.get(0) == null ? ""
//								: supplierPartnumberList.get(0));
//				if (supplierPartnumberList.size() > 1) {
//					for (int i = 1; i < supplierPartnumberList.size(); i++) {
//						sbSupplierPartnumber.append("|"
//								+ supplierPartnumberList.get(i));
//					}
//				}
//				baseModel.setSpecification(sbSupplierPartnumber.toString());
//			}
//
//			// //针Pmale/孔Sfemale
//			if (libraryCavityMap.get(backshellObjectId) != null) {
//				String maleOrFemale = ListUtil
//						.getStringFromStringList(libraryCavityMap
//								.get(backshellObjectId));
//				baseModel.setMaleOrFemale(maleOrFemale);
//			}
//			// mating
//			List<String> matingLibraryObjectIdList = libraryMatingMap
//					.get(backshellObjectId);
//			if (ListUtil.isNotEmpty(matingLibraryObjectIdList)) {
//				StringBuilder sb = new StringBuilder();
//				sb.append(allModelMap.get(matingLibraryObjectIdList.get(0)));
//				if (matingLibraryObjectIdList.size() > 1) {
//					for (int i = 1; i < matingLibraryObjectIdList.size(); i++) {
//						sb.append("|"
//								+ allModelMap.get(matingLibraryObjectIdList
//										.get(i)));
//					}
//				}
//				baseModel.setMating(sb.toString());
//			}
//		}
		// 3.3处理other
//		for (BaseModel baseModel : otherModelList) {
//			otherChsUserPropertyPartMap = new HashMap<String, String>();
//			String otherObjectId = baseModel.getLibraryobject_id();
//			for (ChsUserPropertyPart chsUserPropertyPart : chsUserPropertyPartList) {
//				usedChsUserPropertyPartList = new ArrayList<ChsUserPropertyPart>();
//				if (otherObjectId.equals(chsUserPropertyPart
//						.getLibraryobject_id())) {
//					String Chsuserproperty_id = chsUserPropertyPart
//							.getChsuserproperty_id();
//					String propertyName = chsUserPropertyMap
//							.get(Chsuserproperty_id);
//					String propertyValue = chsUserPropertyPart
//							.getUserpropertyvalue();
//					System.out.println(propertyName + ":"+propertyValue);
//					otherChsUserPropertyPartMap
//							.put(propertyName, propertyValue);
//					usedChsUserPropertyPartList.add(chsUserPropertyPart);
//				}
//			}
//			chsUserPropertyPartList.removeAll(usedChsUserPropertyPartList);
//			baseModel.setCuppmMap(otherChsUserPropertyPartMap);
//
//			List<String> symbolId = libraryGraphicMap.get(otherObjectId);
//			if (ListUtil.isNotEmpty(symbolId)) {
//				baseModel.setSymbolNameXPT(symbolId.get(0) == null ? ""
//						: symbolId.get(0));
//				StringBuilder sbCST = new StringBuilder();
//				if (symbolId.size() > 1) {
//					sbCST.append(symbolId.get(1) == null ? "" : symbolId.get(1));
//					for (int i = 2; i < symbolId.size(); i++) {
//						sbCST.append("|" + symbolId.get(i));
//					}
//				}
//				baseModel.setSymbolNameCST(sbCST.toString());
//			}
//			// supplierSpecification
//			List<String> supplierPartnumberList = supplierPartnumberMap
//					.get(otherObjectId);
//			if (ListUtil.isNotEmpty(supplierPartnumberList)) {
//				StringBuilder sbSupplierPartnumber = new StringBuilder(
//						supplierPartnumberList.get(0) == null ? ""
//								: supplierPartnumberList.get(0));
//				if (supplierPartnumberList.size() > 1) {
//					for (int i = 1; i < supplierPartnumberList.size(); i++) {
//						sbSupplierPartnumber.append("|"
//								+ supplierPartnumberList.get(i));
//					}
//				}
//				baseModel.setSpecification(sbSupplierPartnumber.toString());
//			}
//			// //针Pmale/孔Sfemale
//			if (libraryCavityMap.get(otherObjectId) != null) {
//				String maleOrFemale = ListUtil
//						.getStringFromStringList(libraryCavityMap
//								.get(otherObjectId));
//				baseModel.setMaleOrFemale(maleOrFemale);
//			}
//			// mating
//			List<String> matingLibraryObjectIdList = libraryMatingMap
//					.get(otherObjectId);
//			if (ListUtil.isNotEmpty(matingLibraryObjectIdList)) {
//				StringBuilder sb = new StringBuilder();
//				sb.append(allModelMap.get(matingLibraryObjectIdList.get(0)));
//				if (matingLibraryObjectIdList.size() > 1) {
//					for (int i = 1; i < matingLibraryObjectIdList.size(); i++) {
//						sb.append("|"
//								+ allModelMap.get(matingLibraryObjectIdList
//										.get(i)));
//					}
//				}
//				baseModel.setMating(sb.toString());
//			}
//		}
		// 3.4处理terminal
//		for (BaseModel baseModel : terminalModelList) {
//			terminalChsUserPropertyPartMap = new HashMap<String, String>();
//			String terminalObjectId = baseModel.getLibraryobject_id();
//			for (ChsUserPropertyPart chsUserPropertyPart : chsUserPropertyPartList) {
//				usedChsUserPropertyPartList = new ArrayList<ChsUserPropertyPart>();
//				if (terminalObjectId.equals(chsUserPropertyPart
//						.getLibraryobject_id())) {
//					String Chsuserproperty_id = chsUserPropertyPart
//							.getChsuserproperty_id();
//					String propertyName = chsUserPropertyMap
//							.get(Chsuserproperty_id);
//					String propertyValue = chsUserPropertyPart
//							.getUserpropertyvalue();
//					System.out.println(propertyName+"       :       "+propertyValue);
//					terminalChsUserPropertyPartMap.put(propertyName,
//							propertyValue);
//					usedChsUserPropertyPartList.add(chsUserPropertyPart);
//				}
//			}
//			chsUserPropertyPartList.removeAll(usedChsUserPropertyPartList);
//			baseModel.setCuppmMap(terminalChsUserPropertyPartMap);
//
//			List<String> symbolId = libraryGraphicMap.get(terminalObjectId);
//			if (ListUtil.isNotEmpty(symbolId)) {
//				baseModel.setSymbolNameXPT(symbolId.get(0) == null ? ""
//						: symbolId.get(0));
//				StringBuilder sbCST = new StringBuilder();
//				if (symbolId.size() > 1) {
//					sbCST.append(symbolId.get(1) == null ? "" : symbolId.get(1));
//					for (int i = 2; i < symbolId.size(); i++) {
//						sbCST.append("|" + symbolId.get(i));
//					}
//				}
//				baseModel.setSymbolNameCST(sbCST.toString());
//			}
//			// supplierSpecification
//			List<String> supplierPartnumberList = supplierPartnumberMap
//					.get(terminalObjectId);
//			if (ListUtil.isNotEmpty(supplierPartnumberList)) {
//				StringBuilder sbSupplierPartnumber = new StringBuilder(
//						supplierPartnumberList.get(0) == null ? ""
//								: supplierPartnumberList.get(0));
//				if (supplierPartnumberList.size() > 1) {
//					for (int i = 1; i < supplierPartnumberList.size(); i++) {
//						sbSupplierPartnumber.append("|"
//								+ supplierPartnumberList.get(i));
//					}
//				}
//				baseModel.setSpecification(sbSupplierPartnumber.toString());
//			}
//			// //针Pmale/孔Sfemale
//			if (libraryCavityMap.get(terminalObjectId) != null) {
//				String maleOrFemale = ListUtil
//						.getStringFromStringList(libraryCavityMap
//								.get(terminalObjectId));
//				baseModel.setMaleOrFemale(maleOrFemale);
//			}
//			// mating
//			List<String> matingLibraryObjectIdList = libraryMatingMap
//					.get(terminalObjectId);
//			if (ListUtil.isNotEmpty(matingLibraryObjectIdList)) {
//				StringBuilder sb = new StringBuilder();
//				sb.append(allModelMap.get(matingLibraryObjectIdList.get(0)));
//				if (matingLibraryObjectIdList.size() > 1) {
//					for (int i = 1; i < matingLibraryObjectIdList.size(); i++) {
//						sb.append("|"
//								+ allModelMap.get(matingLibraryObjectIdList
//										.get(i)));
//					}
//				}
//				baseModel.setMating(sb.toString());
//			}
//		}

		/**
		 * 封装表格数据
		 */
//		dataList = new ArrayList<BaseModel>();
//		dataList.put(Constants.CONNECTOR, connectorModelList);
//		dataList.put(Constants.BACKSHELL, backShellModelList);
//		dataList.put(Constants.OTHER, otherModelList);
//		dataList.put(Constants.TERMINAL, terminalModelList);

		/**
		 * 输出文件位置
		 */
		outFile = new File(xlsPath);
		/**
		 * 将数据结果写入到Excel中，每种元器件写入到一个表中，只生成一个工作薄
		 */
		PoiUtil.getPoiUtil().writeList2Excel(headers_zh,headers_en, allModelList,
				outFile);
	}

	public static void main(String[] args) {
		try {
			ParseTest parseTest = new ParseTest();
			parseTest.testSAX(Constants.AllLIBXMLPATH,
					Constants.XLSNAME + System.currentTimeMillis() + ".xls");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static String[] getHeaders_zh() {
		return headers_zh;
	}

	public static String[] getHeaders_en() {
		return headers_en;
	}
}