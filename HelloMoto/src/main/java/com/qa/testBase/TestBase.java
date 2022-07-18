package com.qa.testBase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	WebDriver driver;
	@Test
	public void setUp() {
		
		String br = "chrome";
	 if(br.equalsIgnoreCase("chrome")) {
		WebDriverManager.chromedriver().setup();
	      driver = new ChromeDriver();
	}
	 else if(br.equalsIgnoreCase("opera")) {
		 WebDriverManager.operadriver().setup();
		  driver = new OperaDriver(); 
	 }
	 else if(br.equalsIgnoreCase("edge")) {
		 WebDriverManager.edgedriver().setup();
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
	 public void tearDown() {
		driver.quit(); 
	 }
	 
 }

