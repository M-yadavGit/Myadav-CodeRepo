package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment_Blinkit {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.blinkit.com");
		//detect my location
		WebElement clickOnLocationButton = driver.findElement(By.xpath("//button[text()='Detect my location']"));
		clickOnLocationButton.click();
		//click on search icon
		WebElement search = driver.findElement(By.xpath("//div[text()='!']"));
		search.click();
		//search and send vegetables
		WebElement searchItem = driver.findElement(By.xpath("//input[@placeholder='Search for atta dal and more']"));
		searchItem.sendKeys("vegetables");
		//click on add button
		WebElement vegetables = driver.findElement(By.xpath("//div[text()='Lady Finger (Bhindi)']/ancestor::div[@class='Product__UpdatedContentContainer-sc-11dk8zk-7 bekgjj']/descendant::div[text()='ADD']"));
		vegetables.click();
		
		//now click on +icon on five-times
				WebElement plusIcon = driver.findElement(By.xpath("//div[@class='AddToCart__AddMinusIcon-sc-17ig0e3-9 dtDpfZ']"));
				for(int i=0;i<4;i++) {
					plusIcon.click();
				}
	}

}
