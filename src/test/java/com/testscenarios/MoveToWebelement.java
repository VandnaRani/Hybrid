package com.testscenarios;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.utilities.ReusableFunction;

public class MoveToWebelement extends ReusableFunction {
  @Test
  public void f() throws Exception {
	  openEdgeBrowser();
	  getURL("MoveToURL");
	  moveToOnElement(By.xpath("//*[@id='menu-item-15434']"));
	  Thread.sleep(1000);
	  moveToOnElement(By.xpath("//*[@id=\"menu-item-15601\"]"));
	  moveToOnElement(By.xpath("//*[@id=\"menu-item-15599\"]"));
	  //flipkart
	  getURL("MoveURL");
	  moveToOnElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[3]/a/div[1]/div/img"));
	  Thread.sleep(1000);
	  moveToOnElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[4]/a/div[1]/div/img"));
	  moveToOnElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[1]/a"));
	  
	//*[@id="container"]/div/div[2]/div/div/div[4]/a/div[1]/div/img  
	//*[@id="container"]/div/div[2]/div/div/div[1]/a
	  
  }
}
//*[@id="menu-item-15599"]
//*[@id="menu-item-15434"]
//*[@id="menu-item-15434"]
//*[@id="menu-item-15434"]
//*[@id="menu-item-15599"]/a/span[1]
//*[@id="menu-item-15434"]
//*[@id="menu-item-15434"]
//*[@id="menu-item-15434"]