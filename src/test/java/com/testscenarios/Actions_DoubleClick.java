package com.testscenarios;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.utilities.ReusableFunction;

public class Actions_DoubleClick extends ReusableFunction {
  @Test
  public void f() throws Exception {
	  openEdgeBrowser();
	  getURL("ActionsDoubleClickURL");
	  Thread.sleep(3000);
	  
	  Actions act =new Actions (driver);
	  WebElement DoubleClickobj =driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
			  act.doubleClick(DoubleClickobj).perform();
			  //Click on Alert
			  driver.switchTo().alert().accept();
			  Thread.sleep(3000);
			  
			  //Right click
			  
			  WebElement RightClickobj =driver.findElement(By.xpath("//*[text()='right click me']"));
			  act.contextClick(RightClickobj).perform();
			  Thread.sleep(3000);
  }
}
