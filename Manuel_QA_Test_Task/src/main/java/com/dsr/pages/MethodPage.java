package com.dsr.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class MethodPage extends PageBase{

	public MethodPage(WebDriver driver) {
		super(driver);
	}
	
	
	JavascriptExecutor jsexecutor=((JavascriptExecutor) driver);
	
	
	
	public MethodPage Submit() throws InterruptedException {
		
		jsexecutor.executeScript("arguments[0].style.border='2px solid red'", firstname); Thread.sleep(1500);
		firstname.sendKeys("Muhammed"); Thread.sleep(2000);
		jsexecutor.executeScript("arguments[0].style.border='transparent'", firstname);
		jsexecutor.executeScript("arguments[0].style.border='2px solid red'", lastname); Thread.sleep(1500);
		lastname.sendKeys("Karakasli"); Thread.sleep(2000);
		jsexecutor.executeScript("arguments[0].style.border='transparent'", lastname);
		jsexecutor.executeScript("arguments[0].style.border='2px solid red'", email); Thread.sleep(1500);
		email.sendKeys("mtalhakarakasli@gmail.com"); Thread.sleep(2000);
		jsexecutor.executeScript("arguments[0].style.border='transparent'", email);
		jsexecutor.executeScript("arguments[0].style.border='2px solid red'", number); Thread.sleep(1500);
		number.sendKeys("905350184572"); Thread.sleep(2000);
		jsexecutor.executeScript("arguments[0].style.border='transparent'", number);
		malebox.click();Thread.sleep(1500);femalebox.click();Thread.sleep(1500);malebox.click();Thread.sleep(1500);
		box.click(); Thread.sleep(1500);box.click(); Thread.sleep(1500);box.click(); Thread.sleep(1500);
		jsexecutor.executeScript("arguments[0].style.border='2px solid red'", submit); Thread.sleep(1500);
		jsexecutor.executeScript("arguments[0].style.border='transparent'", submit);
		submit.click(); Thread.sleep(2000);
		Alert alert=driver.switchTo().alert();Thread.sleep(2000);
		alert.accept();Thread.sleep(2000);
		
		
		
		
		return new MethodPage(driver);
		
	}
	
}
