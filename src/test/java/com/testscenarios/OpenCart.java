package com.testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.objectrepository.Locators;

public class OpenCart {
	Locators loc = new Locators();
  @Test
  public void f() throws Exception {
	  System.setProperty("webdriver.edge.driver","C:\\Users\\uvoja\\Downloads\\edgedriver_win64\\msedgedriver.exe");
	  WebDriver driver = new EdgeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://opencart-prf.exense.ch/");
	  Thread.sleep(6000);
	  //driver.findElement(loc.OpenCart_iphonebutton).sendKeys("iPhone");
	  driver.findElement(loc.OpenCart_Addtocartbutton).click();
	  Thread.sleep(1000);
	  driver.findElement(loc.OpenCart_ShoppingCart).click();
	  Thread.sleep(1000);
	  driver.findElement(loc.OpenCart_Checkouttbutton).click();
	  Thread.sleep(1000);
  }
}
