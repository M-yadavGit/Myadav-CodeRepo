package DropDown;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

	public class DropDownHandleByLooping {
		public static void main(String[] args) {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com");
			//click on the createNewAccount button
			WebElement createAccountButton = driver.findElement(By.xpath("//a[text()='Create new account']"));
			createAccountButton.click();
			
			//find the month WebElement
			WebElement month = driver.findElement(By.id("month"));
			//select the month
			Select s1=new Select(month);
			for(int i=0;i<12;i++) {
				s1.selectByIndex(i);
			}
			
	}

}

