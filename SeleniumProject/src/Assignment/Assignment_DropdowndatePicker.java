package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_DropdowndatePicker {
	public static void main(String[] args) {
		String year="1998";
		String month="Mar";
		String date="5";
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://demoapps.qspiders.com/ui/datePick/datedropdown?sublist=1");
		driver.findElement(By.xpath("//input[@placeholder='Select A Date']")).click();
		driver.findElement(By.xpath("//span[@class='react-datepicker__year-read-view--down-arrow']")).click();

		for(;;) {
		try {
			driver.findElement(By.xpath("//div[text()='"+year+"']")).click();
			break;
		}
		catch(Exception e) {
			driver.findElement(By.xpath("//a[@class='react-datepicker__navigation react-datepicker__navigation--years react-datepicker__navigation--years-previous']")).click();	

		}
		}
		driver.findElement(By.xpath("//span[@class='react-datepicker__month-read-view--down-arrow']")).click();
		driver.findElement(By.xpath("//div[text()='"+month+"']")).click();
		driver.findElement(By.xpath("//div[text()='"+date+"']")).click();
	}

}
