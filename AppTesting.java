package com.demo.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class AppTesting {
	
	WebDriver driver;
	
	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nikita Patil\\Desktop\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();		
	}
  
	@Test
	public void f() {	  
		driver.get("https://www.hackerrank.com/");
		driver.manage().window().maximize();
	}
  
	@AfterClass
	public void afterClass() {
		driver.quit();
	}
  

}
