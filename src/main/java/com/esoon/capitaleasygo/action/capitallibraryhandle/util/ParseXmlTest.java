package com.esoon.capitaleasygo.action.capitallibraryhandle.util;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

import com.acconsys.capital.lib.entity.BackshellType;
import com.acconsys.capital.lib.entity.ChsuserpropertyType;
import com.acconsys.capital.lib.entity.ChsuserpropertypartType;
import com.acconsys.capital.lib.entity.ConnectorType;
import com.acconsys.capital.lib.entity.DocumentBase;
import com.acconsys.capital.lib.entity.LibraryPartBaseType;
import com.acconsys.capital.lib.entity.OtherType;
import com.acconsys.capital.lib.entity.TerminalType;
import com.esoon.capitaleasygo.action.capitallibraryhandle.entity.BaseDocument;
import com.esoon.capitaleasygo.action.capitallibraryhandle.entity.LibraryComponentType;

public class ParseXmlTest {
	private static BaseDocument baseDocument;
	// private static String xmlPath = "0713.xml";
	// private static String xmlPath =
	// "F:\\工作\\8院\\何海英\\2016_08_02\\Lib-all0712.xml";//第一步前内存溢出
	// private static String xmlPath =
	// "F:\\工作\\8院\\何海英\\2016_04_28\\0429.xml";//第一步前内存溢出
	// private static String xmlPath =
	// "F:\\工作\\8院\\电气160331\\电气\\all-lib.xml";//第二步时内存溢出
	// private static String xmlPath =
	// "F:\\工作\\8院\\模拟数据\\导出库文件349.xml";//第二步时内存溢出
	// private static String xmlPath = "F:\\工作\\8院\\模拟数据\\导出库文件131.xml";//
	// private static String xmlPath = "F:\\工作\\8院\\模拟数据\\导出库文件238.xml";//
	// private static String xmlPath =
	// "F:\\工作\\8院\\模拟数据\\导出库文件other和terminal126.xml";//
	// private static String xmlPath =
	// "F:\\工作\\8院\\模拟数据\\导出库文件backshell98.xml";//
	// private static String xmlPath =
	// "F:\\工作\\8院\\模拟数据\\导出库文件connector884.xml";//
	// private static String xmlPath =
	// "F:\\工作\\8院\\模拟数据\\导出库文件connector200.xml";//
	// private static String xmlPath =
	// "F:\\工作\\8院\\模拟数据\\导出库文件connector904.xml";//
	// private static String xmlPath = "F:\\工作\\8院\\模拟数据\\导出库文件All.xml";//
	// private static String xmlPath = "F:\\工作\\8院\\模拟数据\\导出库文件All1.xml";//
	private static String xmlPath = "F:\\工作\\8院\\模拟数据\\导出库文件All2.xml";//
	private static HashMap<String, ChsuserpropertyType> chsuserpropertyTypeMap;
	private static ArrayList<LibraryPartBaseType> libraryPartBaseTypeList;
	private static HashMap<String, LibraryComponentType> libraryComponentTypeMap;
	private static String[] headers_zh_property;
	private static String[] headers_en_property;

	// private static String xmlPath =
	// "F:\\工作\\8院\\模拟数据\\A950_20ZA98SLN-10B_连接器后缀.xml";//

	public static void main(String[] args) throws Exception {

		DocumentBase documentBase = test1();
		System.out.println("开始把对象生成xml文件");
		// object2Xml(documentBase);
		// checkJVMTest();

		// test2();
	}

	/**
	 * 将 com.acconsys.capital.lib.entity.DocumentBase对象生成xml文件
	 */
	private static void object2Xml(DocumentBase documentBase) {
		String importTempXml = "importTempXml#.xml";
		String importReplacedXml = "importReplacedXml#.xml";
		String importXml = "importXml#.xml";
		JAXBElement<DocumentBase> je = new JAXBElement<DocumentBase>(new QName(
				"http://www.mentor.com/harness/Schema/LibrarySchema",
				"chssystem"), DocumentBase.class, documentBase);
		System.out.println("第一步");
		JAXBUtils.object2Xml(je, importTempXml);
		System.out.println("第二步");
		JAXBUtils.contentReplace(importTempXml, importReplacedXml);
		// System.out.println("第三步");
		// JAXBUtils.createImportXml(importReplacedXml, importXml);
		// System.out.println("第三步");
		// JAXBUtils.createImportXml(importTempXml, importXml);

	}

