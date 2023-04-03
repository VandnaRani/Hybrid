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
	  if(driver.findElement(loc.MegaBus_signup_submitbutton).isEnabled()) {
		  System.out.println("element is enable");
	  }else {
		  System.out.println("element is not enable");
	  }

	 driver.findElement(loc.MegaBus_signupbutton).click();
	 Thread.sleep(1000);
	 sendKeysByAnyLocator(loc.MegaBus_Email_EditBox, "Email");
	 //driver.findElement(loc.MegaBus_Email_EditBox).sendKeys("uvojasvi@gma");
	 Thread.sleep(1000);
	sendKeysByAnyLocator(loc.MegaBus_ConfirmEmail_EditBox,"ConfirmEmail");
	 Thread.sleep(1000);
	 sendKeysByAnyLocator(loc.MegaBus_Password_EditBox,"Password");
	 Thread.sleep(1000);
	 sendKeysByAnyLocator(loc.MegaBus_ConfirmPassword_EditBox,"ConfirmPassword");
	 Thread.sleep(1000);
     driver.findElement(loc.MegaBus_checkboxes);
	 Thread.sleep(1000);
	 driver.findElement(loc.MegaBus_signup_submitbutton).click();
	 

	  
	 
  } 
	 
} 
	 


