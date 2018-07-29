package com.testsuite1;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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
	
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\lib\\chromedriver2.36.exe");
    driver = new ChromeDriver();
    driver.get("http://demo.guru99.com/test/guru99home/");
    driver.manage().window().maximize();
    Thread.sleep(5000);
/*    JavascriptExecutor execute = (JavascriptExecutor) driver;
    for(int i =0; i<=5;i++){
        execute.executeScript("window.scrollBy(0,1000)");
    }*/
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.linkText("Books to Read")));
    js.executeScript("arguments[0].setAttribute('style', 'background : yellow; border : 2px solid red;');", driver.findElement(By.linkText("Books to Read")));
}

}
