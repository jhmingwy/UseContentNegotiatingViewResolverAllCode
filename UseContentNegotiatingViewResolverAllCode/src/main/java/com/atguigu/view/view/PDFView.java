package com.atguigu.view.view;

import java.awt.Color;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.atguigu.view.pojo.User;
import com.lowagie.text.Document;
import com.lowagie.text.Element;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;
//import com.wisely.domain.DemoObj;

public class PDFView extends AbstractPdfView {

	@Override
	protected void buildPdfDocument(Map<String, Object> model, Document document, PdfWriter writer,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		User user = (User) model.get("user");

		PdfPTable table = new PdfPTable(2); // 列数
		table.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);
		table.getDefaultCell().setVerticalAlignment(Element.ALIGN_MIDDLE);
		table.getDefaultCell().setBackgroundColor(Color.lightGray);

		table.addCell("name");
		table.addCell("age");
		table.addCell("address");

		table.addCell(user.getName());
		table.addCell(user.getAge() + "");
		table.addCell(user.getAddress());

		document.add(table);
	}

}
