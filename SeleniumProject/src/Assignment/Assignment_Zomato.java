package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_Zomato {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https:\\www.zomato.com");
		
		WebElement search = driver.findElement(By.xpath("//input[@placeholder='Search for restaurant, cuisine or a dish']"));
		search.sendKeys("roti");
		search.click();
		
		WebElement rotiDish = driver.findElement(By.xpath("//p[text()='Roti - Delivery']"));
		rotiDish.click();
		
		WebElement FirstOption = driver.findElement(By.xpath("//h4[text()='Havemore']"));
		FirstOption.click();
		
		WebElement review = driver.findElement(By.xpath("//a[text()='Reviews']"));
		review.click();
		
		WebElement followButton = driver.findElement(By.xpath("//p[text()='Anshul Biala']/ancestor::section[@class='sc-leGWhw dsGFFl']/descendant::span[text()='Follow']"));
		followButton.click();
		Thread.sleep(3000);
		
		WebElement createAccount = driver.findElement(By.xpath("//span[text()='Create account']"));
		createAccount.click();
		
		WebElement name = driver.findElement(By.xpath("//h2[text()='Signup']/ancestor::div[@class='sc-re4bd0-8 huFQYv']/descendant::input[@class='sc-1yzxt5f-9 eSaBRN'][1]"));
		name.sendKeys("Mohan");
		
		WebElement pas = driver.findElement(By.xpath("//h2[text()='Signup']/ancestor::div[@class='sc-re4bd0-8 huFQYv']/descendant::input[@class='sc-1yzxt5f-9 eSaBRN'][2]"));
		pas.sendKeys("1234");
		
		WebElement checkbox = driver.findElement(By.xpath("//input[@class='sc-1o2pknd-1 gUphWv']"));
		checkbox.click();
		
		WebElement singin = driver.findElement(By.xpath("//span[text()='Create account']"));
		singin.click();
	}

}
