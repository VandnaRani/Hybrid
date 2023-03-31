package com.testscenarios;

import java.io.FileInputStream;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.ClickAction;
import org.testng.annotations.Test;

import com.neilalexander.jnacl.crypto.poly1305;
import com.utilities.ReusableFunction;

public class Megabus extends ReusableFunction{
  @Test
  public void f() throws Exception {
	  
	 
	  openEdgeBrowser();
	  driver.get("https://us.megabus.com/account-management/login");
	  Thread.sleep(1000);
	  if(driver.findElements(loc.MegaBus_signup_submitbutton).size()>0) {
		  System.out.println("element is displayed");
	  }else {
		  System.out.println("element is not displayed");
	  }

	 driver.findElement(loc.MegaBus_signupbutton).click();
	 Thread.sleep(1000);
	 sendKeysByAnyLocator(loc.MegaBus_Email_EditBox, "Email");
	 //driver.findElement(loc.MegaBus_Email_EditBox).sendKeys("uvojasvi@gma");
	 Thread.sleep(1000);
	 driver.findElement(loc.MegaBus_ConfirmEmail_EditBox).sendKeys("Email");
	 Thread.sleep(1000);
	 driver.findElement(loc.MegaBus_Password_EditBox).sendKeys("Dhiman12");
	 Thread.sleep(1000);
	 driver.findElement(loc.MegaBus_ConfirmPassword_EditBox).sendKeys("Dhiamn12");
	 Thread.sleep(1000);
     driver.findElement(loc.MegaBus_checkboxes);
	 Thread.sleep(1000);
	 //driver.findElement(loc.MegaBus_signup_submitbutton).click();
	 

	  
	 
  } 
	 
} 
	 

