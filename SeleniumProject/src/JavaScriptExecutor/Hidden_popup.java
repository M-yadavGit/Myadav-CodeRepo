package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hidden_popup {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/r.php");
		 JavascriptExecutor j=(JavascriptExecutor)driver;
		 j.executeScript("arguments[0].value='transgender'", driver.findElement(By.id("custom_gender")));
		j.executeScript("arguments[0].value='abcd'", driver.findElement(By.name("firstname")));
	}
}
