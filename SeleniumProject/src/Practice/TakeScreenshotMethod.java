package Practice;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class TakeScreenshotMethod {
	public static void main(String[] args) throws IOException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		WebElement element = driver.findElement(By.xpath("//img[@alt='Facebook']"));
		TakesScreenshot t=(TakesScreenshot)driver;
		File src = element.getScreenshotAs(OutputType.FILE);
		File f1=new File("./screenshot/facebookS.png");
		Files.copy(src, f1);
	}


}
