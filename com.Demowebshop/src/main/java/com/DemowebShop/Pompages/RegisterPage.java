package com.DemowebShop.Pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BaseClass {

	public RegisterPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(id="gender-male")
	private WebElement maleRadioButton;
	
	@FindBy(id="gender-Female")
	private WebElement FemaleRadioButton;
	
	@FindBy(id="FirstName")
	private WebElement firstNameTextField;
	
	@FindBy(id="LastName")
	private WebElement LastNameTextField;
	
	@FindBy(id="Email")
	private WebElement emailTextField;
	
	@FindBy(id="Password")
	private WebElement passwordTextField;
	
	@FindBy(id="ConfirmPassword")
	private WebElement confirmpasswordtextFiled;
	
	@FindBy(id="register-button")
	private WebElement registerButton;
	
	public void toRegisterIntoDemoWeb(String firstName,String lastName, String email, String password) {
		maleRadioButton.click();
		//FemaleRadioButton.click();
		firstNameTextField.sendKeys(firstName);
		LastNameTextField.sendKeys(lastName);
		emailTextField.sendKeys(email);
		passwordTextField.sendKeys(password);
		confirmpasswordtextFiled.sendKeys(password);
		registerButton.click();
	}
	
	
	

}
