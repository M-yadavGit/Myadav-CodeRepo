package DataDrivenFramework;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;

public class Flib {
	public static String getDataFromProperty(String filepath, String key) throws IOException {
		//to load the property file
		FileInputStream f= new FileInputStream(filepath);
		//create the object of property class
		Properties p=new Properties();
		//to load all the keys
		p.load(f);
		//to fetch the data
		return p.getProperty(key);
	}
	public static String getDataFromExcel(String path,String sheetName,int row,int cell) throws EncryptedDocumentException, IOException {
		//to load the file
		FileInputStream f = new FileInputStream(path);
		//open the workbook in readable mode
		Workbook book = WorkbookFactory.create(f);
		//get the sheet
		Sheet sheet = book.getSheet(sheetName);
		//get the row and cell
		return sheet.getRow(row).getCell(cell).getStringCellValue();	
	}
	public static void implicitwait(WebDriver driver, long seconds) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
	}

}

