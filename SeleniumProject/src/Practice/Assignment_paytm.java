package Practice;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

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

public class Assignment_paytm {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://paytm.com/");
		
		driver.findElement(By.xpath("//label[text()='Round Trip']")).click();
		driver.findElement(By.xpath("//span[text()='DEL']")).click();
		driver.findElement(By.xpath("//div[text()='BOM']")).click();
//		WebElement From = driver.findElement(By.id("text-box"));
//		From.clear();
//		Thread.sleep(3000);
//		From.sendKeys("Mumbai");
		driver.findElement(By.xpath("//span[text()='BOM']")).click();
		driver.findElement(By.xpath("//div[text()='DEL']")).click();
		driver.findElement(By.xpath("//span[text()='Departure Date']")).click();
		List<WebElement> allelements = driver.findElements(By.xpath("//table[@class='calendar']"));
		for(WebElement element:allelements) {
			//String x = element.getText();
			//System.out.println(x);
			if(element.getText().contains("February 2025")) {
				driver.findElement(By.xpath("//td[text()='February 2025']/ancestor::table[@class='calendar']/descendant::div[text()='14']")).click();
					break;
			}else {
				driver.findElement(By.xpath("//i[@class='fCLnC _1MMxa']")).click();
			}
		driver.findElement(By.xpath("//span[text()='Choose Date']")).click();
		List<WebElement> allelements1 = driver.findElements(By.xpath("//table[@class='calendar']"));
		
		for(WebElement element1:allelements1) {
			String x1 = element1.getText();
			if(x1.contains("July 2025")) {
				driver.findElement(By.xpath("//td[text()='July 2025']/ancestor::table[@class='calendar']/descendant::div[text()='14']")).click();
				break;
			}else {
				driver.findElement(By.xpath("//i[@class='fCLnC _1MMxa']")).click();
			}
			}
		
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
		File f1=new File("./screenshot/Flight.png");
		Files.copy(src, f1);
		
	}

}
}
