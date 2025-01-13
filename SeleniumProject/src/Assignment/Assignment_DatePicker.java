package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_DatePicker {
	public static void main(String[] args) {
		String month="March 1996";
		String date="5";
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui/datePick?sublist=0/");
		driver.findElement(By.xpath("//input[@placeholder='Select A Date']")).click();
		
		for(;;) {
		try {
			driver.findElement(By.xpath("//div[text()='"+month+"']/ancestor::div[@class='react-datepicker__month-container']/descendant::div[text()='"+date+"']")).click();
			break;
		}
		catch(Exception e) {
			driver.findElement(By.xpath("//button[@aria-label='Previous Month']")).click();
			
		}
		}
	}
}
