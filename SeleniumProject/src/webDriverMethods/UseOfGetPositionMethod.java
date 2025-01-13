package webDriverMethods;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseOfGetPositionMethod {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Point position = driver.manage().window().getPosition();
		int XAxis=position.getX();
		int YAxis=position.getY();
		System.out.println(XAxis+" "+YAxis);
		System.out.println(position.getX()+" "+position.getY());
	}

}
