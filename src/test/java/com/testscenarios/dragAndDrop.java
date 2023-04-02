package com.testscenarios;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.utilities.ReusableFunction;

public class dragAndDrop extends ReusableFunction {
  @Test
  public void f() throws Exception {
	  //move Bank under Account Section
	  openEdgeBrowser();
	 getURL("dragAndDrop_URL");
	 
	 Thread.sleep(3000);
	 dragandDrop(By.xpath("//*[@id='fourth']/a"), By.xpath("//*[@id='amt7']/li"));
	 dragandDrop(By.xpath("//*[@id='credit2']/a"), By.id("shoppingCart1"));
	 dragandDrop(By.xpath("//*[@id='credit1']/a"), By.id("shoppingCart3"));
	 dragandDrop(By.xpath("//*[@id='fourth']/a"), By.id("amt8"));
	 
	
	 
	 
  } 
  }
//*[@id="fourth"]/a

