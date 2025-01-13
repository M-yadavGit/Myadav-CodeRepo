package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Selector {
	public static void main(String[] args) {
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	
	// tag-id 		tag#id
	//driver.findElement(By.cssSelector("input#email")).sendKeys("Myadav@gmail.com");
	//driver.findElement(By.cssSelector("#pass")).sendKeys("1234");
	
	//tag-class  	tag.classname
	//driver.findElement(By.cssSelector("input.inputtext")).sendKeys("Myadav");
	//driver.findElement(By.cssSelector(".inputtext")).sendKeys("Myadav123");
	
	//tag-attribute		tag[attribute='value']
	//driver.findElement(By.cssSelector(""))
	
	
	
	
	
	
	
	
	}

}
