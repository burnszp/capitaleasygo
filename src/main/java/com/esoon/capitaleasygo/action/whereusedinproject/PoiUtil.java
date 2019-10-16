package com.esoon.capitaleasygo.action.whereusedinproject;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

import javax.swing.JOptionPane;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRichTextString;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

/**
 * 使用poi操作office软件
 * @author Administrator
 *
 */
public class PoiUtil {

	private static PoiUtil poiUtil;
	
	public static PoiUtil getPoiUtil(){
		if(poiUtil == null){
			poiUtil = new PoiUtil();
		}
		return poiUtil;
	}
	
	public void writeList2Excel(String title, String[] headers,List<ExcelModel> list,File outFile){
		OutputStream out = null;
		// 声明一个工作薄
		HSSFWorkbook workbook = new HSSFWorkbook();
		// 生成一个表格
		HSSFSheet sheet = workbook.createSheet(title);
		// 设置表格默认列宽度为15个字节
		sheet.setDefaultColumnWidth((short) 15);
		
		HSSFRow row = sheet.createRow(0);
		for (short i = 0; i < headers.length; i++) {
			HSSFCell cell = row.createCell(i);
			HSSFRichTextString text = new HSSFRichTextString(headers[i]);
			cell.setCellValue(text);
		}

		// 遍历集合数据，产生数据行
		System.out.println("list.size():"+list.size());
		if(list != null && list.size()>0){
			for(int i=0;i<list.size();i++){
//				System.out.println("第" +i + "行数据：===============");
				HSSFRow row1 = sheet.createRow(i+1);
				ExcelModel model = list.get(i);
				String[] data = model.toArray();
				for(int j=0;j<headers.length;j++){
					HSSFCell cell = row1.createCell((short) j);
					HSSFRichTextString text = new HSSFRichTextString(data[j]);
					cell.setCellValue(text);
				}
			}
		}
		try {
			out = new FileOutputStream(outFile);
			workbook.write(out);
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	
	}

	public void writeList2Excel2(String title, String[] headers,
			List<ComponentInfoModel2> list, File outFile) {
		OutputStream out = null;
		// 声明一个工作薄
		HSSFWorkbook workbook = new HSSFWorkbook();
		// 生成一个表格
		HSSFSheet sheet = workbook.createSheet(title);
		// 设置表格默认列宽度为15个字节
		sheet.setDefaultColumnWidth((short) 15);
		
		HSSFRow row = sheet.createRow(0);
		for (short i = 0; i < headers.length; i++) {
			HSSFCell cell = row.createCell(i);
			HSSFRichTextString text = new HSSFRichTextString(headers[i]);
			cell.setCellValue(text);
		}

		// 遍历集合数据，产生数据行
		System.out.println("list.size():"+list.size());
		if(list != null && list.size()>0){
			for(int i=0;i<list.size();i++){
//				System.out.println("第" +i + "行数据：===============");
				HSSFRow row1 = sheet.createRow(i+1);
				ComponentInfoModel2 model = list.get(i);
				String[] data = model.toArray();
				for(int j=0;j<headers.length;j++){
					HSSFCell cell = row1.createCell((short) j);
					HSSFRichTextString text = new HSSFRichTextString(data[j]);
					cell.setCellValue(text);
				}
			}
		}
		try {
			out = new FileOutputStream(outFile);
			workbook.write(out);
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				out.close();
				System.out.println("文件生成成功！");
				JOptionPane.showMessageDialog(null, "文件生成完成！");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	
	}
}
