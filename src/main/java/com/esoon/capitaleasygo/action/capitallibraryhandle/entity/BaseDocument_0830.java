package com.esoon.capitaleasygo.action.capitallibraryhandle.entity;

import java.util.ArrayList;
import java.util.List;

public class BaseDocument_0830 {

	public List<BaseModel> baseModelList;
	private BaseData baseData;

	public BaseDocument_0830() {
		baseModelList = new ArrayList<BaseModel>();
		baseData = new BaseData();
	}

	public List<BaseModel> getBaseModelList() {
		return baseModelList;
	}

	public void setBaseModelList(List<BaseModel> baseModelList) {
		this.baseModelList = baseModelList;
	}

	public BaseData getBaseData() {
		return baseData;
	}

	public void setBaseData(BaseData baseData) {
		this.baseData = baseData;
	}

}
