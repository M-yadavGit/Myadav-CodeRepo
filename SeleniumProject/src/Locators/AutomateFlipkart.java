package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateFlipkart {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		 WebElement search = driver.findElement(By.name("q"));
		 search.sendKeys("iphone",Keys.ENTER);
		 
		List<WebElement> Alliphone = driver.findElements(By.xpath("//div[@class='KzDlHZ']"));
		for(int i=0;i<Alliphone.size();i++) {
			System.out.println(Alliphone.get(i).getText());
		}
		 
	}

}
