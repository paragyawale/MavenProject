package com.qa.TestLayer;

import org.testng.annotations.Test;

import com.qa.PageLayer.LoginPage;
import com.qa.testBase.TestBase;

public class LoginPageTest extends TestBase {

	@Test
	public void verifyLoginFunctionality() {
		LoginPage login = new LoginPage(driver);
		login.setUsername("CJ1757");
		login.setPassword("babu45678");
		login.verifyLoginButton();
		
		login.setPin("210292");
		login.verifycontinueBtn();
	}
	
	
	
	
	
	
	
}
