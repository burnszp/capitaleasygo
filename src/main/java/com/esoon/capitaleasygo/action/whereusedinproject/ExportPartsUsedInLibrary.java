package com.esoon.capitaleasygo.action.whereusedinproject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.acconsys.capital.lib.entity.BackshellType;
import com.acconsys.capital.lib.entity.BaseGroupType;
import com.acconsys.capital.lib.entity.ConnectorType;
import com.acconsys.capital.lib.entity.DeviceType;
import com.acconsys.capital.lib.entity.DocumentBase;
import com.acconsys.capital.lib.entity.LibrarycolorType;
import com.acconsys.capital.lib.entity.LibrarycomponenttypeType;
import com.acconsys.capital.lib.entity.LibrarymaterialType;
import com.acconsys.capital.lib.entity.MulticoreType;
import com.acconsys.capital.lib.entity.SpliceType;
import com.acconsys.capital.lib.entity.SupplierorganisationType;
import com.acconsys.capital.lib.entity.SupplierpartnumberType;
import com.acconsys.capital.lib.entity.TapeType;
import com.acconsys.capital.lib.entity.TubeType;
import com.acconsys.capital.lib.entity.WireType;
import com.acconsys.capital.lib.service.impl.WObjectServiceImpl;

/**
 * 根据指定的partnumber查找详细信息：
 * 器件型号	器件名称	器件类型	管脚数	器件描述	颜色	材料	院物资编码	所物资编码	集团物资编码	质量等级	详细规范	附件协议	特殊要求	生产厂家	国产/进口	Group Name	Type Code	Status	使用次数	所在型号名称	 型号使用次数	所在设计名称	设计使用次数	所编码
 * @author Administrator
 *
 */
public class ExportPartsUsedInLibrary {

	private static DocumentBase docBase;
	private static WObjectServiceImpl service;
	private static List<String> partNumbers;
	private static Map<String,String> colorMap;//第一个String表示librarycolor_id，第二个String表示：colorcode  ,最后在循环元器件信息替换其中的数据。
	private static Map<String,String> supplierMap;//第一个String表示supplierorganisation_id，第二个String表示：name  ,最后在循环元器件信息替换其中的数据。
	private static Map<String, String> typeCodeMap;//第一个String表示librarycomponenttype_id，第二个String表示：typecode  ,最后在循环元器件信息替换其中的数据。
	private static List<ConnectorType> connectorTypeList;
	private static List<BackshellType> backshellTypeList;
	private static List<WireType> wireTypeList;
	private static List<MulticoreType> multicoreTypeList;
	private static List<DeviceType> deviceTypeList;
	private static List<SpliceType> spliceTypeList;
	private static List<TubeType> tubeTypeList;
	private static List<TapeType> tapeTypeList;
	
