package com.testsuite1;

import java.lang.invoke.MethodHandles;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.Select;
import com.fss.BaseClass;
import com.pageObject.HomePage;

public class HomePageTest extends BaseClass{

	HomePage homepage;
	
	public static Log log = LogFactory.getLog(MethodHandles.lookup().lookupClass().getSimpleName());
	
	@Test
	public void alertHandling()
	{
		driver.findElement(By.linkText("Alert")).click();
		driver.findElement(By.id("alertexamples")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		driver.navigate().back();
	}
	
	@Test
	public void alertsHandling()
	{
		driver.findElement(By.linkText("Alerts")).click();
		driver.findElement(By.id("confirmexample")).click();
		driver.switchTo().alert();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
		driver.findElement(By.id("confirmexample")).click();
		driver.switchTo().alert().accept();
		if("true".equals(driver.findElement(By.id("confirmreturn")).getText()))
		{
			System.out.println("displayed true");
		}
		driver.findElement(By.id("promptexample")).click();
		driver.switchTo().alert().sendKeys("IAMKING");
		driver.switchTo().alert().accept();
		if("IAMKING".equals(driver.findElement(By.id("promptreturn")).getText()))
		{
			System.out.println("displayed IAMKING");
		}
		driver.navigate().back();
	}
	
	@Test
	public void basicAjax() throws InterruptedException
	{
		driver.findElement(By.linkText("Basic Ajax")).click();
		Select category = new Select(driver.findElement(By.name("id")));
		category.selectByVisibleText("Server");
		category = new Select(driver.findElement(By.name("language_id")));
		category.selectByVisibleText("Java");
		driver.findElement(By.id("lteq30")).sendKeys("15");
		driver.findElement(By.name("submitbutton")).click();
		driver.findElement(By.linkText("Go back to the Ajax form")).click();
	    driver.quit();
	}
}










































