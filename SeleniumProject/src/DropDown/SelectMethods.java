package DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectMethods {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		//click on the createNewAccount button
		WebElement createAccountButton = driver.findElement(By.xpath("//a[text()='Create new account']"));
		createAccountButton.click();
		
		//find the day WebElement
		WebElement day = driver.findElement(By.id("day"));
		//select by Index
		Select s=new Select(day);
		s.selectByIndex(4);
		
		//find the month WebElement
		WebElement month = driver.findElement(By.id("month"));
		//select by Visible Text
		Select s1=new Select(month);
		s1.selectByVisibleText("Mar");
		
		//find the year WebElement
		WebElement year = driver.findElement(By.id("year"));
		//select By Value
		Select s2=new Select(year);
		s2.selectByValue("1997");
		
		
	}

}