	public static void main(String[] args) {
		try {
			service = new WObjectServiceImpl();
			colorMap = new HashMap<String, String>();
			supplierMap = new HashMap<String, String>();
			typeCodeMap = new HashMap<String, String>();
			connectorTypeList = new ArrayList<ConnectorType>();
			backshellTypeList = new ArrayList<BackshellType>();
			wireTypeList = new ArrayList<WireType>();
			multicoreTypeList = new ArrayList<MulticoreType>();
			deviceTypeList = new ArrayList<DeviceType>();
			spliceTypeList = new ArrayList<SpliceType>();
			tubeTypeList = new ArrayList<TubeType>();
			tapeTypeList = new ArrayList<TapeType>();
			ExportPartsUsedInLibrary test = new ExportPartsUsedInLibrary();
//			partNumbers = test.getPartNumbers();
			docBase = service.exportPartObject(partNumbers);
			if(docBase != null){
				System.out.println(docBase);
				List<Object> objects = docBase.getLibrarycolorOrLibrarymaterialOrLibrarycomponenttype();
				for(Object o : objects){
					if(o instanceof LibrarycolorType){
						LibrarycolorType colorType = (LibrarycolorType) o;
						colorMap.put(colorType.getLibrarycolorId(), colorType.getColorcode());
					}
					if(o instanceof SupplierorganisationType){
						SupplierorganisationType supplierType = (SupplierorganisationType) o;
						supplierMap.put(supplierType.getSupplierorganisationId(), supplierType.getName());
					}
					if(o instanceof LibrarycomponenttypeType){
						LibrarycomponenttypeType typeCodeModel = (LibrarycomponenttypeType) o;
						typeCodeMap.put(typeCodeModel.getLibrarycomponenttypeId(), typeCodeModel.getTypecode());
					}
					//Connector
					if(o instanceof ConnectorType){
						connectorTypeList.add((ConnectorType) o);
					}
				}
				
				for(ConnectorType ct:connectorTypeList){
					System.out.println("Part number: "+ ct.getPartnumber());
					System.out.println("User Field5: "+ ct.getUserf5());
					System.out.println("器件类型: "+ "连接器");
					System.out.println("No.Cavities: "+ ct.getLibraryconnectordetailsOrLibrarysinglewirefitscavityOrLibrarymultiplewirecavities().size());
					System.out.println("Desciption: "+ ct.getDescription());
					System.out.println("Colour Code :: "+ colorMap.get(ct.getLibrarycolorId()));
					System.out.println("Material Code: "+ ((LibrarymaterialType)ct.getLibrarymaterialId()).getMaterialcode());
					System.out.println("User Field1: "+ ct.getUserf1());
					System.out.println("User Field2: "+ ct.getUserf2());
					System.out.println("User Field3: "+ ct.getUserf3());
					System.out.println("User Field4: "+ ct.getUserf4());
					List<Object> objList = ct.getLibrarygraphicOrCustomerpartnumberOrSupplierpartnumber();
					SupplierpartnumberType suType = null;
					for(Object o1 :objList){
						if(o1 instanceof SupplierpartnumberType){
							suType = (SupplierpartnumberType) o1;
						}
					}
					System.out.println("Supplier Part Number: "+ suType.getSupplierpartnumber());
					System.out.println("Supplier Name : "+ supplierMap.get(((SupplierorganisationType)(suType.getSupplierorganisationId())).getSupplierorganisationId()));//需要用supplierMap的value来替换
					System.out.println("Group Name: "+ BaseGroupType.CONNECTOR.value());
					System.out.println("Type Code: "+ typeCodeMap.get(ct.getLibrarycomponenttypeId()));
					System.out.println("Status: "+ ct.getPartstatus());
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
//	public List<String> getPartNumbers(){
//		List<String> partNumbers = new ArrayList<String>();
//		partNumbers.add("J599/20FB35PA");
//		return partNumbers;
//	}
	
	
	/**
	 * 根据元器件集合信息获取元器件详情信息。
	 * @param partNumberList
	 * @return
	 */
	public static Map<String,ComponentInfoModel> getComponentInfoByPartNumber(List<String> partNumberList){
		Map<String,ComponentInfoModel> map = new HashMap<String, ComponentInfoModel>();
		try {
			service = new WObjectServiceImpl();
			colorMap = new HashMap<String, String>();
			supplierMap = new HashMap<String, String>();
			typeCodeMap = new HashMap<String, String>();
			connectorTypeList = new ArrayList<ConnectorType>();
			backshellTypeList = new ArrayList<BackshellType>();
			wireTypeList = new ArrayList<WireType>();
			multicoreTypeList = new ArrayList<MulticoreType>();
			deviceTypeList = new ArrayList<DeviceType>();
			spliceTypeList = new ArrayList<SpliceType>();
			tubeTypeList = new ArrayList<TubeType>();
			tapeTypeList = new ArrayList<TapeType>();
//			ExportPartsUsedInLibrary test = new ExportPartsUsedInLibrary();
//			partNumbers = test.getPartNumbers();
			docBase = service.exportPartObject(partNumberList);
			if(docBase != null){
				System.out.println(docBase);
				List<Object> objects = docBase.getLibrarycolorOrLibrarymaterialOrLibrarycomponenttype();
				for(Object o : objects){
					if(o instanceof LibrarycolorType){
						LibrarycolorType colorType = (LibrarycolorType) o;
						colorMap.put(colorType.getLibrarycolorId(), colorType.getColorcode());
					}
					if(o instanceof SupplierorganisationType){
						SupplierorganisationType supplierType = (SupplierorganisationType) o;
						supplierMap.put(supplierType.getSupplierorganisationId(), supplierType.getName());
					}
					if(o instanceof LibrarycomponenttypeType){
						LibrarycomponenttypeType typeCodeModel = (LibrarycomponenttypeType) o;
						typeCodeMap.put(typeCodeModel.getLibrarycomponenttypeId(), typeCodeModel.getTypecode());
					}
					//Backshell
					if(o instanceof BackshellType){
						backshellTypeList.add((BackshellType) o);
					}
					//Wire
					if(o instanceof WireType){
						wireTypeList.add((WireType) o);
					}
					//Multicore Wire
					if(o instanceof MulticoreType){
						multicoreTypeList.add((MulticoreType) o);
					}
					//Connector
					if(o instanceof ConnectorType){
						connectorTypeList.add((ConnectorType) o);
					}
					//Device
					if(o instanceof DeviceType){
						deviceTypeList.add((DeviceType) o);
					}
					//Splice
					if(o instanceof SpliceType){
						spliceTypeList.add((SpliceType) o);
					}
					//Tube
					if(o instanceof TubeType){
						tubeTypeList.add((TubeType) o);
					}
					//Tape
					if(o instanceof TapeType){
						tapeTypeList.add((TapeType) o);
					}
				}
				
				for(ConnectorType ct:connectorTypeList){
//					System.out.println("Part number: "+ ct.getPartnumber());
//					System.out.println("User Field5: "+ ct.getUserf5());
//					System.out.println("器件类型: "+ "连接器");
//					System.out.println("No.Cavities: "+ ct.getLibraryconnectordetailsOrLibrarysinglewirefitscavityOrLibrarymultiplewirecavities().size());
//					System.out.println("Desciption: "+ ct.getDescription());
//					System.out.println("Colour Code :: "+ colorMap.get(ct.getLibrarycolorId()));
//					System.out.println("Material Code: "+ ((LibrarymaterialType)ct.getLibrarymaterialId()).getMaterialcode());
//					System.out.println("User Field1: "+ ct.getUserf1());
//					System.out.println("User Field2: "+ ct.getUserf2());
//					System.out.println("User Field3: "+ ct.getUserf3());
//					System.out.println("User Field4: "+ ct.getUserf4());
//					System.out.println("Supplier Part Number: "+ suType.getSupplierpartnumber());
//					System.out.println("Supplier Name : "+ supplierMap.get(((SupplierorganisationType)(suType.getSupplierorganisationId())).getSupplierorganisationId()));//需要用supplierMap的value来替换
//					System.out.println("Group Name: "+ BaseGroupType.CONNECTOR.value());
//					System.out.println("Type Code: "+ typeCodeMap.get(ct.getLibrarycomponenttypeId()));
//					System.out.println("Status: "+ ct.getPartstatus());
					List<Object> objList = ct.getLibrarygraphicOrCustomerpartnumberOrSupplierpartnumber();
					SupplierpartnumberType suType = null;
					for(Object o1 :objList){
						if(o1 instanceof SupplierpartnumberType){
							suType = (SupplierpartnumberType) o1;
						}
					}
					ComponentInfoModel model = new ComponentInfoModel();
					model.setPartNumber(ct.getPartnumber());
					model.setUserField5(ct.getUserf5()==null?"-":ct.getUserf5());
					model.setComponentType("连接器");
//					ct.getCavityqt();
					model.setNoCavities(ct.getCavityqt().intValue());
//					model.setNoCavities(ct.getLibraryconnectordetailsOrLibrarysinglewirefitscavityOrLibrarymultiplewirecavities().size());
					model.setDescription(ct.getDescription()==null?"-":ct.getDescription());
					model.setColourCode(colorMap.get(ct.getLibrarycolorId()));
					model.setMaterialCode(((LibrarymaterialType)ct.getLibrarymaterialId()).getMaterialcode());
					model.setUserField1(ct.getUserf1()==null?"-":ct.getUserf1());
					model.setUserField2(ct.getUserf2()==null?"-":ct.getUserf2());
					model.setUserField3(ct.getUserf3()==null?"-":ct.getUserf3());
					model.setUserField4(ct.getUserf4()==null?"-":ct.getUserf4());
					model.setSupplierPartNumber(suType==null ||suType.getSupplierpartnumber()==null ?"-":suType.getSupplierpartnumber());
					model.setSupplierName(suType==null || suType.getSupplierorganisationId() == null?"-":supplierMap.get(((SupplierorganisationType)(suType.getSupplierorganisationId())).getSupplierorganisationId()));
					model.setGroupName(BaseGroupType.CONNECTOR.value());
					model.setTypeCode(typeCodeMap.get(ct.getLibrarycomponenttypeId()));
					model.setStatus(ct.getPartstatus());
					map.put(ct.getPartnumber(), model);
				}
				for(BackshellType bst:backshellTypeList){
					List<Object> objList = bst.getLibrarygraphicOrCustomerpartnumberOrSupplierpartnumber();
					SupplierpartnumberType suType = null;
					for(Object o1 :objList){
						if(o1 instanceof SupplierpartnumberType){
							suType = (SupplierpartnumberType) o1;
						}
					}
					ComponentInfoModel model = new ComponentInfoModel();
					model.setPartNumber(bst.getPartnumber());
					model.setUserField5(bst.getUserf5()==null?"-":bst.getUserf5());
					model.setComponentType("尾罩");
					model.setNoCavities(bst.getCavityqt().intValue());
					model.setDescription(bst.getDescription()==null?"-":bst.getDescription());
					model.setColourCode(colorMap.get(bst.getLibrarycolorId()));
					model.setMaterialCode(((LibrarymaterialType)bst.getLibrarymaterialId()).getMaterialcode());
					model.setUserField1(bst.getUserf1()==null?"-":bst.getUserf1());
					model.setUserField2(bst.getUserf2()==null?"-":bst.getUserf2());
					model.setUserField3(bst.getUserf3()==null?"-":bst.getUserf3());
					model.setUserField4(bst.getUserf4()==null?"-":bst.getUserf4());
					model.setSupplierPartNumber(suType==null ||suType.getSupplierpartnumber()==null ?"-":suType.getSupplierpartnumber());
					model.setSupplierName(suType==null || suType.getSupplierorganisationId() == null?"-":supplierMap.get(((SupplierorganisationType)(suType.getSupplierorganisationId())).getSupplierorganisationId()));
					model.setGroupName(BaseGroupType.BACKSHELL.value());
					model.setTypeCode(typeCodeMap.get(bst.getLibrarycomponenttypeId()));
					model.setStatus(bst.getPartstatus());
					map.put(bst.getPartnumber(), model);
				}
				for(WireType wt:wireTypeList){
					List<Object> objList = wt.getLibrarygraphicOrCustomerpartnumberOrSupplierpartnumber();
					SupplierpartnumberType suType = null;
					for(Object o1 :objList){
						if(o1 instanceof SupplierpartnumberType){
							suType = (SupplierpartnumberType) o1;
						}
					}
					ComponentInfoModel model = new ComponentInfoModel();
					model.setPartNumber(wt.getPartnumber());
					model.setUserField5(wt.getUserf5()==null?"-":wt.getUserf5());
					model.setComponentType("导线");
					model.setNoCavities(wt.getCavityqt().intValue());
					model.setDescription(wt.getDescription()==null?"-":wt.getDescription());
					model.setColourCode(colorMap.get(wt.getLibrarycolorId()));
					model.setMaterialCode(((LibrarymaterialType)wt.getLibrarymaterialId()).getMaterialcode());
					model.setUserField1(wt.getUserf1()==null?"-":wt.getUserf1());
					model.setUserField2(wt.getUserf2()==null?"-":wt.getUserf2());
					model.setUserField3(wt.getUserf3()==null?"-":wt.getUserf3());
					model.setUserField4(wt.getUserf4()==null?"-":wt.getUserf4());
					model.setSupplierPartNumber(suType==null ||suType.getSupplierpartnumber()==null ?"-":suType.getSupplierpartnumber());
					model.setSupplierName(suType==null || suType.getSupplierorganisationId() == null?"-":supplierMap.get(((SupplierorganisationType)(suType.getSupplierorganisationId())).getSupplierorganisationId()));
					model.setGroupName(BaseGroupType.WIRE.value());
					model.setTypeCode(typeCodeMap.get(wt.getLibrarycomponenttypeId()));
					model.setStatus(wt.getPartstatus());
					map.put(wt.getPartnumber(), model);
				}
				for(MulticoreType mct:multicoreTypeList){
					List<Object> objList = mct.getLibrarygraphicOrCustomerpartnumberOrSupplierpartnumber();
					SupplierpartnumberType suType = null;
					for(Object o1 :objList){
						if(o1 instanceof SupplierpartnumberType){
							suType = (SupplierpartnumberType) o1;
						}
					}
					ComponentInfoModel model = new ComponentInfoModel();
					model.setPartNumber(mct.getPartnumber());
					model.setUserField5(mct.getUserf5()==null?"-":mct.getUserf5());
					model.setComponentType("多芯线");
					model.setNoCavities(mct.getCavityqt().intValue());
					model.setDescription(mct.getDescription()==null?"-":mct.getDescription());
					model.setColourCode(colorMap.get(mct.getLibrarycolorId()));
					model.setMaterialCode(((LibrarymaterialType)mct.getLibrarymaterialId()).getMaterialcode());
					model.setUserField1(mct.getUserf1()==null?"-":mct.getUserf1());
					model.setUserField2(mct.getUserf2()==null?"-":mct.getUserf2());
					model.setUserField3(mct.getUserf3()==null?"-":mct.getUserf3());
					model.setUserField4(mct.getUserf4()==null?"-":mct.getUserf4());
					model.setSupplierPartNumber(suType==null ||suType.getSupplierpartnumber()==null ?"-":suType.getSupplierpartnumber());
					model.setSupplierName(suType==null || suType.getSupplierorganisationId() == null?"-":supplierMap.get(((SupplierorganisationType)(suType.getSupplierorganisationId())).getSupplierorganisationId()));
					model.setGroupName(BaseGroupType.MULTICORE_WIRE.value());
					model.setTypeCode(typeCodeMap.get(mct.getLibrarycomponenttypeId()));
					model.setStatus(mct.getPartstatus());
					map.put(mct.getPartnumber(), model);
				}
				for(DeviceType dt:deviceTypeList){
					List<Object> objList = dt.getLibrarygraphicOrCustomerpartnumberOrSupplierpartnumber();
					SupplierpartnumberType suType = null;
					for(Object o1 :objList){
						if(o1 instanceof SupplierpartnumberType){
							suType = (SupplierpartnumberType) o1;
						}
					}
					ComponentInfoModel model = new ComponentInfoModel();
					model.setPartNumber(dt.getPartnumber());
					model.setUserField5(dt.getUserf5()==null?"-":dt.getUserf5());
					model.setComponentType("连接器");
					model.setNoCavities(dt.getCavityqt().intValue());
					model.setDescription(dt.getDescription()==null?"-":dt.getDescription());
					model.setColourCode(colorMap.get(dt.getLibrarycolorId()));
					model.setMaterialCode(((LibrarymaterialType)dt.getLibrarymaterialId()).getMaterialcode());
					model.setUserField1(dt.getUserf1()==null?"-":dt.getUserf1());
					model.setUserField2(dt.getUserf2()==null?"-":dt.getUserf2());
					model.setUserField3(dt.getUserf3()==null?"-":dt.getUserf3());
					model.setUserField4(dt.getUserf4()==null?"-":dt.getUserf4());
					model.setSupplierPartNumber(suType==null ||suType.getSupplierpartnumber()==null ?"-":suType.getSupplierpartnumber());
					model.setSupplierName(suType==null || suType.getSupplierorganisationId() == null?"-":supplierMap.get(((SupplierorganisationType)(suType.getSupplierorganisationId())).getSupplierorganisationId()));
					model.setGroupName(BaseGroupType.DEVICE.value());
					model.setTypeCode(typeCodeMap.get(dt.getLibrarycomponenttypeId()));
					model.setStatus(dt.getPartstatus());
					map.put(dt.getPartnumber(), model);
				}
				for(SpliceType st:spliceTypeList){
					List<Object> objList = st.getLibrarygraphicOrCustomerpartnumberOrSupplierpartnumber();
					SupplierpartnumberType suType = null;
					for(Object o1 :objList){
						if(o1 instanceof SupplierpartnumberType){
							suType = (SupplierpartnumberType) o1;
						}
					}
					ComponentInfoModel model = new ComponentInfoModel();
					model.setPartNumber(st.getPartnumber());
					model.setUserField5(st.getUserf5()==null?"-":st.getUserf5());
					model.setComponentType("压接端子（Splice）");
					model.setNoCavities(st.getCavityqt().intValue());
					model.setDescription(st.getDescription()==null?"-":st.getDescription());
					model.setColourCode(colorMap.get(st.getLibrarycolorId()));
					model.setMaterialCode(((LibrarymaterialType)st.getLibrarymaterialId()).getMaterialcode());
					model.setUserField1(st.getUserf1()==null?"-":st.getUserf1());
					model.setUserField2(st.getUserf2()==null?"-":st.getUserf2());
					model.setUserField3(st.getUserf3()==null?"-":st.getUserf3());
					model.setUserField4(st.getUserf4()==null?"-":st.getUserf4());
					model.setSupplierPartNumber(suType==null ||suType.getSupplierpartnumber()==null ?"-":suType.getSupplierpartnumber());
					model.setSupplierName(suType==null || suType.getSupplierorganisationId() == null?"-":supplierMap.get(((SupplierorganisationType)(suType.getSupplierorganisationId())).getSupplierorganisationId()));
					model.setGroupName(BaseGroupType.SPLICE.value());
					model.setTypeCode(typeCodeMap.get(st.getLibrarycomponenttypeId()));
					model.setStatus(st.getPartstatus());
					map.put(st.getPartnumber(), model);
				}
				for(TubeType tubeType:tubeTypeList){
					List<Object> objList = tubeType.getLibrarygraphicOrCustomerpartnumberOrSupplierpartnumber();
					SupplierpartnumberType suType = null;
					for(Object o1 :objList){
						if(o1 instanceof SupplierpartnumberType){
							suType = (SupplierpartnumberType) o1;
						}
					}
					ComponentInfoModel model = new ComponentInfoModel();
					model.setPartNumber(tubeType.getPartnumber());
					model.setUserField5(tubeType.getUserf5()==null?"-":tubeType.getUserf5());
					model.setComponentType("成缆");
					model.setNoCavities(tubeType.getCavityqt().intValue());
					model.setDescription(tubeType.getDescription()==null?"-":tubeType.getDescription());
					model.setColourCode(colorMap.get(tubeType.getLibrarycolorId()));
					model.setMaterialCode(((LibrarymaterialType)tubeType.getLibrarymaterialId()).getMaterialcode());
					model.setUserField1(tubeType.getUserf1()==null?"-":tubeType.getUserf1());
					model.setUserField2(tubeType.getUserf2()==null?"-":tubeType.getUserf2());
					model.setUserField3(tubeType.getUserf3()==null?"-":tubeType.getUserf3());
					model.setUserField4(tubeType.getUserf4()==null?"-":tubeType.getUserf4());
					model.setSupplierPartNumber(suType==null ||suType.getSupplierpartnumber()==null ?"-":suType.getSupplierpartnumber());
					model.setSupplierName(suType==null || suType.getSupplierorganisationId() == null?"-":supplierMap.get(((SupplierorganisationType)(suType.getSupplierorganisationId())).getSupplierorganisationId()));
					model.setGroupName(BaseGroupType.TUBE.value());
					model.setTypeCode(typeCodeMap.get(tubeType.getLibrarycomponenttypeId()));
					model.setStatus(tubeType.getPartstatus());
					map.put(tubeType.getPartnumber(), model);
				}
				for(TapeType tapeType:tapeTypeList){
					List<Object> objList = tapeType.getLibrarygraphicOrCustomerpartnumberOrSupplierpartnumber();
					SupplierpartnumberType suType = null;
					for(Object o1 :objList){
						if(o1 instanceof SupplierpartnumberType){
							suType = (SupplierpartnumberType) o1;
						}
					}
					ComponentInfoModel model = new ComponentInfoModel();
					model.setPartNumber(tapeType.getPartnumber());
					model.setUserField5(tapeType.getUserf5()==null?"-":tapeType.getUserf5());
					model.setComponentType("防波套");
					model.setNoCavities(tapeType.getCavityqt().intValue());
					model.setDescription(tapeType.getDescription()==null?"-":tapeType.getDescription());
					model.setColourCode(colorMap.get(tapeType.getLibrarycolorId()));
					model.setMaterialCode(((LibrarymaterialType)tapeType.getLibrarymaterialId()).getMaterialcode());
					model.setUserField1(tapeType.getUserf1()==null?"-":tapeType.getUserf1());
					model.setUserField2(tapeType.getUserf2()==null?"-":tapeType.getUserf2());
					model.setUserField3(tapeType.getUserf3()==null?"-":tapeType.getUserf3());
					model.setUserField4(tapeType.getUserf4()==null?"-":tapeType.getUserf4());
					model.setSupplierPartNumber(suType==null ||suType.getSupplierpartnumber()==null ?"-":suType.getSupplierpartnumber());
					model.setSupplierName(suType==null || suType.getSupplierorganisationId() == null?"-":supplierMap.get(((SupplierorganisationType)(suType.getSupplierorganisationId())).getSupplierorganisationId()));
					model.setGroupName(BaseGroupType.TAPE.value());
					model.setTypeCode(typeCodeMap.get(tapeType.getLibrarycomponenttypeId()));
					model.setStatus(tapeType.getPartstatus());
					map.put(tapeType.getPartnumber(), model);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return map;
	
	}
	
	/**
	 * 根据元器件集合信息获取元器件详情信息。
	 * @param partNumberList
	 * @return
	 */
	public static Map<String,ComponentInfoModel> getComponentInfoByXML(){
		Map<String,ComponentInfoModel> map = new HashMap<String, ComponentInfoModel>();
		try {
			service = new WObjectServiceImpl();
			colorMap = new HashMap<String, String>();
			supplierMap = new HashMap<String, String>();
			typeCodeMap = new HashMap<String, String>();
			connectorTypeList = new ArrayList<ConnectorType>();
			backshellTypeList = new ArrayList<BackshellType>();
			wireTypeList = new ArrayList<WireType>();
			multicoreTypeList = new ArrayList<MulticoreType>();
			deviceTypeList = new ArrayList<DeviceType>();
			spliceTypeList = new ArrayList<SpliceType>();
			tubeTypeList = new ArrayList<TubeType>();
			tapeTypeList = new ArrayList<TapeType>();
//			ExportPartsUsedInLibrary test = new ExportPartsUsedInLibrary();
//			partNumbers = test.getPartNumbers();
			docBase = service.exportPartObjectByXML(new PropertieUtil().getPropertieUtil().getValue(Constants.LIBRARYPATH));
			if(docBase != null){
				System.out.println(docBase);
				List<Object> objects = docBase.getLibrarycolorOrLibrarymaterialOrLibrarycomponenttype();
				for(Object o : objects){
					if(o instanceof LibrarycolorType){
						LibrarycolorType colorType = (LibrarycolorType) o;
						colorMap.put(colorType.getLibrarycolorId(), colorType.getColorcode());
					}
					if(o instanceof SupplierorganisationType){
						SupplierorganisationType supplierType = (SupplierorganisationType) o;
						supplierMap.put(supplierType.getSupplierorganisationId(), supplierType.getName());
					}
					if(o instanceof LibrarycomponenttypeType){
						LibrarycomponenttypeType typeCodeModel = (LibrarycomponenttypeType) o;
						typeCodeMap.put(typeCodeModel.getLibrarycomponenttypeId(), typeCodeModel.getTypecode());
					}
					//Backshell
					if(o instanceof BackshellType){
						backshellTypeList.add((BackshellType) o);
					}
					//Wire
					if(o instanceof WireType){
						wireTypeList.add((WireType) o);
					}
					//Multicore Wire
					if(o instanceof MulticoreType){
						multicoreTypeList.add((MulticoreType) o);
					}
					//Connector
					if(o instanceof ConnectorType){
						connectorTypeList.add((ConnectorType) o);
					}
					//Device
					if(o instanceof DeviceType){
						deviceTypeList.add((DeviceType) o);
					}
					//Splice
					if(o instanceof SpliceType){
						spliceTypeList.add((SpliceType) o);
					}
					//Tube
					if(o instanceof TubeType){
						tubeTypeList.add((TubeType) o);
					}
					//Tape
					if(o instanceof TapeType){
						tapeTypeList.add((TapeType) o);
					}
				}
				
				for(ConnectorType ct:connectorTypeList){
//					System.out.println("Part number: "+ ct.getPartnumber());
//					System.out.println("User Field5: "+ ct.getUserf5());
//					System.out.println("器件类型: "+ "连接器");
//					System.out.println("No.Cavities: "+ ct.getLibraryconnectordetailsOrLibrarysinglewirefitscavityOrLibrarymultiplewirecavities().size());
//					System.out.println("Desciption: "+ ct.getDescription());
//					System.out.println("Colour Code :: "+ colorMap.get(ct.getLibrarycolorId()));
//					System.out.println("Material Code: "+ ((LibrarymaterialType)ct.getLibrarymaterialId()).getMaterialcode());
//					System.out.println("User Field1: "+ ct.getUserf1());
//					System.out.println("User Field2: "+ ct.getUserf2());
//					System.out.println("User Field3: "+ ct.getUserf3());
//					System.out.println("User Field4: "+ ct.getUserf4());
//					System.out.println("Supplier Part Number: "+ suType.getSupplierpartnumber());
//					System.out.println("Supplier Name : "+ supplierMap.get(((SupplierorganisationType)(suType.getSupplierorganisationId())).getSupplierorganisationId()));//需要用supplierMap的value来替换
//					System.out.println("Group Name: "+ BaseGroupType.CONNECTOR.value());
//					System.out.println("Type Code: "+ typeCodeMap.get(ct.getLibrarycomponenttypeId()));
//					System.out.println("Status: "+ ct.getPartstatus());
					List<Object> objList = ct.getLibrarygraphicOrCustomerpartnumberOrSupplierpartnumber();
					SupplierpartnumberType suType = null;
					for(Object o1 :objList){
						if(o1 instanceof SupplierpartnumberType){
							suType = (SupplierpartnumberType) o1;
						}
					}
					ComponentInfoModel model = new ComponentInfoModel();
					model.setPartNumber(ct.getPartnumber());
					model.setUserField5(ct.getUserf5()==null?"-":ct.getUserf5());
					model.setComponentType("连接器");
//					ct.getCavityqt();
					model.setNoCavities(ct.getCavityqt().intValue());
//					model.setNoCavities(ct.getLibraryconnectordetailsOrLibrarysinglewirefitscavityOrLibrarymultiplewirecavities().size());
					model.setDescription(ct.getDescription()==null?"-":ct.getDescription());
					model.setColourCode(colorMap.get(ct.getLibrarycolorId()));
					model.setMaterialCode(((LibrarymaterialType)ct.getLibrarymaterialId()).getMaterialcode());
					model.setUserField1(ct.getUserf1()==null?"-":ct.getUserf1());
					model.setUserField2(ct.getUserf2()==null?"-":ct.getUserf2());
					model.setUserField3(ct.getUserf3()==null?"-":ct.getUserf3());
					model.setUserField4(ct.getUserf4()==null?"-":ct.getUserf4());
					model.setSupplierPartNumber(suType==null ||suType.getSupplierpartnumber()==null ?"-":suType.getSupplierpartnumber());
					model.setSupplierName(suType==null || suType.getSupplierorganisationId() == null?"-":supplierMap.get(((SupplierorganisationType)(suType.getSupplierorganisationId())).getSupplierorganisationId()));
					model.setGroupName(BaseGroupType.CONNECTOR.value());
					model.setTypeCode(typeCodeMap.get(ct.getLibrarycomponenttypeId()));
					model.setStatus(ct.getPartstatus());
					map.put(ct.getPartnumber(), model);
				}
				for(BackshellType bst:backshellTypeList){
					List<Object> objList = bst.getLibrarygraphicOrCustomerpartnumberOrSupplierpartnumber();
					SupplierpartnumberType suType = null;
					for(Object o1 :objList){
						if(o1 instanceof SupplierpartnumberType){
							suType = (SupplierpartnumberType) o1;
						}
					}
					ComponentInfoModel model = new ComponentInfoModel();
					model.setPartNumber(bst.getPartnumber());
					model.setUserField5(bst.getUserf5()==null?"-":bst.getUserf5());
					model.setComponentType("尾罩");
					model.setNoCavities(bst.getCavityqt().intValue());
					model.setDescription(bst.getDescription()==null?"-":bst.getDescription());
					model.setColourCode(colorMap.get(bst.getLibrarycolorId()));
					model.setMaterialCode(((LibrarymaterialType)bst.getLibrarymaterialId()).getMaterialcode());
					model.setUserField1(bst.getUserf1()==null?"-":bst.getUserf1());
					model.setUserField2(bst.getUserf2()==null?"-":bst.getUserf2());
					model.setUserField3(bst.getUserf3()==null?"-":bst.getUserf3());
					model.setUserField4(bst.getUserf4()==null?"-":bst.getUserf4());
					model.setSupplierPartNumber(suType==null ||suType.getSupplierpartnumber()==null ?"-":suType.getSupplierpartnumber());
					model.setSupplierName(suType==null || suType.getSupplierorganisationId() == null?"-":supplierMap.get(((SupplierorganisationType)(suType.getSupplierorganisationId())).getSupplierorganisationId()));
					model.setGroupName(BaseGroupType.BACKSHELL.value());
					model.setTypeCode(typeCodeMap.get(bst.getLibrarycomponenttypeId()));
					model.setStatus(bst.getPartstatus());
					map.put(bst.getPartnumber(), model);
				}
				for(WireType wt:wireTypeList){
					List<Object> objList = wt.getLibrarygraphicOrCustomerpartnumberOrSupplierpartnumber();
					SupplierpartnumberType suType = null;
					for(Object o1 :objList){
						if(o1 instanceof SupplierpartnumberType){
							suType = (SupplierpartnumberType) o1;
						}
					}
					ComponentInfoModel model = new ComponentInfoModel();
					model.setPartNumber(wt.getPartnumber());
					model.setUserField5(wt.getUserf5()==null?"-":wt.getUserf5());
					model.setComponentType("导线");
					model.setNoCavities(wt.getCavityqt().intValue());
					model.setDescription(wt.getDescription()==null?"-":wt.getDescription());
					model.setColourCode(colorMap.get(wt.getLibrarycolorId()));
					model.setMaterialCode(((LibrarymaterialType)wt.getLibrarymaterialId()).getMaterialcode());
					model.setUserField1(wt.getUserf1()==null?"-":wt.getUserf1());
					model.setUserField2(wt.getUserf2()==null?"-":wt.getUserf2());
					model.setUserField3(wt.getUserf3()==null?"-":wt.getUserf3());
					model.setUserField4(wt.getUserf4()==null?"-":wt.getUserf4());
					model.setSupplierPartNumber(suType==null ||suType.getSupplierpartnumber()==null ?"-":suType.getSupplierpartnumber());
					model.setSupplierName(suType==null || suType.getSupplierorganisationId() == null?"-":supplierMap.get(((SupplierorganisationType)(suType.getSupplierorganisationId())).getSupplierorganisationId()));
					model.setGroupName(BaseGroupType.WIRE.value());
					model.setTypeCode(typeCodeMap.get(wt.getLibrarycomponenttypeId()));
					model.setStatus(wt.getPartstatus());
					map.put(wt.getPartnumber(), model);
				}
				for(MulticoreType mct:multicoreTypeList){
					List<Object> objList = mct.getLibrarygraphicOrCustomerpartnumberOrSupplierpartnumber();
					SupplierpartnumberType suType = null;
					for(Object o1 :objList){
						if(o1 instanceof SupplierpartnumberType){
							suType = (SupplierpartnumberType) o1;
						}
					}
					ComponentInfoModel model = new ComponentInfoModel();
					model.setPartNumber(mct.getPartnumber());
					model.setUserField5(mct.getUserf5()==null?"-":mct.getUserf5());
					model.setComponentType("多芯线");
					model.setNoCavities(mct.getCavityqt().intValue());
					model.setDescription(mct.getDescription()==null?"-":mct.getDescription());
					model.setColourCode(colorMap.get(mct.getLibrarycolorId()));
					model.setMaterialCode(((LibrarymaterialType)mct.getLibrarymaterialId()).getMaterialcode());
					model.setUserField1(mct.getUserf1()==null?"-":mct.getUserf1());
					model.setUserField2(mct.getUserf2()==null?"-":mct.getUserf2());
					model.setUserField3(mct.getUserf3()==null?"-":mct.getUserf3());
					model.setUserField4(mct.getUserf4()==null?"-":mct.getUserf4());
					model.setSupplierPartNumber(suType==null ||suType.getSupplierpartnumber()==null ?"-":suType.getSupplierpartnumber());
					model.setSupplierName(suType==null || suType.getSupplierorganisationId() == null?"-":supplierMap.get(((SupplierorganisationType)(suType.getSupplierorganisationId())).getSupplierorganisationId()));
					model.setGroupName(BaseGroupType.MULTICORE_WIRE.value());
					model.setTypeCode(typeCodeMap.get(mct.getLibrarycomponenttypeId()));
					model.setStatus(mct.getPartstatus());
					map.put(mct.getPartnumber(), model);
				}
				for(DeviceType dt:deviceTypeList){
					List<Object> objList = dt.getLibrarygraphicOrCustomerpartnumberOrSupplierpartnumber();
					SupplierpartnumberType suType = null;
					for(Object o1 :objList){
						if(o1 instanceof SupplierpartnumberType){
							suType = (SupplierpartnumberType) o1;
						}
					}
					ComponentInfoModel model = new ComponentInfoModel();
					model.setPartNumber(dt.getPartnumber());
					model.setUserField5(dt.getUserf5()==null?"-":dt.getUserf5());
					model.setComponentType("设备");
					model.setNoCavities(dt.getCavityqt().intValue());
					model.setDescription(dt.getDescription()==null?"-":dt.getDescription());
					model.setColourCode(colorMap.get(dt.getLibrarycolorId()));
					model.setMaterialCode(((LibrarymaterialType)dt.getLibrarymaterialId()).getMaterialcode());
					model.setUserField1(dt.getUserf1()==null?"-":dt.getUserf1());
					model.setUserField2(dt.getUserf2()==null?"-":dt.getUserf2());
					model.setUserField3(dt.getUserf3()==null?"-":dt.getUserf3());
					model.setUserField4(dt.getUserf4()==null?"-":dt.getUserf4());
					model.setSupplierPartNumber(suType==null ||suType.getSupplierpartnumber()==null ?"-":suType.getSupplierpartnumber());
					model.setSupplierName(suType==null || suType.getSupplierorganisationId() == null?"-":supplierMap.get(((SupplierorganisationType)(suType.getSupplierorganisationId())).getSupplierorganisationId()));
					model.setGroupName(BaseGroupType.DEVICE.value());
					model.setTypeCode(typeCodeMap.get(dt.getLibrarycomponenttypeId()));
					model.setStatus(dt.getPartstatus());
					map.put(dt.getPartnumber(), model);
				}
				for(SpliceType st:spliceTypeList){
					List<Object> objList = st.getLibrarygraphicOrCustomerpartnumberOrSupplierpartnumber();
					SupplierpartnumberType suType = null;
					for(Object o1 :objList){
						if(o1 instanceof SupplierpartnumberType){
							suType = (SupplierpartnumberType) o1;
						}
					}
					ComponentInfoModel model = new ComponentInfoModel();
					model.setPartNumber(st.getPartnumber());
					model.setUserField5(st.getUserf5()==null?"-":st.getUserf5());
					model.setComponentType("压接端子（Splice）");
					model.setNoCavities(st.getCavityqt().intValue());
					model.setDescription(st.getDescription()==null?"-":st.getDescription());
					model.setColourCode(colorMap.get(st.getLibrarycolorId()));
					model.setMaterialCode(((LibrarymaterialType)st.getLibrarymaterialId()).getMaterialcode());
					model.setUserField1(st.getUserf1()==null?"-":st.getUserf1());
					model.setUserField2(st.getUserf2()==null?"-":st.getUserf2());
					model.setUserField3(st.getUserf3()==null?"-":st.getUserf3());
					model.setUserField4(st.getUserf4()==null?"-":st.getUserf4());
					model.setSupplierPartNumber(suType==null ||suType.getSupplierpartnumber()==null ?"-":suType.getSupplierpartnumber());
					model.setSupplierName(suType==null || suType.getSupplierorganisationId() == null?"-":supplierMap.get(((SupplierorganisationType)(suType.getSupplierorganisationId())).getSupplierorganisationId()));
					model.setGroupName(BaseGroupType.SPLICE.value());
					model.setTypeCode(typeCodeMap.get(st.getLibrarycomponenttypeId()));
					model.setStatus(st.getPartstatus());
					map.put(st.getPartnumber(), model);
				}
				for(TubeType tubeType:tubeTypeList){
					List<Object> objList = tubeType.getLibrarygraphicOrCustomerpartnumberOrSupplierpartnumber();
					SupplierpartnumberType suType = null;
					for(Object o1 :objList){
						if(o1 instanceof SupplierpartnumberType){
							suType = (SupplierpartnumberType) o1;
						}
					}
					ComponentInfoModel model = new ComponentInfoModel();
					model.setPartNumber(tubeType.getPartnumber());
					model.setUserField5(tubeType.getUserf5()==null?"-":tubeType.getUserf5());
					model.setComponentType("成缆");
					model.setNoCavities(tubeType.getCavityqt().intValue());
					model.setDescription(tubeType.getDescription()==null?"-":tubeType.getDescription());
					model.setColourCode(colorMap.get(tubeType.getLibrarycolorId()));
					model.setMaterialCode(((LibrarymaterialType)tubeType.getLibrarymaterialId()).getMaterialcode());
					model.setUserField1(tubeType.getUserf1()==null?"-":tubeType.getUserf1());
					model.setUserField2(tubeType.getUserf2()==null?"-":tubeType.getUserf2());
					model.setUserField3(tubeType.getUserf3()==null?"-":tubeType.getUserf3());
					model.setUserField4(tubeType.getUserf4()==null?"-":tubeType.getUserf4());
					model.setSupplierPartNumber(suType==null ||suType.getSupplierpartnumber()==null ?"-":suType.getSupplierpartnumber());
					model.setSupplierName(suType==null || suType.getSupplierorganisationId() == null?"-":supplierMap.get(((SupplierorganisationType)(suType.getSupplierorganisationId())).getSupplierorganisationId()));
					model.setGroupName(BaseGroupType.TUBE.value());
					model.setTypeCode(typeCodeMap.get(tubeType.getLibrarycomponenttypeId()));
					model.setStatus(tubeType.getPartstatus());
					map.put(tubeType.getPartnumber(), model);
				}
				for(TapeType tapeType:tapeTypeList){
					List<Object> objList = tapeType.getLibrarygraphicOrCustomerpartnumberOrSupplierpartnumber();
					SupplierpartnumberType suType = null;
					for(Object o1 :objList){
						if(o1 instanceof SupplierpartnumberType){
							suType = (SupplierpartnumberType) o1;
						}
					}
					ComponentInfoModel model = new ComponentInfoModel();
					model.setPartNumber(tapeType.getPartnumber());
					model.setUserField5(tapeType.getUserf5()==null?"-":tapeType.getUserf5());
					model.setComponentType("防波套");
					model.setNoCavities(tapeType.getCavityqt().intValue());
					model.setDescription(tapeType.getDescription()==null?"-":tapeType.getDescription());
					model.setColourCode(colorMap.get(tapeType.getLibrarycolorId()));
					model.setMaterialCode(((LibrarymaterialType)tapeType.getLibrarymaterialId()).getMaterialcode());
					model.setUserField1(tapeType.getUserf1()==null?"-":tapeType.getUserf1());
					model.setUserField2(tapeType.getUserf2()==null?"-":tapeType.getUserf2());
					model.setUserField3(tapeType.getUserf3()==null?"-":tapeType.getUserf3());
					model.setUserField4(tapeType.getUserf4()==null?"-":tapeType.getUserf4());
					model.setSupplierPartNumber(suType==null ||suType.getSupplierpartnumber()==null ?"-":suType.getSupplierpartnumber());
					model.setSupplierName(suType==null || suType.getSupplierorganisationId() == null?"-":supplierMap.get(((SupplierorganisationType)(suType.getSupplierorganisationId())).getSupplierorganisationId()));
					model.setGroupName(BaseGroupType.TAPE.value());
					model.setTypeCode(typeCodeMap.get(tapeType.getLibrarycomponenttypeId()));
					model.setStatus(tapeType.getPartstatus());
					map.put(tapeType.getPartnumber(), model);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return map;
		
	}

	public static Map<String, ComponentInfoModel2> getComponentInfoByPartNumber2() {
		Map<String,ComponentInfoModel2> map = new HashMap<String, ComponentInfoModel2>();
		try {
			service = new WObjectServiceImpl();
			colorMap = new HashMap<String, String>();
			supplierMap = new HashMap<String, String>();
			typeCodeMap = new HashMap<String, String>();
			connectorTypeList = new ArrayList<ConnectorType>();
			backshellTypeList = new ArrayList<BackshellType>();
			wireTypeList = new ArrayList<WireType>();
			multicoreTypeList = new ArrayList<MulticoreType>();
			deviceTypeList = new ArrayList<DeviceType>();
			spliceTypeList = new ArrayList<SpliceType>();
			tubeTypeList = new ArrayList<TubeType>();
			tapeTypeList = new ArrayList<TapeType>();
			docBase = service.exportPartObjectByXML(new PropertieUtil().getPropertieUtil().getValue(Constants.LIBRARYPATH));
//			docBase = service.exportPartObject(allPartNumberList);
			if(docBase != null){
				System.out.println(docBase);
				List<Object> objects = docBase.getLibrarycolorOrLibrarymaterialOrLibrarycomponenttype();
				for(Object o : objects){
					if(o instanceof LibrarycolorType){
						LibrarycolorType colorType = (LibrarycolorType) o;
						colorMap.put(colorType.getLibrarycolorId(), colorType.getColorcode());
					}
					if(o instanceof SupplierorganisationType){
						SupplierorganisationType supplierType = (SupplierorganisationType) o;
						supplierMap.put(supplierType.getSupplierorganisationId(), supplierType.getName());
					}
					if(o instanceof LibrarycomponenttypeType){
						LibrarycomponenttypeType typeCodeModel = (LibrarycomponenttypeType) o;
						typeCodeMap.put(typeCodeModel.getLibrarycomponenttypeId(), typeCodeModel.getTypecode());
					}
					//Backshell
					if(o instanceof BackshellType){
						backshellTypeList.add((BackshellType) o);
					}
					//Wire
					if(o instanceof WireType){
						wireTypeList.add((WireType) o);
					}
					//Multicore Wire
					if(o instanceof MulticoreType){
						multicoreTypeList.add((MulticoreType) o);
					}
					//Connector
					if(o instanceof ConnectorType){
						connectorTypeList.add((ConnectorType) o);
					}
					//Device
					if(o instanceof DeviceType){
						deviceTypeList.add((DeviceType) o);
					}
					//Splice
					if(o instanceof SpliceType){
						spliceTypeList.add((SpliceType) o);
					}
					//Tube
					if(o instanceof TubeType){
						tubeTypeList.add((TubeType) o);
					}
					//Tape
					if(o instanceof TapeType){
						tapeTypeList.add((TapeType) o);
					}
				}
				
				for(ConnectorType ct:connectorTypeList){
//					System.out.println("Part number: "+ ct.getPartnumber());
//					System.out.println("User Field5: "+ ct.getUserf5());
//					System.out.println("器件类型: "+ "连接器");
//					System.out.println("No.Cavities: "+ ct.getLibraryconnectordetailsOrLibrarysinglewirefitscavityOrLibrarymultiplewirecavities().size());
//					System.out.println("Desciption: "+ ct.getDescription());
//					System.out.println("Colour Code :: "+ colorMap.get(ct.getLibrarycolorId()));
//					System.out.println("Material Code: "+ ((LibrarymaterialType)ct.getLibrarymaterialId()).getMaterialcode());
//					System.out.println("User Field1: "+ ct.getUserf1());
//					System.out.println("User Field2: "+ ct.getUserf2());
//					System.out.println("User Field3: "+ ct.getUserf3());
//					System.out.println("User Field4: "+ ct.getUserf4());
//					System.out.println("Supplier Part Number: "+ suType.getSupplierpartnumber());
//					System.out.println("Supplier Name : "+ supplierMap.get(((SupplierorganisationType)(suType.getSupplierorganisationId())).getSupplierorganisationId()));//需要用supplierMap的value来替换
//					System.out.println("Group Name: "+ BaseGroupType.CONNECTOR.value());
//					System.out.println("Type Code: "+ typeCodeMap.get(ct.getLibrarycomponenttypeId()));
//					System.out.println("Status: "+ ct.getPartstatus());
					List<Object> objList = ct.getLibrarygraphicOrCustomerpartnumberOrSupplierpartnumber();
					SupplierpartnumberType suType = null;
					for(Object o1 :objList){
						if(o1 instanceof SupplierpartnumberType){
							suType = (SupplierpartnumberType) o1;
						}
					}
					ComponentInfoModel2 model = new ComponentInfoModel2();
					model.setPartNumber(ct.getPartnumber());
					model.setUserField5(ct.getUserf5()==null?"-":ct.getUserf5());
					model.setComponentType("连接器");
//					ct.getCavityqt();
					model.setNoCavities(ct.getCavityqt().intValue());
//					model.setNoCavities(ct.getLibraryconnectordetailsOrLibrarysinglewirefitscavityOrLibrarymultiplewirecavities().size());
					model.setDescription(ct.getDescription()==null?"-":ct.getDescription());
					model.setColourCode(colorMap.get(ct.getLibrarycolorId()));
					model.setMaterialCode(((LibrarymaterialType)ct.getLibrarymaterialId()).getMaterialcode());
					model.setUserField1(ct.getUserf1()==null?"-":ct.getUserf1());
					model.setUserField2(ct.getUserf2()==null?"-":ct.getUserf2());
					model.setUserField3(ct.getUserf3()==null?"-":ct.getUserf3());
					model.setUserField4(ct.getUserf4()==null?"-":ct.getUserf4());
					model.setSupplierPartNumber(suType==null ||suType.getSupplierpartnumber()==null ?"-":suType.getSupplierpartnumber());
					model.setSupplierName(suType==null || suType.getSupplierorganisationId() == null?"-":supplierMap.get(((SupplierorganisationType)(suType.getSupplierorganisationId())).getSupplierorganisationId()));
					map.put(ct.getPartnumber(), model);
				}
				for(BackshellType bst:backshellTypeList){
					List<Object> objList = bst.getLibrarygraphicOrCustomerpartnumberOrSupplierpartnumber();
					SupplierpartnumberType suType = null;
					for(Object o1 :objList){
						if(o1 instanceof SupplierpartnumberType){
							suType = (SupplierpartnumberType) o1;
						}
					}
					ComponentInfoModel2 model = new ComponentInfoModel2();
					model.setPartNumber(bst.getPartnumber());
					model.setUserField5(bst.getUserf5()==null?"-":bst.getUserf5());
					model.setComponentType("尾罩");
					model.setNoCavities(bst.getCavityqt().intValue());
					model.setDescription(bst.getDescription()==null?"-":bst.getDescription());
					model.setColourCode(colorMap.get(bst.getLibrarycolorId()));
					model.setMaterialCode(((LibrarymaterialType)bst.getLibrarymaterialId()).getMaterialcode());
					model.setUserField1(bst.getUserf1()==null?"-":bst.getUserf1());
					model.setUserField2(bst.getUserf2()==null?"-":bst.getUserf2());
					model.setUserField3(bst.getUserf3()==null?"-":bst.getUserf3());
					model.setUserField4(bst.getUserf4()==null?"-":bst.getUserf4());
					model.setSupplierPartNumber(suType==null ||suType.getSupplierpartnumber()==null ?"-":suType.getSupplierpartnumber());
					model.setSupplierName(suType==null || suType.getSupplierorganisationId() == null?"-":supplierMap.get(((SupplierorganisationType)(suType.getSupplierorganisationId())).getSupplierorganisationId()));
					map.put(bst.getPartnumber(), model);
				}
				for(WireType wt:wireTypeList){
					List<Object> objList = wt.getLibrarygraphicOrCustomerpartnumberOrSupplierpartnumber();
					SupplierpartnumberType suType = null;
					for(Object o1 :objList){
						if(o1 instanceof SupplierpartnumberType){
							suType = (SupplierpartnumberType) o1;
						}
					}
					ComponentInfoModel2 model = new ComponentInfoModel2();
					model.setPartNumber(wt.getPartnumber());
					model.setUserField5(wt.getUserf5()==null?"-":wt.getUserf5());
					model.setComponentType("导线");
					model.setNoCavities(wt.getCavityqt().intValue());
					model.setDescription(wt.getDescription()==null?"-":wt.getDescription());
					model.setColourCode(colorMap.get(wt.getLibrarycolorId()));
					model.setMaterialCode(((LibrarymaterialType)wt.getLibrarymaterialId()).getMaterialcode());
					model.setUserField1(wt.getUserf1()==null?"-":wt.getUserf1());
					model.setUserField2(wt.getUserf2()==null?"-":wt.getUserf2());
					model.setUserField3(wt.getUserf3()==null?"-":wt.getUserf3());
					model.setUserField4(wt.getUserf4()==null?"-":wt.getUserf4());
					model.setSupplierPartNumber(suType==null ||suType.getSupplierpartnumber()==null ?"-":suType.getSupplierpartnumber());
					model.setSupplierName(suType==null || suType.getSupplierorganisationId() == null?"-":supplierMap.get(((SupplierorganisationType)(suType.getSupplierorganisationId())).getSupplierorganisationId()));
					map.put(wt.getPartnumber(), model);
				}
				for(MulticoreType mct:multicoreTypeList){
					List<Object> objList = mct.getLibrarygraphicOrCustomerpartnumberOrSupplierpartnumber();
					SupplierpartnumberType suType = null;
					for(Object o1 :objList){
						if(o1 instanceof SupplierpartnumberType){
							suType = (SupplierpartnumberType) o1;
						}
					}
					ComponentInfoModel2 model = new ComponentInfoModel2();
					model.setPartNumber(mct.getPartnumber());
					model.setUserField5(mct.getUserf5()==null?"-":mct.getUserf5());
					model.setComponentType("多芯线");
					model.setNoCavities(mct.getCavityqt().intValue());
					model.setDescription(mct.getDescription()==null?"-":mct.getDescription());
					model.setColourCode(colorMap.get(mct.getLibrarycolorId()));
					model.setMaterialCode(((LibrarymaterialType)mct.getLibrarymaterialId()).getMaterialcode());
					model.setUserField1(mct.getUserf1()==null?"-":mct.getUserf1());
					model.setUserField2(mct.getUserf2()==null?"-":mct.getUserf2());
					model.setUserField3(mct.getUserf3()==null?"-":mct.getUserf3());
					model.setUserField4(mct.getUserf4()==null?"-":mct.getUserf4());
					model.setSupplierPartNumber(suType==null ||suType.getSupplierpartnumber()==null ?"-":suType.getSupplierpartnumber());
					model.setSupplierName(suType==null || suType.getSupplierorganisationId() == null?"-":supplierMap.get(((SupplierorganisationType)(suType.getSupplierorganisationId())).getSupplierorganisationId()));
					map.put(mct.getPartnumber(), model);
				}
				for(DeviceType dt:deviceTypeList){
					List<Object> objList = dt.getLibrarygraphicOrCustomerpartnumberOrSupplierpartnumber();
					SupplierpartnumberType suType = null;
					for(Object o1 :objList){
						if(o1 instanceof SupplierpartnumberType){
							suType = (SupplierpartnumberType) o1;
						}
					}
					ComponentInfoModel2 model = new ComponentInfoModel2();
					model.setPartNumber(dt.getPartnumber());
					model.setUserField5(dt.getUserf5()==null?"-":dt.getUserf5());
					model.setComponentType("设备");
					model.setNoCavities(dt.getCavityqt().intValue());
					model.setDescription(dt.getDescription()==null?"-":dt.getDescription());
					model.setColourCode(colorMap.get(dt.getLibrarycolorId()));
					model.setMaterialCode(((LibrarymaterialType)dt.getLibrarymaterialId()).getMaterialcode());
					model.setUserField1(dt.getUserf1()==null?"-":dt.getUserf1());
					model.setUserField2(dt.getUserf2()==null?"-":dt.getUserf2());
					model.setUserField3(dt.getUserf3()==null?"-":dt.getUserf3());
					model.setUserField4(dt.getUserf4()==null?"-":dt.getUserf4());
					model.setSupplierPartNumber(suType==null ||suType.getSupplierpartnumber()==null ?"-":suType.getSupplierpartnumber());
					model.setSupplierName(suType==null || suType.getSupplierorganisationId() == null?"-":supplierMap.get(((SupplierorganisationType)(suType.getSupplierorganisationId())).getSupplierorganisationId()));
					map.put(dt.getPartnumber(), model);
				}
				for(SpliceType st:spliceTypeList){
					List<Object> objList = st.getLibrarygraphicOrCustomerpartnumberOrSupplierpartnumber();
					SupplierpartnumberType suType = null;
					for(Object o1 :objList){
						if(o1 instanceof SupplierpartnumberType){
							suType = (SupplierpartnumberType) o1;
						}
					}
					ComponentInfoModel2 model = new ComponentInfoModel2();
					model.setPartNumber(st.getPartnumber());
					model.setUserField5(st.getUserf5()==null?"-":st.getUserf5());
					model.setComponentType("压接端子（Splice）");
					model.setNoCavities(st.getCavityqt().intValue());
					model.setDescription(st.getDescription()==null?"-":st.getDescription());
					model.setColourCode(colorMap.get(st.getLibrarycolorId()));
					model.setMaterialCode(((LibrarymaterialType)st.getLibrarymaterialId()).getMaterialcode());
					model.setUserField1(st.getUserf1()==null?"-":st.getUserf1());
					model.setUserField2(st.getUserf2()==null?"-":st.getUserf2());
					model.setUserField3(st.getUserf3()==null?"-":st.getUserf3());
					model.setUserField4(st.getUserf4()==null?"-":st.getUserf4());
					model.setSupplierPartNumber(suType==null ||suType.getSupplierpartnumber()==null ?"-":suType.getSupplierpartnumber());
					model.setSupplierName(suType==null || suType.getSupplierorganisationId() == null?"-":supplierMap.get(((SupplierorganisationType)(suType.getSupplierorganisationId())).getSupplierorganisationId()));
					map.put(st.getPartnumber(), model);
				}
				for(TubeType tubeType:tubeTypeList){
					List<Object> objList = tubeType.getLibrarygraphicOrCustomerpartnumberOrSupplierpartnumber();
					SupplierpartnumberType suType = null;
					for(Object o1 :objList){
						if(o1 instanceof SupplierpartnumberType){
							suType = (SupplierpartnumberType) o1;
						}
					}
					ComponentInfoModel2 model = new ComponentInfoModel2();
					model.setPartNumber(tubeType.getPartnumber());
					model.setUserField5(tubeType.getUserf5()==null?"-":tubeType.getUserf5());
					model.setComponentType("成缆");
					model.setNoCavities(tubeType.getCavityqt().intValue());
					model.setDescription(tubeType.getDescription()==null?"-":tubeType.getDescription());
					model.setColourCode(colorMap.get(tubeType.getLibrarycolorId()));
					model.setMaterialCode(((LibrarymaterialType)tubeType.getLibrarymaterialId()).getMaterialcode());
					model.setUserField1(tubeType.getUserf1()==null?"-":tubeType.getUserf1());
					model.setUserField2(tubeType.getUserf2()==null?"-":tubeType.getUserf2());
					model.setUserField3(tubeType.getUserf3()==null?"-":tubeType.getUserf3());
					model.setUserField4(tubeType.getUserf4()==null?"-":tubeType.getUserf4());
					model.setSupplierPartNumber(suType==null ||suType.getSupplierpartnumber()==null ?"-":suType.getSupplierpartnumber());
					model.setSupplierName(suType==null || suType.getSupplierorganisationId() == null?"-":supplierMap.get(((SupplierorganisationType)(suType.getSupplierorganisationId())).getSupplierorganisationId()));
					map.put(tubeType.getPartnumber(), model);
				}
				for(TapeType tapeType:tapeTypeList){
					List<Object> objList = tapeType.getLibrarygraphicOrCustomerpartnumberOrSupplierpartnumber();
					SupplierpartnumberType suType = null;
					for(Object o1 :objList){
						if(o1 instanceof SupplierpartnumberType){
							suType = (SupplierpartnumberType) o1;
						}
					}
					ComponentInfoModel2 model = new ComponentInfoModel2();
					model.setPartNumber(tapeType.getPartnumber());
					model.setUserField5(tapeType.getUserf5()==null?"-":tapeType.getUserf5());
					model.setComponentType("防波套");
					model.setNoCavities(tapeType.getCavityqt().intValue());
					model.setDescription(tapeType.getDescription()==null?"-":tapeType.getDescription());
					model.setColourCode(colorMap.get(tapeType.getLibrarycolorId()));
					model.setMaterialCode(((LibrarymaterialType)tapeType.getLibrarymaterialId()).getMaterialcode());
					model.setUserField1(tapeType.getUserf1()==null?"-":tapeType.getUserf1());
					model.setUserField2(tapeType.getUserf2()==null?"-":tapeType.getUserf2());
					model.setUserField3(tapeType.getUserf3()==null?"-":tapeType.getUserf3());
					model.setUserField4(tapeType.getUserf4()==null?"-":tapeType.getUserf4());
					model.setSupplierPartNumber(suType==null ||suType.getSupplierpartnumber()==null ?"-":suType.getSupplierpartnumber());
					model.setSupplierName(suType==null || suType.getSupplierorganisationId() == null?"-":supplierMap.get(((SupplierorganisationType)(suType.getSupplierorganisationId())).getSupplierorganisationId()));
					map.put(tapeType.getPartnumber(), model);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return map;
		
	}
	
//	public DocumentBase exportPartObject(List<String> partNumbers) throws Exception {
//		String exportXml = getTempFileDir()+"export.xml";
//		String exportReplaceXml = getTempFileDir()+"export_replace.xml";
//		StringBuilder payloadBuilder = new StringBuilder("<Parts includescoping='false' exportrevisions='true' exportallcodes='true'>");
//		for(String partNumber:partNumbers){
//			payloadBuilder.append("<Part partnumber='"+partNumber+"'/>");
//		}
//		payloadBuilder.append("</Parts>");
//		libraryService.ExportLibraryPart(exportXml, payloadBuilder.toString());
//		JAXBUtils.contentReplace(exportXml, exportReplaceXml);
//		DocumentBase base = (DocumentBase) JAXBUtils.xml2Object(exportReplaceXml).getValue();
//		return base;
//	}
}
