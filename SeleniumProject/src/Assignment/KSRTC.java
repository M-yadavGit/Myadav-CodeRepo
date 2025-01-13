package Assignment;

import java.awt.AWTException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class KSRTC {
	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.ksrtc.in/");
		driver.findElement(By.xpath("//span[text()='Select Departure City']")).click();
		driver.findElement(By.xpath("//span[text()='Select Departure City']/ancestor::a/following-sibling::div/descendant::input[@placeholder='Search Your City Name']")).sendKeys("adoni",Keys.ENTER);
		//driver.findElement(By.xpath("//em[text()='Adoni']")).click();
		driver.findElement(By.xpath("//span[text()='Select Destination City']")).click();
		driver.findElement(By.xpath("//span[text()='Select Destination City']/ancestor::a/following-sibling::div/descendant::input[@placeholder='Search Your City Name']")).sendKeys("bangalore");
		driver.findElement(By.xpath("//em[text()='Bangalore']")).click();
		
		JavascriptExecutor j=(JavascriptExecutor) driver;
		driver.findElement(By.id("departDate")).click();
			List<WebElement> month = driver.findElements(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']"));
			for(WebElement x:month) {
				String monthText=x.getText();
				if(monthText.contains("December 2024")) {
					//j.executeScript("window.scrollBy(0,1000)");
					driver.findElement(By.xpath("//a[text()='19']")).click();
				break;
				}
				else {
					driver.findElement(By.xpath("//span[text()='Next']")).click();
				}
			}
		WebElement click = driver.findElement(By.xpath("//input[@class='checkinput']"));
		click.click();
		driver.findElement(By.xpath("//div[text()='Search Buses']")).click();
		WebElement slider = driver.findElement(By.xpath("//div[@class='example-thumb example-thumb-0 ']"));
		Actions a=new Actions(driver);
		a.dragAndDropBy(slider, 100, 0).perform();
		j.executeScript("window.scrollBy(0,1000)");
		driver.findElement(By.xpath("//span[text()='2131MNTMYS']/ancestor::div[@class='listinng-block-left']/descendant::div[text()='Select Seats']")).click();
		driver.findElement(By.xpath("//div[@class='seatlook' and text()='11']")).click();
		driver.findElement(By.xpath("//div[text()='Select Boarding Point']")).click();
		driver.findElement(By.xpath("//div[text()='ADONI APSRTC BUS STAND']")).click();
		driver.findElement(By.xpath("//div[text()='Select Dropping Point']")).click();
		driver.findElement(By.xpath("//div[text()='KEMPEGOWDA BS MAJESTIC']")).click();
		driver.findElement(By.xpath("//div[text()='Provide Passenger Details']")).click();
		driver.findElement(By.xpath("//label[text()='Mobile No']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='mobileNo']")).sendKeys("9716331010");
	}

}
