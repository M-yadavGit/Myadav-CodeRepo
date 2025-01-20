package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LoginTest {
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://facebook.com");
		LoginPage l1=new LoginPage(driver);
		WebElement create = l1.getCreateAcount();
		create.click();
		
		CreateAccountPage cp=new CreateAccountPage(driver);
		cp.getFirstName().sendKeys("Mohan");
		cp.getLastname().sendKeys("Mohannn");
		cp.getDay().click();
		
		Select s=new Select(cp.getDay());
		s.selectByIndex(2);
		
		Select s1=new Select(cp.getMonth());
		s1.selectByIndex(2);
		
		Select s2=new Select(cp.getYear());
		s2.selectByIndex(10);
		
		cp.getGender().click();
		cp.getEmailText().sendKeys("abc@gmail.com");
		cp.getPasswordText().sendKeys("12wer43");
		cp.getSignupButton().click();
	}
	
}
