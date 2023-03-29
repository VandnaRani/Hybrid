package com.testscenarios;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import com.objectrepository.Locators;

public class JustRecharge {
	Locators loc = new Locators();
  @Test
  public void f() throws Exception {
	  //Read the property files test data
	  FileInputStream fi = new FileInputStream(".\\src\\test\\resources\\testdata\\QA.properties");
	  Properties p =new Properties();
	  p.load(fi);
	  System.setProperty("webdriver.edge.driver","C:\\Users\\uvoja\\Downloads\\edgedriver_win64\\msedgedriver.exe");
	  WebDriver driver = new EdgeDriver();
	  driver.get("https://www.justrechargeit.com/SignIn.aspx");
	  driver.manage().window().maximize();
	  Thread.sleep(6000);
	  driver.findElement(loc.JREsignin_Email_EditBox).sendKeys(p.getProperty("Email"));
	  Thread.sleep(1000);
	  driver.findElement(loc.JREsignin_Password_EditBox).sendKeys(p.getProperty("Password"));
	  driver.findElement(loc.JREsignin_Signinbutton).click();
  }
}
//*[@id="ucCaptcha"]/img
//*[@id="ucCaptcha"]/img