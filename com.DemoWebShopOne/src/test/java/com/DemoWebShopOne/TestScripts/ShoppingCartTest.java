package com.DemoWebShopOne.TestScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.DemoWebShopOne.genericLibrary.BaseTest;
import com.DemoWebShopOne.pomPages.ShoppingCartPage;

public class ShoppingCartTest extends BaseTest {
	@Test
	public void performchekout() throws EncryptedDocumentException, IOException {
		LoginTest lt = new LoginTest();
		lt.loginIntoDemo();
		AddToCartTest ad = new AddToCartTest();
		ad.addToCart();
		ShoppingCartPage sp = new ShoppingCartPage(driver);
		sp.performShoppingCart();

	}

}
