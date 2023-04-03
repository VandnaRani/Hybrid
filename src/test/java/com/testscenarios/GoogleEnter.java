package com.testscenarios;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.utilities.ReusableFunction;

public class GoogleEnter extends ReusableFunction {
  @Test
  public void f() throws Exception {
	  openEdgeBrowser();
	  getURL("GoogleURL");
	  Thread.sleep(3000);
	  //Type some content on google search edit box//After that i want to click Enter Key on my Keyboard
	  //Here we are using Action class method 
	  sendKeysByAnyLocator(By.name("q"), "Country");
	  Thread.sleep(3000);
	  pressEnter(By.name("q"));
	 
  }
}
