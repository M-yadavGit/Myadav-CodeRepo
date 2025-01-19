package com.DemoWebShopOne.pomPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddToCartPage extends BaseClass{
	public AddToCartPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath="//a[text()='$25 Virtual Gift Card']/ancestor::div[@class='details']/descendant::input[@class='button-2 product-box-add-to-cart-button']")
	private WebElement giftCard;

	@FindBy(id="giftcard_2_RecipientName")
	private WebElement recipientName;
	
	@FindBy(id="giftcard_2_RecipientEmail")
	private WebElement recipientEmail;
	
	@FindBy(id="add-to-cart-button-2")
	private WebElement addToCartButton;
	
	public WebElement getGiftCard() {
		return giftCard;
	}
	
	public WebElement getAddToCartButton() {
		return addToCartButton;
	}

	public WebElement getRecipientName() {
		return recipientName;
	}

	public WebElement getRecipientEmail() {
		return recipientEmail;
	}

	public void performAddToCart(String name,String email) {
		giftCard.click();
		recipientName.sendKeys(name);
		recipientEmail.sendKeys(email);
		addToCartButton.click();
	}
	


}
