package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class UseOfGetCSSValue {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement loginButton = driver.findElement(By.name("login"));
		
		// Background color of the login button
		String backgroundcolor = loginButton.getCssValue("background-color");
		System.out.println(backgroundcolor);
		// to convert RGBA to hex-code
		String hexCode = Color.fromString(backgroundcolor).asHex();
		System.out.println(hexCode);
		
		// line-height
		String height = loginButton.getCssValue("line-height");
		System.out.println(height);
		
		// font-size
		String fontSize = loginButton.getCssValue("font-size");
		System.out.println(fontSize);
	}
}
