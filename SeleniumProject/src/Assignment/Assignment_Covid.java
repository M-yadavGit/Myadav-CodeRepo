package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_Covid {
		public static void main(String[] args) {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("https://www.worldometers.info/coronavirus/");
			WebElement deaths = driver.findElement(By.xpath("//h1[text()='Deaths:']/ancestor::div[@id='maincounter-wrap']/descendant::span[text()='7,010,681']"));
			System.out.println("Total Deaths are: "+deaths.getText());
			WebElement recover = driver.findElement(By.xpath("//h1[text()='Recovered:']/ancestor::div[@id='maincounter-wrap']/descendant::span"));
			System.out.println("Total recovery are: "+recover.getText());
	}

}
