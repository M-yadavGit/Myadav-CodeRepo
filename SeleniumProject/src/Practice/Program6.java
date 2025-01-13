package Practice;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program6 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Point pos = driver.manage().window().getPosition();
//				int x = pos.getX();
//				int y = pos.getY();
		int x=pos.x;
		int y=pos.y;
				System.out.println(x+" "+y);
				driver.quit();
				
				
	}

}
