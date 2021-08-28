package org.driver.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	protected WebDriver driver;      //Interface

	@Parameters("browserName")
	@BeforeMethod    //annotation
	public void openBrowser(String browserName) throws Exception {
		//Open Browser
		//String browserName = "chrome";
		
		if(browserName.equalsIgnoreCase("Chrome")) {
			//Open Chrome Browser
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("Firefox")) {
			//Open FF
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("ie")) {
			//Open IE
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		}
		else {
			throw new Exception(browserName + " - This browser type is not defined.");
		}

		driver.manage().window().maximize();
		
		
	}
	
	@AfterMethod
	public void quitBrowser() {
		//driver.quit();
	}
}
