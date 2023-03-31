package com.objectrepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators {
	 public final By JREsignin_Email_EditBox = By.id("txtUserName");
	 public	final By JREsignin_Password_EditBox = By.id("txtPasswd");
	 public	final By JREsignin_Signinbutton =By.name("imgbtnSignin");


// Open Cart
//public final  By OpenCart_iphonebutton = By.partialLinkText("iPhone");
public final  By OpenCart_Addtocartbutton = By.xpath("(//*[text()='Add to Cart'])[2]");

public final By OpenCart_ShoppingCart = By.partialLinkText("Shopping Cart");
//public final  By OpenCart_Checkouttbutton = By.xpath("//*[@id=\"top-links\"]/ul/li[5]/a/span");
//public final By OpenCart_Checkouttbutton = By.partialLinkText("Checkout");
public final By OpenCart_Checkouttbutton = By.xpath("//span[contains(text(),'Checkout')]");

//MegaBus
//public final By MegaBus_signupbutton = By.partialLinkText("Forgotten password?Sign up");
//public final By MegaBus_signupbutton = By.xpath("(//*[text()=' Sign up ']) [1]");
public final By MegaBus_signupbutton = By.cssSelector("[data-gtm-id='account-management-sign-up']");
public final By MegaBus_Email_EditBox = By.id("email");
public final By MegaBus_ConfirmEmail_EditBox = By.id("confirmEmail");
public final By MegaBus_Password_EditBox = By.id("choosePassword");
public final By MegaBus_ConfirmPassword_EditBox = By.id("confirmPassword");
public final By MegaBus_checkboxes= By.xpath("(//input[@type='checkbox']) [2]");
public final By MegaBus_signup_submitbutton= By.cssSelector("[data-gtm-id ='account-management-sign-up-submit']");

//OrangeHrm
public final By Orange_userName_EditBox = By.name("username");
public final By Orange_password_EditBox = By.name("password");
public final By Orange_Login_button =By.xpath("//button[contains(@type,'submit')]");

//Tripati balaji
public final By triputibalaji_DateofBirth_clickbutton = By.id("regdob");
public final By triputibalaji_Yeardropdown=By.xpath("(//select[@class='datepick-month-year'])[2]");
public final By triputibalaji_Monthdropdown=(By.xpath("(//select[@class='datepick-month-year'])[1]"));
public final By triputibalaji_DateofbirthselectkBox=(By.xpath("//a[@title='Select Friday, May 4, 1984']"));






		


}
