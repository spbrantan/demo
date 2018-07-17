package com.testsuite1;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class Test {
	
	protected static WebDriver driver;
	SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyyMMdd"); 
	SimpleDateFormat timeFormatter = new SimpleDateFormat("HHmmss"); 
	Date date = new Date();  
	
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\lib\\chromedriver2.36.exe");
    driver = new ChromeDriver();
    driver.get("http://google.com/");
    driver.manage().window().maximize();
    
    Actions builder = new Actions(driver);
    builder.moveByOffset(50, 70).click().build().perform();
    
}

}
