package webDriverMethods;

import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1st {
	public static void main(String[] args) throws InterruptedException   {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().fullscreen();

		driver.get("https://www.instagram.com/");

		driver.switchTo().newWindow(WindowType.WINDOW);
		Thread.sleep(2000);
		driver.get("https://www.linkedin.com/home");

		Thread.sleep(2000);
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.facebook.com/");

		Set<String> windowHandles = driver.getWindowHandles();

		for(String winHand: windowHandles) {
			String title=driver.switchTo().window(winHand).getTitle();
				//System.out.println("Title is: "+title);
				if(title.equalsIgnoreCase("Instagram")) {
					int height=driver.manage().window().getSize().getHeight();
					System.out.println("Height of Instagram web page is: "+height);
				}
				else if(title.equalsIgnoreCase("LinkedIn: Log In or Sign Up")) {
					int width=driver.manage().window().getSize().getWidth();
					System.out.println("Width of linkedin web page is: "+width);
				}
				else if(title.equalsIgnoreCase("Facebook – log in or sign up")) {
					int height=driver.manage().window().getSize().getHeight();
					System.out.println("Height of facebook web page is: "+height);
					int width=driver.manage().window().getSize().getWidth();
					System.out.println("Width of facebook web page is: "+width);							}
		}

		}

}