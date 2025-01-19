package com.DemoWebShopOne.TestScripts;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.DemoWebShopOne.genericLibrary.BaseTest;
import com.DemoWebShopOne.pomPages.LoginPage;
import com.DemoWebShopOne.pomPages.WelcomePage;

public class InvalidLoginTest extends BaseTest {
	@DataProvider(name = "invalidData")
	public Object[][] invalidData() {
		Object[][] obj = new Object[5][2];
		obj[0][0] = "admin1";
		obj[0][1] = "manager1";

		obj[1][0] = "admin2";
		obj[1][1] = "manager2";

		obj[2][0] = "admin3";
		obj[2][1] = "manager3";

		obj[3][0] = "admin4";
		obj[3][1] = "manager4";

		obj[4][0] = "admin5";
		obj[4][1] = "manager5";

		return obj;
	}

	@Test(dataProvider = "invalidData", groups="FT")
	public void invalidLogin(String username, String password) {
		WelcomePage wp = new WelcomePage(driver);
		wp.getLoginlink().click();
		LoginPage lp=new LoginPage(driver);
		lp.toPerforminvalidLogin(username, password);
		

	}

}
