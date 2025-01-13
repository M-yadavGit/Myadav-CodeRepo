package Assignment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_HandleMultipleWindow {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.zomato.com/");
		
		WebElement scrollTill = driver.findElement(By.xpath("//h6[text()='Social links']"));
		JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript("arguments[0].scrollIntoView(true)", scrollTill);
		driver.findElement(By.xpath("//a[@href='https://in.linkedin.com/company/zomato']")).click();
		driver.findElement(By.xpath("//a[@href='https://www.instagram.com/zomato/']")).click();
		driver.findElement(By.xpath("//a[@href='https://twitter.com/zomato']")).click();
		driver.findElement(By.xpath("//a[@href='https://www.youtube.com/zomato']")).click();
		driver.findElement(By.xpath("//a[@href='https://www.facebook.com/zomato']")).click();
		Set<String> sessionid = driver.getWindowHandles();
		for(String id:sessionid) {
			//System.out.println(id);
			driver.switchTo().window(id);
			if(driver.getTitle().equalsIgnoreCase("Zomato | LinkedIn")) {
			driver.close();
			}
			else if(driver.getTitle().equalsIgnoreCase("zomato (@zomato) / X")) {
			driver.close();
			}
			else if(driver.getTitle().equalsIgnoreCase("Zomato - YouTube")) {
			driver.close();
			}
			
			else if(driver.getTitle().equalsIgnoreCase("Zomato | Facebook")) {
			driver.close();
			}
			}
			
		}
}
