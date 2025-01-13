package Assignment;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_ArrayList {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("iphone",Keys.ENTER);
		ArrayList<String> a=new ArrayList<String>();
		a.add(driver.findElement(By.xpath("//div[text()='Apple iPhone 15 (Pink, 128 GB)']")).getText());
		a.add(driver.findElement(By.xpath("//div[text()='Apple iPhone 15 (Green, 128 GB)']")).getText());
		a.add(driver.findElement(By.xpath("//div[text()='Apple iPhone 15 Plus (Black, 128 GB)']")).getText());
		a.add(driver.findElement(By.xpath("//div[text()='Apple iPhone 15 Plus (Blue, 128 GB)']")).getText());
		a.add(driver.findElement(By.xpath("//div[text()='Apple iPhone 16 (Ultramarine, 128 GB)']")).getText());
		for(String x:a)
		System.out.println(x+"==>"+driver.findElement(By.xpath("//div[text()='"+x+"']/ancestor::div[@class='yKfJKb row']/descendant::div[@class='Nx9bqj _4b5DiR']")).getText());
	}

}
