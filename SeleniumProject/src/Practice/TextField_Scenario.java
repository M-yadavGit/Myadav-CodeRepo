package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextField_Scenario {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Enter your name']")).sendKeys("ABCD");
		driver.findElement(By.xpath("//input[@placeholder='Enter Your Email']")).sendKeys("Myadav@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("12345567");
		driver.findElement(By.xpath("//span[@class='absolute text-slate-600 text-[18px] bg-gray-100']")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).submit();
		
	}
	

}
