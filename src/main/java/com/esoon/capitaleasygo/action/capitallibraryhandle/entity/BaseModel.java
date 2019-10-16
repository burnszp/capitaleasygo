package com.esoon.capitaleasygo.action.capitallibraryhandle.entity;

import java.util.HashMap;
import java.util.Map;

public class BaseModel {

	private String libraryobject_id;
	private String librarycomponenttype_id;

	private String partNumber;
	private String description;// 描述
	// private String kth;// 壳体号(eg:20)这个只是建库用，实际在Capital
	// Library中不体现。所以没法从库中提取，所以就没法显示。
	private String typeCode;// 插头CONN/插座CONF(eg:CONN)
	private String symbolNameXPT;// 型谱图（eg:YMG-20-10-Z1)
	private String symbolNameCST;// 侧视图(eg：YMG-T-P）
	private String specification;// supplier也下的specification;
	private String maleOrFemale;// 针Pmale/孔Sfemale(eg:male/female)Cavity
								// Attribute:Name
	private String mating;// (eg:YMG20F7K1P40)

	private Map<String, String> cuppmMap;

	public String getPartNumber() {
		return partNumber;
	}

	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	public String[] toArray() {
		String[] temp = new String[12];
		int tempi = 0;

		temp[0] = partNumber;
		temp[1] = description;
		temp[2] = "";
		temp[3] = typeCode;
		temp[4] = symbolNameXPT;
		temp[5] = symbolNameCST;
		temp[6] = specification;
		temp[7] = maleOrFemale;
		temp[8] = mating;
		temp[9] = cuppmMap.get("Remark") == null ? "" : cuppmMap.get("Remark")
				.trim();
		temp[10] = cuppmMap.get("Reserve1") == null ? "" : cuppmMap.get(
				"Reserve1").trim();
		temp[11] = cuppmMap.get("Reserve2") == null ? "" : cuppmMap.get(
				"Reserve2").trim();

		String[] xlsHeaderEN = ParseTest.getHeaders_en();
		String[] data = new String[xlsHeaderEN.length];
		boolean isOrNotAppearPartNumber = false;
		for (int i = 0; i < xlsHeaderEN.length; i++) {
			String key = xlsHeaderEN[i];
			if("PART NUMBER".equals(key)){
				isOrNotAppearPartNumber = true;
			}
			if (!isOrNotAppearPartNumber) {
				data[i] = cuppmMap.get(key) == null ? "" : cuppmMap.get(key)
						.trim();
			} else {
				data[i] = temp[tempi];
				tempi++;
			}
		}
//		data[0] = cuppmMap.get("Preferred level of code") == null ? ""
//				: cuppmMap.get("Preferred level of code").trim();
//		data[1] = cuppmMap.get("Range of application") == null ? "" : cuppmMap
//				.get("Range of application").trim();
//		data[2] = cuppmMap.get("State of code") == null ? "" : cuppmMap.get(
//				"State of code").trim();
//		data[3] = cuppmMap.get("Type of code") == null ? "" : cuppmMap.get(
//				"Type of code").trim();
//		data[4] = cuppmMap.get("ClassificationNum") == null ? "" : cuppmMap
//				.get("ClassificationNum").trim();
//		data[5] = cuppmMap.get("SystematicName") == null ? "" : cuppmMap.get(
//				"SystematicName").trim();
//		data[6] = cuppmMap.get("DesignCode") == null ? "" : cuppmMap.get(
//				"DesignCode").trim();
//		data[7] = cuppmMap.get("Group Name") == null ? "" : cuppmMap.get(
//				"Group Name").trim();
//		data[8] = cuppmMap.get("ComponentName") == null ? "" : cuppmMap.get(
//				"ComponentName").trim();
//		data[9] = cuppmMap.get("ComponentRef") == null ? "" : cuppmMap.get(
//				"ComponentRef").trim();
//		data[10] = cuppmMap.get("Type") == null ? "" : cuppmMap.get("Type")
//				.trim();
//		data[11] = cuppmMap.get("SpecificationType") == null ? "" : cuppmMap
//				.get("SpecificationType").trim();
//		data[12] = cuppmMap.get("Supplier for short") == null ? "" : cuppmMap
//				.get("Supplier for short").trim();
//		data[13] = cuppmMap.get("Quality grade") == null ? "" : cuppmMap.get(
//				"Quality grade").trim();
//		data[14] = cuppmMap.get("GenericSpecification") == null ? "" : cuppmMap
//				.get("GenericSpecification").trim();
//		data[15] = cuppmMap.get("DetailSpecification") == null ? "" : cuppmMap
//				.get("DetailSpecification").trim();
//		data[16] = cuppmMap.get("PackageType") == null ? "" : cuppmMap.get(
//				"PackageType").trim();
//		data[17] = cuppmMap.get("Dimension") == null ? "" : cuppmMap.get(
//				"Dimension").trim();
//		data[18] = cuppmMap.get("SpecialCondition") == null ? "" : cuppmMap
//				.get("SpecialCondition").trim();
//		data[19] = cuppmMap.get("Supplemental agreement") == null ? ""
//				: cuppmMap.get("Supplemental agreement").trim();
//		data[20] = cuppmMap.get("Whether to import") == null ? "" : cuppmMap
//				.get("Whether to import").trim();
//		data[21] = cuppmMap.get("Unit of measure") == null ? "" : cuppmMap.get(
//				"Unit of measure").trim();
//		data[22] = cuppmMap.get("The catalogue") == null ? "" : cuppmMap.get(
//				"The catalogue").trim();
//		data[23] = cuppmMap.get("Data source") == null ? "" : cuppmMap.get(
//				"Data source").trim();
//		data[24] = partNumber;
//		data[25] = description;
//		data[26] = "";
//		data[27] = typeCode;
//		data[28] = symbolNameXPT;
//		data[29] = symbolNameCST;
//		data[30] = specification;
//		data[31] = maleOrFemale;
//		data[32] = mating;
//		data[33] = cuppmMap.get("Remark") == null ? "" : cuppmMap.get("Remark")
//				.trim();
//		data[34] = cuppmMap.get("Reserve1") == null ? "" : cuppmMap.get(
//				"Reserve1").trim();
//		data[35] = cuppmMap.get("Reserve2") == null ? "" : cuppmMap.get(
//				"Reserve2").trim();
		return data;

	}

