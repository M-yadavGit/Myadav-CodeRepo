package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRectMethod {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement EmailTextField = driver.findElement(By.id("email"));
		Rectangle rect = EmailTextField.getRect();
		int EmailHeight = rect.getHeight();
		int EmailWidth = rect.getWidth();
		System.out.println("Height of EmailTextField "+EmailHeight);
		System.out.println("Width of EmailTextField "+EmailWidth);
		int Emailx = rect.getX();
		int Emaily = rect.getY();
		System.out.println("Email xAxis "+ Emailx);
		System.out.println("Email yAxis "+Emaily);
		
		System.out.println("===========================================");
		System.out.println(EmailWidth+Emailx);
		System.out.println("===========================================");
		
		WebElement passTextField = driver.findElement(By.id("pass"));
		Rectangle pasRect = passTextField.getRect();
		System.out.println(pasRect.getX());
		System.out.println(pasRect.getY());
		System.out.println(pasRect.getHeight());
		System.out.println(pasRect.getWidth());
		
		System.out.println("===========================================");
		System.out.println(pasRect.getWidth()+pasRect.getX());
		System.out.println("===========================================");
		
		
		
	}
}
