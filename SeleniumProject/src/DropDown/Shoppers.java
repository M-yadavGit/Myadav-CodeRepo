package DropDown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Shoppers {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.shoppersstack.com/products_page/16");
		WebElement element = driver.findElement(By.id("Check Delivery"));
		element.sendKeys("123456");
		WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(20));
		WebElement Click = w.until(ExpectedConditions.elementToBeClickable(By.id("Check")));
		Click.click();
		
	}

}
