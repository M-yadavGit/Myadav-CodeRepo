package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(10000);
		
		WebElement usernameField = driver.findElement(By.xpath("//input[@name='username']"));
		usernameField.sendKeys("Admin");
		
		WebElement passwordField = driver.findElement(By.name("password"));
		passwordField.sendKeys("admin123");
		
		Thread.sleep(3000);
		
		WebElement clickLoginbutton = driver.findElement(By.xpath("//button[@type='submit']"));
		clickLoginbutton.click();
		
		Thread.sleep(5000);
		
		WebElement profile = driver.findElement(By.className("oxd-userdropdown-name"));
		profile.click();
		
		Thread.sleep(5000);
		
		//driver.findElement(By.className("oxd-icon bi-stopwatch")).click();
		
		WebElement log = driver.findElement(By.xpath("//a[text()='Logout']"));
		log.click();
		
		
	}

}
