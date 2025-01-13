package Locators;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpecificIphoneOnly {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("iphone",Keys.ENTER);
		
		List<WebElement> allIphones = driver.findElements(By.className("KzDlHZ"));
		
		String ExpectedResult="Apple iPhone 15 (Green, 128 GB)";
		int count=0;
		for(int i=0;i<allIphones.size();i++) {
			if(allIphones.get(i).getText().equalsIgnoreCase(ExpectedResult)) {
				allIphones.get(i).click();
				System.out.println("Product is matched : "+allIphones.get(i).getText() );
				count++;
				break;
			}
		}
		if(count==0)
			System.out.println("Product is not matching to the expectation");
		
		

		
	}

}

