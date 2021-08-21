package org.project.com;

import org.driver.com.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC01 extends BaseTest{
	
	@Test
	public void testCase01() {
		System.out.println("Running Test 1");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		//Logic
	}
}








