package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_Myntra_Shoes {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.myntra.com/");
		driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("shoes",Keys.ENTER);
		WebElement name = driver.findElement(By.xpath("//h4[text()='Men Lace-Up Sneakers']/ancestor::div[@class='product-productMetaInfo']/descendant::h3[text()='HIGHLANDER']"));
		System.out.println("Name of shoes: "+name.getText());
		WebElement price = driver.findElement(By.xpath("//h4[text()='Men Lace-Up Sneakers']/ancestor::div[@class='product-productMetaInfo']/descendant::span[@class='product-discountedPrice']"));
		System.out.println("price is: "+price.getText());
	}

}
