package com.dsr.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageBase {
	
	WebDriver driver;
	
	public PageBase(WebDriver driver) {
		this.driver = driver;
		
		
		PageFactory.initElements(driver, this);
	}
	
	public void getTitle() {
		System.out.println(driver.getTitle());
	}
	
	
	@FindBy(id = "1")
	WebElement firstname;
	
	@FindBy(id = "2")
	WebElement lastname;
	
	@FindBy(id = "3")
	WebElement email;
	
	@FindBy(id = "4")
	WebElement number;
	
	@FindBy(id = "5")
	WebElement box;
	
	@FindBy(xpath = "//input[@value='Male']")
	WebElement malebox;
	
	@FindBy(xpath = "//input[@value='Female']")
	WebElement femalebox;
	
	@FindBy(id = "99")
	WebElement submit;
	

}
