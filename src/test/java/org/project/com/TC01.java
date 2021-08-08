package org.project.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC01 {
	
	WebDriver driver;      //Interface

	@BeforeMethod
	public void openBrowser() {
		//Open Browser
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		//WebDriverManager.firefoxdriver().setup();
		//driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
	}
	
	
	@Test
	public void testCase01() {
		System.out.println("Running Test 1");
	}
	
	@AfterMethod
	public void quitBrowser() {
		driver.quit();
	}
	
}








