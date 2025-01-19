package com.DemoWebShopOne.TestScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.DemoWebShopOne.genericLibrary.BaseTest;
import com.DemoWebShopOne.genericLibrary.CustomListener;
import com.DemoWebShopOne.pomPages.RegisterPage;
import com.DemoWebShopOne.pomPages.WelcomePage;

@Listeners(CustomListener.class)
public class RegisterTest extends BaseTest {
	@Test(groups="RT")
	public void toRegisterIntoDemoWebshop() throws EncryptedDocumentException, IOException {
		String firstName = ex.getDataFromExcel(PATH, REG_SHEET, 1, 0);
		String lastName = ex.getDataFromExcel(PATH, REG_SHEET, 1, 1);
		String email = ex.getDataFromExcel(PATH, REG_SHEET, 1, 2);
		String password = ex.getDataFromExcel(PATH, REG_SHEET, 1, 3);
		WelcomePage wp = new WelcomePage(driver);
		wp.getRegisterLink().click();
		RegisterPage rp = new RegisterPage(driver);
		rp.registerInDemo(firstName, lastName, email, password);

	}

}
