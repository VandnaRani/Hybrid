package com.testscenarios;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.utilities.ReusableFunction;

public class UpperClass extends ReusableFunction{
  @Test
  public void f() throws Exception {
	  openEdgeBrowser();
	  getURL("GoogleURL");
	  pressEnter(By.name("q"));
	  typeTextInCAPS(By.name("q"), "testing");
  }
}
