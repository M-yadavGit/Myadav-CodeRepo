package DropDown;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListOfAnimalDropDown {
	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/Mithlesh%20Yadav/Desktop/ListOfAnimal.html");
	WebElement dropdown = driver.findElement(By.id("AnimalDropdown"));
	Select s=new Select(dropdown);
	List<WebElement> allOptions = s.getOptions();
	
	//All the options in the List
//	for(int i=0;i<allOptions.size();i++) {
//		System.out.println(allOptions.get(i).getText());
//	}
	
	//Set<String> uniqueOptions = new HashSet<>();
	LinkedHashSet<String> uniqueOptions=new LinkedHashSet<>();
    for (WebElement option : allOptions) {
        uniqueOptions.add(option.getText());
    }

    // Print unique options
    System.out.println("Unique options in the dropdown:");
    for (String option : uniqueOptions) {
        System.out.println(option);
    }
	
	}
}
