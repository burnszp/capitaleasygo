package com.esoon.capitaleasygo.action.capitallibraryhandle.util;

import java.io.File;
import java.util.List;

import javax.swing.JOptionPane;
import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

import com.acconsys.capital.lib.entity.DocumentBase;

public class WObjectServiceImpl implements IObjectService {

	private ILibraryService libraryService;

	public WObjectServiceImpl() {
		this.libraryService = new ImplLibraryService();
	}

	@Override
	public void  importObject(DocumentBase base) throws Exception {
		// String importTempXml = getTempFileDir()+"importTemp.xml";
		// String importReplacedXml = getTempFileDir()+"importReplaced.xml";
		// String importXml = getTempFileDir() + "import1.xml";
		String importTempXml = getTempFileDir() +PropertieUtil.getPropertieUtil().getValue(
				ConstantsUtil.IMPORTTEMPXML_PATH);
		String importReplacedXml =getTempFileDir() + PropertieUtil.getPropertieUtil().getValue(
				ConstantsUtil.IMPORTREPLACEDXML_PATH);
		String importXml =getTempFileDir()+ PropertieUtil.getPropertieUtil().getValue(
				ConstantsUtil.IMPORTXML_PATH);
		JAXBElement<DocumentBase> je = new JAXBElement<DocumentBase>(new QName(
				"http://www.mentor.com/harness/Schema/LibrarySchema",
				"chssystem"), DocumentBase.class, base);
		JAXBUtils.object2Xml(je, importTempXml);
		JAXBUtils.contentReplace(importTempXml, importReplacedXml);
		JAXBUtils.createImportXml(importReplacedXml, importXml);
//		libraryService.importLibraryPart(importXml);
	}

	public static String getTempFileDir() {
		PropertieUtil propUtil = PropertieUtil.getPropertieUtil();
		String tempPath = propUtil.getValue(ConstantsUtil.FILE_SAVE_PATH);
		File tempDir = new File(tempPath);
		if (!tempDir.exists()) {
			try {
				tempDir.mkdirs();
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, tempDir+"路径创建失败，请手动创建！");
				e.printStackTrace();
			}
		}
		return tempPath;
	}

	@Override
	public DocumentBase exportPartObject(List<String> partNumbers)
			throws Exception {
		String exportXml = getTempFileDir() + "export.xml";
		String exportReplaceXml = getTempFileDir() + "export_replace.xml";
		StringBuilder payloadBuilder = new StringBuilder(
				"<Parts includescoping='false' exportrevisions='true' exportallcodes='true'>");
		for (String partNumber : partNumbers) {
			payloadBuilder.append("<Part partnumber='" + partNumber + "'/>");
		}
		payloadBuilder.append("</Parts>");
		libraryService.ExportLibraryPart(exportXml, payloadBuilder.toString());
		JAXBUtils.contentReplace(exportXml, exportReplaceXml);
		DocumentBase base = (DocumentBase) JAXBUtils.xml2Object(
				exportReplaceXml).getValue();
		return base;
	}

	@Override
	public DocumentBase exportPartObjectByXML(String filePath) {
		// DocumentBase base = (DocumentBase)
		// (JAXBUtils.xml2Object("D:/temp/W23-0_1.xml").getValue());
		DocumentBase base = (DocumentBase) (JAXBUtils.xml2Object(filePath)
				.getValue());
		return base;
	}

}
