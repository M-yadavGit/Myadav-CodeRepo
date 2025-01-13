package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program9 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://shop-global.malaicha.com/login");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Register']")).click();
		Thread.sleep(2000);
	//	driver.findElement(By.xpath("//button[text()='Need help']")).click();
		
		driver.findElement(By.name("firstName")).sendKeys("Mithlesh");
		Thread.sleep(2000);
		driver.findElement(By.name("lastName")).sendKeys("Yadav");
		Thread.sleep(2000);
		driver.findElement(By.name("email")).sendKeys("Myadav@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.name("mobileNumber")).sendKeys("9716331056");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("m@yadav1234");
		Thread.sleep(2000);
		driver.findElement(By.name("confirmPassword")).sendKeys("m@yadav1234");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).submit();
		
	}

}
