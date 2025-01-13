package LearningTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class SecondTestng {
	
	@Test 
	public void login() {
		Reporter.log("Facebook login successfully");
	}
	@Test 
	public void register() {
		Reporter.log("Facebook register successfully");
	}

}
