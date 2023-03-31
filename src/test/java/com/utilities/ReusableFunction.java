package com.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.seleniumhq.jetty9.util.LazyList;

import com.objectrepository.Locators;

public class ReusableFunction {
	public WebDriver driver;
	public Locators loc = new Locators();
	public Properties p = new Properties();
	String propertyFilePath =".\\src\\test\\resources\\testdata\\QA.properties";
	
	//Create method and use the same in to some other classes
	
	public void openEdgeBrowser() {
		 System.setProperty("webdriver.edge.driver","C:\\Users\\uvoja\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.manage().window().maximize();
	}
		public void openChromeBrowser() {
			ChromeOptions options = new ChromeOptions();
			driver = new ChromeDriver (options);
			driver.manage().window().maximize();
			
		}
	
		public void openFirefoxBrowser() {
			driver = new FirefoxDriver ();
			driver.manage().window().maximize();
		}
		
		//Sendkeys using any locator
		public void sendKeysByAnyLocator(By locatorName, String inputdataVariable) throws Exception {
			FileInputStream fi = new FileInputStream(propertyFilePath);
			p.load(fi);
			
			
			WebElement element = driver.findElement(locatorName);
			// Check your locator is displayed?
			WebElement ele =driver.findElement(locatorName);
			if (driver.findElements(locatorName).size() > 0) {
				if (ele.isEnabled()) {
					ele.clear();
					ele.sendKeys(p.getProperty(inputdataVariable));
				}else {
					System.out.println(" The given Locator is not enabled,please check");
				}
			}else {
				System.out.println("The given Locator is on Screen,please check the locator");
			}
		}
			//Click on any Button /image/Hyperlink
			public  void clickByAnyLocator(By locatorName) {
				WebElement ele =driver.findElement(locatorName);
				if (driver.findElements(locatorName).size() > 0) {
				if (ele.isEnabled()) {
					ele.click();
				}else {
					System.out.println("The given locator is enabled ,please check");
					
				}
			}else {
				System.out.println("The given locator is not displayed on screen ,please check");
				
			}
			}
				//DropDown
				
				public void printAllDropdownValues(By locater) {
					WebElement element = driver.findElement(locater);

					if (driver.findElements(locater).size() > 0) {
						// isEnabled()
						if (element.isEnabled()) {
							Select dropdown = new Select(element);
							List<WebElement> dropdownValues = dropdown.getOptions();
							// Print the size of dropdown values
							System.out.println(dropdownValues.size());
							// Print the dropdown values
							for (int i = 0; i < dropdownValues.size(); i++) {
								System.out.println(dropdownValues.get(i).getText());
							}
						} else {
							System.out.println("The webelement is NOT Enabled, please check**************");
						}
					} else {
						System.out.println("The webelement is NOT displayed, please check**************");
					}

						
					}
				
				public void selectByValue(By locater, String value) {
					WebElement element = driver.findElement(locater);
					if (driver.findElements(locater).size() > 0) {
						// isEnabled()
						if (element.isEnabled()) {
							Select dropdown = new Select(element);
							dropdown.selectByValue(value);
						} else {
							System.out.println("The webelement is NOT Enabled, please check**************");
						}
					} else {
						System.out.println("The webelement is NOT displayed, please check**************");
					}

				}
		

				public void selectByIndex(By locater, int index) {
					WebElement element = driver.findElement(locater);
					if (driver.findElements(locater).size() > 0) {
						if (element.isEnabled()) {
							Select dropdown = new Select(element);
							dropdown.selectByIndex(index);
						} else {
							System.out.println("The webelement is NOT Enabled, please check**************");
						}
					} else {
						System.out.println("The webelement is NOT displayed, please check**************");
					}

				}
				public void selectByVisibleText(By locater, String visibleText) throws IOException {
//					fi = new FileInputStream(propertyFilePath);
//					p.load(fi);
					
					WebElement element = driver.findElement(locater);
					if (driver.findElements(locater).size() > 0) {
						if (element.isEnabled()) {
							Select dropdown = new Select(element);
							dropdown.selectByVisibleText(visibleText);
						} else {
							System.out.println("The webelement is NOT Enabled, please check**************");
						}
					} else {
						System.out.println("The webelement is NOT displayed, please check**************");
					}

				}

				}

				
				
			
			
