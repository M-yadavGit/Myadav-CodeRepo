package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseOfGetLocation {
	public static void main(String[] args){
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Point point = driver.findElement(By.id("email")).getLocation();
		int x = point.x;
		int y = point.y;
		System.out.println(x);
		System.out.println(y);
		System.out.println(point.getX());
		System.out.println(point.getY());
	}

}
