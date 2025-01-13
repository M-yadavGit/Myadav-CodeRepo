package Assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMyTrip {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();
		driver.findElement(By.id("fromCity")).click();
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("Delhi");
		driver.findElement(By.xpath("//span[text()='New Delhi']")).click();
		
		driver.findElement(By.id("toCity")).click();
		driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("Mumbai");
		driver.findElement(By.xpath("//p[text()='Mumbai, India']")).click();
		//driver.findElement(By.xpath("//p[@data-cy='departureDate']")).click();
		try {
			driver.findElement(By.xpath("//div[@class='flt_fsw_inputBox dates inactiveWidget ']")).click();
		}catch(Exception e) {
			//System.out.println(e.getMessage());
		}
		String ExpectedResult="October 2025";
		String ExpectedDate="14";
		
		while(true) {
			String MonthYear = driver.findElement(By.xpath("//div[@class='DayPicker-Caption']")).getText();
			if(ExpectedResult.equalsIgnoreCase(MonthYear)) {
				break;
			}
			driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
		}
		List<WebElement> allDates = driver.findElements(By.xpath("//div[@class='DayPicker-Body']"));
		for(WebElement dt:allDates)
		{
			//System.out.println(dt.getText());
			if(dt.getText().equalsIgnoreCase(ExpectedDate))
				dt.click();
				break;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
