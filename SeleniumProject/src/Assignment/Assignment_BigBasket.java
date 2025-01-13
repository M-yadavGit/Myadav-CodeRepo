package Assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_BigBasket {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.bigbasket.com/");
		driver.findElement(By.xpath("//button[text()='Login/ Sign Up']/ancestor::div[@class='grid grid-flow-col gap-x-6 h-9 mt-3.5 mb-2.5']/descendant::input[@placeholder='Search for Products...']")).sendKeys("vegetables",Keys.ENTER);
		List<WebElement> allveg = driver.findElements(By.xpath("//div[@class='break-words h-10 w-full']"));
		for(WebElement veg:allveg)
			System.out.println(veg.getText());
		System.out.println("-----------------------");
	}

}
