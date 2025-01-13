package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_iFrame {
	public static void main(String[] args) {
		
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.dream11.com");
	
	driver.switchTo().frame(0);
	driver.findElement(By.id("regEmail")).sendKeys("123789898");
	driver.switchTo().defaultContent();
	driver.findElement(By.id("hamburger")).click();
	
	driver.switchTo().newWindow(WindowType.TAB);
	driver.get("https://www.google.com");
	
	
	}
}
