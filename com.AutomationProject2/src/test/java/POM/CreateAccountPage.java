package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccountPage {
	public CreateAccountPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "firstname")
	private WebElement firstName;
	
	@FindBy(name = "lastname")
	private WebElement lastname;

	@FindBy(id = "day")
	private WebElement day;
	
	@FindBy(id = "month")
	private WebElement month;
	
	@FindBy(id = "year")
	private WebElement year;
	
	@FindBy(xpath = "//label[text()='Male']")
	private WebElement gender;
	
	@FindBy(name = "reg_email__")
	private WebElement emailText;
	
	@FindBy(name = "reg_passwd__")
	private WebElement passwordText;
	
	@FindBy(name = "websubmit")
	private WebElement signupButton;

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getDay() {
		return day;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getGender() {
		return gender;
	}

	public WebElement getEmailText() {
		return emailText;
	}

	public WebElement getPasswordText() {
		return passwordText;
	}

	public WebElement getSignupButton() {
		return signupButton;
	}

}
