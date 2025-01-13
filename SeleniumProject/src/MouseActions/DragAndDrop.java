package MouseActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/dragDrop/dragToCorrect?sublist=2");
		WebElement drag1 = driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
		WebElement drag2 = driver.findElement(By.xpath("//div[text()='Mobile Cover']"));
		WebElement drop1 = driver.findElement(By.xpath("//div[text()='Mobile Accessories']"));
		WebElement drag3 = driver.findElement(By.xpath("//div[text()='Laptop Cover']"));
		WebElement drag4 = driver.findElement(By.xpath("//div[text()='Laptop Charger']"));
		WebElement drop2 = driver.findElement(By.xpath("//div[text()='Laptop Accessories']"));
		Actions a=new Actions(driver);
		a.dragAndDrop(drag1, drop1).perform();
		a.dragAndDrop(drag2, drop1).perform();
		a.dragAndDrop(drag3, drop2).perform();
		a.dragAndDrop(drag4, drop2).perform();
	}
	

}
