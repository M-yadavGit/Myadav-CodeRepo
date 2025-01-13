package DataDrivenFramework;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchDataFromExcel {
	static String path= "./src/test/resources/Login.xlsx";
	static WebDriver driver;
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		String username = Flib.getDataFromExcel(path,"LoginData",1,0);
		String password = Flib.getDataFromExcel(path,"LoginData",1,1);
		System.out.println(username);
		System.out.println(password);
		driver = new ChromeDriver();
		Flib.implicitwait(driver, 10);
		
		
	}
	

}
