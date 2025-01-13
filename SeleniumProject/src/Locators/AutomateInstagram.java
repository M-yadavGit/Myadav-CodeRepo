package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateInstagram {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		WebElement userName = driver.findElement(By.name("username"));
		userName.sendKeys("12345");
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("1234567");
		WebElement LoginButton = driver.findElement(By.xpath("//div[text()='Log in']"));
		LoginButton.click();
	}

}
