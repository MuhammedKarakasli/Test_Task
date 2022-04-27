package com.dsr.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.dsr.pages.HomePage;
import com.dsr.util.Browser;

public class TestPage {
	
	WebDriver driver;
	HomePage homePage;
	
	
	@BeforeMethod
	
	public void setUp() throws FileNotFoundException, IOException {
	
		Properties testConfig= new Properties();
		
		testConfig.load(new FileInputStream("TestConfig.properties"));
		
		driver= Browser.createDriver(testConfig.getProperty("browser"));
		
		driver.get(testConfig.getProperty("baseUrl"));
		
		homePage= new HomePage(driver);
		
	}
	
	@AfterMethod
	
	public void tearDown() {
		driver.close();
	}
	
	
	
	
}
