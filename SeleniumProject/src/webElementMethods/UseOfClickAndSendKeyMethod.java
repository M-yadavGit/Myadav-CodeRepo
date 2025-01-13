package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseOfClickAndSendKeyMethod  {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	
		
		WebElement clickCreateButton = driver.findElement(By.xpath("//a[text()='Create new account']"));
		clickCreateButton.click();
		
		WebElement FirstName = driver.findElement(By.name("firstname"));
		FirstName.sendKeys("Mithlesh");
		
		WebElement LastName = driver.findElement(By.name("lastname"));
		LastName.sendKeys("Yadav");
		
		WebElement GenderButton = driver.findElement(By.xpath("//label[text()='Male']/input"));
		GenderButton.click();
		
		WebElement EnterEmail = driver.findElement(By.name("reg_email__"));
		EnterEmail.sendKeys("M_yadav_@gmail.com");
		
		WebElement EnterPassword = driver.findElement(By.name("reg_passwd__"));
		EnterPassword.sendKeys("12345");
		
		WebElement singupButton = driver.findElement(By.name("websubmit"));
		singupButton.click();
		singupButton.click();
		
		
		
		
	}

}
