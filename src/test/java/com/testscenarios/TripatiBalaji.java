package com.testscenarios;

import org.testng.annotations.Test;

import com.utilities.ReusableFunction;

public class TripatiBalaji extends ReusableFunction{
  @Test
  public void f() throws Exception {
	  openEdgeBrowser();
	  driver.get("https://tirupatibalaji.ap.gov.in/#/registration");
	  Thread.sleep(1000);
	 clickByAnyLocator(loc.triputibalaji_DateofBirth_clickbutton);
	  Thread.sleep(1000);
	selectByVisibleText(loc.triputibalaji_Yeardropdown,"1984" );
	 Thread.sleep(1000);
	selectByVisibleText(loc.triputibalaji_Monthdropdown,"May" );
	 Thread.sleep(1000);
	clickByAnyLocator(loc.triputibalaji_DateofbirthselectkBox);
	  
	  
	  
  }
}
