package com.testscenarios;

import org.testng.annotations.Test;

import com.objectrepository.Locators;

import org.testng.annotations.BeforeTest;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import com.objectrepository.*;

public class JRETest {
 WebDriver driver;
 Locators loc = new Locators();
  public void f() {
	  
  }
  @BeforeTest
  public void url() {
	  driver = new FirefoxDriver();
	  driver.get ("https://www.justrechargeit.com/SignIn.aspx");
	  
  }
  
  @Test
  public void Test () throws Exception {
	  Properties prop = ReadConfig.readPropertiesFile("C:\\Users\\uvoja\\639Batch\\HybridFramework\\src\\test\\resources\\TestData\\QA_Envi-TestData.properties");

	  driver.get(prop.getProperty("JRE_URL"));
	  Thread.sleep(2000);
		driver.findElement(loc.JREsignin_Email_EditBox).sendKeys("vani@gmail.com");
		driver.findElement(loc.JREsignin_Password_EditBox).sendKeys("vani12345");
		//driver.findElement(By.id("txtCaptcha")).sendKeys("23");
		//driver.findElement(By.name("imgbtnSignin")).click();
  }

}
