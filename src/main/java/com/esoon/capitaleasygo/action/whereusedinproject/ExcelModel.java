package com.esoon.capitaleasygo.action.whereusedinproject;


public class ExcelModel {

	private ComponentInfoModel ciModel;
	private int allUsedCount;
	private String projectName;
	private int allUsedInOneProjectCount;
	private String designName;
	private int allUsedInOneDesignCount;

	public String[] toArray() {
		String[] str = new String[21];
		if(ciModel != null){
			str[0] = ciModel.getPartNumber();
			str[1] = ciModel.getUserField5();
			str[2] = ciModel.getComponentType();
			str[3] = String.valueOf(ciModel.getNoCavities());
			str[4] = ciModel.getDescription();
			str[5] = ciModel.getColourCode();
			str[6] = ciModel.getMaterialCode();
			str[7] = ciModel.getUserField1();
			str[8] = ciModel.getUserField2();
			str[9] = ciModel.getUserField3();
			str[10] = ciModel.getUserField4();
			str[11] = ciModel.getSupplierPartNumber();
			str[12] = ciModel.getSupplierName();
			str[13] = ciModel.getGroupName();
			str[14] = ciModel.getTypeCode();
			str[15] = ciModel.getStatus();
			str[16] = getAllUsedCount()==-1?"":String.valueOf(getAllUsedCount());
			str[17] = "-".equals(getProjectName())?"":getProjectName();
			str[18] = getAllUsedInOneProjectCount()==-1?"":String.valueOf(getAllUsedInOneProjectCount());
			str[19] = getDesignName();
			str[20] = String.valueOf(getAllUsedInOneDesignCount());
		}else{
			for (int i = 0; i < 16; i++) {
				str[i] = "";
			}
			str[16] = getAllUsedCount()==-1?"":String.valueOf(getAllUsedCount());
			str[17] = "-".equals(getProjectName())?"":getProjectName();
			str[18] = getAllUsedInOneProjectCount()==-1?"":String.valueOf(getAllUsedInOneProjectCount());
			str[19] = getDesignName();
			str[20] = String.valueOf(getAllUsedInOneDesignCount());
		}
		return str;
	}

	public ComponentInfoModel getCiModel() {
		return ciModel;
	}

	public void setCiModel(ComponentInfoModel ciModel) {
		this.ciModel = ciModel;
	}

	public int getAllUsedCount() {
		return allUsedCount;
	}

	public void setAllUsedCount(int allUsedCount) {
		this.allUsedCount = allUsedCount;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public int getAllUsedInOneProjectCount() {
		return allUsedInOneProjectCount;
	}

	public void setAllUsedInOneProjectCount(int allUsedInOneProjectCount) {
		this.allUsedInOneProjectCount = allUsedInOneProjectCount;
	}

	public String getDesignName() {
		return designName;
	}

	public void setDesignName(String designName) {
		this.designName = designName;
	}

	public int getAllUsedInOneDesignCount() {
		return allUsedInOneDesignCount;
	}

	public void setAllUsedInOneDesignCount(int allUsedInOneDesignCount) {
		this.allUsedInOneDesignCount = allUsedInOneDesignCount;
	}

}
