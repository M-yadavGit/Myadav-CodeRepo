package Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class All_iPhones {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("iphone",Keys.ENTER);
		List<WebElement> alliphones = driver.findElements(By.xpath("//div[@class='KzDlHZ']"));
		List<WebElement> allprice = driver.findElements(By.xpath("//div[@class='Nx9bqj _4b5DiR']"));
		for(int i=0;i<alliphones.size();i++) {
			System.out.println(alliphones.get(i).getText()+"==>"+allprice.get(i).getText());
		}		
	}

}
