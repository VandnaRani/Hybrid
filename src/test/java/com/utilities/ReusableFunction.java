package com.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
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

		
		public void getURL(String URL) throws IOException {
			FileInputStream fi = new FileInputStream(propertyFilePath);
			p.load(fi);
			driver.get(p.getProperty(URL));
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
					highlightElement(ele);
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
			public void highlightElement(WebElement element) throws InterruptedException {
				try {
					JavascriptExecutor executor = (JavascriptExecutor) driver;
					for (int i = 0; i < 1; i++) {
						executor.executeScript("arguments[0].style.border='7px groove green'", element);
						Thread.sleep(200);
						executor.executeScript("arguments[0].style.border='7px groove green'", element);
					}
				} catch (Exception e) {
					System.out.println("Exception - " + e.getMessage());
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

				/*********** timestamp **********/
				public String timestamp() {
					Date d = new Date();
					DateFormat df = new SimpleDateFormat("ddMMMyyy_HHmmss");
					String timeTamp = df.format(d);
					return timeTamp;
				}
				
				/*****
				 * takescreenshot
				 * 
				 * @throws Exception
				 ************/
				public void takeScreenshot(String name) throws Exception {
					File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
					String screenshotPath = ".\\Screenshots\\";
					FileHandler.copy(scrFile, new File(screenshotPath + name + timestamp() + ".PNG"));
					System.out.println("Screenshot taken*** ");
				}

				

public void moveToOnElement(By locator) {
	try {
		WebElement element = driver.findElement(locator);
		Actions actions = new Actions(driver);
		actions.moveToElement(element);
		actions.click().build().perform();
	} catch (Exception e) {
		System.out.println("Error in description: " + e.getStackTrace());
	}

}
public void mouseHoverClickandHold(By locator) {
	try {
		WebElement element = driver.findElement(locator);
		Actions actions = new Actions(driver);
		actions.clickAndHold(element);
		actions.click().build().perform();
	} catch (Exception e) {
		System.out.println("Error in description: " + e.getStackTrace());
	}
}
	public void doubleClick(By locator) {
		try {
			WebElement element = driver.findElement(locator);
			Actions actions = new Actions(driver);
			actions.doubleClick(element);
			actions.click().build().perform();

		} catch (Exception e) {
			System.out.println("Error in description: " + e.getStackTrace());
		}

	}

	public void dragandDrop(By sourceelementLocator, By destinationelementLocator) {
		try {
			WebElement sourceElement = driver.findElement(sourceelementLocator);
			WebElement destinationElement = driver.findElement(destinationelementLocator);

			if (driver.findElements(sourceelementLocator).size() > 0 && driver.findElements(destinationelementLocator).size() > 0) {
				Actions action = new Actions(driver);
				action.dragAndDrop(sourceElement, destinationElement).build().perform();
			} else {
				System.out.println("Element(s) was not displayed to drag / drop");
			}
		} catch (StaleElementReferenceException e) {
			System.out.println("Element with " + sourceelementLocator + "or" + destinationelementLocator
					+ "is not attached to the page document " + e.getStackTrace());
		} catch (NoSuchElementException e) {
			System.out.println("Element " + sourceelementLocator + "or" + destinationelementLocator
					+ " was not found in DOM " + e.getStackTrace());
		} catch (Exception e) {
			System.out.println("Error occurred while performing drag and drop operation " + e.getStackTrace());
		}
	}

	// Reading ToolTip text
	public String tooltipText(By locator) {
		WebElement element = driver.findElement(locator);
		String tooltip = element.getAttribute("title");
		return tooltip;
	}

	// Press Enter/Return Key in Selenium
	public void pressEnter(By locator) {
		WebElement element = driver.findElement(locator);
		element.sendKeys(Keys.RETURN);
	}

	// Code snippet for Keyboard Actions
	public void typeTextInCAPS(By locator, String TextToBePrint) {
		WebElement textBoxElement = driver.findElement(locator);
		Actions builder = new Actions(driver);
		Action typeInCAPS = builder.keyDown(textBoxElement, Keys.SHIFT).sendKeys(textBoxElement, TextToBePrint)
				.keyUp(textBoxElement, Keys.SHIFT).build();
		typeInCAPS.perform();
	}


	public void waitForElementToBeClickable(By locator, int waitTime) {
		WebElement element = driver.findElement(locator);
		try {
			new WebDriverWait(driver, Duration.ofSeconds(waitTime)).ignoring(StaleElementReferenceException.class)
					.until(ExpectedConditions.elementToBeClickable(element));
			System.out.println("element To Be lickable***");
		} catch (Exception Ex) {
			System.out.println(Ex);
			System.out.println("element To Be not Clickable***");
		}
	}

	public void waitForElementToBeClickable(int waitTime) {
		try {
			new WebDriverWait(driver, Duration.ofSeconds(waitTime)).ignoring(StaleElementReferenceException.class)
					.until(ExpectedConditions.alertIsPresent());
			System.out.println("alert Is Present***");
		} catch (Exception Ex) {
			System.out.println(Ex);
			System.out.println("alert Is not Present****");
		}
	}

	/***
	 * instead of fluent wait use customized While loop statement**@throws Exception
	 *****/

	public void waitforElement(By locater) throws Exception {
		int i = 0;
		while (driver.findElements(locater).size() < 1) {
			Thread.sleep(500);
			System.out.println("Wait for the element***************");
			// Suppose system has not present the element it will repeat 30 time
			// then stop
			// the execution using break
			if (i > 30) {
				System.out.println("Element is not present");
				break;
			}
			
		}
			}
		//Right Click on Webelement
		public void mouseHoverContextClick(By locator) {
			try {
				WebElement element = driver.findElement(locator);
				Actions actions = new Actions(driver);
				actions.contextClick(element);
				actions.click().build().perform();

			} catch (Exception e) {
				System.out.println("Error in description: " + e.getStackTrace());
			}
	}
	

	
	


}			
		

