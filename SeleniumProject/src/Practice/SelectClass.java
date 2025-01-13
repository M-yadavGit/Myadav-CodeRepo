package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/r.php");
		 WebElement day = driver.findElement(By.id("day"));
		Select s=new Select (day);
		s.selectByIndex(4);
		WebElement month = driver.findElement(By.id("month"));
		Select s1=new Select (month);
		s1.selectByVisibleText("Mar");
		
		WebElement year = driver.findElement(By.id("year"));
		Select s2=new Select(year);
		s2.selectByValue("1997");
		
		
		
		
	}

}
