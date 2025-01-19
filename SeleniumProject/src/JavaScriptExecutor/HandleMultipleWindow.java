package JavaScriptExecutor;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleMultipleWindow {
	public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://www.flipkart.com/");
			
			driver.findElement(By.name("q")).sendKeys("iphone",Keys.ENTER);
			driver.findElement(By.xpath("//div[text()='Apple iPhone 15 (Black, 128 GB)']")).click();
			driver.findElement(By.xpath("//div[text()='Apple iPhone 15 (Green, 128 GB)']")).click();
			
			String sessionid1 = driver.getWindowHandle();
			System.out.println(sessionid1);
			
			Set<String> allsessionid = driver.getWindowHandles();
			//System.out.println(allsessionid);
			for(String id:allsessionid) {
				driver.switchTo().window(id);
				if(driver.getTitle().equalsIgnoreCase("Apple iPhone 15 (Black, 128 GB)"));
				{
					break;
				}
			}
			try {	
			driver.findElement(By.xpath("//button[@class='QqFHMw vslbG+ In9uk2']")).click();
			}
			catch(Exception e) {
				//driver.findElement(By.xpath(""));
				System.out.println("Write xpath for PaywithEMI");
			}
			Thread.sleep(4000);
			driver.switchTo().window(sessionid1);
			driver.findElement(By.linkText("Cart")).click();
			//driver.findElement(By.xpath("//div[text()='Remove']")).click();
			
	}

}
