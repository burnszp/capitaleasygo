package com.esoon.capitaleasygo.action.capitallibraryhandle.util;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.swing.JOptionPane;

import com.acconsys.capital.lib.entity.BackshellType;
import com.acconsys.capital.lib.entity.BaseGroupType;
import com.acconsys.capital.lib.entity.ChsuserpropertyType;
import com.acconsys.capital.lib.entity.ChsuserpropertypartType;
import com.acconsys.capital.lib.entity.ChsuserpropertytypeType;
import com.acconsys.capital.lib.entity.ConnectorType;
import com.acconsys.capital.lib.entity.DocumentBase;
import com.acconsys.capital.lib.entity.LibraryPartBaseType;
import com.acconsys.capital.lib.entity.LibrarycolorType;
import com.acconsys.capital.lib.entity.LibrarycomponenttypeType;
import com.acconsys.capital.lib.entity.LibrarymaterialType;
import com.acconsys.capital.lib.entity.LibrarywireType;
import com.acconsys.capital.lib.entity.LibrarywirespecType;
import com.acconsys.capital.lib.entity.OtherType;
import com.acconsys.capital.lib.entity.SupplierorganisationType;
import com.acconsys.capital.lib.entity.SupplierpartnumberType;
import com.acconsys.capital.lib.entity.TerminalType;
import com.acconsys.capital.lib.entity.WireType;
import com.esoon.capitaleasygo.action.capitallibraryhandle.entity.Attribute;
import com.esoon.capitaleasygo.action.capitallibraryhandle.entity.LibraryPartVo;

public class LibraryPartImporter {
	public final static String IMPORT_FILE = "importReplaced.xml";
	public static int index = 0;
	private WObjectServiceImpl service;
	private LibrarycomponenttypeType componentType;
	private LibrarycolorType colorType;
	private LibrarymaterialType materialType;
	private LibrarywirespecType librarywirespec;
	private List<ChsuserpropertyType> cpt;
	private List<ChsuserpropertytypeType> cptt;
	private List<ChsuserpropertypartType> cppt;
	private List<SupplierorganisationType> suppORAType;
	private List<SupplierpartnumberType> suppPartNumberType;
	private LibraryPartBaseType lpb;
	private DocumentBase docBase;
	private SupplierorganisationType supplierorganisationType;
	private LibrarywireType lyt;
	private Map<String, Attribute> createLibAttrMap;// 这个map保存建库的基本信息。
	private String[] createLibAttrs = { CapitalConstants.PART_NUMBER,
			CapitalConstants.GROUPNAME };

	public LibraryPartImporter() {
		this.service = new WObjectServiceImpl();
	}

