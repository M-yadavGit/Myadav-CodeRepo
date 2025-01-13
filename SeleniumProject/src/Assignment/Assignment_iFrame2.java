package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment_iFrame2 {
	public static void main(String[] args) throws InterruptedException {
		
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://google.com");
	driver.findElement(By.xpath("//a[@aria-label='Google apps']")).click();
	
	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='https://ogs.google.com/widget/app/so?eom=1&awwd=1&origin=https%3A%2F%2Fwww.google.com&cn=app&pid=1&spid=538&hl=en']")));
	driver.findElement(By.xpath("//span[text()='Maps']")).click();
	driver.switchTo().defaultContent();
	for(int i=0;i<8;i++) {
		driver.findElement(By.id("widget-zoom-in")).click();
	}
	}
}
