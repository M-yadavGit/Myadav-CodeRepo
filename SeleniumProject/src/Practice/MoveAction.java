package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveAction {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/button/buttonDouble?sublist=2");
		//driver.get("https://www.myntra.com/");
		//driver.get("https://facebook.com");
		Actions a=new Actions(driver);
		//move to element
		//a.moveToElement(driver.findElement(By.xpath("//a[text()='Men']"))).perform();
		//context click
		//a.contextClick().perform();
		//a.contextClick(driver.findElement(By.xpath("//a[text()='Men']"))).perform();
		//double click
		//a.doubleClick().perform();
		a.doubleClick(driver.findElement(By.xpath("//button[text()='Yes']"))).perform();
		
	}

}
