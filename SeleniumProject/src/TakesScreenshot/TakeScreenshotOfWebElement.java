package TakesScreenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;
		public class TakeScreenshotOfWebElement {
			public static void main(String[] args) throws IOException, InterruptedException {
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.instagram.com/");
				Thread.sleep(2000);
				WebElement element = driver.findElement(By.xpath("//div[text()='Log in']")); 
				File src = element.getScreenshotAs(OutputType.FILE);
				File dest=new File("./screenshot/instagramLogin.png");
				Files.copy(src, dest);
	}
}

