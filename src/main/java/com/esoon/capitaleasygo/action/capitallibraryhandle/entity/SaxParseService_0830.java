package com.esoon.capitaleasygo.action.capitallibraryhandle.entity;

import java.io.InputStream;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import com.esoon.capitaleasygo.action.capitallibraryhandle.util.Constants;

public class SaxParseService_0830 extends DefaultHandler {
	BaseDocument_0830 baseDocument = null;
	private String preTag = null;// 作用是记录解析时的上一个节点名称
	private BaseModel baseModel;
//	private BackShellModel backshellModel;
//	private OtherModel otherModel;
//	private TerminalModel terminalModel;
	private String currentType;
	private ChsUserPropertyType chsUserPropertyType;
	private ChsUserProperty chsUserProperty;
	private LibraryComponentType libraryComponentType;
	private LibraryGraphic libraryGraphic;
	private SupplierPartnumber supplierPartnumber;
	private LibraryCavity libraryCavity;
	private LibraryMating libraryMating;

	public BaseDocument_0830 getBaseDocument(InputStream xmlStream) throws Exception {
		SAXParserFactory factory = SAXParserFactory.newInstance();
		SAXParser parser = factory.newSAXParser();
		SaxParseService_0830 handler = new SaxParseService_0830();
		parser.parse(xmlStream, handler);
		return handler.getBaseDocument();
	}

	private BaseDocument_0830 getBaseDocument() {
		return baseDocument;
	}

	@Override
	public void startDocument() throws SAXException {
		baseDocument = new BaseDocument_0830();
	}

	@Override
	public void startElement(String uri, String localName, String qName,
			Attributes attributes) throws SAXException {
		if (qName.endsWith("part")&&attributes.getValue("partnumber")!=null) {
			baseModel = new BaseModel();
			baseModel.setPartNumber(attributes.getValue("partnumber"));
			baseModel.setLibraryobject_id(attributes
					.getValue("libraryobject_id"));
			baseModel.setDescription(attributes.getValue("description"));
			baseModel.setLibrarycomponenttype_id(attributes
					.getValue("librarycomponenttype_id"));

		} else if (Constants.CHSUSERPROPERTYPART.equals(qName)) {
			ChsUserPropertyPart cuppm = new ChsUserPropertyPart();
			cuppm.setChsuserpropertypart_id(attributes
					.getValue("chsuserpropertypart_id"));
			cuppm.setLibraryobject_id(attributes.getValue("libraryobject_id"));
			cuppm.setChsuserproperty_id(attributes
					.getValue("chsuserproperty_id"));
			cuppm.setUserpropertyvalue(attributes.getValue("userpropertyvalue"));
			baseDocument.getBaseData().getChsUserPropertyPartList().add(cuppm);
		} else if (Constants.CHSUSERPROPERTY.equals(qName)) {
			chsUserProperty = new ChsUserProperty();
			chsUserProperty.setChsuserproperty_id(attributes
					.getValue("chsuserproperty_id"));
			chsUserProperty.setPropdesc(attributes.getValue("propdesc"));
			chsUserProperty.setUserpropertyname(attributes
					.getValue("userpropertyname"));
			baseDocument.getBaseData().getChsUserPropertyList()
					.add(chsUserProperty);
		} else if (Constants.CHSUSERPROPERTYTYPE.equals(qName)) {
			chsUserPropertyType = new ChsUserPropertyType();
			chsUserPropertyType.setChsuserpropertytype_id(attributes
					.getValue("chsuserpropertytype_id"));
			chsUserPropertyType.setLibrarycomponenttype_id(attributes
					.getValue("librarycomponenttype_id"));
			chsUserPropertyType.setChsuserproperty_id(attributes
					.getValue("chsuserproperty_id"));
			baseDocument.getBaseData().getChsUserPropertyTypeList()
					.add(chsUserPropertyType);
		} else if (Constants.LIBRARYCOMPONENTTYPE.equals(qName)) {
			libraryComponentType = new LibraryComponentType();
			libraryComponentType.setLibrarycomponenttype_id(attributes
					.getValue("librarycomponenttype_id"));
			libraryComponentType.setDescription(attributes
					.getValue("description"));
			libraryComponentType.setClipgromident(attributes
					.getValue("clipgromident"));
			libraryComponentType.setTypecode(attributes.getValue("typecode"));
			baseDocument.getBaseData().getLibraryComponentTypeList()
					.add(libraryComponentType);
		} else if (Constants.LIBRARYGRAPHIC.equals(qName)) {
			libraryGraphic = new LibraryGraphic();
			libraryGraphic.setLibrarygraphic_id(attributes
					.getValue("librarygraphic_id"));
			libraryGraphic.setSymbol_id(attributes.getValue("symbol_id"));
			libraryGraphic.setLibraryobject_id(attributes
					.getValue("libraryobject_id"));
			baseDocument.getBaseData().getLibraryGraphicList()
					.add(libraryGraphic);
		} else if (Constants.SUPPLIERPARTNUMBER.equals(qName)) {
			supplierPartnumber = new SupplierPartnumber();
			supplierPartnumber.setSupplierpartnumber_id(attributes
					.getValue("supplierpartnumber_id"));
			supplierPartnumber.setLibraryobject_id(attributes
					.getValue("libraryobject_id"));
			supplierPartnumber.setSpecification(attributes
					.getValue("specification"));
			baseDocument.getBaseData().getSupplierPartnumberList()
					.add(supplierPartnumber);
		} else if (Constants.LIBRARYCAVITY.equals(qName)) {
			libraryCavity = new LibraryCavity();
			libraryCavity.setLibrarycavity_id(attributes
					.getValue("librarycavity_id"));
			libraryCavity.setPingraphic(attributes.getValue("pingraphic"));
			libraryCavity.setCavityname(attributes.getValue("cavityname"));
			libraryCavity.setLibrarypincontainer_id(attributes
					.getValue("librarypincontainer_id"));
			baseDocument.getBaseData().getLibraryCavityList()
					.add(libraryCavity);
		} else if (Constants.LIBRARYMATING.equals(qName)) {
			libraryMating = new LibraryMating();
			libraryMating.setLibrarymating_id(attributes
					.getValue("librarymating_id"));
			libraryMating.setMatedconnector_id(attributes
					.getValue("matedconnector_id"));
			libraryMating.setLibraryobject_id(attributes.getValue("libraryobject_id"));
			baseDocument.getBaseData().getLibraryMatingList()
					.add(libraryMating);
		}
		preTag = qName;// 将正在解析的节点名称赋给preTag
	}

