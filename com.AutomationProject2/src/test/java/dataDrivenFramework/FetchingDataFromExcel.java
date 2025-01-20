package dataDrivenFramework;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FetchingDataFromExcel {
	static String Prop_path = "./src/test/resources/TestData/Data.properties";
	static String path = "./src/test/resources/TestData/A5BatchExcel.xlsx";
	static String sheetName = "Sheet1";
	static WebDriver driver;

	public static void main(String[] args) throws IOException {
		String browser = Property.getDataFromProperty(Prop_path, "browser");
		String url = Property.getDataFromProperty(Prop_path, "url");
		String Username = Property.getDataFromExcel(path, sheetName, 1, 0);
		String Password = Property.getDataFromExcel(path, sheetName, 1, 1);

		if (browser.equalsIgnoreCase("chrome"))
			driver = new ChromeDriver();
		else if (browser.equalsIgnoreCase("firefox"))
			driver = new FirefoxDriver();
		else if (browser.equalsIgnoreCase("edge"))
			driver = new EdgeDriver();
		else
			System.out.println("Invalid Browser");
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("email")).sendKeys(Username);
		driver.findElement(By.name("pass")).sendKeys(Password);

	}
}
