package Assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Assignment_DMRC {
	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://delhimetrorail.com/");
		
		//click on close pop-up;
		driver.findElement(By.id("buttonDismiss1")).click();
		//click on from station
		driver.findElement(By.id("FromStation")).click();
		//click on yellow-line
		driver.findElement(By.xpath("//div[text()='Line 2']")).click();
		//click on rajiv chowk
		driver.findElement(By.xpath("//font[text()='RAJIV CHOWK']")).click();
		//click on to station
		driver.findElement(By.id("ToStation")).click();
		//click on yellow-line
		driver.findElement(By.xpath("//div[text()='Line 2']")).click();
		//click on Green Park
		driver.findElement(By.xpath("//font[text()='GREEN PARK']")).click();
		//click on shortest route icon
		driver.findElement(By.xpath("//i[@class='flaticon-distance']")).click();
		//click on show route&Fare button
		driver.findElement(By.xpath("//button[text()='Show Route & Fare']")).click();
		//click on close pop-up;
		driver.findElement(By.id("buttonDismiss1")).click();
		WebElement plusIcon = driver.findElement(By.xpath("//li[text()='+']"));	
		for(int i=0;i<=5;i++) {
			plusIcon.click();
			}
		TakesScreenshot t=(TakesScreenshot) driver;
		File src = t.getScreenshotAs(OutputType.FILE);
		File f1=new File("./screenshot/delhimetro.png");
		Files.copy(src, f1);
	}

}
