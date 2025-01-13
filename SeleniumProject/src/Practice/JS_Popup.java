package Practice;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JS_Popup {
	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://demoapps.qspiders.com/ui/alert?sublist=0");
	driver.findElement(By.id("buttonAlert2")).click();
	Alert a = driver.switchTo().alert();
	a.accept();
	driver.findElement(By.xpath("//a[text()='Confirm']")).click();
	driver.findElement(By.id("buttonAlert5")).click();
	a.dismiss();
	driver.findElement(By.xpath("//a[text()='Prompt']")).click();
	driver.findElement(By.id("buttonAlert1")).click();
	a.sendKeys("yes");
	System.out.println(a.getText());
	a.accept();
	
	}
}