	/**
	 * 将xml解析生成 com.acconsys.capital.lib.entity.DocumentBase对象
	 */
	private static DocumentBase test1() {
		DocumentBase base = (DocumentBase) JAXBUtils.xml2Object(xmlPath)
				.getValue();
		List<Object> objectList = base
				.getLibrarycolorOrLibrarymaterialOrLibrarycomponenttype();
		List<LibraryPartBaseType> libraryPartBaseTypeList = new ArrayList<LibraryPartBaseType>();
		List<ConnectorType> connectorTypeList = new ArrayList<ConnectorType>();
		List<BackshellType> backshellTypeList = new ArrayList<BackshellType>();
		List<TerminalType> terminalTypeList = new ArrayList<TerminalType>();
		List<OtherType> otherTypeList = new ArrayList<OtherType>();
		Map<String, ChsuserpropertyType> chsuserpropertyTypeMap = new HashMap<String, ChsuserpropertyType>();
		for (Object object : objectList) {
			if (object instanceof ConnectorType) {
				connectorTypeList.add((ConnectorType) object);
			} else if (object instanceof BackshellType) {
				backshellTypeList.add((BackshellType) object);
			} else if (object instanceof TerminalType) {
				terminalTypeList.add((TerminalType) object);
			} else if (object instanceof OtherType) {
				otherTypeList.add((OtherType) object);
			} else if (object instanceof ChsuserpropertyType) {
				ChsuserpropertyType chsuserpropertyType = (ChsuserpropertyType) object;
				chsuserpropertyTypeMap.put(
						chsuserpropertyType.getChsuserpropertyId(),
						chsuserpropertyType);
			}
		}

		for (Object objectType : objectList) {
			if (objectType instanceof LibraryPartBaseType) {
				libraryPartBaseTypeList.add((LibraryPartBaseType) objectType);
			}
		}

		System.out.println("第一个连接器partnumber是："
				+ connectorTypeList.get(0).getPartnumber());
		System.out.println("connector个数:" + connectorTypeList.size());
		System.out.println("backshell个数:" + backshellTypeList.size());
		System.out.println("terminal个数:" + terminalTypeList.size());
		System.out.println("other个数:" + otherTypeList.size());
		System.out.println("LibraryPartBaseType个数:"
				+ libraryPartBaseTypeList.size());

		for (ConnectorType connectorType : connectorTypeList) {

			// connectorType.setPartnumber(connectorType.getPartnumber()
			// + "_连接器后缀");
		}

		for (BackshellType backshellType : backshellTypeList) {
			// backshellType
			// .setPartnumber(backshellType.getPartnumber() + "_尾罩后缀");
		}

		for (TerminalType terminalType : terminalTypeList) {
			// terminalType.setPartnumber(terminalType.getPartnumber() +
			// "_端子后缀");
		}

		for (OtherType otherType : otherTypeList) {
			// otherType.setPartnumber(otherType.getPartnumber() + "_其他后缀");
		}

		// 对partnumber为J1784_38-13N_02_尾罩后缀做property值的处理
		for (ConnectorType connectorType : connectorTypeList) {
			if ("不可能出现的partnumber".equals(connectorType.getPartnumber())) {
				ConnectorType ct = connectorType;
				System.out.println("partnumber:" + ct.getPartnumber());
				List<Object> objects = ct
						.getLibrarygraphicOrCustomerpartnumberOrSupplierpartnumber();
				for (Object object : objects) {
					if (object instanceof ChsuserpropertypartType) {
						ChsuserpropertypartType cuppt = (ChsuserpropertypartType) object;
						// chsuserpropertyTypeMap
						ChsuserpropertyType chsUserPropertyId = (ChsuserpropertyType) cuppt
								.getChsuserpropertyId();
						System.out.println("Userpropertyname:=="
								+ chsUserPropertyId.getUserpropertyname()
								+ "Propdesc:=="
								+ chsUserPropertyId.getPropdesc()
								+ "Userpropertyvalue:=="
								+ cuppt.getUserpropertyvalue());
						cuppt.setUserpropertyvalue(cuppt.getUserpropertyvalue()
								+ "添加后缀");
					}
				}
			}
		}

		return base;
	}

