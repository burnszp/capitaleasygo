package com.esoon.capitaleasygo.action.capitallibraryhandle.entity;

import java.util.ArrayList;
import java.util.List;


public class LibraryPartVo {
	private  String groupname ;
	private  String description;
	private  String typecode;
	private  String typedescription;
	private  String materialcode;
	private  String includeonbom;
	private  String status;
	private  String unitofmeasure;
	private  String domain;
	private  String weight;
	private  String specification;
	private  String userfiled1;
	private  String userfiled2;
	private  String userfiled3;
	private  String userfiled4;
	private  String userfiled5;
	private  String supplier;
	private  String supplierpartnumber;
	private  String mating;
	private  String cavityattributes;
	private  String nocavities;
	private  String addon;
	private  String knockoff;
	private  String wirespecification;
	private  String csa;
	private  String colorcode;
	private  String outsidediameterdefined;
	private  String outsidediametercalc;
	private  String colordescription; 
	private  String materialdescription ;
	private  String supplierspecification ;
	private List<Attribute> attributeList;
	public String getGroupname() {
		return groupname;
	}
	public void setGroupname(String groupname) {
		this.groupname = groupname;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getTypecode() {
		return typecode;
	}
	public void setTypecode(String typecode) {
		this.typecode = typecode;
	}
	public String getMaterialcode() {
		return materialcode;
	}
	public void setMaterialcode(String materialcode) {
		this.materialcode = materialcode;
	}
	public String getIncludeonbom() {
		return includeonbom;
	}
	public void setIncludeonbom(String includeonbom) {
		this.includeonbom = includeonbom;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getUnitofmeasure() {
		return unitofmeasure;
	}
	public void setUnitofmeasure(String unitofmeasure) {
		this.unitofmeasure = unitofmeasure;
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getSpecification() {
		return specification;
	}
	public void setSpecification(String specification) {
		this.specification = specification;
	}
	public String getUserfiled1() {
		return userfiled1;
	}
	public void setUserfiled1(String userfiled1) {
		this.userfiled1 = userfiled1;
	}
	public String getUserfiled2() {
		return userfiled2;
	}
	public void setUserfiled2(String userfiled2) {
		this.userfiled2 = userfiled2;
	}
	public String getUserfiled3() {
		return userfiled3;
	}
	public void setUserfiled3(String userfiled3) {
		this.userfiled3 = userfiled3;
	}
	public String getUserfiled4() {
		return userfiled4;
	}
	public void setUserfiled4(String userfiled4) {
		this.userfiled4 = userfiled4;
	}
	public String getUserfiled5() {
		return userfiled5;
	}
	public void setUserfiled5(String userfiled5) {
		this.userfiled5 = userfiled5;
	}
	public String getSupplier() {
		return supplier;
	}
	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}
	public String getSupplierpartnumber() {
		return supplierpartnumber;
	}
	public void setSupplierpartnumber(String supplierpartnumber) {
		this.supplierpartnumber = supplierpartnumber;
	}
	public String getMating() {
		return mating;
	}
	public void setMating(String mating) {
		this.mating = mating;
	}
	public String getCavityattributes() {
		return cavityattributes;
	}
	public void setCavityattributes(String cavityattributes) {
		this.cavityattributes = cavityattributes;
	}
	public String getNocavities() {
		return nocavities;
	}
	public void setNocavities(String nocavities) {
		this.nocavities = nocavities;
	}
	public String getAddon() {
		return addon;
	}
	public void setAddon(String addon) {
		this.addon = addon;
	}
	public String getKnockoff() {
		return knockoff;
	}
	public void setKnockoff(String knockoff) {
		this.knockoff = knockoff;
	}
	public String getWirespecification() {
		return wirespecification;
	}
	public void setWirespecification(String wirespecification) {
		this.wirespecification = wirespecification;
	}
	public String getCsa() {
		return csa;
	}
	public void setCsa(String csa) {
		this.csa = csa;
	}
	public String getColorcode() {
		return colorcode;
	}
	public void setColorcode(String colorcode) {
		this.colorcode = colorcode;
	}
	public String getOutsidediameterdefined() {
		return outsidediameterdefined;
	}
	public void setOutsidediameterdefined(String outsidediameterdefined) {
		this.outsidediameterdefined = outsidediameterdefined;
	}
	public String getOutsidediametercalc() {
		return outsidediametercalc;
	}
	public void setOutsidediametercalc(String outsidediametercalc) {
		this.outsidediametercalc = outsidediametercalc;
	}
	public String getColordescription() {
		return colordescription;
	}
	public void setColordescription(String colordescription) {
		this.colordescription = colordescription;
	}
	public String getMaterialdescription() {
		return materialdescription;
	}
	public void setMaterialdescription(String materialdescription) {
		this.materialdescription = materialdescription;
	}
	public String getTypedescription() {
		return typedescription;
	}
	public void setTypedescription(String typedescription) {
		this.typedescription = typedescription;
	}
	public String getSupplierspecification() {
		return supplierspecification;
	}
	public void setSupplierspecification(String supplierspecification) {
		this.supplierspecification = supplierspecification;
	}
	public List<Attribute> getAttributeList() {
		if(attributeList == null){
			attributeList = new ArrayList<Attribute>();
		}
		return attributeList;
	}
	public void setAttributeList(List<Attribute> attributeList) {
		this.attributeList = attributeList;
	}
	
}
