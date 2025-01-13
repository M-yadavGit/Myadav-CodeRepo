package DropDown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectMethods {
	public static void main(String[] args) throws InterruptedException {
		
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1");
	Thread.sleep(3000);
	WebElement dropdown = driver.findElement(By.id("select-multiple-native"));

	Select s=new Select(dropdown);
	
	//selection Methods
	s.selectByIndex(0);
	s.selectByValue("Winter Coat");
	s.selectByVisibleText("Casual Pants");

	
	//deselection Methods
	s.deselectByIndex(2);
	s.deselectByValue("Winter Coat");
	s.deselectByVisibleText("Running Shoes");
	for(int i=0;i<5;i++) {
		s.selectByIndex(i);
	}
	s.deselectAll();
	}

	private static Duration Duration(int i) {
		// TODO Auto-generated method stub
		return null;
	}
}
