package com.DemoWebShopOne.TestScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.DemoWebShopOne.genericLibrary.BaseTest;
import com.DemoWebShopOne.pomPages.LoginPage;
import com.DemoWebShopOne.pomPages.WelcomePage;

public class LoginTest extends BaseTest {
	@Test(groups="RT")
	public void loginIntoDemo() throws EncryptedDocumentException, IOException {
		String username = ex.getDataFromExcel(PATH, LOGIN_SHEET, 2, 0);
		String password = ex.getDataFromExcel(PATH, LOGIN_SHEET, 2, 1);
		WelcomePage wp = new WelcomePage(driver);
		wp.getLoginlink().click();
		LoginPage lp = new LoginPage(driver);
		lp.toPerformLogin(username, password);
	}
}
