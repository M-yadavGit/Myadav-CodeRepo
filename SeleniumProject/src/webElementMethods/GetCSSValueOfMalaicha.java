package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class GetCSSValueOfMalaicha {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://shop-global.malaicha.com/login");
		Thread.sleep(2000);
		WebElement SinInButton = driver.findElement(By.xpath("//button[text()='Sign In']"));
		String textColor = SinInButton.getCssValue("color");
		System.out.println(textColor);
		
//		Color hexcode = Color.fromString(textColor);
//		System.out.println(hexcode);
		
		String backgroundColor = SinInButton.getCssValue("background");
		System.out.println(backgroundColor);
		
//		Color hexcode1 = Color.fromString(backgroundColor);
//		System.out.println(hexcode1);
		
		WebElement RegisterButton = driver.findElement(By.xpath("//button[text()='Register']"));
		String RegtextColor = RegisterButton.getCssValue("color");
		System.out.println(RegtextColor);
		
		String RegBackgroundColor = RegisterButton.getCssValue("background");
		System.out.println(RegBackgroundColor);
		
	}

}
