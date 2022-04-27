package com.dsr.test;

import org.testng.annotations.Test;

public class LoginTest extends TestPage{
	
	@Test
	public void TestLogin() throws InterruptedException {
		homePage.SubmitAccount()
		.Submit();
		
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = "Web UI Playground";
		Assert.assertEquals(ActualTitle, ExpectedTitle);
		
	}

}
