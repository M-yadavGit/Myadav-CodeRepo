package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseOfGetTagName {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement dropDown = driver.findElement(By.id("day"));
		String tagName = dropDown.getTagName();
		System.out.println(tagName);
		if(tagName.equalsIgnoreCase("select"))
			dropDown.click();
		else
			System.out.println("This tag name is not created within Select tag");
	}

}
