package Enum;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeysEnum {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();;
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.id("username")).sendKeys("admin",Keys.TAB,"admin123",Keys.ENTER);
	
		
	
	}

}
 