package com.fss;

import org.testng.annotations.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BaseClass {
	
	static WebDriver driver;
	
	@BeforeSuite
	public static void setup()
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\lib\\chromedriver2.33.exe");
	    driver = (WebDriver) new ChromeDriver();
	}
	
	@BeforeTest
	public static void beforeTest()
	{
		
	}
	
	@Test
	public static void Test ()
	{
		driver.get("http://google.com");
	}
	
	@BeforeMethod
	public static void beforeMethod()
	{
		
	}
	
	@AfterMethod
	public static void afterMethod()
	{
		
	}
	
	@AfterTest
	public static void afterTest()
	{
		
	}
	@AfterSuite
	public static void tearDown()
	{
		
	}

}
