package dataDrivenFramework;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Property {
	public static String getDataFromProperty(String path, String key) throws IOException {
		FileInputStream file = new FileInputStream(path);
		Properties p = new Properties();
		p.load(file);
		return p.getProperty(key);
	}

	public static String getDataFromExcel(String path, String sheetName, int RowNo, int cellNo)
			throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream(path);
		Workbook workbook = WorkbookFactory.create(file);
		Sheet sheet = workbook.getSheet(sheetName);
		return sheet.getRow(RowNo).getCell(cellNo).getStringCellValue();
	}

}
