package com.qa.testBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(xpath=("//input[@placeholder='User ID (eg: AB0001)']"))
	private WebElement un;
	
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void setUsername() {
		un.sendKeys("CJ1757");
	}
	
	
	
	
	
	
	
}
