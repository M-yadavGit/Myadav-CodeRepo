package Assignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_BigBasketArrayList {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.bigbasket.com/");
		driver.findElement(By.xpath("//button[text()='Login/ Sign Up']/ancestor::div[@class='grid grid-flow-col gap-x-6 h-9 mt-3.5 mb-2.5']/descendant::input[@placeholder='Search for Products...']")).sendKeys("vegetables",Keys.ENTER);
		
		ArrayList<String> a=new ArrayList<String>();
		a.add(driver.findElement(By.xpath("//h3[text()='Cucumber (Loose)']")).getText());
		a.add(driver.findElement(By.xpath("//h3[text()='Cucumber (Loose)']")).getText());
		a.add(driver.findElement(By.xpath("//h3[text()='Carrot - Orange (Loose)']")).getText());
		a.add(driver.findElement(By.xpath("//h3[text()='Carrot - Orange (Loose)']")).getText());
		a.add(driver.findElement(By.xpath("//h3[text()='Capsicum - Green (Loose)']")).getText());
		a.add(driver.findElement(By.xpath("//h3[text()='Cauliflower']")).getText());
		for(String x:a)
			System.out.println(x+"==>"+driver.findElement(By.xpath("//h3[text()='Cucumber (Loose)']/ancestor::div[contains(@class,'SK')]/descendant::span[contains(@class,'Label-sc-15v1nk5-0 Pricing___StyledLabel-')]")).getText());
	}

}