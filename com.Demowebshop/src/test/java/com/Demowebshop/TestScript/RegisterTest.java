package com.Demowebshop.TestScript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.DemowebShop.Pompages.RegisterPage;
import com.DemowebShop.Pompages.WelcomePage;
import com.DemowebShop.generic.Lib.BaseTest;
import com.DemowebShop.generic.Lib.Flib;
import com.DemowebShop.generic.Lib.WorkLib;

public class RegisterTest extends BaseTest {
	String email="Mithlesh"+WorkLib.getRandomNo(100)+"@gmail.com";
	
	@Test(groups={"RT","ST"})
	public void registerTestScript() throws EncryptedDocumentException, IOException {
		Flib lib=new Flib();
		String firstName = lib.getDataFromExcelSheet(EXCEL_PATH,REGSHEET,1,0);
		String lasttName = lib.getDataFromExcelSheet(EXCEL_PATH,REGSHEET,1,1);
		String password = lib.getDataFromExcelSheet(EXCEL_PATH,REGSHEET,1,3);
		//String email = lib.getDataFromExcelSHeet(EXCEL_PATH,REGSHEET,1,2);
		//click on register link
		WelcomePage wp=new WelcomePage(driver);
		wp.getRegisterLink().click();
		//perform registration process
		RegisterPage rp=new RegisterPage(driver);
		rp.toRegisterIntoDemoWeb(firstName, lasttName, email, password);
	}
}
