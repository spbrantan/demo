package com.fss;

import org.testng.annotations.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\lib\\chromedriver2.36.exe");
	    driver = (WebDriver) new ChromeDriver();
	    driver.get("http://192.168.184.1:9001/");
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








