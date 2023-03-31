package com.testscenarios;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import com.utilities.ReusableFunction;

public class OrangeHrm extends ReusableFunction{
  @Test
  public void f() throws Exception {
	  FileInputStream fi = new FileInputStream (".\\src\\test\\resources\\testdata\\QA.properties");
	  Properties p = new Properties();
	  p.load(fi);
	  System.setProperty("webdriver.edge.driver","C:\\Users\\uvoja\\Downloads\\edgedriver_win64\\msedgedriver.exe");
	  WebDriver driver = new EdgeDriver();
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  Thread.sleep(6000);
	  Thread.sleep(1000);
	 
	  driver.findElement(loc.Orange_userName_EditBox).sendKeys(p.getProperty("username"));
	  driver.findElement(loc.Orange_password_EditBox).sendKeys(p.getProperty("password"));
	  driver.findElement(loc.Orange_Login_button).click();
}
}