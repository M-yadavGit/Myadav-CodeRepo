package DropDown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropDown {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("file:///C:/Users/Mithlesh%20Yadav/Documents/dropdown.html");
		Thread.sleep(2000);
		WebElement dropdown = driver.findElement(By.id("dropdown"));
		Select s=new Select(dropdown);
		s.selectByIndex(3);
		Thread.sleep(2000);
		s.selectByVisibleText("USA");
	}

	private static Duration Duration(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