	public Map<String, String> getCuppmMap() {
		if (cuppmMap == null) {
			cuppmMap = new HashMap<String, String>();
		}
		return cuppmMap;
	}

	public void setCuppmMap(Map<String, String> cuppmMap) {
		this.cuppmMap = cuppmMap;
	}

	public String getLibraryobject_id() {
		return libraryobject_id;
	}

	public void setLibraryobject_id(String libraryobject_id) {
		this.libraryobject_id = libraryobject_id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTypeCode() {
		return typeCode;
	}

	public void setTypeCode(String typeCode) {
		this.typeCode = typeCode;
	}

	public String getSymbolNameXPT() {
		return symbolNameXPT;
	}

	public void setSymbolNameXPT(String symbolNameXPT) {
		this.symbolNameXPT = symbolNameXPT;
	}

	public String getSymbolNameCST() {
		return symbolNameCST;
	}

	public void setSymbolNameCST(String symbolNameCST) {
		this.symbolNameCST = symbolNameCST;
	}

	public String getSpecification() {
		return specification;
	}

	public void setSpecification(String specification) {
		this.specification = specification;
	}

	public String getMaleOrFemale() {
		return maleOrFemale;
	}

	public void setMaleOrFemale(String maleOrFemale) {
		this.maleOrFemale = maleOrFemale;
	}

	public String getMating() {
		return mating;
	}

	public void setMating(String mating) {
		this.mating = mating;
	}

	public String getLibrarycomponenttype_id() {
		return librarycomponenttype_id;
	}

	public void setLibrarycomponenttype_id(String librarycomponenttype_id) {
		this.librarycomponenttype_id = librarycomponenttype_id;
	}
}
