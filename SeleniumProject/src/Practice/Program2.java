package Practice;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program2 {
	public static void main(String[] args) throws MalformedURLException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.dassault-aviation.com/en/");
		
		URL mainurl=new URL("https://www.dassault-aviation.com/en/");
		driver.navigate().to(mainurl);
		
		URL groupurl=new URL(mainurl,"group/");
		driver.navigate().to(groupurl);
		
		URL civilurl=new URL(mainurl,"civil/");
		driver.navigate().to(civilurl);
	}
}
