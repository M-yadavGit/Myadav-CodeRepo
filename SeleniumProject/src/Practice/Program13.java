package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program13 {
	public static void main(String[] args){
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		String title=driver.getTitle();
		System.out.println("Title of the page is: "+title);
		if(title.contains("Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!"))
			System.out.println("Page Verified");
		else
			System.out.println("Not Verified");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("iphone");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		String deviceName = driver.findElement(By.xpath("//div[text()='Apple iPhone 15 (Black, 128 GB)']")).getText();
		System.out.println("Name of the Device "+deviceName);
		
		String devicePrice = driver.findElement(By.xpath("//div[text()='Apple iPhone 15 (Black, 128 GB)']/../..//div[@class='Nx9bqj _4b5DiR']")).getText();
		System.out.println("Price of the Device "+devicePrice);
	}

}
