package I_Frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automate_Dream11 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.dream11.com/");
		
		//Way1
		/*driver.switchTo().frame(0);
		
		*/
		
		//way2
		/*
		driver.switchTo().frame("send-sms-iframe");
		driver.findElement(By.id("regEmail")).sendKeys("12345678");
		*/
		
		//way3
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='Iframe Example']")));
		driver.findElement(By.id("regEmail")).sendKeys("12345678");
	}

}
