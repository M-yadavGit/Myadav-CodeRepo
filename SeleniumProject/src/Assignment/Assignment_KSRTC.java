package Assignment;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment_KSRTC {
	public static void main(String[] args) throws AWTException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.ksrtc.in/");
		driver.findElement(By.xpath("//span[text()='Select Departure City']")).click();
		WebElement a = driver.findElement(By.xpath("//input[@placeholder='Search Your City Name']"));
		
		driver.findElement(By.xpath("//li[text()='Achampet']")).click();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement destination = driver.findElement(By.xpath("//span[text()='Select Destination City']"));
		destination.click();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		driver.findElement(By.id("departDate")).click();
		
		for(int i=0;i<12;i++) { 
		List<WebElement> month = driver.findElements(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']"));
	
		for(WebElement x:month) {
			String monthText=x.getText();
			if(monthText.contains("December 2024")) {
				JavascriptExecutor j=(JavascriptExecutor) driver;
				j.executeScript("window.scrollBy(0,100)");
				driver.findElement(By.xpath("//a[text()='18']")).click();
			break;
			}
			else {
				driver.findElement(By.xpath("//span[text()='Next']")).click();
			}
		}
	}
		
//		WebElement element = driver.findElement(By.xpath("//input[@class='checkinput']"));
//		((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
		WebElement clik = driver.findElement(By.xpath("//div[@class='single-lady-wrap']/descendant::input[@class='checkinput']"));
		clik.click();
		clik.click();
		driver.findElement(By.xpath("//label[text()='Single Lady']/ancestor::div[@class='search--btn--wrap']/descendant::div[text()='Search Buses']")).click();
		
	}

}
