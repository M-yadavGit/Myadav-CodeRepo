package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Name {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com");
		WebElement userName = driver.findElement(By.name("username"));
		userName.sendKeys("Myadav123");
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("1234567");
		WebElement loginButton = driver.findElement(By.className("_acap"));
		loginButton.click();
	}

}
