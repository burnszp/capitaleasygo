package com.esoon.capitaleasygo.action.capitallibraryhandle.util;

import java.util.List;

public class ListUtil {

	public static String getStringFromStringList(List<String> sList){
		StringBuilder sb =null;
		if(sList !=null && sList.size()!=0&&sList.get(0)!=null){
			sb = new StringBuilder(sList.get(0).trim());
			if(sList.size()>1){
				for (int i = 1; i < sList.size(); i++) {
					sb.append("|"+sList.get(i).trim());
				}
			}
		}
		return sb.toString();
	}
	
	public static boolean isNotEmpty(List list){
		if(list !=null && list.size()>0){
			return true;
		}else{
			return false;
		}
	}
}
