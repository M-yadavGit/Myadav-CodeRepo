package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseOfGetTitleMethod {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https:www.instagram.com/");
		String title=driver.getTitle();
		System.out.println("Title of the page is: "+title);
		if(title.contains("Instagram"))
			System.out.println("Verified");
		else
			System.out.println("Not Verified");
		
	}

}

