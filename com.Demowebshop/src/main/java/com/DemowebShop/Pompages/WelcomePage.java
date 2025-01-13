package com.DemowebShop.Pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class WelcomePage extends BaseClass{

	public WelcomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
		//register link
		@FindBy(xpath="//a[text()='Register']")
		private WebElement registerLink;
		
		public WebElement getRegisterLink() {
			return registerLink;
		}
		//login link
		@FindAll({@FindBy(className = "ico-login"),@FindBy(linkText = "Log in")})
		private WebElement loginLink;

		public WebElement getLoginLink() {
			return loginLink;
		}
	
		
}