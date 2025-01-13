package LearningTestNG;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class FirstTestNg {
	@Test(dependsOnMethods="register")
	public void login() {
		Reporter.log("login test script executed sucessfully",true);
	}
	@Test(invocationCount=5)
	public void register() {
		Reporter.log("register test script executed sucessfully",true);
	}
	@Test(enabled=false)
	public void addToCart() {
		Reporter.log("addTocart test script executed sucessfully",true);
	}
}
