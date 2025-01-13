package Assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Assignment_Paytm {
	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.paytm.com");
		//click on Movies button
		driver.findElement(By.xpath("//img[contains(@src,'https://assetscdn1.paytm.com/images/catalog/view_item/733295')]")).click();
		//search Noida Location
		WebElement search = driver.findElement(By.xpath("//input[@type='search']"));
		search.sendKeys("Noida");
		//select Noida in suggestion 
		driver.findElement(By.xpath("//a[@href='/movies/noida']")).click();
		//click on BookTicket
		driver.findElement(By.xpath("//img[contains(@src,'https://assetscdn1.paytm.com/images/cinema/Pushpa-2--')]/ancestor::div[contains(@class,'DesktopR')]/descendant::a[text()='Book Ticket']")).click();
//Alternate xpath for click on book ticket driver.findElement(By.xpath("//span[text()='Hindi, Telugu']")).click();
		
		//click on procced button
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		//click on date 5th dec.
		driver.findElement(By.xpath("//div[text()='5']")).click();
		//Identify the poster and take Screenshot
		WebElement poster = driver.findElement(By.xpath("//img[@alt='movie poster']"));
		File puspa = poster.getScreenshotAs(OutputType.FILE);
		File f1=new File("./screenshot/puspa.png");
		Files.copy(puspa, f1);
	}

}
