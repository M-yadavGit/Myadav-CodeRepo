package com.DemoWebShopOne.genericLibrary;

import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.WebDriver;

import com.graphbuilder.math.func.RandFunction;

public class DataUtility {
	public void maximizeWindow(WebDriver driver) {
		driver.manage().window().maximize();
	}

	public void implicitWait(WebDriver driver, int sec) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));
	}

	public void toLaunchApplication(WebDriver driver, String url) {
		driver.get(url);
	}

	public int getRandomNo() {
		Random r = new Random();
		return r.nextInt(10000);
	}
}
