package com.esoon.capitaleasygo.action.capitallibraryhandle.entity;

import java.io.InputStream;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import com.esoon.capitaleasygo.action.capitallibraryhandle.util.Constants;

public class SaxParseService extends DefaultHandler {
	BaseDocument baseDocument = null;
	private String preTag = null;// 作用是记录解析时的上一个节点名称
	private ConnectorModel connectorModel;
	private BackShellModel backshellModel;
	private OtherModel otherModel;
	private TerminalModel terminalModel;
	private String currentType;
	private ChsUserPropertyType chsUserPropertyType;
	private ChsUserProperty chsUserProperty;
	private LibraryComponentType libraryComponentType;
	private LibraryGraphic libraryGraphic;
	private SupplierPartnumber supplierPartnumber;
	private LibraryCavity libraryCavity;
	private LibraryMating libraryMating;

	public BaseDocument getBaseDocument(InputStream xmlStream) throws Exception {
		SAXParserFactory factory = SAXParserFactory.newInstance();
		SAXParser parser = factory.newSAXParser();
		SaxParseService handler = new SaxParseService();
		parser.parse(xmlStream, handler);
		return handler.getBaseDocument();
	}

	private BaseDocument getBaseDocument() {
		return baseDocument;
	}

	@Override
	public void startDocument() throws SAXException {
		baseDocument = new BaseDocument();
	}

	@Override
	public void startElement(String uri, String localName, String qName,
			Attributes attributes) throws SAXException {
		if (Constants.CONNECTORPART.equals(qName)) {
			connectorModel = new ConnectorModel();
			connectorModel.setPartNumber(attributes.getValue("partnumber"));
			connectorModel.setLibraryobject_id(attributes
					.getValue("libraryobject_id"));
			connectorModel.setDescription(attributes.getValue("description"));
			connectorModel.setLibrarycomponenttype_id(attributes
					.getValue("librarycomponenttype_id"));

		} else if (Constants.BACKSHELLPART.equals(qName)) {
			backshellModel = new BackShellModel();
			backshellModel.setPartNumber(attributes.getValue("partnumber"));
			backshellModel.setLibraryobject_id(attributes
					.getValue("libraryobject_id"));
			backshellModel.setDescription(attributes.getValue("description"));
			backshellModel.setLibrarycomponenttype_id(attributes
					.getValue("librarycomponenttype_id"));

		} else if (Constants.OTHERPART.equals(qName)) {
			otherModel = new OtherModel();
			otherModel.setPartNumber(attributes.getValue("partnumber"));
			otherModel.setLibraryobject_id(attributes
					.getValue("libraryobject_id"));
			otherModel.setDescription(attributes.getValue("description"));
			otherModel.setLibrarycomponenttype_id(attributes
					.getValue("librarycomponenttype_id"));

		} else if (Constants.TERMINALPART.equals(qName)) {
			terminalModel = new TerminalModel();
			terminalModel.setPartNumber(attributes.getValue("partnumber"));
			terminalModel.setLibraryobject_id(attributes
					.getValue("libraryobject_id"));
			terminalModel.setDescription(attributes.getValue("description"));
			terminalModel.setLibrarycomponenttype_id(attributes
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
		if (Constants.CONNECTORPART.equals(qName)) {
			baseDocument.getConnectorModelList().add(connectorModel);
			currentType = Constants.CONNECTOR;
			// connectorModel = null;
		} else if (Constants.BACKSHELLPART.equals(qName)) {
			baseDocument.getBackShellModelList().add(backshellModel);
			currentType = Constants.BACKSHELLPART;
			// backshellModel = null;
		} else if (Constants.OTHERPART.equals(qName)) {
			baseDocument.getOtherModelList().add(otherModel);
			currentType = Constants.OTHERPART;
			// backshellModel = null;
		} else if (Constants.TERMINALPART.equals(qName)) {
			baseDocument.getTerminalModelList().add(terminalModel);
			currentType = Constants.TERMINALPART;
			// backshellModel = null;
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