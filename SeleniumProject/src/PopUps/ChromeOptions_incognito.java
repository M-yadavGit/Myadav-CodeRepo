package PopUps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptions_incognito {
	public static void main(String[] args) {
		ChromeOptions o=new ChromeOptions();
		o.addArguments("--incognito");
		WebDriver driver=new ChromeDriver(o);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("12345");	
	}
}
