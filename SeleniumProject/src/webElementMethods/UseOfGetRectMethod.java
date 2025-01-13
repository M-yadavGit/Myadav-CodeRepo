
package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseOfGetRectMethod {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement EmailText = driver.findElement(By.id("email"));
		Rectangle Rectangle = EmailText.getRect();
		int EmailHeight = Rectangle.getHeight();
		int Emailwidth = Rectangle.getWidth();
		int XAxis = Rectangle.getX();
		int YAxis = Rectangle.getY();
		
		System.out.println(XAxis);
		System.out.println(YAxis);
		
		System.out.println(Emailwidth);
		System.out.println(EmailHeight);
		
		WebElement PassText = driver.findElement(By.id("pass"));
		Rectangle Rectangle1 = PassText.getRect();
		int PassWidth = Rectangle1.getWidth();
		int PassHeight = Rectangle1.getHeight();
		
		int PassXaxis = Rectangle1.getX();
		int PassYAxis = Rectangle1.getY();
		
		System.out.println(PassXaxis);
		System.out.println(PassYAxis);
		
		System.out.println(PassWidth);
		System.out.println(PassHeight);
		
		System.out.println(XAxis+Emailwidth);
		System.out.println(PassXaxis+PassWidth);
		
	}
	

}
