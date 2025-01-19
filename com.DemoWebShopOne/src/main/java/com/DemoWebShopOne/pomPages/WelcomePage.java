package com.DemoWebShopOne.pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WelcomePage extends BaseClass {

	public WelcomePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(className = "ico-register")
	private WebElement registerLink;

	public WebElement getRegisterLink() {
		return registerLink;
	}

	@FindBy(linkText = "Log in")
	private WebElement loginlink;

	public WebElement getLoginlink() {
		return loginlink;
	}

}
