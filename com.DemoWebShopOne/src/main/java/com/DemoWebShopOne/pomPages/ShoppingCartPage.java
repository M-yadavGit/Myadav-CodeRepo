package com.DemoWebShopOne.pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends BaseClass {

	public ShoppingCartPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//span[text()='Shopping cart']")
	private WebElement shopingCartLink;
	
	@FindBy(id="termsofservice")
	private WebElement checkboxButton;
	
	@FindBy(id="checkout")
	private WebElement checkoutButton;

	public WebElement getCheckboxButton() {
		return checkboxButton;
	}

	public WebElement getCheckoutButton() {
		return checkoutButton;
	}

	public WebElement getShopingCartLink() {
		return shopingCartLink;
	}
	
	public void performShoppingCart() {
		shopingCartLink.click();
		checkboxButton.click();
		checkoutButton.click();
	}
	

}
