package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_Flipkart {
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		
		//identify the searchButton
		WebElement searchButton = driver.findElement(By.name("q"));
		searchButton.sendKeys("nokia1100",Keys.ENTER);
		//Back on the previous page
		driver.navigate().back();
		//click on close icon
		WebElement loginCloseButton = driver.findElement(By.className("_30XB9F"));
		loginCloseButton.click();
		//click on the cart button
		WebElement cartButton = driver.findElement(By.linkText("Cart"));
		cartButton.click();
		
	}

}
