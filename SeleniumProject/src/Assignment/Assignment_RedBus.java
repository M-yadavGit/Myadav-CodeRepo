package Assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment_RedBus {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.redbus.in/");
		
		driver.findElement(By.id("src")).sendKeys("Delhi");
		driver.findElement(By.xpath("//text[text()='ISBT Kashmiri Gate']")).click();
		driver.findElement(By.id("dest")).sendKeys("Kasol");
		driver.findElement(By.xpath("//text[text()='Kasol']")).click();
		WebElement calenderIcon = driver.findElement(By.xpath("//i[@class='sc-cSHVUG NyvQv icon icon-datev2']"));
		calenderIcon.click();
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfAllElements(calenderIcon));
		
		for(int i=0;i<12;i++) { 
		List<WebElement> allElement = driver.findElements(By.xpath("//div[@class='DatePicker__MainBlock-sc-1kf43k8-1 hHKFiR']"));
		 for(WebElement x:allElement) {
			 String a = x.getText();
			 if(a.contains("Feb")) {
				driver.findElement(By.xpath("//span[text()='14']")).click();
				System.err.print("\u2764\uFE0F");
				System.out.print("Happy Velentine Day");
				System.out.print("\u2764\uFE0F");
				break;
			 }else {
				 driver.findElement(By.xpath("//div[@style='flex-grow: 1; cursor: pointer;'][2]")).click();
					}
		 	}
		}	
	}
}
	


