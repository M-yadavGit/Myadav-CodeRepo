package com.Demowebshop.TestScript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.DemowebShop.Pompages.LoginPage;
import com.DemowebShop.Pompages.WelcomePage;
import com.DemowebShop.generic.Lib.BaseTest;
import com.DemowebShop.generic.Lib.Flib;

public class InvalidLoginTest extends BaseTest {
	
	@DataProvider(name="InvalidData")
	public Object[][] invalidData() throws EncryptedDocumentException, IOException{
		return Flib.readExcel(EXCEL_PATH, INVALID);
		
	}
	@Test(dataProvider="InvalidData",groups="FT")
	public void invalidLoginTest(String username, String password)throws EncryptedDocumentException  {
		WelcomePage wp=new WelcomePage(driver);
		wp.getLoginLink().click();
		LoginPage lp=new LoginPage(driver);
		lp.invalidLogInDemoWebShop(username, password);
	}
	
	

}
