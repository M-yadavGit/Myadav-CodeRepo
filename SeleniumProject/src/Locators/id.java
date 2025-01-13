package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class id {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		Thread.sleep(2000);
		WebElement userName = driver.findElement(By.id("email"));
		userName.sendKeys("Myadav123");
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("1234567");
	}

}
