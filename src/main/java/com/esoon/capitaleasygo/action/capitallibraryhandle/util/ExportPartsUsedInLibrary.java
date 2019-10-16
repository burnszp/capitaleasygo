package com.esoon.capitaleasygo.action.capitallibraryhandle.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.acconsys.capital.lib.entity.BackshellType;
import com.acconsys.capital.lib.entity.ChsuserpropertyType;
import com.acconsys.capital.lib.entity.ChsuserpropertypartType;
import com.acconsys.capital.lib.entity.ConnectorType;
import com.acconsys.capital.lib.entity.DocumentBase;
import com.acconsys.capital.lib.entity.LibraryPartBaseType;
import com.acconsys.capital.lib.entity.LibrarycavityType;
import com.acconsys.capital.lib.entity.LibrarycolorType;
import com.acconsys.capital.lib.entity.LibrarycomponenttypeType;
import com.acconsys.capital.lib.entity.LibrarygraphicType;
import com.acconsys.capital.lib.entity.LibrarymatingType;
import com.acconsys.capital.lib.entity.OtherType;
import com.acconsys.capital.lib.entity.SupplierorganisationType;
import com.acconsys.capital.lib.entity.SupplierpartnumberType;
import com.acconsys.capital.lib.entity.TerminalType;
import com.esoon.capitaleasygo.action.capitallibraryhandle.entity.ComponentInfoModel;

/**
 * 根据指定的partnumber查找详细信息： 器件型号 器件名称 器件类型 管脚数 器件描述 颜色 材料 院物资编码 所物资编码 集团物资编码 质量等级
 * 详细规范 附件协议 特殊要求 生产厂家 国产/进口 Group Name Type Code Status 使用次数 所在型号名称 型号使用次数
 * 所在设计名称 设计使用次数 所编码
 * 
 * @author Administrator
 * 
 */
public class ExportPartsUsedInLibrary {

	private static DocumentBase docBase;
	private static WObjectServiceImpl service;
	// private static List<String> partNumbers;
	private static Map<String, String> colorMap;// 第一个String表示librarycolor_id，第二个String表示：colorcode
												// ,最后在循环元器件信息替换其中的数据。
	private static Map<String, String> supplierMap;// 第一个String表示supplierorganisation_id，第二个String表示：name
													// ,最后在循环元器件信息替换其中的数据。
	private static Map<String, String> typeCodeMap;// 第一个String表示librarycomponenttype_id，第二个String表示：typecode
													// ,最后在循环元器件信息替换其中的数据。
	private static List<ConnectorType> connectorTypeList;
	private static Map<String, String> connectorTypeMap;
	private static List<BackshellType> backshellTypeList;
	private static List<OtherType> otherTypeList;
	private static List<TerminalType> terminalTypeList;
	// private static List<WireType> wireTypeList;
	// private static List<MulticoreType> multicoreTypeList;
	// private static List<DeviceType> deviceTypeList;
	// private static List<SpliceType> spliceTypeList;
	// private static List<TubeType> tubeTypeList;
	// private static List<TapeType> tapeTypeList;
	private static HashMap<String, String> propertyTypeMap;
	private static Map<String, String> backshellTypeMap;
	private static HashMap<String, String> otherTypeMap;
	private static HashMap<String, String> terminalTypeMap;

	/**
	 * 根据元器件集合信息获取元器件详情信息。
	 * 
	 * @param partNumberList
	 * @return
	 */

	/**
	 * 根据元器件集合信息获取元器件详情信息。
	 * 
	 * @param jkXmlPath
	 * @param compType
	 * 
	 * @param partNumberList
	 * @return
	 */

