package Assignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_iphones_inArraylist {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("iphone",Keys.ENTER);
		//From ArrayList
		ArrayList<WebElement> a1=new ArrayList<>();
		a1.add(driver.findElement(By.xpath("//div[text()='Apple iPhone 15 (Pink, 128 GB)']")));
		a1.add(driver.findElement(By.xpath("//div[text()='Apple iPhone 15 (Green, 128 GB)']")));
		a1.add(driver.findElement(By.xpath("//div[text()='Apple iPhone 15 Plus (Black, 128 GB)']")));
		a1.add(driver.findElement(By.xpath("//div[text()='Apple iPhone 15 Plus (Blue, 128 GB)']")));
		a1.add(driver.findElement(By.xpath("//div[text()='Apple iPhone 16 (Ultramarine, 128 GB)']")));
		
		a1.add(driver.findElement(By.xpath("//div[text()='Apple iPhone 15 (Pink, 128 GB)']/ancestor::div[@class='yKfJKb row']/descendant::div[@class='Nx9bqj _4b5DiR']")));
		a1.add(driver.findElement(By.xpath("//div[text()='Apple iPhone 15 (Green, 128 GB)']/ancestor::div[@class='yKfJKb row']/descendant::div[@class='Nx9bqj _4b5DiR']")));
		a1.add(driver.findElement(By.xpath("//div[text()='Apple iPhone 15 Plus (Black, 128 GB)']/ancestor::div[@class='yKfJKb row']/descendant::div[@class='Nx9bqj _4b5DiR']")));
		a1.add(driver.findElement(By.xpath("//div[text()='Apple iPhone 15 Plus (Blue, 128 GB)']/ancestor::div[@class='yKfJKb row']/descendant::div[@class='Nx9bqj _4b5DiR']")));
		a1.add(driver.findElement(By.xpath("//div[text()='Apple iPhone 16 (Ultramarine, 128 GB)']/ancestor::div[@class='yKfJKb row']/descendant::div[@class='Nx9bqj _4b5DiR']")));
		for(WebElement iphone:a1)
			System.out.println(iphone.getText());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//From Map
		Map<String, String> m1=new HashMap<>();
		m1.put(driver.findElement(By.xpath("//div[text()='Apple iPhone 15 (Pink, 128 GB)']")).getText(), driver.findElement(By.xpath("//div[text()='Apple iPhone 15 (Pink, 128 GB)']/ancestor::div[@class='yKfJKb row']/descendant::div[@class='Nx9bqj _4b5DiR']")).getText());
		m1.put(driver.findElement(By.xpath("//div[text()='Apple iPhone 15 (Green, 128 GB)']")).getText(), driver.findElement(By.xpath("//div[text()='Apple iPhone 15 (Green, 128 GB)']/ancestor::div[@class='yKfJKb row']/descendant::div[@class='Nx9bqj _4b5DiR']")).getText());
		m1.put(driver.findElement(By.xpath("//div[text()='Apple iPhone 15 Plus (Black, 128 GB)']")).getText(), driver.findElement(By.xpath("//div[text()='Apple iPhone 15 Plus (Black, 128 GB)']/ancestor::div[@class='yKfJKb row']/descendant::div[@class='Nx9bqj _4b5DiR']")).getText());
		m1.put(driver.findElement(By.xpath("//div[text()='Apple iPhone 15 Plus (Blue, 128 GB)']")).getText(), driver.findElement(By.xpath("//div[text()='Apple iPhone 15 Plus (Blue, 128 GB)']/ancestor::div[@class='yKfJKb row']/descendant::div[@class='Nx9bqj _4b5DiR']")).getText());
		m1.put(driver.findElement(By.xpath("//div[text()='Apple iPhone 16 (Ultramarine, 128 GB)']")).getText(), driver.findElement(By.xpath("//div[text()='Apple iPhone 16 (Ultramarine, 128 GB)']/ancestor::div[@class='yKfJKb row']/descendant::div[@class='Nx9bqj _4b5DiR']")).getText());
		
		Set<Map.Entry<String, String>> x=m1.entrySet();
		for(Map.Entry<String, String> p:x)
			System.out.println(p);
		
		}
	
	}


