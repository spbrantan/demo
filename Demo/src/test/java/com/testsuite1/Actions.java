package com.testsuite1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import com.fss.BaseClass;

public class Actions extends BaseClass{
	
	@Test
	public static void dragAndDropTest()
	{
		driver.get("http://127.0.0.1:8080/draganddrop.html");
		WebElement elm2 = driver.findElement(By.id("commands"));
		
	}

}
