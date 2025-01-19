package com.DemoWebShopOne.genericLibrary;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BaseTest implements IAutoConstant {
	public static WebDriver sdriver;
	public WebDriver driver;
	public FileUtility f1 = new FileUtility();
	public DataUtility d = new DataUtility();
	public ExcelUtility ex = new ExcelUtility();
	

	@BeforeSuite(alwaysRun=true)
	public void toConnectServer() {
		Reporter.log("===Server connected successfully==", true);
	}

	@BeforeTest(alwaysRun=true)
	public void toConnectDatabase() {
		Reporter.log("==database connected successfully==", true);
	}
	@Parameters("browser")
	@BeforeClass(alwaysRun=true)
	public void setupt(@Optional("chrome") String browser) throws IOException {
		//String browser = f1.getDataFromProperty(PROP_PATH, "browser");
		String url = f1.getDataFromProperty(PROP_PATH, "url");
		Reporter.log("***********Launching " + browser + " **************", true);
		if (browser.equalsIgnoreCase("chrome"))
			driver = new ChromeDriver();
		else if (browser.equalsIgnoreCase("firefox"))
			driver = new FirefoxDriver();
		else if (browser.equalsIgnoreCase("edge"))
			driver = new EdgeDriver();
		else {
			Reporter.log("Invalid Browser");
		}
		sdriver=driver;
		d.maximizeWindow(driver);
		d.implicitWait(driver, TIMESECONDS);
		d.toLaunchApplication(driver, url);

	}

	@AfterClass(alwaysRun=true)
	public void tearDown() {
		Reporter.log("=====Browser closed successfully====", true);
		//driver.quit();
	}

	@AfterClass(alwaysRun=true)
	public void toCloseDatabase() {
		Reporter.log("=====database closed successfully====", true);
	}

	@AfterSuite(alwaysRun=true)
	public void toCloseServer() {
		Reporter.log("=====database closed successfully====");
	}

}
