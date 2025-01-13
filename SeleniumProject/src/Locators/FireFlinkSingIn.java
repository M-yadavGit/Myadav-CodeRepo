package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FireFlinkSingIn {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.fireflink.com/signin");
		Thread.sleep(2000);
		WebElement UserName = driver.findElement(By.id("emailId"));
		UserName.sendKeys("MithleshYadav");
		WebElement passwaor = driver.findElement(By.name("password"));
		passwaor.sendKeys("1233456");
	}

}