	/**
	 * 将xml解析生成com.acconsys.capital.test.ParseXmlTest.baseDocument对象
	 * 
	 * @throws Exception
	 */
//	private static void test2() throws Exception {
//
//		/**
//		 * 从xml中提取信息
//		 */
//		SaxParseService sax = new SaxParseService();
//		InputStream input = new FileInputStream(new File(xmlPath));
//		baseDocument = sax.getBaseDocument(input);
//		System.out.println("连接器个数：" + baseDocument.connectorModelList.size());
//		System.out.println("尾罩个数：" + baseDocument.backShellModelList.size());
//		System.out.println("其他个数：" + baseDocument.otherModelList.size());
//		System.out.println("端子个数：" + baseDocument.terminalModelList.size());
//
//		/**
//		 * 将baseDocument对象保存到xml文件中。
//		 */
//
//	}

	/**
	 * 根据指定的partnumber来从库中导出xml文件。
	 * 
	 * @throws Exception
	 */
	private static void exportSpecifiedPartnumberComponentList()
			throws Exception {
		WObjectServiceImpl service = new WObjectServiceImpl();
		List<String> partNumbers = new ArrayList<String>();
		partNumbers.add("#20");
		service.exportPartObject(partNumbers);
	}

	// 查看package com.acconsys.capital.service.WObjectServiceImpl的方法。

	private static void checkJVMTest() {
		System.out.println("Runtime.getRuntime().maxMemory():=="
				+ Runtime.getRuntime().maxMemory());
		System.out.println("Runtime.getRuntime().freeMemory():=="
				+ Runtime.getRuntime().freeMemory());
		System.out.println("Runtime.getRuntime().totalMemory():=="
				+ Runtime.getRuntime().totalMemory());
		// Runtime.getRuntime().maxMemory(); //最大可用内存，对应-Xmx
		// Runtime.getRuntime().freeMemory(); //当前JVM空闲内存
		// Runtime.getRuntime().totalMemory();
		// //当前JVM占用的内存总数，其值相当于当前JVM已使用的内存及freeMemory()的总和
	}

