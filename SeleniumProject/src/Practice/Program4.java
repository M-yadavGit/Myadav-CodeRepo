package Practice;

import java.util.Set;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program4 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		String title=driver.getTitle();
		System.out.println(title);
//		if(title.contains("facebook"))
//			System.out.println("verify");
//		String url = driver.getCurrentUrl();
//		System.out.println(url);
//		if(url.contains("facebook"))
//			System.out.println("verify");
//		String winid = driver.getWindowHandle();
//		System.out.println(winid);
		Set<String> win = driver.getWindowHandles();
		for(String x:win)
			System.out.print(x+" ");
	
	}
	

}
