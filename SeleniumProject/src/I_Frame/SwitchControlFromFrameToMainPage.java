package I_Frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchControlFromFrameToMainPage {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.dream11.com/");
		
		//Switch control into frame
		driver.switchTo().frame(0);
		driver.findElement(By.id("regEmail")).sendKeys("123458989");
		
		//Here we have to switch control again from frame to main page
		//driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		driver.findElement(By.id("hamburger")).click();
	}

}
