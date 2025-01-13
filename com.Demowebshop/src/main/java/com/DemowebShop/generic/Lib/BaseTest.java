package com.DemowebShop.generic.Lib;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;

import org.testng.annotations.Parameters;

public class BaseTest implements IAutoConstant {
	public static WebDriver sdriver;
	public WebDriver driver;

	@BeforeSuite(alwaysRun = true)
	public void toConnectServer() {
		Reporter.log("=========Server Connected Successfully=========", true);
	}

	@BeforeTest(alwaysRun = true)
	public void toConnectDatabase() {
		Reporter.log("========Database Connected Successfully=========", true);
	}

	@Parameters("browser")
	@BeforeClass(alwaysRun = true)
	public void setUp(@Optional("chrome") String browser) throws IOException {
		Flib lib = new Flib();
		// String browser=lib.getDataFromCommonDataProperty(PROP_PATH, "browser");
		String url = lib.getDataFromCommonDataProperty(PROP_PATH, "url");
		Reporter.log("========Launching " + browser + " Browser==========", true);
		if (browser.equalsIgnoreCase("Chrome"))
			driver = new ChromeDriver();
		else if (browser.equalsIgnoreCase("firefox"))
			driver = new FirefoxDriver();
		else if (browser.equalsIgnoreCase("edge"))
			driver = new EdgeDriver();
		else
			Reporter.log("Invalid browser", true);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMESECONDS));
		driver.get(url);
	}

	@AfterClass(alwaysRun = true)
	public void tearDown() {
		driver.quit();
		Reporter.log("Browser closed successfully", true);
	}

	@AfterTest(alwaysRun = true)
	public void toCloseDatabase() {
		Reporter.log("============Database Closed Successfully", true);
	}

	@AfterSuite(alwaysRun = true)
	public void toCloseServer() {
		Reporter.log("===========Server Closed successfully====", true);
	}

}
