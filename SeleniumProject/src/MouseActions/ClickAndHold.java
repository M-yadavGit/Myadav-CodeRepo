package MouseActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHold {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();;
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(10));
		driver.get("https://demoapps.qspiders.com/ui/clickHold?sublist=0");
		WebElement circle = driver.findElement(By.id("circle"));
		Actions a=new Actions(driver);
		a.clickAndHold(circle).perform();
		Thread.sleep(2000);
		a.release().perform();
		Thread.sleep(2000);
		a.click(circle).perform();
	}

}