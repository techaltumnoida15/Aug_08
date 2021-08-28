package org.project.com;

import java.util.List;

import org.driver.com.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SnapDealSearchItemTest extends BaseTest{

	@Test
	public void snapdealTest() throws Exception {
		driver.get("http://www.snapdeal.com");
		//Thread.sleep(1500);
		new WebDriverWait(driver, 10)
		.until(d -> ((JavascriptExecutor)driver).executeScript("return document.readyState").equals("complete"));
		
		//Type in Search Text Box
		WebElement searchTextBox = driver.findElement(By.cssSelector("input#inputValEnter"));
		searchTextBox.sendKeys("Mobile");
		
		//wait
		Thread.sleep(1500);
		
		//Get all suggestion
		List<WebElement> suggestionList = driver.findElement(By.cssSelector("ul[class='suggestionList_menu']")).findElements(By.tagName("li"));
		System.out.println("Total Suggestion - " + suggestionList.size());
		
		String clickableSuggestion = "Mobile Holder";
		Boolean isElementFound = false;
		//Click on some suggestion in the list
		
		for(int i = 0; i<suggestionList.size(); i++) {
			String suggestionListText = suggestionList.get(i).getText();
			System.out.println(suggestionListText);
			
			if(suggestionListText.equalsIgnoreCase(clickableSuggestion)) {
				suggestionList.get(i).click();
				isElementFound = true;
				System.out.println("Click on " + clickableSuggestion + " in suggestion list.");
				break;
			}
		}
		
		/*
		if(!isElementFound) {
			System.out.println(clickableSuggestion + " is not found in suggestion list.");
			//throw new Exception(clickableSuggestion + " is not found in suggestion list.");
		}
		*/
		
		Assert.assertTrue(isElementFound, clickableSuggestion + " is not found in suggestion list.");
		System.out.println("Done.");
	}
}







