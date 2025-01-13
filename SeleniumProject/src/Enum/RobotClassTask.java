package Enum;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotClassTask {
	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_N);
		r.keyPress(KeyEvent.VK_TAB);
		
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_SHIFT);
		r.keyRelease(KeyEvent.VK_N);
		
		r.keyPress(KeyEvent.VK_F);
		r.keyPress(KeyEvent.VK_A);
		r.keyPress(KeyEvent.VK_C);
		r.keyPress(KeyEvent.VK_E);
		r.keyPress(KeyEvent.VK_B);
		r.keyPress(KeyEvent.VK_O);
		r.keyPress(KeyEvent.VK_O);
		r.keyPress(KeyEvent.VK_K);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(3000);

		
		//driver.findElement(By.xpath("//h3[text()='Facebook - log in or sign up']"));
		for(int i=0;i<25;i++) {
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		}
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		/*
		 * r.keyPress(KeyEvent.VK_CONTROL); r.keyPress(KeyEvent.VK_SHIFT);
		 * r.keyPress(KeyEvent.VK_I);
		 * 
		 * r.keyRelease(KeyEvent.VK_CONTROL); r.keyPress(KeyEvent.VK_SHIFT);
		 * r.keyPress(KeyEvent.VK_I);
		 */
//		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
//		email.sendKeys("123456789");
		for(int i=0;i<9;i++) {
			r.keyPress(KeyEvent.VK_I);																									
			r.keyRelease(KeyEvent.VK_I);
		}
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_A);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_C);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		r.keyPress(KeyEvent.VK_ENTER);

		
		
	}

}

