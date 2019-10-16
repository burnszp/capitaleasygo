package com.esoon.capitaleasygo.action.capitallibraryhandle.util;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GetExcelDataUtil {

	private static int propertyCount = PropertieUtil
			.getExcelHeaders_ZH_Property().length;
	private static Workbook wb = null;
	private static List<String[]> componentModelList;

	public static List<String[]> getComponentArrs(String mergedExcelFilePath) {
		// 获得工作薄对象
		getWorkBook(mergedExcelFilePath);
		// 如果是xls格式
		if (wb instanceof HSSFWorkbook) {
			try {
				componentModelList = getComponentListFromXls(mergedExcelFilePath);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if (wb instanceof XSSFWorkbook) {
			try {
				componentModelList = getComponentListFromXlsx(mergedExcelFilePath);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			JOptionPane.showMessageDialog(null,
					"选择的excel的后缀既不是xls也不是xlsx，请重新选择");
			return null;
		}
		for (String[] arrString : componentModelList) {
			for (int i = 0; i < propertyCount; i++) {
				System.out.print(arrString[i] + "  ");
			}
			System.out.println();
		}
		return componentModelList;

	}

	private static List<String[]> getComponentListFromXlsx(
			String mergedExcelFilePath) throws Exception {
		InputStream is = new FileInputStream(mergedExcelFilePath);
		XSSFWorkbook xssfWorkbook = new XSSFWorkbook(is);
		ComponentModel componentModel = null;
		List<String[]> list = new ArrayList<String[]>();
		// 循环工作表Sheet
		for (int numSheet = 0; numSheet < xssfWorkbook.getNumberOfSheets(); numSheet++) {
			XSSFSheet xssfSheet = xssfWorkbook.getSheetAt(numSheet);
			if (xssfSheet == null) {
				continue;
			}
			// 循环行Row
			for (int rowNum = 1; rowNum <= xssfSheet.getLastRowNum(); rowNum++) {
				XSSFRow xssfRow = xssfSheet.getRow(rowNum);
				if (xssfRow != null) {
					String[] componentValue = new String[propertyCount];
					for (int i = 0; i < propertyCount; i++) {
						System.out.println("rowNum:columnNum" + rowNum + ":"
								+ i);
						XSSFCell cell = xssfRow.getCell(i);
						if (cell != null) {
							xssfRow.getCell(i).setCellType(
									Cell.CELL_TYPE_STRING);
							componentValue[i] = xssfRow.getCell(i)
									.getStringCellValue();
						} else {
							componentValue[i] = "-";
						}
					}
					list.add(componentValue);
				}
			}
		}
		return list;
	}

	private static List<String[]> getComponentListFromXls(
			String mergedExcelFilePath) throws Exception {
		InputStream is = new FileInputStream(mergedExcelFilePath);
		HSSFWorkbook hssfWorkbook = new HSSFWorkbook(is);
		ComponentModel componentModel = null;
		List<String[]> list = new ArrayList<String[]>();
		// 循环工作表Sheet
		HSSFSheet hssfSheet = hssfWorkbook.getSheetAt(0);//只读取第一个表单的数据。
		// 循环行Row
		for (int rowNum = 2; rowNum <= hssfSheet.getLastRowNum(); rowNum++) {
			HSSFRow hssfRow = hssfSheet.getRow(rowNum);
			if (hssfRow != null) {
				String[] componentValue = new String[propertyCount];
				for (int i = 0; i < propertyCount; i++) {
					System.out.println("rowNum:columnNum" + rowNum + ":" + i);
					HSSFCell cell = hssfRow.getCell(i);
					if (cell != null
							|| "".equals(cell.getStringCellValue().trim())) {
						hssfRow.getCell(i).setCellType(Cell.CELL_TYPE_STRING);
						componentValue[i] = hssfRow.getCell(i)
								.getStringCellValue();
					} else {
						componentValue[i] = "-";
					}

				}
				list.add(componentValue);
			}
		}
		return list;
	}

	private static void getWorkBook(String mergedExcelFilePath) { // 创建工作文档对象
		if (mergedExcelFilePath.endsWith("xls")) {
			System.out.println("xls格式文件");
			wb = new HSSFWorkbook();
		} else if (mergedExcelFilePath.endsWith("xlsx")) {
			System.out.println("xlsx格式文件");
			wb = new XSSFWorkbook();
		} else {
			wb = null;
			System.out.println("您的文档格式不正确！");
		}
	}
}
