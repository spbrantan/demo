package com.testsuite1;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import com.fss.BaseClass;

public class jquerytest extends BaseClass{
         
	@Test
	public void queryScroll()
	{
		driver.get("http://127.0.0.1:8080/jqueryTest/index.html");
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.linkText("Tooltips")));
		driver.findElement(By.id("ui-id-3")).click();
		String str = driver.findElement(By.id("ui-id-4")).getText();
		System.out.println(str);
		
		
		driver.findElement(By.id("autocomplete")).sendKeys("test");
		
		WebElement elm = driver.findElement(By.id("car-type"));
		Select select = new Select(elm);
		js.executeScript("arguments[0].scrollIntoView();", elm);
		select.selectByIndex(4);
		driver.findElement(By.className("ui-button ui-widget ui-checkboxradio-radio-label ui-checkboxradio-label ui-controlgroup-item ui-checkboxradio-checked ui-state-active")).click();
		driver.findElement(By.className("ui-button-icon ui-icon ui-icon-triangle-1-n")).click();
		driver.findElement(By.className("ui-widget ui-controlgroup-item ui-button ui-corner-right")).click();
	}
	

}
