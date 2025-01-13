package webElementMethods;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Maliacha {
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://shop-global.malaicha.com/login");
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//button[text()='Register']")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//button[text()='Need help']")).click();			
			Thread.sleep(2000);
			
			driver.findElement(By.name("email")).sendKeys("Myadav@gmail.com");
			Thread.sleep(2000);
			
			WebElement enquiry = driver.findElement(By.xpath("//select[@name='enquiryCode']"));
			enquiry.click();
			Thread.sleep(2000);
			enquiry.click();
			Thread.sleep(2000);
			
			driver.findElement(By.name("message")).sendKeys("Hi Malaicha.com could you plz suggest how to select above enquiry dropdown");
			Thread.sleep(2000);
			
			driver.findElement(By.id("needHelpSubmitButton")).submit();
		}

	}
