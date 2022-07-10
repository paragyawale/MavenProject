package com.qa.testBase;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	
	@Test
	public void m1() {
		System.setProperty("webdriver.chrome.driver", "D:\\SetUps\\Selenium\\Newer_versions\\chromedriver.exe");   
		WebDriver driver = new ChromeDriver();
	
	
	
	
	}
	
}
