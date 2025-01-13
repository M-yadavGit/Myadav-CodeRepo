package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Blinkit {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.blinkit.com");
		WebElement clickOnLocationButton = driver.findElement(By.xpath("//button[text()='Detect my location']"));
		clickOnLocationButton.click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[text()='!']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@placeholder='Search for atta dal and more']")).sendKeys("vegetables");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[text()='Lady Finger (Bhindi)']/ancestor::div[contains(@class,'Product__UpdatedC')]/descendant::div[text()='ADD']")).click();
	}

}
