package Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.myntra.com/pant?rawQuery=pant");
		List<WebElement> allproduct = driver.findElements(By.xpath("//div[@class='product-productMetaInfo']"));
		for(WebElement product:allproduct) {
			System.out.println(product.getText());
			System.out.println("-------------------------------------------");
		}
	}

}
