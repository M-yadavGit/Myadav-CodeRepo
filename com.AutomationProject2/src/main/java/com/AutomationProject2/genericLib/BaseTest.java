package com.AutomationProject2.genericLib;

import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	@BeforeSuite
	public void connectServer() {
		Reporter.log("-----------ServerConnected-Successfully---------");
	}

	@BeforeTest
	public void connectDatabase() {
		Reporter.log("---------DataBaseConected-Successfully------");
	}
	
	@BeforeClass
	public void setup() {
		
	}
}
