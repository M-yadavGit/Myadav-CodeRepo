package Assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assignment_EaseMyTrip {
	public static void main(String[] args) throws InterruptedException {
		String month="Mar 2025";
		String date="5";
		ChromeOptions o=new ChromeOptions();
		o.addArguments("--disable-notifications");

		WebDriver driver=new ChromeDriver(o);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.easemytrip.com/");
		
		driver.findElement(By.id("FromSector_show")).click();
		driver.findElement(By.id("a_FromSector_show")).sendKeys("Delhi");
		driver.findElement(By.xpath("//span[text()='New Delhi(DEL)']")).click();
		
		driver.findElement(By.id("a_Editbox13_show")).sendKeys("blr");
		driver.findElement(By.xpath("//span[text()='Bengaluru(BLR)']")).click();
		
		//driver.findElement(By.id("ddate")).click();
		
		for(;;) {
			try {
				driver.findElement(By.xpath("//div[text()='"+month+"']/ancestor::div[@class='box1']/descendant::li[text()='"+date+"']")).click();
				break;
			}
			catch(Exception e) {
				driver.findElement(By.xpath("//img[@Alt='Arrow' and @id='img2Nex']")).click();	
			}	
		}
	}
}
