package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class program12 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=4");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("abc");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='absolute text-slate-600 text-[18px] bg-gray-100']")).click();
	}

}
