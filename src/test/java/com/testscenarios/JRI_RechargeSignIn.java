package com.testscenarios;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import com.objectrepository.Locators;
import com.utilities.ReusableFunction;

public class JRI_RechargeSignIn  extends ReusableFunction{

  @Test
  public void f() throws Exception {
	  //Read the property files test data
	 
	 
	 openEdgeBrowser();
	  getURL("JRI_RechargeSignIn_URL");
	  driver.manage().window().maximize();
	  Thread.sleep(1000);
	 sendKeysByAnyLocator(loc.JRE_Signin_Email_EditBox,"Email");
	  Thread.sleep(1000);
	  sendKeysByAnyLocator(loc.JRE_Signin_Password_EditBox,"Password");
	 clickByAnyLocator(loc.JRE_Signinbutton);
	 takeScreenshot("JRI_RechargeSignIn");
  }
}
