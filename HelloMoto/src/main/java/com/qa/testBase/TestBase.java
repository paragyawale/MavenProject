package com.qa.testBase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	public static WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		
		String br = "chrome";
	 if(br.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", "D:\\SetUps\\Selenium\\Newer_versions\\chromedriver.exe");
	      driver = new ChromeDriver();
	}
	 else if(br.equalsIgnoreCase("opera")) {
		 System.setProperty("webdriver.opera.driver","D:\\SetUps\\Selenium\\Newer_versions\\operadriver_win64\\operadriver.exe");
		  driver = new OperaDriver(); 
	 }
	 else if(br.equalsIgnoreCase("edge")) {
		 System.setProperty("webdriver.edge.deriver","D:\\SetUps\\Selenium\\Newer_versions\\msedgedriver.exe");
		  driver = new EdgeDriver();
	 }
	 else {
		 System.out.println("Enter valid browser name");
	 }
	 
	 driver.manage().window().maximize();
	 driver.manage().deleteAllCookies();
	 driver.get("https://kite.zerodha.com/?next=%2Fholdings");
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	 
	
	}
	@AfterMethod
	 public void tearDown() {
	//	driver.quit(); 
	 }
	 
 }

