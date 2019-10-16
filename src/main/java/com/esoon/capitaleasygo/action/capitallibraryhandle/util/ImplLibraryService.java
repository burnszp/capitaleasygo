/*******************************************************************************
 * @project: 501Capital_libaray
 * @package: com.acconsys.capital.lib.service.impl
 * @file: ImplLibraryService.java
 * @author: huangzuoyu 
 * @created: 2014-11-13
 * @purpose:
 * 
 * @version: 1.0
 * 
 * Revision History at the end of file.
 * 
 * Copyright 2014 AcconSys All rights reserved.
 ******************************************************************************/

package com.esoon.capitaleasygo.action.capitallibraryhandle.util;

public class ImplLibraryService implements ILibraryService {

	@Override
	public void ExportLibraryPart(String xmlFile, String parts) throws Exception {
		// TODO Auto-generated method stub
		ExportLibraryPartsClient client = new ExportLibraryPartsClient(xmlFile,
				parts);
		client.invoke();
	}

	@Override
	public void importLibraryPart(String xmlFile) throws Exception {
		// TODO Auto-generated method stub
		ImportLibraryPartsClient client = new ImportLibraryPartsClient(xmlFile);
		client.invoke();
	}

}

/*******************************************************************************
 * <B>Revision History</B><BR>
 * [type 'revision' and press Alt + / to insert revision block]<BR>
 * 
 * 
 * 
 * Copyright 2014 AcconSys All rights reserved.
 ******************************************************************************/
