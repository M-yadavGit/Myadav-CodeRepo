package Locators;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShop {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/register");
		
		WebElement gender = driver.findElement(By.id("gender-male"));
		gender.click();
		
		WebElement firstName = driver.findElement(By.name("FirstName"));
		firstName.sendKeys("Mithlesh");
		
		WebElement lastName = driver.findElement(By.id("LastName"));
		lastName.sendKeys("Yadav");
		
		Random r=new Random();
		int num = r.nextInt(1000);
		String emailid="myadav"+num+"@gmail.com";
		WebElement email = driver.findElement(By.name("Email"));
		email.sendKeys(emailid);
		
		WebElement password = driver.findElement(By.id("Password"));
		password.sendKeys("1234567");
		
		WebElement confirmpassword = driver.findElement(By.name("ConfirmPassword"));
		confirmpassword.sendKeys("1234567");
		
		WebElement registerButton = driver.findElement(By.id("register-button"));
		registerButton.click();
	}

}
