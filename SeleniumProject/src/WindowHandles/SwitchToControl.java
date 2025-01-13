package WindowHandles;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToControl {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.myntra.com/");
		driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("sleepers",Keys.ENTER);
		driver.findElement(By.xpath("//h4[text()='Men TOPLIN Printed Sliders']")).click();
		Set<String> winid = driver.getWindowHandles();
		for(String x:winid) {
			driver.switchTo().window(x);
			if(driver.getTitle().contains("Buy U.S. Polo Assn. Men TOPLIN Printed Sliders")) {
				driver.findElement(By.xpath("//p[text()='8']")).click();
				driver.findElement(By.xpath("//span[@class='myntraweb-sprite pdp-whiteBag sprites-whiteBag pdp-flex pdp-center']")).click();
				break;
			}
		}
	}
}