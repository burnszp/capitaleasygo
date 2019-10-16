package com.esoon.capitaleasygo.action.capitallibraryhandle.entity;

import java.util.ArrayList;
import java.util.List;

import com.esoon.capitaleasygo.action.capitallibraryhandle.entity.ChsUserPropertyType;

public class BaseData {

	private List<ChsUserProperty> chsUserPropertyList;

	private List<ChsUserPropertyType> chsUserPropertyTypeList;

	private List<ChsUserPropertyPart> chsUserPropertyPartList;
	private List<LibraryComponentType> libraryComponentTypeList;

	private List<LibraryGraphic> libraryGraphicList;
	private List<SupplierPartnumber> supplierPartnumberList;
	private List<LibraryCavity> libraryCavityList;
	private List<LibraryMating> libraryMatingList;

	public BaseData() {
		chsUserPropertyList = new ArrayList<ChsUserProperty>();
		chsUserPropertyTypeList = new ArrayList<ChsUserPropertyType>();
		chsUserPropertyPartList = new ArrayList<ChsUserPropertyPart>();
		libraryComponentTypeList = new ArrayList<LibraryComponentType>();
		libraryGraphicList = new ArrayList<LibraryGraphic>();
		supplierPartnumberList = new ArrayList<SupplierPartnumber>();
		libraryCavityList = new ArrayList<LibraryCavity>();
		libraryMatingList = new ArrayList<LibraryMating>();
	}

	public List<ChsUserPropertyType> getChsUserPropertyTypeList() {
		return chsUserPropertyTypeList;
	}

	public void setChsUserPropertyTypeList(
			List<ChsUserPropertyType> chsUserPropertyTypeList) {
		this.chsUserPropertyTypeList = chsUserPropertyTypeList;
	}

	public List<ChsUserProperty> getChsUserPropertyList() {
		return chsUserPropertyList;
	}

	public void setChsUserPropertyList(List<ChsUserProperty> chsUserPropertyList) {
		this.chsUserPropertyList = chsUserPropertyList;
	}

	public List<ChsUserPropertyPart> getChsUserPropertyPartList() {
		return chsUserPropertyPartList;
	}

	public void setChsUserPropertyPartList(
			List<ChsUserPropertyPart> chsUserPropertyPartList) {
		this.chsUserPropertyPartList = chsUserPropertyPartList;
	}

	public List<LibraryComponentType> getLibraryComponentTypeList() {
		return libraryComponentTypeList;
	}

	public void setLibraryComponentTypeList(
			List<LibraryComponentType> libraryComponentTypeList) {
		this.libraryComponentTypeList = libraryComponentTypeList;
	}

	public List<LibraryGraphic> getLibraryGraphicList() {
		return libraryGraphicList;
	}

	public void setLibraryGraphicList(List<LibraryGraphic> libraryGraphicList) {
		this.libraryGraphicList = libraryGraphicList;
	}

	public List<SupplierPartnumber> getSupplierPartnumberList() {
		return supplierPartnumberList;
	}

	public void setSupplierPartnumberList(
			List<SupplierPartnumber> supplierPartnumberList) {
		this.supplierPartnumberList = supplierPartnumberList;
	}

	public List<LibraryCavity> getLibraryCavityList() {
		return libraryCavityList;
	}

	public void setLibraryCavityList(List<LibraryCavity> libraryCavityList) {
		this.libraryCavityList = libraryCavityList;
	}

	public List<LibraryMating> getLibraryMatingList() {
		return libraryMatingList;
	}

	public void setLibraryMatingList(List<LibraryMating> libraryMatingList) {
		this.libraryMatingList = libraryMatingList;
	}
}