	/**
	 * 将excel表格中对应的partnumber更新到xml文件中
	 * 
	 * @param excelPath
	 * @param xmlPath2
	 * @return
	 */
	public static File excelInfoInsertXml(String excelPath, String xmlPath) {
		File xmlPathTemp = new File(xmlPath.replace("\\","/"));
		String xmlPathParentPath = xmlPathTemp.getParentFile()
				.getAbsolutePath();
		String importTempXml = xmlPathParentPath+"\\" + "importTempXml8Y.xml";
		String importReplacedXml = xmlPathParentPath+"\\"
				+ "importReplacedXml8Y.xml";

		Map<String, String> propertyMap_en_zh = new HashMap<String, String>();
		Map<String, String> propertyMap_zh_en = new HashMap<String, String>();
		headers_zh_property = PropertieUtil.getExcelHeaders_ZH_Property();
		headers_en_property = PropertieUtil.getExcelHeaders_EN_Property();
		// for (int i = 0; i < CustomerPropertiesExcel2Xml.fieldNames.length;
		// i++) {
		// propertyMap1.put(CustomerPropertiesExcel2Xml.fieldNames[i],
		// CustomerPropertiesExcel2Xml.attrNames[i]);
		// propertyMap2.put(CustomerPropertiesExcel2Xml.attrNames[i],
		// CustomerPropertiesExcel2Xml.fieldNames[i]);
		// }
		for (int i = 0; i < headers_en_property.length; i++) {
			propertyMap_en_zh.put(headers_en_property[i], headers_zh_property[i]);
			propertyMap_zh_en.put(headers_zh_property[i], headers_en_property[i]);
		}
		// 1.获取excel表中数据。
		Map<String, Map<String, String>> excelMap = getExcelInfo(excelPath);// Map<partnumber,Map<AttrName,AttrValue>>
		System.out.println("excel中共有数据条数:==== " + excelMap.size());
		DocumentBase documentBase = getXml4TypeComp(xmlPath);
		System.out.println("libraryPartBaseTypeList.size()=="
				+ getLibraryPartBaseTypeList().size());
		for (LibraryPartBaseType libraryPartBaseType : getLibraryPartBaseTypeList()) {
			// 获得其中一个元器件的partnumber
			String partnumber = libraryPartBaseType.getPartnumber();
			// 从excel的map集合中根据partnumber获取excel中属性集合信息。
			Map<String, String> excelInfoMap = excelMap.get(partnumber);
			if (excelInfoMap != null) {
				List<Object> objectList = libraryPartBaseType
						.getLibrarygraphicOrCustomerpartnumberOrSupplierpartnumber();
				List<ChsuserpropertypartType> cupptList = new ArrayList<ChsuserpropertypartType>();
				// System.out.println("objectList.size()======"+objectList.size());
				for (Object object : objectList) {
					if (object instanceof ChsuserpropertypartType) {
						ChsuserpropertypartType chsuserpropertypartType = (ChsuserpropertypartType) object;
						ChsuserpropertyType cupt = (ChsuserpropertyType) chsuserpropertypartType
								.getChsuserpropertyId();
						String userPropertyName = cupt.getUserpropertyname();
						String propDesc = cupt.getPropdesc();
						// System.out.println("userPropertyName:propDesc==="
						// + userPropertyName + "=||=" + propDesc);
						String excelValue = excelInfoMap.get(propertyMap_en_zh
								.get(userPropertyName));
						// System.out.println("propDesc:excelValue" + propDesc
						// + "=||=" + excelValue);
						chsuserpropertypartType
								.setUserpropertyvalue(excelValue);
						cupptList.add((ChsuserpropertypartType) object);
						excelInfoMap.remove(propertyMap_en_zh.get(userPropertyName));
					}
				}
				// 判断如果excelInfoMap还有属性信息，如果有的话创建添加到元器件上。
				if (excelInfoMap.size() > 0) {
					for (String attrName : excelInfoMap.keySet()) {
						ChsuserpropertypartType newChsuserpropertypartType = new ChsuserpropertypartType();
						newChsuserpropertypartType
								.setChsuserpropertypartId("UIDfdee08-139e9016648-"
										+ UUID.randomUUID().toString()
												.replace("-", ""));
						String fieldName = propertyMap_zh_en.get(attrName);
						newChsuserpropertypartType
								.setChsuserpropertyId(chsuserpropertyTypeMap
										.get(fieldName));
						newChsuserpropertypartType
								.setLibraryobjectId(libraryPartBaseType);
						newChsuserpropertypartType
								.setUserpropertyvalue(excelInfoMap
										.get(attrName));
						objectList.add(newChsuserpropertypartType);
					}
				}
			} else {
				// JOptionPane.showMessageDialog(null, "partnumber为：" +
				// partnumber+"在excel表中不存在!");
//				MainUI1.logger.error("partnumber为：" + partnumber
//						+ "在excel表中不存在!");
				System.out
						.println("partnumber为：" + partnumber + "在excel表中不存在!");
			}
			// System.out.println("cupptList.size()/objectList.size()=="
			// + cupptList.size() + "/" + objectList.size());

			// 把property属性的prodesc

			// 开始根据每个元器件的属性来把excel表中的信息更新到对应的元器件对象上。
			// for (ChsuserpropertypartType chsuserpropertypartType : cupptList)
			// {
			// ChsuserpropertyType cupt = (ChsuserpropertyType)
			// chsuserpropertypartType.getChsuserpropertyId();
			// String userPropertyName = cupt.getUserpropertyname();
			// String propDesc = cupt.getPropdesc();
			// System.out.println("userPropertyName:propDesc==="+userPropertyName+"=||="+propDesc);
			// String excelValue =
			// excelInfoMap.get(propertyMap.get(userPropertyName));
			// System.out.println("propDesc:excelValue"+propDesc+"=||="+excelValue);
			// chsuserpropertypartType.setUserpropertyvalue(excelValue);
			// }

			// 把documentbase对象写入文件中。

		}
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
	 * 注意：这个方法已经被弃用，由excelInfoInsertXml来代替
	 * 
	 * @param excelPath
	 * @param xmlPath
	 * @return
	 */
	public static File excelInfoInsertXml2(String excelPath, String xmlPath) {
		String importTempXml = "importTempXml8Y.xml";
		String importReplacedXml = "importReplacedXml8Y.xml";

		Map<String, String> propertyMap = new HashMap<String, String>();
		for (int i = 0; i < PropertieUtil.getExcelHeaders_EN_Property().length; i++) {
			propertyMap.put(PropertieUtil.getExcelHeaders_EN_Property()[i],
					PropertieUtil.getExcelHeaders_ZH_Property()[i]);
		}
		// 1.获取excel表中数据。
		Map<String, Map<String, String>> excelMap = getExcelInfo(excelPath);// Map<partnumber,Map<AttrName,AttrValue>>
		DocumentBase documentBase = getXml4TypeComp(xmlPath);
		System.out.println("libraryPartBaseTypeList.size()=="
				+ getLibraryPartBaseTypeList().size());
		for (LibraryPartBaseType libraryPartBaseType : getLibraryPartBaseTypeList()) {
			// 获得其中一个元器件的partnumber
			String partnumber = libraryPartBaseType.getPartnumber();
			// 从excel的map集合中根据partnumber获取excel中属性集合信息。
			Map<String, String> excelInfoMap = excelMap.get(partnumber);
			List<Object> objectList = libraryPartBaseType
					.getLibrarygraphicOrCustomerpartnumberOrSupplierpartnumber();
			List<ChsuserpropertypartType> cupptList = new ArrayList<ChsuserpropertypartType>();
			// System.out.println("objectList.size()======"+objectList.size());
			for (Object object : objectList) {
				if (object instanceof ChsuserpropertypartType) {
					ChsuserpropertypartType chsuserpropertypartType = (ChsuserpropertypartType) object;
					ChsuserpropertyType cupt = (ChsuserpropertyType) chsuserpropertypartType
							.getChsuserpropertyId();
					String userPropertyName = cupt.getUserpropertyname();
					String propDesc = cupt.getPropdesc();
					// System.out.println("userPropertyName:propDesc==="
					// + userPropertyName + "=||=" + propDesc);
					String excelValue = excelInfoMap.get(propertyMap
							.get(userPropertyName));
					// System.out.println("propDesc:excelValue" + propDesc
					// + "=||=" + excelValue);
					chsuserpropertypartType.setUserpropertyvalue(excelValue);
					cupptList.add((ChsuserpropertypartType) object);
				}
			}
			// System.out.println("cupptList.size()/objectList.size()=="
			// + cupptList.size() + "/" + objectList.size());

			// 把property属性的prodesc

			// 开始根据每个元器件的属性来把excel表中的信息更新到对应的元器件对象上。
			// for (ChsuserpropertypartType chsuserpropertypartType : cupptList)
			// {
			// ChsuserpropertyType cupt = (ChsuserpropertyType)
			// chsuserpropertypartType.getChsuserpropertyId();
			// String userPropertyName = cupt.getUserpropertyname();
			// String propDesc = cupt.getPropdesc();
			// System.out.println("userPropertyName:propDesc==="+userPropertyName+"=||="+propDesc);
			// String excelValue =
			// excelInfoMap.get(propertyMap.get(userPropertyName));
			// System.out.println("propDesc:excelValue"+propDesc+"=||="+excelValue);
			// chsuserpropertypartType.setUserpropertyvalue(excelValue);
			// }

			// 把documentbase对象写入文件中。

		}
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
	 * 获取excel表格中的数据。
	 * 
	 * @param excelPath
	 * @return
	 */
	public static Map<String, Map<String, String>> getExcelInfo(String excelPath) {
		List<String[]> componentArrList = GetExcelDataUtil
				.getComponentArrs(excelPath);

		List<List<com.esoon.capitaleasygo.action.capitallibraryhandle.entity.Attribute>> listList = CustomerPropertiesExcel2Xml
				.arrList2AttList(componentArrList);

		Map<String, Map<String, String>> excelMap = new HashMap<String, Map<String, String>>();
		for (List<com.esoon.capitaleasygo.action.capitallibraryhandle.entity.Attribute> list : listList) {
			String keyValue = null;
			Map<String, String> excelInfoMap = new HashMap<String, String>();
			for (com.esoon.capitaleasygo.action.capitallibraryhandle.entity.Attribute attribute : list) {
				if ("PART NUMBER".equals(attribute.getAttrName())) {
					keyValue = attribute.getAttrValue();
				} else {
					excelInfoMap.put(attribute.getAttrName(),
							attribute.getAttrValue());
				}
			}
			excelMap.put(keyValue, excelInfoMap);
		}

		return excelMap;
	}

	/**
	 * 从xml文件中获取connector,backshell,terminal,other四种元器件的信息集合。
	 * 
	 * @param xmlPath
	 */
	public static DocumentBase getXml4TypeComp(String xmlPath) {
		DocumentBase base = (DocumentBase) JAXBUtils.xml2Object(xmlPath)
				.getValue();
		List<Object> objectList = base
				.getLibrarycolorOrLibrarymaterialOrLibrarycomponenttype();
		setLibraryPartBaseTypeList(new ArrayList<LibraryPartBaseType>());
		List<ConnectorType> connectorTypeList = new ArrayList<ConnectorType>();
		List<BackshellType> backshellTypeList = new ArrayList<BackshellType>();
		List<TerminalType> terminalTypeList = new ArrayList<TerminalType>();
		List<OtherType> otherTypeList = new ArrayList<OtherType>();
		libraryComponentTypeMap = new HashMap<String, LibraryComponentType>();
		chsuserpropertyTypeMap = new HashMap<String, ChsuserpropertyType>();
		for (Object object : objectList) {
			if (object instanceof ConnectorType) {
				connectorTypeList.add((ConnectorType) object);
				getLibraryPartBaseTypeList().add((LibraryPartBaseType) object);
			} else if (object instanceof BackshellType) {
				backshellTypeList.add((BackshellType) object);
				getLibraryPartBaseTypeList().add((LibraryPartBaseType) object);
			} else if (object instanceof TerminalType) {
				terminalTypeList.add((TerminalType) object);
				getLibraryPartBaseTypeList().add((LibraryPartBaseType) object);
			} else if (object instanceof OtherType) {
				otherTypeList.add((OtherType) object);
				getLibraryPartBaseTypeList().add((LibraryPartBaseType) object);
			} else if (object instanceof ChsuserpropertyType) {
				ChsuserpropertyType chsuserpropertyType = (ChsuserpropertyType) object;
				chsuserpropertyTypeMap.put(
						chsuserpropertyType.getUserpropertyname(),
						chsuserpropertyType);
			} else if (object instanceof LibraryComponentType) {
				ChsuserpropertyType chsuserpropertyType = (ChsuserpropertyType) object;
				chsuserpropertyTypeMap.put(
						chsuserpropertyType.getUserpropertyname(),
						chsuserpropertyType);
			}
		}
		System.out.println("connector个数：" + connectorTypeList.size());
		System.out.println("backshell个数：" + backshellTypeList.size());
		System.out.println("terminal个数：" + terminalTypeList.size());
		System.out.println("other个数：" + otherTypeList.size());
		System.out.println("总个数：" + getLibraryPartBaseTypeList().size());
		return base;

	}

	public static ArrayList<LibraryPartBaseType> getLibraryPartBaseTypeList() {
		return libraryPartBaseTypeList;
	}

	public static void setLibraryPartBaseTypeList(
			ArrayList<LibraryPartBaseType> libraryPartBaseTypeList) {
		ParseXmlTest.libraryPartBaseTypeList = libraryPartBaseTypeList;
	}
}
