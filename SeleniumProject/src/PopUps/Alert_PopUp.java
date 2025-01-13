package PopUps;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_PopUp {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui/alert?sublist=0");
		
		driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
		Alert a = driver.switchTo().alert();
		a.accept();
		
		driver.findElement(By.linkText("Confirm")).click();
		driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
		Alert c = driver.switchTo().alert();
		//c.accept();
		c.dismiss();
		
		driver.findElement(By.linkText("Prompt")).click();
		driver.findElement(By.xpath("//button[text()='Prompt Alert Box']")).click();
		Alert p = driver.switchTo().alert();
		System.out.println(p.getText());
		p.sendKeys("yes");
		p.accept();
		
	}

}
