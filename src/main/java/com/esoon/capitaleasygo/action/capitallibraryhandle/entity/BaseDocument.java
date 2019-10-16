package com.esoon.capitaleasygo.action.capitallibraryhandle.entity;

import java.util.ArrayList;
import java.util.List;

public class BaseDocument {

	public List<BaseModel> connectorModelList;
	public List<BaseModel> backShellModelList;
	public List<BaseModel> otherModelList;
	public List<BaseModel> terminalModelList;
	private BaseData baseData;
	

	public BaseDocument() {
		connectorModelList = new ArrayList<BaseModel>();
		backShellModelList = new ArrayList<BaseModel>();
		otherModelList = new ArrayList<BaseModel>();
		terminalModelList = new ArrayList<BaseModel>();
		baseData = new BaseData();
	}

	public List<BaseModel> getConnectorModelList() {
		return connectorModelList;
	}

	public void setConnectorModelList(List<BaseModel> connectorModelList) {
		this.connectorModelList = connectorModelList;
	}

	public List<BaseModel> getBackShellModelList() {
		return backShellModelList;
	}

	public void setBackShellModelList(List<BaseModel> backShellModelList) {
		this.backShellModelList = backShellModelList;
	}

	public List<BaseModel> getOtherModelList() {
		return otherModelList;
	}

	public void setOtherModelList(List<BaseModel> otherModelList) {
		this.otherModelList = otherModelList;
	}

	public List<BaseModel> getTerminalModelList() {
		return terminalModelList;
	}

	public void setTerminalModelList(List<BaseModel> terminalModelList) {
		this.terminalModelList = terminalModelList;
	}

	public BaseData getBaseData() {
		return baseData;
	}

	public void setBaseData(BaseData baseData) {
		this.baseData = baseData;
	}

	public List<BaseModel> getAllModel() {
		List<BaseModel> allModelList = new ArrayList<BaseModel>();
		allModelList.addAll(connectorModelList);
		allModelList.addAll(backShellModelList);
		allModelList.addAll(otherModelList);
		allModelList.addAll(terminalModelList);
		return allModelList;
	}

}
