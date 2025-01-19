package com.DemoWebShopOne.TestScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.DemoWebShopOne.genericLibrary.BaseTest;
import com.DemoWebShopOne.pomPages.AddToCartPage;

public class AddToCartTest extends BaseTest {
	@Test//(dependsOnMethods = "loginIntoDemo")
	public void addToCart() throws EncryptedDocumentException, IOException {
		String name=ex.getDataFromExcel(PATH, ADDTOCART, 1, 0);
		String email=ex.getDataFromExcel(PATH, ADDTOCART, 1, 1);
		AddToCartPage a = new AddToCartPage(driver);
		a.performAddToCart(name,email);
	}
}