	/**
	 * 
	 * @param groupName
	 *            Connector/Wire/Other/Backshell
	 * @param compId
	 * @param series
	 * @param manufName
	 * @return
	 * @throws Exception
	 */
	public boolean liraryPartInsertOrUpdate(List<List<Attribute>> listList)
			throws Exception {
		List<String> libAttrList = Arrays.asList(createLibAttrs);
		docBase = new DocumentBase();
		for (List<Attribute> attributes : listList) {
			createLibAttrMap = new HashMap<String, Attribute>();
			for (Attribute ab : attributes) {
				// 获取属性中包含的建库的信息，这些建库信息是不能写在自定义属性中的，所以需要用map来保存，已备后用。
				if (libAttrList.contains(ab.getFieldName())) {
					createLibAttrMap.put(ab.getFieldName(), ab);
				}

			}
			attributes.remove(createLibAttrMap.get(CapitalConstants.PART_NUMBER));
			Attribute groupNameAttr = createLibAttrMap
					.get(CapitalConstants.GROUPNAME);
			Attribute partNumberAttr = createLibAttrMap
					.get(CapitalConstants.PART_NUMBER);
			String groupName = groupNameAttr == null ? null : groupNameAttr
					.getAttrValue().trim();
			String partNumber = partNumberAttr == null ? null : partNumberAttr
					.getAttrValue().trim();
			System.out.println("partNumber : " + partNumber);
			if (partNumber == null) {
				JOptionPane.showMessageDialog(null, "有的元器件partNumber为空!");
				return false;
			}
			try {
				// docBase = service.exportPartObject(pStrings);
				// if (docBase == null) {
				// new
				if (groupName != null && !"".equals(groupName.trim())) {
					if (LibrarySchemaConst.CONNECTOR.equals(groupName)) {
						lpb = new ConnectorType();
						lpb.setGroupname(BaseGroupType.CONNECTOR);
					} else if (LibrarySchemaConst.TERMINAL.equals(groupName)) {
						lpb = new TerminalType();
						lpb.setGroupname(BaseGroupType.TERMINAL);
					} else if (LibrarySchemaConst.OTHER.equals(groupName)) {
						lpb = new OtherType();
						lpb.setGroupname(BaseGroupType.OTHER);
					} else if (LibrarySchemaConst.BACKSHELL.equals(groupName)) {
						lpb = new BackshellType();
						lpb.setGroupname(BaseGroupType.BACKSHELL);
					}
					// }
					if(lpb!=null){
						lpb.setLibraryobjectId("UIDfdee08-139e9016648-"
								+ UUID.randomUUID().toString().replace("-", ""));
						getLiraryPart(groupName);
						createLibraryPartVo(attributes, groupName);
						lpb.setPartnumber(partNumber);
						
						docBase.getLibrarycolorOrLibrarymaterialOrLibrarycomponenttype()
						.add(lpb);
					}else{
						JOptionPane.showMessageDialog(null, "partNumber："+partNumber+"元器件的元器件类型属性不属于Connector、Backshell、Other、Terminal四种的任意一种!");
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
				throw new Exception();

			}

		}

//		List<Object> list = docBase
//				.getLibrarycolorOrLibrarymaterialOrLibrarycomponenttype();
//
//		List<Object> needRemoveList = new ArrayList<Object>();
//		Map<String, Object> componentMap = new HashMap<String, Object>();
//		Map<String, Object> colorMap = new HashMap<String, Object>();
//		Map<String, Object> materialMap = new HashMap<String, Object>();
//		for (Object object : list) {
//			if (object instanceof LibrarycomponenttypeType) {
//				if (componentMap.get(((LibrarycomponenttypeType) object)
//						.getTypecode()) == null) {
//					componentMap.put(
//							((LibrarycomponenttypeType) object).getTypecode(),
//							object);
//				} else {
//					needRemoveList.add(object);
//				}
//			} else if (object instanceof LibrarycolorType) {
//				if (colorMap.get(((LibrarycolorType) object).getColorcode()) == null) {
//					colorMap.put(((LibrarycolorType) object).getColorcode(),
//							object);
//				} else {
//					needRemoveList.add(object);
//				}
//			} else if (object instanceof LibrarymaterialType) {
//				if (materialMap.get(((LibrarymaterialType) object)
//						.getMaterialcode()) == null) {
//					materialMap.put(
//							((LibrarymaterialType) object).getMaterialcode(),
//							object);
//				} else {
//					needRemoveList.add(object);
//				}
//			}
//		}
//		list.removeAll(needRemoveList);

		service.importObject(docBase);
		String path = WObjectServiceImpl.getTempFileDir();
		File file = new File(path);
		if(!file.exists() && file.isDirectory()){
			file.mkdirs();
		}
//		for (File file2 : file.listFiles()) {
//			// file2.delete();
//		}

		return true;
	}

	private LibraryPartVo createLibraryPartVo(List<Attribute> attributeList,
			String groupName) {
		LibraryPartVo vo = new LibraryPartVo();
		if (groupName != null) {
			if (LibrarySchemaConst.CONNECTOR.equals(groupName)) {
				vo.setGroupname(LibrarySchemaConst.CONNECTOR);
				vo.setUnitofmeasure("Each");
			} else if (LibrarySchemaConst.TERMINAL.equals(groupName)) {
				vo.setGroupname(LibrarySchemaConst.TERMINAL);
				vo.setUnitofmeasure("Each");
			} else if (LibrarySchemaConst.OTHER.equals(groupName)) {
				vo.setGroupname(LibrarySchemaConst.OTHER);
				vo.setUnitofmeasure("Each");
			} else if (LibrarySchemaConst.BACKSHELL.equals(groupName)) {
				vo.setGroupname(LibrarySchemaConst.BACKSHELL);
				vo.setUnitofmeasure("Each");
			}
		}

		// 描述Description
		// vo.setDescription(createLibAttrMap.get(CapitalConstants.CI_CAPI_MS)
		// .getAttrValue().trim());
		// 这里不需要显示壳体号，也没法在Capital Library中体现。

		// typeCode
		vo.setTypecode("-");
		vo.setTypedescription("No Application");
		// vo.setTypecode(createLibAttrMap
		// .get(CapitalConstants.CI_CAPI_CTCONN_CZCONF).getAttrValue()
		// .trim());
		// typeCode
		// vo.setTypedescription(createLibAttrMap
		// .get(CapitalConstants.CI_CAPI_CTCONN_CZCONF).getAttrValue()
		// .trim());
		// //型谱图
		// vo.setDescription(createLibAttrMap
		// .get(CapitalConstants.CI_CAPI_MS).getAttrValue()
		// .trim());
		// 侧视图
		// vo.setDescription(createLibAttrMap
		// .get(CapitalConstants.CI_CAPI_MS).getAttrValue()
		// .trim());
		// specification
		// vo.setSupplierspecification(createLibAttrMap
		// .get(CapitalConstants.CI_CAPI_SPECIFICATION).getAttrValue()
		// .trim());
		// 针Pmale/孔Sfemale
		// vo.setCavityattributes(createLibAttrMap
		// .get(CapitalConstants.CI_CAPI_ZPMALE_KSFEMALE).getAttrValue()
		// .trim());
		// mating
		// vo.setMating(createLibAttrMap.get(CapitalConstants.CI_CAPI_MATING)
		// .getAttrValue().trim());

		for (Attribute ab : attributeList) {
			vo.getAttributeList().add(ab);
		}
		vo.setStatus("New");
		upDataLiraryPartBase(vo, groupName);
		updateSupperAndSupperPartNumber(vo);
		return vo;
	}

	private void upDataLiraryPartBase(LibraryPartVo vo, String groupName) {

		if (vo.getTypecode() != null) {
			if (componentType == null) {
				componentType = CapitalTypeUtils
						.createLibrarycomponenttypeType(vo.getGroupname(),
								vo.getTypedescription(), vo.getTypecode());
				lpb.setLibrarycomponenttypeId(componentType
						.getLibrarycomponenttypeId());
				docBase.getLibrarycolorOrLibrarymaterialOrLibrarycomponenttype()
						.add(componentType);
			} else if (!componentType.getTypecode().equals(vo.getTypecode())) {
				componentType = CapitalTypeUtils
						.createLibrarycomponenttypeType(vo.getGroupname(),
								vo.getTypedescription(), vo.getTypecode());
				lpb.setLibrarycomponenttypeId(componentType
						.getLibrarycomponenttypeId());
				docBase.getLibrarycolorOrLibrarymaterialOrLibrarycomponenttype()
						.add(componentType);
			}

		}

		// if (vo.getMaterialcode() != null) {
		// if (materialType == null) {
		// materialType = CapitalTypeUtils.createLibrarymaterialType(
		// vo.getMaterialcode(),
		// vo.getMaterialdescription() == null ? "暂无描述" : vo
		// .getMaterialdescription());
		// lpb.setLibrarymaterialId(materialType);
		// docBase.getLibrarycolorOrLibrarymaterialOrLibrarycomponenttype()
		// .add(materialType);
		// } else if (!(materialType.getMaterialcode().equals(vo
		// .getMaterialcode()))) {
		// materialType = CapitalTypeUtils.createLibrarymaterialType(
		// vo.getMaterialcode(),
		// vo.getMaterialdescription() == null ? "暂无描述" : vo
		// .getMaterialdescription());
		// lpb.setLibrarymaterialId(materialType);
		// docBase.getLibrarycolorOrLibrarymaterialOrLibrarycomponenttype()
		// .add(materialType);
		// }
		// } else {
		// if (vo.getCsa() != null && vo.getWirespecification() != null) {
		// materialType = CapitalTypeUtils.createLibrarymaterialType(
		// "wire", "导入的元器件默认的MaterialTypeCode");
		// lpb.setLibrarymaterialId(materialType);
		// docBase.getLibrarycolorOrLibrarymaterialOrLibrarycomponenttype()
		// .add(materialType);
		// } else {
		// materialType = CapitalTypeUtils.createLibrarymaterialType(
		// "Tem", "没有指定MaterialCode");
		// lpb.setLibrarymaterialId(materialType);
		// docBase.getLibrarycolorOrLibrarymaterialOrLibrarycomponenttype()
		// .add(materialType);
		//
		// }
		// }
		// if (vo.getColorcode() != null) {
		// if (colorType == null) {
		// colorType = CapitalTypeUtils.createLibrarycolorType(
		// vo.getColorcode(), vo.getColordescription());
		// lpb.setLibrarycolorId(colorType.getLibrarycolorId());
		// docBase.getLibrarycolorOrLibrarymaterialOrLibrarycomponenttype()
		// .add(colorType);
		// } else if (vo.getColorcode().equals(colorType.getColorcode())) {
		// colorType = CapitalTypeUtils.createLibrarycolorType(
		// vo.getColorcode(), vo.getColordescription());
		// lpb.setLibrarycolorId(colorType.getLibrarycolorId());
		// docBase.getLibrarycolorOrLibrarymaterialOrLibrarycomponenttype()
		// .add(colorType);
		// }
		// } else {
		// colorType = CapitalTypeUtils.createLibrarycolorType("Tem",
		// "没有指定ColorCode");
		// lpb.setLibrarycolorId(colorType.getLibrarycolorId());
		// docBase.getLibrarycolorOrLibrarymaterialOrLibrarycomponenttype()
		// .add(colorType);
		// }
//		if (groupName.equals(LibrarySchemaConst.WIRE)) {
//			if (vo.getWirespecification() != null) {
//				if (librarywirespec == null) {
//					if (vo.getCsa() != null
//							&& vo.getWirespecification() != null
//							&& materialType != null) {
//						librarywirespec = CapitalTypeUtils
//								.createLibrarywirespecType(
//										vo.getWirespecification(), vo.getCsa(),
//										materialType);
//						docBase.getLibrarycolorOrLibrarymaterialOrLibrarycomponenttype()
//								.add(librarywirespec);
//					}
//
//				}
//				if (librarywirespec != null) {
//					if (lyt == null) {
//						lyt = new LibrarywireType();
//						lyt.setLibraryobjectId(lpb);
//						lyt.setLibrarywireId("UIDfdee01-139e2016646-"
//								+ UUID.randomUUID().toString().replace("-", ""));
//						lyt.setLibrarywirespecId(librarywirespec
//								.getLibrarywirespecId());
//						if (vo.getColorcode() != null) {
//							lyt.setWirecolor(vo.getColorcode());
//						} else {
//							lyt.setWirecolor("TemC");
//						}
//						WireType wireType = (WireType) lpb;
//						wireType.getLibrarywire().clear();
//						wireType.getLibrarywire().add(lyt);
//					} else {
//						lyt.setLibraryobjectId(lpb);
//						lyt.setLibrarywireId(lpb.getLibraryobjectId());
//						lyt.setLibrarywirespecId(librarywirespec
//								.getLibrarywirespecId());
//						lyt.setWirecolor(vo.getColorcode());
//					}
//				}
//
//			}
//		}

		if (vo.getDescription() != null) {
			lpb.setDescription(vo.getDescription());
		}
		if (vo.getIncludeonbom() != null) {
			lpb.setIncludeonbom(true);
		}
		if (vo.getStatus() != null) {
			lpb.setPartstatus("New");
		}
		if (vo.getUnitofmeasure() != null) {
			lpb.setUnitofmeasure(vo.getUnitofmeasure());
		}
		if (vo.getWeight() != null) {
			lpb.setWeight(vo.getWeight());
		}
		if (vo.getSpecification() != null) {
			lpb.setSpecification(vo.getSpecification());
		}
		if (vo.getUserfiled1() != null) {
			lpb.setUserf1(vo.getUserfiled1());
		}
		if (vo.getUserfiled2() != null) {
			lpb.setUserf2(vo.getUserfiled2());
		}
		if (vo.getUserfiled3() != null) {
			lpb.setUserf3(vo.getUserfiled3());
		}
		if (vo.getUserfiled4() != null) {
			lpb.setUserf4(vo.getUserfiled4());
		}
		if (vo.getUserfiled5() != null) {
			lpb.setUserf5(vo.getUserfiled5());
		}

		if (vo.getNocavities() != null) {
			lpb.setCavityqt(Long.valueOf(vo.getNocavities()));
		}
		if (vo.getAddon() != null) {
			lpb.setAddon(vo.getAddon());
		}
		if (vo.getKnockoff() != null) {
			lpb.setKnockoff(vo.getKnockoff());
		}
		if (vo.getOutsidediameterdefined() != null) {
			lpb.setOutsidediameter(vo.getOutsidediameterdefined());
		}

		for (Attribute attribute : vo.getAttributeList()) {
			updateProperties(attribute);
		}
	}

	private void updateSupperAndSupperPartNumber(LibraryPartVo vo) {
		if (vo.getSupplier() != null) {
			supplierorganisationType = getSupplierorganisationType(vo
					.getSupplier());
			// 需要添加电话信息
		}
		if (vo.getSupplierpartnumber() != null) {
			getSupplierpartnumberType(
					lpb,
					vo.getSupplierspecification() == null ? "" : vo
							.getSupplierspecification(),
					supplierorganisationType, vo.getSupplierpartnumber());
		}
	}

	private void updateProperties(Attribute reslut) {
		ChsuserpropertyType chsuserpropertyType = null;
		for (ChsuserpropertyType cpts : cpt) {
			if (reslut.getFieldName().equals(cpts.getUserpropertyname())) {
				chsuserpropertyType = cpts;
				break;
			}
		}
		if (chsuserpropertyType == null) {
			chsuserpropertyType = CapitalTypeUtils.createChsuserpropertyType(
					reslut.getFieldName(), "String");
			docBase.getLibrarycolorOrLibrarymaterialOrLibrarycomponenttype()
					.add(chsuserpropertyType);
		}
		System.out.println(reslut.getAttrName());
		chsuserpropertyType.setPropdesc(reslut.getAttrName());
		ChsuserpropertytypeType chsuserpropertytypeType = null;

		for (ChsuserpropertytypeType type : cptt) {
			ChsuserpropertyType ct = (ChsuserpropertyType) type
					.getChsuserpropertyId();
			String a = ct.getChsuserpropertyId();
			if (type.getLibrarycomponenttypeId().equals(
					lpb.getLibrarycomponenttypeId())
					&& a.equals(chsuserpropertyType.getChsuserpropertyId())) {
				chsuserpropertytypeType = type;
				break;
			}
		}
		if (chsuserpropertytypeType == null) {
			chsuserpropertytypeType = CapitalTypeUtils
					.createChsuserpropertytypeType(chsuserpropertyType,
							componentType.getLibrarycomponenttypeId());
			docBase.getLibrarycolorOrLibrarymaterialOrLibrarycomponenttype()
					.add(chsuserpropertytypeType);
		}
		/*
		 * int a = 0; for (ChsuserpropertytypeType type : cptt) { if
		 * (type.getChsuserpropertyId().equals(
		 * chsuserpropertytypeType.getChsuserpropertyId()) &&
		 * type.getLibrarycomponenttypeId() .equals( chsuserpropertytypeType
		 * .getLibrarycomponenttypeId())) {
		 * System.out.println("-----------------------------------"); a = 1;
		 * break; } } if (a == 0) {
		 * docBase.getLibrarycolorOrLibrarymaterialOrLibrarycomponenttype()
		 * .add(chsuserpropertytypeType);
		 * 
		 * }
		 */
		ChsuserpropertypartType chsuserpropertypartType1 = null;
		for (ChsuserpropertypartType chsuserpropertypartType : cppt) {
			ChsuserpropertyType ct = (ChsuserpropertyType) chsuserpropertypartType
					.getChsuserpropertyId();

			if (ct.getChsuserpropertyId().equals(
					chsuserpropertyType.getChsuserpropertyId())) {
				chsuserpropertypartType1 = chsuserpropertypartType;
				chsuserpropertypartType.setUserpropertyvalue(reslut
						.getAttrValue() == null ? "" : reslut.getAttrValue()
						.trim());
			}
		}
		if (chsuserpropertypartType1 == null) {
			chsuserpropertypartType1 = CapitalTypeUtils
					.createChsuserpropertypartType(chsuserpropertyType, lpb,
							reslut.getAttrValue() == null ? "" : reslut
									.getAttrValue().trim());
			lpb.getLibrarygraphicOrCustomerpartnumberOrSupplierpartnumber()
					.add(chsuserpropertypartType1);
		}

	}

	/**
	 * 将docBase 对象 中的Library 类型转化为JavaBean对象。
	 */
	private void getLiraryPart(String groupName) {
		List<Object> objects = docBase
				.getLibrarycolorOrLibrarymaterialOrLibrarycomponenttype();
		List<LibrarycomponenttypeType> librarycomponenttypeTypeList = new ArrayList<LibrarycomponenttypeType>();
		List<LibrarycolorType> librarycolorTypeList = new ArrayList<LibrarycolorType>();
		List<LibrarymaterialType> librarymaterialTypeList = new ArrayList<LibrarymaterialType>();
		List<LibrarywirespecType> librarywirespecTypeList = new ArrayList<LibrarywirespecType>();
		cpt = new ArrayList<ChsuserpropertyType>();
		cptt = new ArrayList<ChsuserpropertytypeType>();
		cppt = new ArrayList<ChsuserpropertypartType>();
		suppORAType = new ArrayList<SupplierorganisationType>();
		suppPartNumberType = new ArrayList<SupplierpartnumberType>();
		for (Object object : objects) {
			// TypeCode
			if (object instanceof LibrarycomponenttypeType) {
				LibrarycomponenttypeType compType = (LibrarycomponenttypeType) object;
				librarycomponenttypeTypeList.add(compType);
			}
			// Color Code
			if (object instanceof LibrarycolorType) {
				LibrarycolorType compType = (LibrarycolorType) object;
				librarycolorTypeList.add(compType);
			}
			// Material Code
			if (object instanceof LibrarymaterialType) {
				LibrarymaterialType compType = (LibrarymaterialType) object;
				librarymaterialTypeList.add(compType);
			}
			// 只针对wire
			if (object instanceof LibrarywirespecType) {
				LibrarywirespecType compType = (LibrarywirespecType) object;
				librarywirespecTypeList.add(compType);
			}
			// 自定义属性
			if (object instanceof ChsuserpropertyType) {
				ChsuserpropertyType compType = (ChsuserpropertyType) object;
				cpt.add(compType);
			}
			// 自定义属性对应的Type Code
			if (object instanceof ChsuserpropertytypeType) {
				ChsuserpropertytypeType compType = (ChsuserpropertytypeType) object;
				cptt.add(compType);
			}
			// 生厂厂家
			if (object instanceof SupplierorganisationType) {
				SupplierorganisationType compType = (SupplierorganisationType) object;
				suppORAType.add(compType);
			}
			System.out.println(object.getClass());
			if (object instanceof LibraryPartBaseType) {
				// lpb = (LibraryPartBaseType) object;
				for (Object object2 : lpb
						.getLibrarygraphicOrCustomerpartnumberOrSupplierpartnumber()) {
					if (object2 instanceof SupplierpartnumberType) {
						SupplierpartnumberType supplierpartnumberType = (SupplierpartnumberType) object2;
						suppPartNumberType.add(supplierpartnumberType);
					}
					if (object2 instanceof ChsuserpropertypartType) {
						ChsuserpropertypartType chsuserpropertypartType = (ChsuserpropertypartType) object2;
						cppt.add(chsuserpropertypartType);
					}
					if (object2 instanceof LibrarywireType) {
						lyt = (LibrarywireType) object2;
					}
				}
			}
		}
		getLibrarycomponenttypeType(librarycomponenttypeTypeList);
		getLibrarycolorType(librarycolorTypeList);
		getLibrarymaterialType(librarymaterialTypeList);
		if (groupName.equals(LibrarySchemaConst.WIRE)) {
			getLibrarywirespecType(librarywirespecTypeList);
		}
	}

	private void getLibrarycomponenttypeType(
			List<LibrarycomponenttypeType> librarycomponenttypeTypeList) {

		String librarycomponenttypeId = lpb.getLibrarycomponenttypeId();
		for (LibrarycomponenttypeType type : librarycomponenttypeTypeList) {
			if (type.getLibrarycomponenttypeId().equals(librarycomponenttypeId)) {
				componentType = type;
				break;
			}
		}
	}

	private void getLibrarycolorType(List<LibrarycolorType> librarycolorTypeList) {
		String librarycomponenttypeId = lpb.getLibrarycolorId();
		for (LibrarycolorType type : librarycolorTypeList) {
			if (type.getLibrarycolorId().equals(librarycomponenttypeId)) {
				colorType = type;
				break;
			}
		}
	}

	private void getLibrarymaterialType(
			List<LibrarymaterialType> librarymaterialTypeList) {
		if (lpb.getLibrarymaterialId() != null) {
			String librarycomponenttypeId = ((LibrarymaterialType) lpb
					.getLibrarymaterialId()).getLibrarymaterialId();
			for (LibrarymaterialType type : librarymaterialTypeList) {
				if (type.getLibrarymaterialId().equals(librarycomponenttypeId)) {
					materialType = type;
					break;
				}
			}
		}

	}

	private void getLibrarywirespecType(
			List<LibrarywirespecType> librarywirespecTypeList) {
		if (lyt != null) {
			for (LibrarywirespecType type : librarywirespecTypeList) {
				LibrarywirespecType lywt = (LibrarywirespecType) lyt
						.getLibrarywirespecId();
				if (type.getWirespec().equals(lywt.getWirespec())) {
					librarywirespec = type;
					break;
				}
			}
		}

	}

	private SupplierorganisationType getSupplierorganisationType(
			String supplierName) {
		for (SupplierorganisationType type : suppORAType) {
			if (supplierName.equals(type.getName())) {
				return type;
			}
		}
		// SupplierorganisationType type = CapitalTypeUtils
		// .createSupplierorganisationType(supplierName, manufacturer
		// .getManufacturerAddress(), manufacturer
		// .getManufacturerZipCode(), manufacturer
		// .getManufacturerPhone(), manufacturer
		// .getManufacturerFax());
		SupplierorganisationType type = CapitalTypeUtils
				.createSupplierorganisationType(supplierName, "厂家地址", "邮编",
						"厂家电话", "传真");
		docBase.getLibrarycolorOrLibrarymaterialOrLibrarycomponenttype().add(
				type);
		return type;
	}

	private void getSupplierpartnumberType(Object object, String specification,
			SupplierorganisationType supplierorganisationType,
			String supplierPartNumber) {
		for (SupplierpartnumberType type : suppPartNumberType) {
			if (supplierPartNumber.equals(type.getSupplierpartnumber())) {
				SupplierorganisationType type2 = (SupplierorganisationType) type
						.getSupplierorganisationId();
				if (!type2.getName().equals(supplierorganisationType.getName())) {
					type.setSupplierorganisationId(supplierorganisationType);
				}
				return;
			}
		}
		SupplierpartnumberType type = CapitalTypeUtils
				.createSupplierpartnumberType(lpb, specification,
						supplierorganisationType, supplierPartNumber);
		lpb.getLibrarygraphicOrCustomerpartnumberOrSupplierpartnumber().add(
				type);
	}

	/**
	 * 获取对应关系
	 * 
	 * @param ab
	 * @return
	 */
	private String getCapitalAtts(Attribute ab) {
		return LibrarySchemaConst.PROPERTIES;
	}

	private boolean isHavePart(List<Object> objects) {
		for (Object object : objects) {
			if (object instanceof ConnectorType) {
				return true;
			} else if (object instanceof WireType) {
				return true;
			} else if (object instanceof OtherType) {
				return true;
			} else if (object instanceof BackshellType) {
				return true;
			}
		}
		return false;
	}

}
