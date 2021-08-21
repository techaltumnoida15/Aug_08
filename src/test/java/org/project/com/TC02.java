package org.project.com;

import org.driver.com.BaseTest;
import org.testng.annotations.Test;

public class TC02 extends BaseTest{

	@Test
	public void test02() {
		String pageURL = driver.getCurrentUrl();
		System.out.println(pageURL);
	}
	
}
