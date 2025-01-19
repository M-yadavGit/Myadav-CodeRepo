package com.DemoWebShopOne.pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BaseClass {

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(id = "Email")
	private WebElement emailTextField;

	@FindBy(id = "Password")
	private WebElement passwordTextField;

	@FindBy(id = "RememberMe")
	private WebElement rememberMeCheckBox;

	@FindBy(xpath = "//input[@value='Log in']")
	private WebElement loginButton;

	public void toPerformLogin(String email, String password) {
		emailTextField.sendKeys(email);
		passwordTextField.sendKeys(password);
		rememberMeCheckBox.click();
		loginButton.click();
	}

	public void toPerforminvalidLogin(String email, String password) {
		emailTextField.sendKeys(email);
		passwordTextField.sendKeys(password);
		rememberMeCheckBox.click();
	}

}
