package Assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class Assignment_PaytmSS {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://paytm.com/");
		
		driver.findElement(By.xpath("//label[text()='Round Trip']")).click();
		driver.findElement(By.xpath("//span[text()='DEL']")).click();
		driver.findElement(By.xpath("//div[text()='BLR']")).click();
		
		driver.findElement(By.xpath("//span[text()='BOM']")).click();
		driver.findElement(By.xpath("//div[text()='DEL']")).click();
		driver.findElement(By.xpath("//span[text()='Departure Date']")).click();
		driver.findElement(By.xpath("//td[text()='December 2024']/ancestor::table[@class='calendar']/descendant::div[text()='25']")).click();
		driver.findElement(By.xpath("//span[text()='Choose Date']")).click();
		driver.findElement(By.xpath("//td[text()='January 2025']/ancestor::table[@class='calendar']/descendant::div[text()='25']")).click();
		
		
		driver.findElement(By.xpath("//div[text()='Travellers & Cabin Class']")).click();
		
		WebElement adult = driver.findElement(By.xpath("//div[text()='Adults']/ancestor::div[@class='SgJ-i _2sTBn']/descendant::img[@alt='add-icon']"));
		for(int i=0;i<2;i++)
			adult.click();
		
		WebElement childreen = driver.findElement(By.xpath("//div[text()='Children']/ancestor::div[@class='SgJ-i _2sTBn']/descendant::img[@alt='add-icon']"));
		for(int i=0;i<2;i++)
			childreen.click();
		
		WebElement infant = driver.findElement(By.xpath("//div[text()='Infants']/ancestor::div[@class='SgJ-i _2sTBn']/descendant::img[@alt='add-icon']"));
		for(int i=0;i<1;i++)
			infant.click();
	
		driver.findElement(By.xpath("//div[text()='Done']")).click();
		driver.findElement(By.xpath("//button[text()='Search Flights']")).click();
		Thread.sleep(3000);
		
		TakesScreenshot t=(TakesScreenshot) driver;
		File src = t.getScreenshotAs(OutputType.FILE);
		File f1=new File("./screenshot/PaytmFlight1.png");
		Files.copy(src, f1);
		
	
	}

}
