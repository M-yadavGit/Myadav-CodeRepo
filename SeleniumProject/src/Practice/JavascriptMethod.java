package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com");
		//driver.findElement(By.xpath("//button[text()='Detect my location']")).click();
		WebElement scroll = driver.findElement(By.xpath("//li[text()='English (UK)']"));
		JavascriptExecutor j=(JavascriptExecutor)driver;
		//j.executeScript("window.scrollBy(0,1000)");
		j.executeScript("arguments[0].scrollIntoView(true)",scroll);
		
	}
}
