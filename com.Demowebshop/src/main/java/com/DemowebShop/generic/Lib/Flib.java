package com.DemowebShop.generic.Lib;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Reporter;

public class Flib {
	public static String getDataFromCommonDataProperty(String path, String key) throws IOException {
		FileInputStream f1 = new FileInputStream(path);
		Properties p = new Properties();
		p.load(f1);
		return p.getProperty(key);
	}

	public static String getDataFromExcelSheet(String path, String sheetName, int rowNo, int cellNo)
			throws EncryptedDocumentException, IOException {
		FileInputStream f1 = new FileInputStream(path);
		 Workbook book = WorkbookFactory.create(f1);
		Sheet sheet = book.getSheet(sheetName);
		return sheet.getRow(rowNo).getCell(cellNo).getStringCellValue();
	}

	public void toWriteDataIntoExcelSheet(String excelPath, String sheetName, int rowNo, int cellNo, String data)
			throws EncryptedDocumentException, IOException {
		FileInputStream f = new FileInputStream(excelPath);
		Workbook book = WorkbookFactory.create(f);
		Sheet sheet = book.getSheet(sheetName);
		Row row = sheet.getRow(rowNo);
		Cell cell = sheet.getRow(rowNo).createCell(cellNo);
		cell.setCellValue(data);
		FileOutputStream f1 = new FileOutputStream(excelPath);
		book.write(f1);
		book.close();
		Reporter.log("data sent successfully");
	}

	public static Object[][] readExcel(String excelPath, String sheetName)
			throws EncryptedDocumentException, IOException {
		FileInputStream f = new FileInputStream(excelPath);
		Workbook book = WorkbookFactory.create(f);
		Sheet sheet = book.getSheet(sheetName);
		int row = sheet.getPhysicalNumberOfRows();
		int cell = sheet.getRow(0).getPhysicalNumberOfCells();
		Object[][] o = new Object[row - 1][cell];
		for (int i = 1; i < row; i++) {
			for (int j = 0; j < cell; j++) {
				o[i - 1][j] = sheet.getRow(i).getCell(j).getStringCellValue();
			}
		}
		return o;

	}

}
