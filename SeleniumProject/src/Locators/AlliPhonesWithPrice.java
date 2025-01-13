package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlliPhonesWithPrice {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("iphone",Keys.ENTER);
		
		List<WebElement> allIphones = driver.findElements(By.className("KzDlHZ"));
		List<WebElement> allPrice = driver.findElements(By.xpath("//div[@class='KzDlHZ']/../..//div[@class='Nx9bqj _4b5DiR']"));
		
		for(int i=0;i<allIphones.size();i++) {
			String phoneName = allIphones.get(i).getText();
			String phonePrice = allPrice.get(i).getText();
			System.out.println(phoneName+" ==> "+phonePrice);
		}
		
	}

}