	public static Map<String, ComponentInfoModel> getComponentInfoByXml(
			String jkXmlPath, String compType) {
		Map<String, ComponentInfoModel> map = new HashMap<String, ComponentInfoModel>();
		try {
			service = new WObjectServiceImpl();
			colorMap = new HashMap<String, String>();
			supplierMap = new HashMap<String, String>();
			typeCodeMap = new HashMap<String, String>();
			connectorTypeList = new ArrayList<ConnectorType>();
			backshellTypeList = new ArrayList<BackshellType>();
			otherTypeList = new ArrayList<OtherType>();
			terminalTypeList = new ArrayList<TerminalType>();
			propertyTypeMap = new HashMap<String, String>();
			connectorTypeMap = new HashMap<String, String>();
			backshellTypeMap = new HashMap<String, String>();
			otherTypeMap = new HashMap<String, String>();
			terminalTypeMap = new HashMap<String, String>();
			// libraryComponentTypeMap = new HashMap<String, String>();
			docBase = service.exportPartObjectByXML(jkXmlPath);
			// docBase = service
			// .exportPartObjectByXML(PropertieUtil.getPropertieUtil()
			// .getValue(ConstantsUtil.JIANKU_XML_PATH));
			// docBase = service.exportPartObject(allPartNumberList);
			if (docBase != null) {
				System.out.println(docBase);
				List<Object> objects = docBase
						.getLibrarycolorOrLibrarymaterialOrLibrarycomponenttype();
				for (Object o : objects) {
					// if(o instanceof LibrarycomponenttypeType){
					// LibrarycomponenttypeType componentTypeType =
					// (LibrarycomponenttypeType) o;
					// libraryComponentTypeMap.put(componentTypeType.getLibrarycomponenttypeId(),
					// componentTypeType.getTypecode());
					// }
					if (o instanceof ChsuserpropertyType) {
						ChsuserpropertyType propertyType = (ChsuserpropertyType) o;
						propertyTypeMap.put(
								propertyType.getChsuserpropertyId(),
								propertyType.getUserpropertyname());
					}
					if (o instanceof LibrarycolorType) {
						LibrarycolorType colorType = (LibrarycolorType) o;
						colorMap.put(colorType.getLibrarycolorId(),
								colorType.getColorcode());
					}
					if (o instanceof SupplierorganisationType) {
						SupplierorganisationType supplierType = (SupplierorganisationType) o;
						supplierMap.put(
								supplierType.getSupplierorganisationId(),
								supplierType.getName());
					}
					if (o instanceof LibrarycomponenttypeType) {
						LibrarycomponenttypeType typeCodeModel = (LibrarycomponenttypeType) o;
						typeCodeMap.put(
								typeCodeModel.getLibrarycomponenttypeId(),
								typeCodeModel.getTypecode());
					}
					// Connector
					if (o instanceof ConnectorType) {
						connectorTypeList.add((ConnectorType) o);
						connectorTypeMap.put(
								((ConnectorType) o).getLibraryobjectId(),
								((ConnectorType) o).getPartnumber());
					}
					// Backshell
					if (o instanceof BackshellType) {
						backshellTypeList.add((BackshellType) o);
						backshellTypeMap.put(
								((BackshellType) o).getLibraryobjectId(),
								((BackshellType) o).getPartnumber());
					}
					// other
					if (o instanceof OtherType) {
						otherTypeList.add((OtherType) o);
						otherTypeMap.put(((OtherType) o).getLibraryobjectId(),
								((OtherType) o).getPartnumber());
					}
					// terminal
					if (o instanceof TerminalType) {
						terminalTypeList.add((TerminalType) o);
						terminalTypeMap.put(
								((TerminalType) o).getLibraryobjectId(),
								((TerminalType) o).getPartnumber());
					}
				}
				if (ConstantsUtil.EMPTY.equals(compType)
						|| PropertieUtil.getPropertieUtil()
								.getValue(ConstantsUtil.CONNECTOR)
								.equalsIgnoreCase(compType)) {
					for (ConnectorType ct : connectorTypeList) {
						List<Object> objList = ct
								.getLibrarygraphicOrCustomerpartnumberOrSupplierpartnumber();
						Map<String, String> supplierTypeMap = new HashMap<String, String>();
						for (Object o1 : objList) {
							if (o1 instanceof SupplierpartnumberType) {
								SupplierpartnumberType supplierType = (SupplierpartnumberType) o1;
								supplierTypeMap.put(
										supplierType.getSupplierpartnumberId(),
										supplierType.getSpecification());
							}
						}
						Map<String, String> propertyMap = new HashMap<String, String>();
						for (Object o1 : objList) {
							if (o1 instanceof ChsuserpropertypartType) {
								ChsuserpropertypartType proPartType = (ChsuserpropertypartType) o1;
								ChsuserpropertyType proType = (ChsuserpropertyType) proPartType
										.getChsuserpropertyId();
								propertyMap.put(proType.getUserpropertyname(),
										proPartType.getUserpropertyvalue());
							}
						}
						ComponentInfoModel model = new ComponentInfoModel();
						model.setBmyxjb(propertyMap
								.get(CapitalConstants.BMYXJB));
						model.setSyfw(propertyMap.get(CapitalConstants.SYFW));
						model.setBmzt(propertyMap.get(CapitalConstants.BMZT));
						model.setBmlx(propertyMap.get(CapitalConstants.BMLX));
						model.setFldm(propertyMap.get(CapitalConstants.FLDM));
						model.setFlmc(propertyMap.get(CapitalConstants.FLMC));
						model.setSjbm(propertyMap.get(CapitalConstants.SJBM));
						model.setGroupName(ct.getGroupname().CONNECTOR.value());
						model.setMc(propertyMap.get(CapitalConstants.MC));
						model.setJc(propertyMap.get(CapitalConstants.JC));
						model.setXh(propertyMap.get(CapitalConstants.XH));
						model.setXhgg(propertyMap.get(CapitalConstants.XHGG));
						model.setGysqc(propertyMap.get(CapitalConstants.GYSQC));
						model.setZldj(propertyMap.get(CapitalConstants.ZLDJ));
						model.setZgf(propertyMap.get(CapitalConstants.ZGF));
						model.setXxgf(propertyMap.get(CapitalConstants.XXGF));
						model.setFzxs(propertyMap.get(CapitalConstants.FZXS));
						model.setWxcc(propertyMap.get(CapitalConstants.WXCC));
						model.setZytj(propertyMap.get(CapitalConstants.ZYTJ));
						model.setFjxy(propertyMap.get(CapitalConstants.FJXY));
						model.setSfjk(propertyMap.get(CapitalConstants.SFJK));
						model.setJldw(propertyMap.get(CapitalConstants.JLDW));
						model.setSsml(propertyMap.get(CapitalConstants.SSML));
						model.setSjly(propertyMap.get(CapitalConstants.SJLY));
						model.setPartNumber(ct.getPartnumber());
						model.setDescription(ct.getDescription());
						model.setKth(PropertieUtil.getPropertieUtil().getValue(
								ConstantsUtil.OBJECT_EMPTY));
						model.setTypeCode(typeCodeMap.get(ct
								.getLibrarycomponenttypeId()));

						List<Object> librarygraphicOrCustomerpartnumberOrSupplierpartnumberList = ct
								.getLibrarygraphicOrCustomerpartnumberOrSupplierpartnumber();
						// StringBuilder graphicSB = new StringBuilder();
						for (Object obj : librarygraphicOrCustomerpartnumberOrSupplierpartnumberList) {
							if (obj instanceof LibrarygraphicType) {
								// 型谱图和侧视图都在Symbol下，并且无法从Capital
								// Library中获取symbol的名字，只能获取ID，并且无法通过ID判断哪个是型谱图哪个是侧视图。
								LibrarygraphicType librarygraphicType = (LibrarygraphicType) obj;
								// graphicSB.append("["
								// + librarygraphicType.getSymbolId() + "]");
								if (model.getSymbolNameXPT() == null) {
									model.setSymbolNameXPT(librarygraphicType
											.getSymbolId());
								} else {
									model.setSymbolNameCST(librarygraphicType
											.getSymbolId());
								}
							}
						}
						// model.setXptOrCst(graphicSB.toString());
						StringBuilder supplierSB = new StringBuilder();
						for (String supplierPartNumberId : supplierTypeMap
								.keySet()) {
							supplierSB.append("["
									+ supplierTypeMap.get(supplierPartNumberId)
									+ "]");
						}

						model.setSpecification(supplierSB.toString());

						StringBuilder matingSB = new StringBuilder();
						StringBuilder maleOrFemaleSB = new StringBuilder();
						List<String> maleOrFemaleList = new ArrayList<String>();
						List<Object> libraryconnectordetailsOrLibrarysinglewirefitscavityOrLibrarymultiplewirecavitiesList = ct
								.getLibraryconnectordetailsOrLibrarysinglewirefitscavityOrLibrarymultiplewirecavities();
						for (Object obj : libraryconnectordetailsOrLibrarysinglewirefitscavityOrLibrarymultiplewirecavitiesList) {
							if (obj instanceof LibrarycavityType) {
								LibrarycavityType librarycavityType = (LibrarycavityType) obj;
								String maleOrFemale1 = librarycavityType
										.getPingraphic();
								if (!maleOrFemaleList.contains(maleOrFemale1)) {
									maleOrFemaleList.add(maleOrFemale1);
								}
							}
							if (obj instanceof LibrarymatingType) {
								LibrarymatingType librarymatingType = (LibrarymatingType) obj;
								LibraryPartBaseType libraryPartBaseType = (LibraryPartBaseType) librarymatingType
										.getLibraryobjectId();
								matingSB.append("["
										+ connectorTypeMap
												.get(libraryPartBaseType
														.getLibraryobjectId())
										+ "]");

							}
						}
						for (String maleOrFemaleTemp : maleOrFemaleList) {
							maleOrFemaleSB.append("[" + maleOrFemaleTemp + "]");
						}
						model.setMaleOrFemale(maleOrFemaleSB.toString());
						model.setMating(matingSB.toString());
						model.setBz(propertyMap.get(CapitalConstants.BZ));
						model.setYl1(propertyMap.get(CapitalConstants.YL1));
						model.setYl2(propertyMap.get(CapitalConstants.YL2));
						map.put(ct.getPartnumber(), model);
					}
				}

				if (ConstantsUtil.EMPTY.equals(compType)
						|| PropertieUtil.getPropertieUtil()
								.getValue(ConstantsUtil.BACKSHELL)
								.equalsIgnoreCase(compType)) {

					for (BackshellType bst : backshellTypeList) {
						List<Object> objList = bst
								.getLibrarygraphicOrCustomerpartnumberOrSupplierpartnumber();
						Map<String, String> supplierTypeMap = new HashMap<String, String>();
						for (Object o1 : objList) {
							if (o1 instanceof SupplierpartnumberType) {
								SupplierpartnumberType supplierType = (SupplierpartnumberType) o1;
								supplierTypeMap.put(
										supplierType.getSupplierpartnumberId(),
										supplierType.getSpecification());
							}
						}
						Map<String, String> propertyMap = new HashMap<String, String>();
						for (Object o1 : objList) {
							if (o1 instanceof ChsuserpropertypartType) {
								ChsuserpropertypartType proPartType = (ChsuserpropertypartType) o1;
								ChsuserpropertyType proType = (ChsuserpropertyType) proPartType
										.getChsuserpropertyId();
								propertyMap.put(proType.getUserpropertyname(),
										proPartType.getUserpropertyvalue());
							}
						}
						ComponentInfoModel model = new ComponentInfoModel();
						model.setBmyxjb(propertyMap
								.get(CapitalConstants.BMYXJB));
						model.setSyfw(propertyMap.get(CapitalConstants.SYFW));
						model.setBmzt(propertyMap.get(CapitalConstants.BMZT));
						model.setBmlx(propertyMap.get(CapitalConstants.BMLX));
						model.setFldm(propertyMap.get(CapitalConstants.FLDM));
						model.setFlmc(propertyMap.get(CapitalConstants.FLMC));
						model.setSjbm(propertyMap.get(CapitalConstants.SJBM));
						model.setGroupName(bst.getGroupname().BACKSHELL.value());
						model.setMc(propertyMap.get(CapitalConstants.MC));
						model.setJc(propertyMap.get(CapitalConstants.JC));
						model.setXh(propertyMap.get(CapitalConstants.XH));
						model.setXhgg(propertyMap.get(CapitalConstants.XHGG));
						model.setGysqc(propertyMap.get(CapitalConstants.GYSQC));
						model.setZldj(propertyMap.get(CapitalConstants.ZLDJ));
						model.setZgf(propertyMap.get(CapitalConstants.ZGF));
						model.setXxgf(propertyMap.get(CapitalConstants.XXGF));
						model.setFzxs(propertyMap.get(CapitalConstants.FZXS));
						model.setWxcc(propertyMap.get(CapitalConstants.WXCC));
						model.setZytj(propertyMap.get(CapitalConstants.ZYTJ));
						model.setFjxy(propertyMap.get(CapitalConstants.FJXY));
						model.setSfjk(propertyMap.get(CapitalConstants.SFJK));
						model.setJldw(propertyMap.get(CapitalConstants.JLDW));
						model.setSsml(propertyMap.get(CapitalConstants.SSML));
						model.setSjly(propertyMap.get(CapitalConstants.SJLY));
						model.setPartNumber(bst.getPartnumber());
						model.setDescription(bst.getDescription());
						model.setKth(PropertieUtil.getPropertieUtil().getValue(
								ConstantsUtil.OBJECT_EMPTY));
						model.setTypeCode(typeCodeMap.get(bst
								.getLibrarycomponenttypeId()));

						List<Object> librarygraphicOrCustomerpartnumberOrSupplierpartnumberList = bst
								.getLibrarygraphicOrCustomerpartnumberOrSupplierpartnumber();
						// StringBuilder graphicSB = new StringBuilder();
						for (Object obj : librarygraphicOrCustomerpartnumberOrSupplierpartnumberList) {
							if (obj instanceof LibrarygraphicType) {
								// 型谱图和侧视图都在Symbol下，并且无法从Capital
								// Library中获取symbol的名字，只能获取ID，并且无法通过ID判断哪个是型谱图哪个是侧视图。
								LibrarygraphicType librarygraphicType = (LibrarygraphicType) obj;
								// graphicSB.append("["
								// + librarygraphicType.getSymbolId() + "]");
								if (model.getSymbolNameXPT() == null) {
									model.setSymbolNameXPT(librarygraphicType
											.getSymbolId());
								} else {
									model.setSymbolNameCST(librarygraphicType
											.getSymbolId());
								}
							}
						}
						// model.setXptOrCst(graphicSB.toString());
						StringBuilder supplierSB = new StringBuilder();
						for (String supplierPartNumberId : supplierTypeMap
								.keySet()) {
							supplierSB.append("["
									+ supplierTypeMap.get(supplierPartNumberId)
									+ "]");
						}

						model.setSpecification(supplierSB.toString());

						StringBuilder matingSB = new StringBuilder();
						StringBuilder maleOrFemaleSB = new StringBuilder();
						List<String> maleOrFemaleList = new ArrayList<String>();
						List<Object> libraryconnectordetailsOrLibrarysinglewirefitscavityOrLibrarymultiplewirecavitiesList = bst
								.getLibrarygraphicOrCustomerpartnumberOrSupplierpartnumber();
						for (Object obj : libraryconnectordetailsOrLibrarysinglewirefitscavityOrLibrarymultiplewirecavitiesList) {
							if (obj instanceof LibrarycavityType) {
								LibrarycavityType librarycavityType = (LibrarycavityType) obj;
								String maleOrFemale1 = librarycavityType
										.getPingraphic();
								if (!maleOrFemaleList.contains(maleOrFemale1)) {
									maleOrFemaleList.add(maleOrFemale1);
								}
							}
							if (obj instanceof LibrarymatingType) {
								LibrarymatingType librarymatingType = (LibrarymatingType) obj;
								LibraryPartBaseType libraryPartBaseType = (LibraryPartBaseType) librarymatingType
										.getLibraryobjectId();
								matingSB.append("["
										+ backshellTypeMap
												.get(libraryPartBaseType
														.getLibraryobjectId())
										+ "]");

							}
						}
						for (String maleOrFemaleTemp : maleOrFemaleList) {
							maleOrFemaleSB.append("[" + maleOrFemaleTemp + "]");
						}
						model.setMaleOrFemale(maleOrFemaleSB.toString());
						model.setMating(matingSB.toString());
						model.setBz(propertyMap.get(CapitalConstants.BZ));
						model.setYl1(propertyMap.get(CapitalConstants.YL1));
						model.setYl2(propertyMap.get(CapitalConstants.YL2));
						map.put(bst.getPartnumber(), model);
					}
				}

				if (ConstantsUtil.EMPTY.equals(compType)
						|| PropertieUtil.getPropertieUtil()
								.getValue(ConstantsUtil.OTHER)
								.equalsIgnoreCase(compType)) {

					for (OtherType ot : otherTypeList) {
						List<Object> objList = ot
								.getLibrarygraphicOrCustomerpartnumberOrSupplierpartnumber();
						Map<String, String> supplierTypeMap = new HashMap<String, String>();
						for (Object o1 : objList) {
							if (o1 instanceof SupplierpartnumberType) {
								SupplierpartnumberType supplierType = (SupplierpartnumberType) o1;
								supplierTypeMap.put(
										supplierType.getSupplierpartnumberId(),
										supplierType.getSpecification());
							}
						}
						Map<String, String> propertyMap = new HashMap<String, String>();
						for (Object o1 : objList) {
							if (o1 instanceof ChsuserpropertypartType) {
								ChsuserpropertypartType proPartType = (ChsuserpropertypartType) o1;
								ChsuserpropertyType proType = (ChsuserpropertyType) proPartType
										.getChsuserpropertyId();
								propertyMap.put(proType.getUserpropertyname(),
										proPartType.getUserpropertyvalue());
							}
						}
						ComponentInfoModel model = new ComponentInfoModel();
						model.setBmyxjb(propertyMap
								.get(CapitalConstants.BMYXJB));
						model.setSyfw(propertyMap.get(CapitalConstants.SYFW));
						model.setBmzt(propertyMap.get(CapitalConstants.BMZT));
						model.setBmlx(propertyMap.get(CapitalConstants.BMLX));
						model.setFldm(propertyMap.get(CapitalConstants.FLDM));
						model.setFlmc(propertyMap.get(CapitalConstants.FLMC));
						model.setSjbm(propertyMap.get(CapitalConstants.SJBM));
						model.setGroupName(ot.getGroupname().OTHER.value());
						model.setMc(propertyMap.get(CapitalConstants.MC));
						model.setJc(propertyMap.get(CapitalConstants.JC));
						model.setXh(propertyMap.get(CapitalConstants.XH));
						model.setXhgg(propertyMap.get(CapitalConstants.XHGG));
						model.setGysqc(propertyMap.get(CapitalConstants.GYSQC));
						model.setZldj(propertyMap.get(CapitalConstants.ZLDJ));
						model.setZgf(propertyMap.get(CapitalConstants.ZGF));
						model.setXxgf(propertyMap.get(CapitalConstants.XXGF));
						model.setFzxs(propertyMap.get(CapitalConstants.FZXS));
						model.setWxcc(propertyMap.get(CapitalConstants.WXCC));
						model.setZytj(propertyMap.get(CapitalConstants.ZYTJ));
						model.setFjxy(propertyMap.get(CapitalConstants.FJXY));
						model.setSfjk(propertyMap.get(CapitalConstants.SFJK));
						model.setJldw(propertyMap.get(CapitalConstants.JLDW));
						model.setSsml(propertyMap.get(CapitalConstants.SSML));
						model.setSjly(propertyMap.get(CapitalConstants.SJLY));
						model.setPartNumber(ot.getPartnumber());
						model.setDescription(ot.getDescription());
						model.setKth(PropertieUtil.getPropertieUtil().getValue(
								ConstantsUtil.OBJECT_EMPTY));
						model.setTypeCode(typeCodeMap.get(ot
								.getLibrarycomponenttypeId()));

						List<Object> librarygraphicOrCustomerpartnumberOrSupplierpartnumberList = ot
								.getLibrarygraphicOrCustomerpartnumberOrSupplierpartnumber();
						// StringBuilder graphicSB = new StringBuilder();
						for (Object obj : librarygraphicOrCustomerpartnumberOrSupplierpartnumberList) {
							if (obj instanceof LibrarygraphicType) {
								// 型谱图和侧视图都在Symbol下，并且无法从Capital
								// Library中获取symbol的名字，只能获取ID，并且无法通过ID判断哪个是型谱图哪个是侧视图。
								LibrarygraphicType librarygraphicType = (LibrarygraphicType) obj;
								// graphicSB.append("["
								// + librarygraphicType.getSymbolId() + "]");
								if (model.getSymbolNameXPT() == null) {
									model.setSymbolNameXPT(librarygraphicType
											.getSymbolId());
								} else {
									model.setSymbolNameCST(librarygraphicType
											.getSymbolId());
								}
							}
						}
						// model.setXptOrCst(graphicSB.toString());
						StringBuilder supplierSB = new StringBuilder();
						for (String supplierPartNumberId : supplierTypeMap
								.keySet()) {
							supplierSB.append("["
									+ supplierTypeMap.get(supplierPartNumberId)
									+ "]");
						}

						model.setSpecification(supplierSB.toString());

						StringBuilder matingSB = new StringBuilder();
						StringBuilder maleOrFemaleSB = new StringBuilder();
						List<String> maleOrFemaleList = new ArrayList<String>();
						List<Object> libraryconnectordetailsOrLibrarysinglewirefitscavityOrLibrarymultiplewirecavitiesList = ot
								.getLibrarygraphicOrCustomerpartnumberOrSupplierpartnumber();
						for (Object obj : libraryconnectordetailsOrLibrarysinglewirefitscavityOrLibrarymultiplewirecavitiesList) {
							if (obj instanceof LibrarycavityType) {
								LibrarycavityType librarycavityType = (LibrarycavityType) obj;
								String maleOrFemale1 = librarycavityType
										.getPingraphic();
								if (!maleOrFemaleList.contains(maleOrFemale1)) {
									maleOrFemaleList.add(maleOrFemale1);
								}
							}
							if (obj instanceof LibrarymatingType) {
								LibrarymatingType librarymatingType = (LibrarymatingType) obj;
								LibraryPartBaseType libraryPartBaseType = (LibraryPartBaseType) librarymatingType
										.getLibraryobjectId();
								matingSB.append("["
										+ otherTypeMap.get(libraryPartBaseType
												.getLibraryobjectId()) + "]");

							}
						}
						for (String maleOrFemaleTemp : maleOrFemaleList) {
							maleOrFemaleSB.append("[" + maleOrFemaleTemp + "]");
						}
						model.setMaleOrFemale(maleOrFemaleSB.toString());
						model.setMating(matingSB.toString());
						model.setBz(propertyMap.get(CapitalConstants.BZ));
						model.setYl1(propertyMap.get(CapitalConstants.YL1));
						model.setYl2(propertyMap.get(CapitalConstants.YL2));
						map.put(ot.getPartnumber(), model);
					}
				}

				if (ConstantsUtil.EMPTY.equals(compType)
						|| PropertieUtil.getPropertieUtil()
								.getValue(ConstantsUtil.TERMINAL)
								.equalsIgnoreCase(compType)) {

					for (TerminalType tt : terminalTypeList) {
						List<Object> objList = tt
								.getLibrarygraphicOrCustomerpartnumberOrSupplierpartnumber();
						Map<String, String> supplierTypeMap = new HashMap<String, String>();
						for (Object o1 : objList) {
							if (o1 instanceof SupplierpartnumberType) {
								SupplierpartnumberType supplierType = (SupplierpartnumberType) o1;
								supplierTypeMap.put(
										supplierType.getSupplierpartnumberId(),
										supplierType.getSpecification());
							}
						}
						Map<String, String> propertyMap = new HashMap<String, String>();
						for (Object o1 : objList) {
							if (o1 instanceof ChsuserpropertypartType) {
								ChsuserpropertypartType proPartType = (ChsuserpropertypartType) o1;
								ChsuserpropertyType proType = (ChsuserpropertyType) proPartType
										.getChsuserpropertyId();
								propertyMap.put(proType.getUserpropertyname(),
										proPartType.getUserpropertyvalue());
							}
						}
						ComponentInfoModel model = new ComponentInfoModel();
						model.setBmyxjb(propertyMap
								.get(CapitalConstants.BMYXJB));
						model.setSyfw(propertyMap.get(CapitalConstants.SYFW));
						model.setBmzt(propertyMap.get(CapitalConstants.BMZT));
						model.setBmlx(propertyMap.get(CapitalConstants.BMLX));
						model.setFldm(propertyMap.get(CapitalConstants.FLDM));
						model.setFlmc(propertyMap.get(CapitalConstants.FLMC));
						model.setSjbm(propertyMap.get(CapitalConstants.SJBM));
						model.setGroupName(tt.getGroupname().TERMINAL.value());
						model.setMc(propertyMap.get(CapitalConstants.MC));
						model.setJc(propertyMap.get(CapitalConstants.JC));
						model.setXh(propertyMap.get(CapitalConstants.XH));
						model.setXhgg(propertyMap.get(CapitalConstants.XHGG));
						model.setGysqc(propertyMap.get(CapitalConstants.GYSQC));
						model.setZldj(propertyMap.get(CapitalConstants.ZLDJ));
						model.setZgf(propertyMap.get(CapitalConstants.ZGF));
						model.setXxgf(propertyMap.get(CapitalConstants.XXGF));
						model.setFzxs(propertyMap.get(CapitalConstants.FZXS));
						model.setWxcc(propertyMap.get(CapitalConstants.WXCC));
						model.setZytj(propertyMap.get(CapitalConstants.ZYTJ));
						model.setFjxy(propertyMap.get(CapitalConstants.FJXY));
						model.setSfjk(propertyMap.get(CapitalConstants.SFJK));
						model.setJldw(propertyMap.get(CapitalConstants.JLDW));
						model.setSsml(propertyMap.get(CapitalConstants.SSML));
						model.setSjly(propertyMap.get(CapitalConstants.SJLY));
						model.setPartNumber(tt.getPartnumber());
						model.setDescription(tt.getDescription());
						model.setKth(PropertieUtil.getPropertieUtil().getValue(
								ConstantsUtil.OBJECT_EMPTY));
						model.setTypeCode(typeCodeMap.get(tt
								.getLibrarycomponenttypeId()));

						List<Object> librarygraphicOrCustomerpartnumberOrSupplierpartnumberList = tt
								.getLibrarygraphicOrCustomerpartnumberOrSupplierpartnumber();
						// StringBuilder graphicSB = new StringBuilder();
						for (Object obj : librarygraphicOrCustomerpartnumberOrSupplierpartnumberList) {
							if (obj instanceof LibrarygraphicType) {
								// 型谱图和侧视图都在Symbol下，并且无法从Capital
								// Library中获取symbol的名字，只能获取ID，并且无法通过ID判断哪个是型谱图哪个是侧视图。
								LibrarygraphicType librarygraphicType = (LibrarygraphicType) obj;
								// graphicSB.append("["
								// + librarygraphicType.getSymbolId() + "]");
								if (model.getSymbolNameXPT() == null) {
									model.setSymbolNameXPT(librarygraphicType
											.getSymbolId());
								} else {
									model.setSymbolNameCST(librarygraphicType
											.getSymbolId());
								}
							}
						}
						// model.setXptOrCst(graphicSB.toString());
						StringBuilder supplierSB = new StringBuilder();
						for (String supplierPartNumberId : supplierTypeMap
								.keySet()) {
							supplierSB.append("["
									+ supplierTypeMap.get(supplierPartNumberId)
									+ "]");
						}

						model.setSpecification(supplierSB.toString());

						StringBuilder matingSB = new StringBuilder();
						StringBuilder maleOrFemaleSB = new StringBuilder();
						List<String> maleOrFemaleList = new ArrayList<String>();
						List<Object> libraryconnectordetailsOrLibrarysinglewirefitscavityOrLibrarymultiplewirecavitiesList = tt
								.getLibrarygraphicOrCustomerpartnumberOrSupplierpartnumber();
						for (Object obj : libraryconnectordetailsOrLibrarysinglewirefitscavityOrLibrarymultiplewirecavitiesList) {
							if (obj instanceof LibrarycavityType) {
								LibrarycavityType librarycavityType = (LibrarycavityType) obj;
								String maleOrFemale1 = librarycavityType
										.getPingraphic();
								if (!maleOrFemaleList.contains(maleOrFemale1)) {
									maleOrFemaleList.add(maleOrFemale1);
								}
							}
							if (obj instanceof LibrarymatingType) {
								LibrarymatingType librarymatingType = (LibrarymatingType) obj;
								LibraryPartBaseType libraryPartBaseType = (LibraryPartBaseType) librarymatingType
										.getLibraryobjectId();
								matingSB.append("["
										+ terminalTypeMap
												.get(libraryPartBaseType
														.getLibraryobjectId())
										+ "]");

							}
						}
						for (String maleOrFemaleTemp : maleOrFemaleList) {
							maleOrFemaleSB.append("[" + maleOrFemaleTemp + "]");
						}
						model.setMaleOrFemale(maleOrFemaleSB.toString());
						model.setMating(matingSB.toString());
						model.setBz(propertyMap.get(CapitalConstants.BZ));
						model.setYl1(propertyMap.get(CapitalConstants.YL1));
						model.setYl2(propertyMap.get(CapitalConstants.YL2));
						map.put(tt.getPartnumber(), model);
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return map;

	}

}
