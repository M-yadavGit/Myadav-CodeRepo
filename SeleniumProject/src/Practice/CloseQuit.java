package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseQuit {
	public static void main(String[] args) {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.flipkart.com/");
			driver.get("https://www.instagram.com/");
			driver.get("https://www.flipkart.com/");
			
			driver.quit();
	}
}
