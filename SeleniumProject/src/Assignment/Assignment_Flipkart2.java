package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_Flipkart2 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.flipkart.com");
		//click on grocery
		WebElement glocery=driver.findElement(By.xpath("//img[@alt='Grocery']"));
		glocery.click();
		//enter the pin-code
		WebElement pincode = driver.findElement(By.name("pincode"));
		pincode.sendKeys("201301",Keys.ENTER);
		//search the poha in search box
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("poha",Keys.ENTER);
	}

}
