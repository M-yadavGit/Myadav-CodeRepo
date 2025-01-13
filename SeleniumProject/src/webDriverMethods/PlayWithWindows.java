package webDriverMethods;

import java.util.Set;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class PlayWithWindows {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.linkedin.com/");
		Thread.sleep(2000);
		//capture all the windowids
		Set<String>allWids=driver.getWindowHandles();
		System.out.println(allWids);
		for(String wid:allWids)
		{
			String widTitle=driver.switchTo().window(wid).getTitle();
		    if(widTitle.equals("Facebook – log in or sign up"))
		    {
		    	
		    }
		    else if(widTitle.equals("LinkedIn: Log In or Sign Up"))
		    {
		    	String signupPageUrl=driver.getCurrentUrl();
		    	System.out.println("SignupPageUrl: "+signupPageUrl);
		    }
		}
		//size
		int signUpHeight=driver.manage().window().getSize().getHeight();
		System.out.println("Signup page height: "+signUpHeight);
		int signUpWidth=driver.manage().window().getSize().getWidth();
		System.out.println("Signup page width: "+signUpWidth);
		//position
		int signUpXAxis=driver.manage().window().getPosition().getX();
		System.out.println("Signup position X axis: "+signUpXAxis);
		int signUpYAxis=driver.manage().window().getPosition().getY();
		System.out.println("Signup position X axis: "+signUpYAxis);
		//setSize
		Dimension definedSize=new Dimension(300, 500);
		driver.manage().window().setSize(definedSize);
		Point definedPosition=new Point(250, 300);
		driver.manage().window().setPosition(definedPosition);
		Thread.sleep(3000);

	}

}
