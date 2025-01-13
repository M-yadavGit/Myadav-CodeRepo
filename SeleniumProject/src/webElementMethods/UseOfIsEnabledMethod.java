package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseOfIsEnabledMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://sandbox.abdm.gov.in/applications/cowin/home/cowin_signup_form");
		WebElement SubmitButton = driver.findElement(By.xpath("//button[text()='Submit']"));
		boolean StateOfButton = SubmitButton.isEnabled();
		
		if(StateOfButton)
			SubmitButton.click();
		else
		{
			driver.findElement(By.xpath("//button[text()='Accept Terms of Service']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='confbtn']")).click();
			driver.findElement(By.xpath("//button[text()='Close']")).click();
			SubmitButton.click();
		}
			
	}

}
