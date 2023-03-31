package com.testscenarios;

import java.io.IOException;

import org.testng.annotations.Test;

import com.utilities.ReusableFunction;

public class FaceBookHighlight extends ReusableFunction {
  @Test
  public void f() throws Exception {
	  openEdgeBrowser();
	  getURL("FaceBook_Login_URL");
	  sendKeysByAnyLocator(loc.FaceBook_Email_Editbox, "Email");
	  sendKeysByAnyLocator(loc.FaceBook_Password_Editbox, "Password");
	  clickByAnyLocator(loc.FaceBook_Login_button);
  }
}
