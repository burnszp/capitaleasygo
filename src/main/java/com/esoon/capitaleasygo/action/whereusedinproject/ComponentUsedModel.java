package com.esoon.capitaleasygo.action.whereusedinproject;

import java.util.Map;

/**
 * 元器件使用情况，在project,design的使用情况。 结构如图：map(partNumber,ProjectModelMap<int 总次数
 * 
 * @author Administrator
 * 
 */
public class ComponentUsedModel {
	private Map<String, ProjectModel> projectMap;// String表示project的名字
	private int usedInAllProjectCount;// 在一个设计中的使用次数。
	private boolean isWrited = false;// 表示此元器件的总使用次数是否已经被写入到Excel中。初始值为没有。当写入过时就设置为false;
	private ComponentInfoModel cInfoModel;//

	public int getUsedInAllProjectCount() {
		return usedInAllProjectCount;
	}

	public void setUsedInAllProjectCount(int usedInAllProjectCount) {
		this.usedInAllProjectCount = usedInAllProjectCount;
	}

	public Map<String, ProjectModel> getProjectMap() {
		return projectMap;
	}

	public void setProjectMap(Map<String, ProjectModel> projectMap) {
		this.projectMap = projectMap;
	}

	public boolean isWrited() {
		return isWrited;
	}

	public void setWrited(boolean isWrited) {
		this.isWrited = isWrited;
	}

	public ComponentInfoModel getcInfoModel() {
		return cInfoModel;
	}

	public void setcInfoModel(ComponentInfoModel cInfoModel) {
		this.cInfoModel = cInfoModel;
	}

}
