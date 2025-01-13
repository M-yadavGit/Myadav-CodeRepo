package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pro1 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.get("https://www.facebook.com/");
		driver.get("https://mail.google.com/");
//		System.out.println(driver.getTitle());
//		if(driver.getTitle().contains("Instagram"))
//			System.out.println("Verified");
//		else
//			System.out.println("Not verified");
//		System.out.println(driver.getCurrentUrl());
//		System.out.println(driver.getPageSource());
//		System.out.println(driver.getWindowHandle());
//		System.out.println(driver.getWindowHandles());
//		System.out.println(driver.switchTo());
//		System.out.println(driver.manage());
//		driver.close();
//		driver.quit();
		String wid=driver.getWindowHandle();
		System.out.println(wid);
			
	}

}
