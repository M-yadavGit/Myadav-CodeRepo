package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class Rakesh {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://betficasino.abhiwandemos.com/");
		driver.findElement(By.xpath("//div[@class='MuiBox-root jss102']/descendant::input")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//div[@class='MuiBox-root jss103']/descendant::span[text()='SUBMIT ']")).click();

	}

}
