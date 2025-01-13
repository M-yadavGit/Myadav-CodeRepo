package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Program3 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.paytm.com/");
//		Actions a=new Actions(driver);
//		a.contextClick().perform();
		driver.findElement(By.xpath("//label[text()='Round Trip']")).click();
		driver.findElement(By.xpath("//span[text()='Departure Date']")).click();
		//driver.findElement(By.xpath("//i[@class='fCLnC _1MMxa']")).click();
//		WebElement mon = driver.findElement(By.xpath("//td[text()='February 2025']"));
//		System.out.println(mon.getText());
		List<WebElement> allelements = driver.findElements(By.xpath("//table[@class='calendar']"));
		for(WebElement element:allelements) {
//			String x = element.getText();
//			System.out.println(x);
			if(element.getText().contains("February 2025")) {
				driver.findElement(By.xpath("//td[text()='February 2025']/ancestor::table[@class='calendar']/descendant::div[text()='14']")).click();
					break;
			}else {
				driver.findElement(By.xpath("//i[@class='fCLnC _1MMxa']")).click();
			}
	}
	
}
}
