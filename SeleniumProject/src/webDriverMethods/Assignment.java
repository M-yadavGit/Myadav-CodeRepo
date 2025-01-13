package webDriverMethods;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		driver.get("https://www.linkedin.com/");
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		driver.get("https://www.facebook.com/");
		Set<String> windowHandles = driver.getWindowHandles();
		
		for(String winid:windowHandles) {
			String title=driver.switchTo().window(winid).getTitle();
			System.out.println("Title is: "+title);
			
			 if (title.contains("instagram")) {
				int height=driver.manage().window().getSize().getHeight();
				System.out.println("Height of Instagram: "+height);
			}
			 else if (title.contains("Linkdin")) {
				int width=driver.manage().window().getSize().getWidth();
				System.out.println("Width of Linkdin: "+width);
			}
			 else if (title.contains("facebook")) {
				int Height=driver.manage().window().getSize().getHeight();
				System.out.println("Height of facebook: "+Height);
				int Width=driver.manage().window().getSize().getWidth();
				System.out.println("Width of facebook: "+Width);
			}
		}
	}

}
