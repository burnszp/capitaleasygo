/**
 * 
 */
package com.esoon.capitaleasygo.action.capitallibraryhandle.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * @author Hongten
 * @created 2014-5-20
 */
public class ReadExcel {

	private Workbook wb;

	/**
	 * read the Excel file
	 * 
	 * @param path
	 *            the path of the Excel file
	 * @return
	 * @throws IOException
	 */
	public List<ComponentModel> readExcel(String path) throws IOException {
		if (path == null || ConstantsUtil.EMPTY.equals(path)) {
			return null;
		} else {
			String postfix = PoiUtil.getPostfix(path);
			if (!ConstantsUtil.EMPTY.equals(postfix)) {
//				if (ConstantsUtil.OFFICE_EXCEL_2003_POSTFIX.equals(postfix)) {
					return readXls(path);
//				}else if(ConstantsUtil.OFFICE_EXCEL_2003_POSTFIX.equals(postfix)){
//					
//				}
			} else {
				System.out.println(path + ConstantsUtil.NOT_EXCEL_FILE);
			}
		}
		return null;
	}

	/**
	 * Read the Excel 2003-2007
	 * 
	 * @param path
	 *            the path of the Excel
	 * @return
	 * @throws IOException
	 */
	public List<ComponentModel> readXls(String path) throws IOException {
		Sheet sheet = null;
		InputStream is = new FileInputStream(path);
		if (path.endsWith("xls")) {
			System.out.println("xls格式文件");
			wb = new HSSFWorkbook(is);
			sheet = wb.getSheetAt(0);
		} else if (path.endsWith("xlsx")) {
			System.out.println("xlsx格式文件");
			wb = new XSSFWorkbook(is);
			sheet = wb.getSheetAt(0);
		} else {
			wb = null;
			System.out.println("您的文档格式不正确！");
		}
//		HSSFWorkbook hssfWorkbook = new HSSFWorkbook(is);
		;// 每个Excel只有一个页
		// Read the Row
		List<ComponentModel> components = new ArrayList<ComponentModel>();
		for (int rowNum = 2; rowNum <= sheet.getLastRowNum(); rowNum++) {// 第一行是标题
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				ComponentModel component = new ComponentModel();
				component.setBmyxjb(getValue(row.getCell(0)));// 编码优选级别(保密)
				component.setSyfw(getValue(row.getCell(1)));// 适用范围(保密)
				component.setBmzt(getValue(row.getCell(2)));// 编码状态(保密)
				component.setBmlx(getValue(row.getCell(3)));// 编码类型(保密)
				component.setFldm(getValue(row.getCell(4)));// 分类代码(eg:0107010102)
				component.setFlmc(getValue(row.getCell(5)));// 分类名称（eg:卡口式低频圆形电连接器)
				component.setSjbm(getValue(row.getCell(6)));// 设计编码(eg:800199800009008)
				component.setGroupName(getValue(row.getCell(7)));// 元器件分类（eg:Connector)
				component.setMc(getValue(row.getCell(8)));// 名称
				component.setJc(getValue(row.getCell(9)));// 简称
				component.setXh(getValue(row.getCell(10)));// 型号
				component.setXhgg(getValue(row.getCell(11)));// 型号规格
				component.setGysqc(getValue(row.getCell(12)));// 供应商全称
				component.setZldj(getValue(row.getCell(13)));// 质量等级
				component.setZgf(getValue(row.getCell(14)));// 总规范
				component.setXxgf(getValue(row.getCell(15)));// 详细规范
				component.setFzxs(getValue(row.getCell(16)));// 封装形式
				component.setWxcc(getValue(row.getCell(17)));// 外形尺寸
				component.setZytj(getValue(row.getCell(18)));// 专用条件
				component.setFjxy(getValue(row.getCell(19)));// 附加协议
				component.setSfjk(getValue(row.getCell(20)));// 是否进口
				component.setJldw(getValue(row.getCell(21)));// 计量单位
				component.setSsml(getValue(row.getCell(22)));// 所属目录
				component.setSjly(getValue(row.getCell(23)));// 数据来源
				component.setPartNumber(getValue(row.getCell(24)));// partNumber(eg:YMG20T10Z1P40)
				component.setDescription(getValue(row.getCell(25)));// 器件描述(eg:YMG系列,10芯,10-Φ1.0)
				component.setKth((getValue(row.getCell(26))));// 壳体号(eg:20)这个只是建库用，实际在Capital
								// Library中不体现。所以没法从库中提取，所以就没法显示。
				component.setTypeCode(getValue(row.getCell(27)));// 插头CONN/插座CONF(eg:CONN)
				component.setSymbolNameXPT(getValue(row.getCell(28)));// 型谱图（eg:YMG-20-10-Z1)
				component.setSymbolNameCST(getValue(row.getCell(29)));// 侧视图(eg：YMG-T-P）
				component.setSpecification(getValue(row.getCell(30)));// supplier也下的specification;
				component.setMaleOrFemale(getValue(row.getCell(31)));// 针Pmale/孔Sfemale(eg:male/female)Cavity
											// Attribute:Name
				component.setMating(getValue(row.getCell(32)));// (eg:YMG20F7K1P40)
				component.setBz(getValue(row.getCell(33)));// 备注
				component.setYl1(getValue(row.getCell(34)));// 预留1
				component.setYl2(getValue(row.getCell(35)));// 预留2
				components.add(component);
			}
		}
		return components;
	}

	@SuppressWarnings("static-access")
	private String getValue(Cell cell) {
		if (cell == null) {
			return "";
		}
		if (cell.getCellType() == cell.CELL_TYPE_BOOLEAN) {
			return String.valueOf(cell.getBooleanCellValue());
		} else if (cell.getCellType() == cell.CELL_TYPE_NUMERIC) {
			return String.valueOf(cell.getNumericCellValue());
		} else {
			return String.valueOf(cell.getStringCellValue());
		}
	}
}