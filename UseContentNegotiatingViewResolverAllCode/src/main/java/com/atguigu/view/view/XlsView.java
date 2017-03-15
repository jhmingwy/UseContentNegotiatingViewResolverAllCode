package com.atguigu.view.view;

import java.util.Map;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.springframework.web.servlet.view.document.AbstractExcelView;

import com.atguigu.view.pojo.User;

@SuppressWarnings("deprecation")
public class XlsView extends AbstractExcelView {

	@Override
	// 填充了数据的workbook 直接被底层 renderMergedOutputModel渲染以输出流形式数据
	/*
	 * buildExcelDocument(model, workbook, request, response);
	 * response.setContentType(getContentType()); ServletOutputStream out =
	 * response.getOutputStream(); workbook.write(out); out.flush();
	 */
	protected void buildExcelDocument(Map<String, Object> model, HSSFWorkbook workbook, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		User demoObj = (User) model.get("user");

		Sheet sheet = workbook.createSheet("sheet1");
		CellStyle style = workbook.createCellStyle();
		style.setFillForegroundColor(IndexedColors.GREY_40_PERCENT.index);
		style.setFillPattern(CellStyle.SOLID_FOREGROUND);
		style.setAlignment(CellStyle.ALIGN_CENTER);
		Row row = null;
		Cell cell = null;
		int rowCount = 0;
		int colCount = 0;

		// 创建头部
		row = sheet.createRow(rowCount++);

		cell = row.createCell(colCount++);
		cell.setCellStyle(style);
		cell.setCellValue("name");

		cell = row.createCell(colCount++);
		cell.setCellStyle(style);
		cell.setCellValue("age");

		cell = row.createCell(colCount++);
		cell.setCellStyle(style);
		cell.setCellValue("address");

		// 创建数据
		row = sheet.createRow(rowCount++);
		colCount = 0;
		row.createCell(colCount++).setCellValue(demoObj.getName());
		row.createCell(colCount++).setCellValue(demoObj.getAge());
		row.createCell(colCount++).setCellValue(demoObj.getAddress());
		for (int i = 0; i < 4; i++) {
			sheet.autoSizeColumn(i, true);
		}

	}

}