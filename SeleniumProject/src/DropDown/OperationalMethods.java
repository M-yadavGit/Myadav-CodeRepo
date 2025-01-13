package DropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OperationalMethods {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1");
		Thread.sleep(3000);
		WebElement dropdown = driver.findElement(By.id("select-multiple-native"));
		Select s=new Select(dropdown);
		//Operational Methods isMultiple()
		System.out.println(s.isMultiple());
		System.out.println("===================================");
		
		//getOptions()
		List<WebElement> allOptions = s.getOptions();
		for(int i=0;i<allOptions.size();i++) {
			System.out.println(allOptions.get(i).getText());
		}
		System.out.println("===================================");
		
		//getFirstSelectedOptions()
		s.selectByIndex(0);
		s.selectByIndex(1);
		s.selectByIndex(5);
		System.out.println(s.getFirstSelectedOption().getText());
		System.out.println("===================================");
		
		//getAllSelectedOptions()
		List<WebElement> selectedOptions = s.getAllSelectedOptions();
		for(int i=0;i<selectedOptions.size();i++) {
			System.out.println(s.getAllSelectedOptions().get(i).getText());
		}
		System.out.println("===================================");
		
		//getWrappedElement()
		System.out.println(s.getWrappedElement().getText());
	}

}
