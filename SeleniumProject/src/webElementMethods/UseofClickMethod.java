package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseofClickMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		
		WebElement emailTextField = driver.findElement(By.id("email"));
		emailTextField.sendKeys("abc@gmail.com");
		Thread.sleep(2000);
		
		WebElement passwordTextField = driver.findElement(By.id("pass"));
		passwordTextField.sendKeys("1234");
		Thread.sleep(2000);
		
		WebElement clickLoginbutton = driver.findElement(By.name("login"));
		clickLoginbutton.click();	
		
		
		
		//driver.close();
	}

}
