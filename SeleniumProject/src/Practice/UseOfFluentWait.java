package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
/**
 * @author Mithlesh Yadav 9 dec
 */
public class UseOfFluentWait {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.shoppersstack.com/");
		FluentWait<WebDriver> wait=new FluentWait<>(driver);
		wait.withTimeout(Duration.ofSeconds(20));
		wait.pollingEvery(Duration.ofSeconds(1));
		wait.ignoring(TimeoutException.class);
		//wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("//img[@alt='kids']"))));
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("//img[@alt='kids']"))));
		
	
	}

}
