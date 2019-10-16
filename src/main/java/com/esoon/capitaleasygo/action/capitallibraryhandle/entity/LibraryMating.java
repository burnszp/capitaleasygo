package com.esoon.capitaleasygo.action.capitallibraryhandle.entity;

public class LibraryMating {

	private String librarymating_id;
	private String matedconnector_id;// 配对的元器件UID
	private String libraryobject_id;// LibraryMating对象所属元器件UID

	public String getLibrarymating_id() {
		return librarymating_id;
	}

	public void setLibrarymating_id(String librarymating_id) {
		this.librarymating_id = librarymating_id;
	}

	public String getMatedconnector_id() {
		return matedconnector_id;
	}

	public void setMatedconnector_id(String matedconnector_id) {
		this.matedconnector_id = matedconnector_id;
	}

	public String getLibraryobject_id() {
		return libraryobject_id;
	}

	public void setLibraryobject_id(String libraryobject_id) {
		this.libraryobject_id = libraryobject_id;
	}
}
