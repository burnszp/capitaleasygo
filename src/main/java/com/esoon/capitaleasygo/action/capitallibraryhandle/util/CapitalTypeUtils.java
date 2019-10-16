package com.esoon.capitaleasygo.action.capitallibraryhandle.util;

import java.util.UUID;

import com.acconsys.capital.lib.entity.ChsuserpropertyType;
import com.acconsys.capital.lib.entity.ChsuserpropertypartType;
import com.acconsys.capital.lib.entity.ChsuserpropertytypeType;
import com.acconsys.capital.lib.entity.LibrarycolorType;
import com.acconsys.capital.lib.entity.LibrarycomponenttypeType;
import com.acconsys.capital.lib.entity.LibrarymaterialType;
import com.acconsys.capital.lib.entity.LibrarywirespecType;
import com.acconsys.capital.lib.entity.SupplierorganisationType;
import com.acconsys.capital.lib.entity.SupplierpartnumberType;

public class CapitalTypeUtils {
	
	/**
	 * 创建Capital Library 库的TypeCode 
	 * @param description TypeCode的描述
	 * @param typeCode TypeCode的值
	 * @return
	 */
	public static LibrarycomponenttypeType createLibrarycomponenttypeType(String groupName ,String description,String typeCode ){
		LibrarycomponenttypeType componentType = new LibrarycomponenttypeType();
		componentType.setClipgromident(groupName);
		componentType.setDescription(description);
		componentType.setTypecode(typeCode); //typeCode不能超过4个字符。
		componentType.setLibrarycomponenttypeId("UIDfdee08-139e9016642-"+UUID.randomUUID().toString().replace("-", ""));
		return componentType;
	}
	/**
	 * 创建Capital Library 库 的MaterialCode 
	 * @param materialCode  对应Capital的 MaterialCode
	 * @param description 描述
	 * @return
	 */
	public static LibrarymaterialType createLibrarymaterialType(String materialCode,String description){
		LibrarymaterialType materialType = new LibrarymaterialType();
		materialType.setDescription(description);
		materialType.setMaterialcode(materialCode);
		materialType.setLibrarymaterialId("UIDfdee08-139e9016643-"+UUID.randomUUID().toString().replace("-", ""));
		return materialType;
	}
	/**
	 * 自定属性 
	 * @param propertyName 属性名称
	 * @param datatype 数据类型
	 */
	public static ChsuserpropertyType createChsuserpropertyType(String propertyName ,String datatype){
		ChsuserpropertyType type = new ChsuserpropertyType();
		type.setChsuserpropertyId("UIDfdee08-139e9016644-"+UUID.randomUUID().toString().replace("-", ""));
		type.setDatatype(datatype);
		type.setUserpropertyname(propertyName);
		type.setPropertystatus("0");
		type.setPinproperty("0");
		type.setPropdesc("test-Propdesc");//待定
		return type;
	}
	/**
	 * 设置自定义属性用于那种TypeCode。
	 * @param propertyType 自定属性 
	 * @param typeCodeId TypeCodeID
	 * @return
	 */
	public static ChsuserpropertytypeType createChsuserpropertytypeType(ChsuserpropertyType propertyType,String typeCodeId){
		ChsuserpropertytypeType propertytypeType = new ChsuserpropertytypeType();
		propertytypeType.setChsuserpropertyId(propertyType);
		propertytypeType.setChsuserpropertytypeId("UIDfdee08-139e9016645-"+UUID.randomUUID().toString().replace("-", ""));
		propertytypeType.setLibrarycomponenttypeId(typeCodeId);
		return propertytypeType;
	}
	/**
	 * 设置Capital library 中元器件的自定义属性
	 * @param chsuserpropertyType 自定属性
	 * @param chsuserpropertytypeType 自定类型对应的Type
	 * @param object Capital library 中元器件
	 * @param value 属性值
	 * @return
	 */
	public static ChsuserpropertypartType createChsuserpropertypartType(ChsuserpropertyType chsuserpropertyType,Object object,String value){
		ChsuserpropertypartType propertypartType =  new ChsuserpropertypartType();
		propertypartType.setChsuserpropertyId(chsuserpropertyType);
		propertypartType.setChsuserpropertypartId("UIDfdee07-139e9016645-"+UUID.randomUUID().toString().replace("-", ""));
		propertypartType.setLibraryobjectId(object);
		propertypartType.setUserpropertyvalue(value);
		return propertypartType;
	}
	/**
	 * 厂家
	 * @param supplierName 厂家名称
	 * @param address 地址
	 * @param postCode 邮编
	 * @param telephonenumber 电话
	 * @param faxNumber 传真
	 * @return
	 */
	public static SupplierorganisationType createSupplierorganisationType(String supplierName,String address,String postCode,String telephonenumber,String faxNumber){
		SupplierorganisationType supplierorganisationType = new SupplierorganisationType();
		supplierorganisationType.setName(supplierName);//厂家名称
		supplierorganisationType.setSupplierorganisationId("UIDfdee08-139e9016646-"+UUID.randomUUID().toString().replace("-", ""));
		supplierorganisationType.setAddress1(address);//地址
		supplierorganisationType.setPostcode(postCode);//
		supplierorganisationType.setTelephonenumber(telephonenumber);
		supplierorganisationType.setFaxnumber(faxNumber);
		return supplierorganisationType;
	}
	/**
	 * SupplierPartNumber
	 * @param object Capital library 中元器件
	 * @param specification 
	 * @param supplierorganisationType
	 * @param supplierpartnumber
	 * @return
	 */
	public static SupplierpartnumberType createSupplierpartnumberType(Object object,String specification,SupplierorganisationType supplierorganisationType,String supplierpartnumber){
		SupplierpartnumberType supplierpartnumberType = new SupplierpartnumberType();
		supplierpartnumberType.setLibraryobjectId(object);
		supplierpartnumberType.setPreferred("1");
		supplierpartnumberType.setSpecification(specification);
		supplierpartnumberType.setSupplierorganisationId(supplierorganisationType);
		supplierpartnumberType.setSupplierpartnumber(supplierpartnumber);
		supplierpartnumberType.setSupplierpartnumberId("UIDfdee08-139e9016647-"+UUID.randomUUID().toString().replace("-", ""));
		return supplierpartnumberType;
	}
	/**
	 * 颜色
	 * @param colorCode 颜色代码
	 * @param description 描述
	 * @return
	 */
	public static LibrarycolorType createLibrarycolorType(String colorCode ,String description ){
		LibrarycolorType colorType = new LibrarycolorType();
		colorType.setColorcode(colorCode);
		colorType.setDescription(description);
		colorType.setLibrarycolorId("UIDfdee08-139e9016648-"+UUID.randomUUID().toString().replace("-", ""));
		return colorType;
	}
	/**
	 * wireSpec
	 * @param wireSpec
	 * @param csa
	 * @param librarymaterialType
	 * @return
	 */
	public static LibrarywirespecType createLibrarywirespecType(String wireSpec,String csa,LibrarymaterialType librarymaterialType){
		LibrarywirespecType librarywirespecType = new LibrarywirespecType();
		librarywirespecType.setCsa(csa);
		librarywirespecType.setLibrarymaterialId(librarymaterialType);
		librarywirespecType.setMaterialcode(librarymaterialType.getMaterialcode());
		if(wireSpec == null || "".equals(wireSpec)){
			wireSpec = "线规值为空";
		}
		librarywirespecType.setWirespec(wireSpec);
		librarywirespecType.setWirusual("1");
		librarywirespecType.setLibrarywirespecId("UIDfdee08-139e9016648-"+UUID.randomUUID().toString().replace("-", ""));
		return librarywirespecType;
	}
}