	@Override
	public void endElement(String uri, String localName, String qName)
			throws SAXException {
		if (qName.endsWith("part")) {
			if(baseModel != null){
				baseDocument.getBaseModelList().add(baseModel);
				baseModel = null;
			}
		}
		preTag = null;
		/**
		 * 当解析结束时置为空。这里很重要，例如，当图中画3的位置结束后，会调用这个方法
		 * ，如果这里不把preTag置为null，根据startElement(....)方法，preTag的值还是book，当文档顺序读到图
		 * 中标记4的位置时，会执行characters(char[] ch, int start, int
		 * length)这个方法，而characters(....)方
		 * 法判断preTag!=null，会执行if判断的代码，这样就会把空值赋值给book，这不是我们想要的。
		 */
	}

	@Override
	public void characters(char[] ch, int start, int length)
			throws SAXException {
		// if (preTag != null) {
		// String content = new String(ch, start, length);
		// if (Constants.CHSUSERPROPERTYPART.equals(preTag)) {
		// if (connectorModel != null) {
		// ChsUserPropertyPartModel cuppm = new ChsUserPropertyPartModel();
		// connectorModel.getCuppmList().add(cuppm);
		// }else if(backshellModel !=null){
		// ChsUserPropertyPartModel cuppm = new ChsUserPropertyPartModel();
		// backshellModel.getCuppmList().add(cuppm);
		// }else if(otherModel !=null){
		// ChsUserPropertyPartModel cuppm = new ChsUserPropertyPartModel();
		// otherModel.getCuppmList().add(cuppm);
		// }else if(terminalModel !=null){
		// ChsUserPropertyPartModel cuppm = new ChsUserPropertyPartModel();
		// terminalModel.getCuppmList().add(cuppm);
		// }
		// }
		// }
	}

}