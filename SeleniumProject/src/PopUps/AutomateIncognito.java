package PopUps;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AutomateIncognito {
	public static void main(String[] args) throws AWTException {
//		ChromeOptions o=new ChromeOptions();
//		o.addArguments("--incognito");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_N);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_SHIFT);
		r.keyRelease(KeyEvent.VK_N);
	
		driver.get("https://www.facebook.com");
		
		Set<String> winid = driver.getWindowHandles();
		System.out.println(winid);
		for(String x:winid) {
			driver.switchTo().window(x);
		if(driver.getTitle().contains("New Incognito Tab")) {
			driver.get("https://www.facebook.com");
			driver.findElement(By.id("email")).sendKeys("12345");	
		}
	}
	}
}
