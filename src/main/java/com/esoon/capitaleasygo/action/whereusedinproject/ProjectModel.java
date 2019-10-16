package com.esoon.capitaleasygo.action.whereusedinproject;

import java.util.Map;

public class ProjectModel {

	private Map<String, Integer> designMap;// String保存designName+version,value保存元器件使用的个数。
	private int usedInAllDesignCount;
	private boolean isWrited = false;// 表示此元器件的在某个项目中使用的次数是否已经被写入到Excel中。初始值为没有。当写入过时就设置为false;

	public int getUsedInAllDesignCount() {
		return usedInAllDesignCount;
	}

	public void setUsedInAllDesignCount(int usedInAllDesignCount) {
		this.usedInAllDesignCount = usedInAllDesignCount;
	}

	public Map<String, Integer> getDesignMap() {
		return designMap;
	}

	public void setDesignMap(Map<String, Integer> designMap) {
		this.designMap = designMap;
	}

	public boolean isWrited() {
		return isWrited;
	}

	public void setWrited(boolean isWrited) {
		this.isWrited = isWrited;
	}

}
