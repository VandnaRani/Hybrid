package com.objectrepository;

import org.openqa.selenium.By;

public class Locators {
	 public final By JREsignin_Email_EditBox = By.id("txtUserName");
	 public	final By JREsignin_Password_EditBox = By.id("txtPasswd");
	 public	final By JREsignin_Captcha_EditBox = By.id("txtCaptcha");
	 public	final By JREsignin_signin_EditBox =By.name("imgbtnSignin");


// Open Cart
//public final  By OpenCart_iphonebutton = By.partialLinkText("iPhone");
public final  By OpenCart_Addtocartbutton = By.xpath ("(//button[@data-original-title='Add to Wish List'])[2]");

public final By OpenCart_ShoppingCart = By.partialLinkText("Shopping Cart");
//public final  By OpenCart_Checkouttbutton = By.xpath("//*[@id=\"top-links\"]/ul/li[5]/a/span");
public final By OpenCart_Checkouttbutton = By.partialLinkText("Checkout");

}
//(//button[contains(@onclick,'cart.add')]) [2]
