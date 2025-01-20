package LearningTestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class FirstTestNgScript {
	@Test(priority=1)
	public void login() {
		Reporter.log("TestExecuted successfully: ",true);
	}
	
	@Test(priority=-1)
	public void register() {
		Reporter.log("TestExecuted successfully: ",true);
	}
	
	@Test(priority=4)
	public void AddToCart() {
		System.out.println("TestExecuted Successfuly");
	}

}
