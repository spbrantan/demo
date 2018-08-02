package com.testsuite1;

import java.lang.invoke.MethodHandles;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.Select;
import com.fss.BaseClass;
import com.pageObject.HomePage;

public class HomePageTest extends BaseClass{

	HomePage homepage;
	
	public static Log log = LogFactory.getLog(MethodHandles.lookup().lookupClass().getSimpleName());
	
	//@Test
	public void alertHandling()
	{
		driver.findElement(By.linkText("Alert")).click();
		driver.findElement(By.id("alertexamples")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		driver.navigate().back();
	}
	
	//@Test
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
	
	//@Test
	public void basicAjax() throws InterruptedException
	{
		driver.findElement(By.linkText("Basic Ajax")).click();
		Select category = new Select(driver.findElement(By.name("id")));
		category.selectByVisibleText("Server");
		category = new Select(driver.findElement(By.name("language_id")));
		category.selectByVisibleText("Flash");
		driver.findElement(By.id("lteq30")).sendKeys("15");
		driver.findElement(By.name("submitbutton")).click();
		driver.findElement(By.linkText("Go back to the Ajax form")).click();
	    driver.quit();
	}
	
	//@Test(invocationCount= 1, threadPoolSize =1)
	public void basicHtmlForm() throws InterruptedException
	{
		driver.findElement(By.id ("htmlform")).click();
		driver.findElement(By.name("username")).sendKeys("BRANTANSP");
		driver.findElement(By.name("password")).sendKeys("Test@123");
		driver.findElement(By.name("comments")).clear();
		driver.findElement(By.name("comments")).sendKeys("Testing the server");
		List <WebElement> elm= driver.findElements(By.xpath("//input[@type='checkbox']"));
		for(int i=0; i<elm.size(); i++)
		{
			if(elm.get(i).isSelected())
			{
				System.out.println(elm.get(i).getAttribute("value")+ " is selected");	
				elm.get(i).click();
			} else{
				elm.get(i).click();
			}
		}
		
		List <WebElement> radioElm = driver.findElements(By.xpath("//input[@type='radio']"));
		for(int i=0;i<radioElm.size();i++)
		{
			if(radioElm.get(i).isSelected())
			{
				System.out.println(radioElm.get(i).getAttribute("value") +" is selected");
			}
		}
		radioElm.get(2).click();
		
		WebElement select = driver.findElement(By.name("multipleselect[]"));
		Select option= new Select(select);
		option.selectByVisibleText("Selection Item 1");
		option.selectByVisibleText("Selection Item 2");
		option.selectByVisibleText("Selection Item 4");
		
		WebElement dropdown = driver.findElement(By.name("dropdown"));
		Select option2= new Select(dropdown);
		option2.selectByVisibleText("Drop Down Item 6");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.close();
	}
	
	@Test
	public void dragDrop()
	{
		driver.findElement(By.partialLinkText("GUI")).click();
		
		WebElement elm1=driver.findElement(By.id("draggable1"));
		WebElement drp1=driver.findElement(By.id("droppable1"));
		
		Actions action= new Actions(driver);
		action.clickAndHold(elm1).release(drp1).build().perform();
	}
	
}










































