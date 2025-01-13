package webDriverMethods;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseOfNavigateToMethod {
	
	public static void main(String[] args) throws MalformedURLException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.dassault-aviation.com/en/");
//
//		URL mainUrl= new URL("https://www.dassault-aviation.com/en/");
//		driver.navigate().to(mainUrl);
//		//driver.navigate().forward();
//		
//		URL grouppage=new URL(mainUrl,"group/");
//		driver.navigate().to(grouppage);
//		
//		driver.navigate().back();
//		driver.navigate().refresh();
//		URL civilpage=new URL(mainUrl,"civil/");
//		driver.navigate().to(civilpage);
//		driver.navigate().back();
//		driver.navigate().forward();
//		
//		driver.navigate().to(mainUrl);
		URL mainurl= new URL("https://www.dassault-aviation.com/en/");
		driver.navigate().to(mainurl);
		
		URL suburl=new URL(mainurl,"group/");
		driver.navigate().to(suburl);
		
		
	
	
		
		
		
	}

}
