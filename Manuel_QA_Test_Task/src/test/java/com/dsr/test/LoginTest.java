package com.dsr.test;

import org.testng.annotations.Test;

public class LoginTest extends TestPage{
	
	@Test
	public void myLogin() throws InterruptedException {
		homePage.SubmitAccount()
		.Submit();
		
	}

}
