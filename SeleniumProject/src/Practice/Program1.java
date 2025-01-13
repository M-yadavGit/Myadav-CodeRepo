package Practice;

import java.util.Set;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program1 {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().fullscreen();
		//driver.switchTo().newWindow(WindowType.WINDOW);
		//driver.manage().wait();
		driver.manage().window().fullscreen();
		
		driver.get("https://web.whatsapp.com/");
		Thread.sleep(3000);
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.instagram.com/");
		Thread.sleep(3000);
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.linkedin.com/");
		
		Set<String> winid = driver.getWindowHandles();
		for(String window:winid) {
			String title = driver.switchTo().window(window).getTitle();
			if(title.contains("whatsapp")) {
				int height = driver.manage().window().getSize().getHeight();
				 Point position = driver.manage().window().getPosition();
				 position.getX();
				 position.getY();
				System.out.println(height);
				System.out.println(position);
			}
		}
		
	}

}
