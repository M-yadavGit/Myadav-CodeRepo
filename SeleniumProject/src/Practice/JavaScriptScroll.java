package Practice;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptScroll {
	public static void main(String[] args) throws AWTException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://dashboards.handmadeinteractive.com/jasonlove/");
		JavascriptExecutor j=(JavascriptExecutor) driver;
		for(int i=0;i<5;i++)
		j.executeScript("window.scrollBy(1000,0)");
		for(int i=0;i<5;i++)
			j.executeScript("window.scrollBy(-1000,0)");
		
		
		
	}

}
