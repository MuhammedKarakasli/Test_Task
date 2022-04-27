package com.dsr.pages;

import org.openqa.selenium.WebDriver;

public class HomePage extends PageBase{
	
	public HomePage(WebDriver driver) {
		
		super(driver);
		
	}
	
	
	
	public MethodPage SubmitAccount() {
		
		return new MethodPage(driver);
		
	}
	

}
