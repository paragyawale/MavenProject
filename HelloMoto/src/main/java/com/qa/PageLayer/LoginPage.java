package com.qa.PageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.TestBase;

public class LoginPage extends TestBase {

	@FindBy(xpath=("//input[@id='userid']"))
	private WebElement un;
	
	@FindBy(xpath=("//input[@placeholder='Password']"))
	private WebElement pwd;
	
	@FindBy(xpath=("//button[@type='submit']"))
	private WebElement loginbtn;
	
	@FindBy(xpath=("//input[@id='pin']"))
	private WebElement pinBtn;
	
	@FindBy(xpath=("// button[@type='submit']"))
	private WebElement continueBtn;
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void setUsername(String userName) {
		un.sendKeys(userName);
	}
	public void setPassword(String Pass) {
		pwd.sendKeys(Pass);
	}
	public void verifyLoginButton() {
		loginbtn.click();
	}
	
	public void setPin(String pin) {
		pinBtn.sendKeys(pin);
	}
	public void verifycontinueBtn() {
		continueBtn.click();
	}
	
	
	
	
	
	
}
