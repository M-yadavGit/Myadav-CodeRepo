package Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Calender {
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.goibibo.com/");
		driver.findElement(By.xpath("//span[@class='logSprite icClose']")).click();
		driver.findElement(By.xpath("//span[text()='Departure']")).click();
		List<WebElement> allopt = driver.findElements(By.xpath("div[@class='DayPicker-Month']"));
		String element;
		for(WebElement x:allopt) {
			element=x.getText();
			if(element.contains("March 2025")) {
				driver.findElement(By.xpath("//div[text()='March 2025']/ancestor::div[@class='DayPicker-Month']/descendant::p[text()='5']")).click();
				break;
			}
			else {
				driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']"));
			}
		}	
	}
}
