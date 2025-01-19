package com.DemoWebShopOne.pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class BillingAddressPage extends BaseClass {

	public BillingAddressPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(id="BillingNewAddress_Company")
	private WebElement companyName;
	
	@FindBy(id="BillingNewAddress_CountryId")
	private WebElement countryDropdown;
	
	@FindBy(id="BillingNewAddress_City")
	private WebElement cityName;
	
	@FindBy(id="BillingNewAddress_Address1")
	private WebElement address1;
	
	@FindBy(id="BillingNewAddress_ZipPostalCode")
	private WebElement zipCode;
	
	@FindBy(id="BillingNewAddress_PhoneNumber")
	private WebElement phoneNo;
	
	@FindBy(className ="button-1 new-address-next-step-button")
	private WebElement continueButton;

	public WebElement getCompanyName() {
		return companyName;
	}

	public WebElement getCountryDropdown() {
		return countryDropdown;
	}

	public WebElement getCityName() {
		return cityName;
	}

	public WebElement getAddress1() {
		return address1;
	}

	public WebElement getZipCode() {
		return zipCode;
	}

	public WebElement getPhoneNo() {
		return phoneNo;
	}

	public WebElement getContinueButton() {
		return continueButton;
	}
	
	public void performBilling(String c_name, String cityName) {
		companyName.sendKeys(c_name);
		countryDropdown.click();

		Select s=new Select(countryDropdown);
		s.selectByVisibleText("India");
	
		
		
	}

}
