package com.testscenarios;

import org.testng.annotations.Test;

import com.utilities.ReusableFunction;


public class JRI_AccountCreation extends ReusableFunction {
  @Test
  public void f() throws Exception {
	  openEdgeBrowser  ();
	  getURL("JRI_CreateAccount_URL");
	
	  sendKeysByAnyLocator(loc.jri_CreateAccount_Name, "Name");
	  sendKeysByAnyLocator(loc.jri_CreateAccount_Mobile, "Mobile");
	  sendKeysByAnyLocator(loc.jri_CreateAccount_Email, "Email");
	  sendKeysByAnyLocator(loc.jri_CreateAccount_Password, "Password");
	  clickByAnyLocator(loc.jri_CreateAccount_TermsCheckbox);
	  clickByAnyLocator(loc.jri_CreateAccount_SubmitButton);
	  takeScreenshot("JRI_AccountCreate");
  }
}
