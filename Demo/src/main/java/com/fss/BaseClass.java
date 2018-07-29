package com.fss;

import org.testng.annotations.*;

import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	
	protected static WebDriver driver;
	SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyyMMdd"); 
	SimpleDateFormat timeFormatter = new SimpleDateFormat("HHmmss"); 
	Date date = new Date();  
	
	@BeforeSuite
	public static void setup()
	{
		ChromeOptions chrome = new ChromeOptions();
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\lib\\chromedriver2.36.exe");
	    driver = (WebDriver) new ChromeDriver(chrome);
	    driver.get("http://127.0.0.1:8080/");
	    driver.manage().window().maximize();
	}
	
	@BeforeTest
	public static void beforeTest()
	{
		
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

	public static void waitUntilSelectOption(final Select select)
	{
		
	}
}








