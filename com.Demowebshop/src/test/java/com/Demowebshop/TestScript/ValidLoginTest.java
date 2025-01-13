package com.Demowebshop.TestScript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.DemowebShop.Pompages.LoginPage;
import com.DemowebShop.Pompages.WelcomePage;
import com.DemowebShop.generic.Lib.BaseTest;
import com.DemowebShop.generic.Lib.Flib;


public class ValidLoginTest extends BaseTest {
	@Test(groups={"IT","ST","RT"})
	public void loginTestScript() throws EncryptedDocumentException, IOException {
		Flib f=new Flib();
		String email=f.getDataFromExcelSheet(EXCEL_PATH, LOGINSHEET, 1, 0);
		String password=f.getDataFromExcelSheet(EXCEL_PATH, LOGINSHEET, 1, 1);
		WelcomePage wp=new WelcomePage(driver);
		wp.getLoginLink().click();
		LoginPage lp=new LoginPage(driver);
		lp.loginInDemoWebShop(email, password);
	}

}
