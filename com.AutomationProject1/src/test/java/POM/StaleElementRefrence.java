package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementRefrence {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		LoginPage ln=new LoginPage(driver);
		WebElement email = ln.getEmailTextField();
		driver.navigate().refresh();
		email.sendKeys("Mohan");
		WebElement pass = ln.getPasswordTextField();
		pass.sendKeys("Singh");
		WebElement login = ln.getLoginbutton();
		login.click();	
	}

}
