package org.project.com;

import org.driver.com.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class SnapDealLoginTest extends BaseTest{

	@Test
	public void snapdealTest() throws Exception {
		driver.get("http://www.snapdeal.com");
		
		//1. Mouver Over = SignIn
		WebElement signIn = driver.findElement(By.cssSelector("span[class*='accountUserImg']"));
		
		Actions obj = new Actions(driver);
		obj.moveToElement(signIn);
		obj.build().perform();
		System.out.println("Mouse Over Done");
		
		Thread.sleep(2500);
		
		//2. Click - Login
		WebElement logIn = driver.findElement(By.xpath("//a[@href='https://www.snapdeal.com/login']"));
		logIn.click();
		System.out.println("Click on Login");
		
		Thread.sleep(1500);
		
		//Switch - Frame
		driver.switchTo().frame(driver.findElement(By.id("loginIframe")));
		
		//3. Enter Mobile Number
		String mobNum = "9711235995";
		WebElement mobileNumberTextBox = driver.findElement(By.id("userName"));
		mobileNumberTextBox.sendKeys(mobNum);
		System.out.println(mobNum + " is typed.");
	}
}
