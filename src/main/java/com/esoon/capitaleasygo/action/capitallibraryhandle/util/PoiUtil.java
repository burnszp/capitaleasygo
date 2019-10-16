package com.esoon.capitaleasygo.action.capitallibraryhandle.util;

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

import com.esoon.capitaleasygo.action.capitallibraryhandle.entity.BaseModel;
import com.esoon.capitaleasygo.action.capitallibraryhandle.entity.ComponentInfoModel;

/**
 * 使用poi操作office软件
 * 
 * @author Administrator
 * 
 */
public class PoiUtil {

	private static PoiUtil poiUtil;

	public static PoiUtil getPoiUtil() {
		if (poiUtil == null) {
			poiUtil = new PoiUtil();
		}
		return poiUtil;
	}

	public File writeList2Excel(String title, String[] headers,
			List<ComponentInfoModel> list, File outFile) {
		File returnFile = null;
		OutputStream out = null;
		// 声明一个工作薄
		HSSFWorkbook workbook = new HSSFWorkbook();
		// 生成一个表格
		HSSFSheet sheet = workbook.createSheet(title);
		// 设置表格默认列宽度为15个字节
		sheet.setDefaultColumnWidth(15);

		HSSFRow row = sheet.createRow(0);
		for (int i = 0; i < headers.length; i++) {
			HSSFCell cell = row.createCell(i);
			HSSFRichTextString text = new HSSFRichTextString(headers[i]);
			cell.setCellValue(text);
		}

		// 遍历集合数据，产生数据行
		System.out.println("list.size():" + list.size());
		if (list != null && list.size() > 0) {
			for (int i = 0; i < list.size(); i++) {
				// System.out.println("第" +i + "行数据：===============");
				HSSFRow row1 = sheet.createRow(i + 1);
				ComponentInfoModel model = list.get(i);
				String[] data = model.toArray();
				for (int j = 0; j < headers.length; j++) {
					HSSFCell cell = row1.createCell(j);
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
		} finally {
			try {
				out.close();
				returnFile = outFile;
				System.out.println("文件生成成功！");
				JOptionPane.showMessageDialog(null, "文件生成完成！");

			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return returnFile;
	}

	public void writeList2Excel2(String title, String[] headers,
			List<ComponentModel> list, File outFile) {
		OutputStream out = null;
		// 声明一个工作薄
		HSSFWorkbook workbook = new HSSFWorkbook();
		// 生成一个表格
		HSSFSheet sheet = workbook.createSheet(title);
		// 设置表格默认列宽度为15个字节
		sheet.setDefaultColumnWidth(15);

		HSSFRow row = sheet.createRow(0);
		for (int i = 0; i < headers.length; i++) {
			HSSFCell cell = row.createCell(i);
			HSSFRichTextString text = new HSSFRichTextString(headers[i]);
			cell.setCellValue(text);
		}

		// 遍历集合数据，产生数据行
		System.out.println("list.size():" + list.size());
		if (list != null && list.size() > 0) {
			for (int i = 0; i < list.size(); i++) {
				// System.out.println("第" +i + "行数据：===============");
				HSSFRow row1 = sheet.createRow(i + 1);
				ComponentModel model = list.get(i);
				String[] data = model.toArray();
				for (int j = 0; j < headers.length; j++) {
					HSSFCell cell = row1.createCell(j);
					HSSFRichTextString text = new HSSFRichTextString(data[j]);
					cell.setCellValue(text);
				}
			}
		}
		try {
			out = new FileOutputStream(outFile);
			workbook.write(out);
			JOptionPane.showMessageDialog(null, "文件生成成功！");
		} catch (Exception e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "文件生成失败，请查看日志信息！");
		} finally {
			try {
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
	
	public File writeList2Excel(
			String[] headers_zh, String[] headers_en,
			List<BaseModel> list, File outFile) {
		File returnFile = null;
		OutputStream out = null;
		// 声明一个工作薄
		HSSFWorkbook workbook = new HSSFWorkbook();
		// 生成一个表格
		HSSFSheet sheet = workbook.createSheet("总记录清单");
		// 设置表格默认列宽度为15个字节
		sheet.setDefaultColumnWidth(15);

		HSSFRow row0 = sheet.createRow(0);
		for (int i = 0; i < headers_zh.length; i++) {
			HSSFCell cell = row0.createCell(i);
			HSSFRichTextString text = new HSSFRichTextString(headers_zh[i]);
			cell.setCellValue(text);
		}
		HSSFRow row1 = sheet.createRow(1);
		for (int i = 0; i < headers_en.length; i++) {
			HSSFCell cell = row1.createCell(i);
			HSSFRichTextString text = new HSSFRichTextString(headers_en[i]);
			cell.setCellValue(text);
		}

		// 遍历集合数据，产生数据行
		System.out.println("list.size():" + list.size());
		if (list != null && list.size() > 0) {
			for (int i = 0; i < list.size(); i++) {
				// System.out.println("第" +i + "行数据：===============");
				HSSFRow row2 = sheet.createRow(i + 2);
				BaseModel model = list.get(i);
				String[] data = model.toArray();
				for (int j = 0; j < headers_zh.length; j++) {
					HSSFCell cell = row2.createCell(j);
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
		} finally {
			try {
				out.close();
				returnFile = outFile;
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return returnFile;
	}

	/**
	 * get postfix of the path
	 * 
	 * @param path
	 * @return
	 */
	public static String getPostfix(String path) {
		if (path == null || ConstantsUtil.EMPTY.equals(path.trim())) {
			return ConstantsUtil.EMPTY;
		}
		if (path.contains(ConstantsUtil.POINT)) {
			return path.substring(path.lastIndexOf(ConstantsUtil.POINT) + 1,
					path.length());
		}
		return ConstantsUtil.EMPTY;
	}
}
