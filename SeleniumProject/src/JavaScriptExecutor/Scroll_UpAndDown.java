package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_UpAndDown {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.blinkit.com");
		driver.findElement(By.xpath("//button[text()='Detect my location']")).click();
		
		JavascriptExecutor j = (JavascriptExecutor)driver;
		for(int i=0;i<3;i++) {
			j.executeScript("window.scrollBy(0,1000)");
			Thread.sleep(3000);
		}
		for(int i=0;i<3;i++) {
			j.executeScript("window.scrollBy(0,-1000)");
			Thread.sleep(3000);
		}
	}

}
