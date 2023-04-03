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
	  
	  //Actions act =new Actions (driver);
	  //WebElement DoubleClickobj =driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
			  //act.doubleClick(DoubleClickobj).perform();
	  doubleClick(By.xpath("//*[@id=\"authentication\\\"]/button"));
			  //Click on Alert
			  //driver.switchTo().alert().accept();
			  Thread.sleep(3000);
			  
			  //Right click
			  getURL("RightClickURL");
			  mouseHoverContextClick(By.xpath("//*[text()='right click me']"));
			  //WebElement RightClickobj =driver.findElement(By.xpath("//*[text()='right click me']"));
			  //act.contextClick(RightClickobj).perform();
			  Thread.sleep(3000);
  }
}
