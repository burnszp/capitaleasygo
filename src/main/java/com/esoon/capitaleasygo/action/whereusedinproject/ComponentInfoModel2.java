package com.esoon.capitaleasygo.action.whereusedinproject;

public class ComponentInfoModel2 {
	private String partNumber;// 器件型号
	private String userField5;// 器件名称
	private String componentType;// 器件类型
	private int noCavities;// 管脚数
	private String description;// 器件描述
	private String colourCode;// 颜色
	private String materialCode;// 材料
	private String userField1;// 院物资编码
	private String userField2;// 所物资编码
	private String userField3;// 集团物资编码
	private String userField4;// 质量等级
	private String supplierPartNumber;// 详细规范
	private String supplierName;// 生产厂家

	public String getPartNumber() {
		return partNumber;
	}

	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	public String getUserField5() {
		return userField5;
	}

	public void setUserField5(String userField5) {
		this.userField5 = userField5;
	}

	public String getComponentType() {
		return componentType;
	}

	public void setComponentType(String componentType) {
		this.componentType = componentType;
	}

	public int getNoCavities() {
		return noCavities;
	}

	public void setNoCavities(int noCavities) {
		this.noCavities = noCavities;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getColourCode() {
		return colourCode;
	}

	public void setColourCode(String colourCode) {
		this.colourCode = colourCode;
	}

	public String getMaterialCode() {
		return materialCode;
	}

	public void setMaterialCode(String materialCode) {
		this.materialCode = materialCode;
	}

	public String getUserField1() {
		return userField1;
	}

	public void setUserField1(String userField1) {
		this.userField1 = userField1;
	}

	public String getUserField2() {
		return userField2;
	}

	public void setUserField2(String userField2) {
		this.userField2 = userField2;
	}

	public String getUserField3() {
		return userField3;
	}

	public void setUserField3(String userField3) {
		this.userField3 = userField3;
	}

	public String getUserField4() {
		return userField4;
	}

	public void setUserField4(String userField4) {
		this.userField4 = userField4;
	}

	public String getSupplierPartNumber() {
		return supplierPartNumber;
	}

	public void setSupplierPartNumber(String supplierPartNumber) {
		this.supplierPartNumber = supplierPartNumber;
	}

	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	public String[] toArray() {
		String[] str = new String[13];
		str[0] = getPartNumber();
		str[1] = getUserField5();
		str[2] = getComponentType();
		str[3] = String.valueOf(getNoCavities());
		str[4] = getDescription();
		str[5] = getColourCode();
		str[6] = getMaterialCode();
		str[7] = getUserField1();
		str[8] = getUserField2();
		str[9] = getUserField3();
		str[10] = getUserField4();
		str[11] = getSupplierPartNumber();
		str[12] = getSupplierName();
		return str;
	}
}
