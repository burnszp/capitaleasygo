package com.esoon.capitaleasygo.action.capitallibraryhandle.util;

import java.io.Serializable;
import java.util.List;

import com.acconsys.capital.lib.entity.DocumentBase;

public interface IObjectService extends Serializable{
	public void importObject(DocumentBase base) throws Exception;
	
	public DocumentBase exportPartObject(List<String> partNumbers) throws Exception;
	
	public DocumentBase exportPartObjectByXML(String filePath);
}
