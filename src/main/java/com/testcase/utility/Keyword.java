package com.testcase.utility;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Keyword {
	public static RemoteWebDriver driver;

	/**
	 * This keyword is used to launch specified browser.
	 * 
	 * @param browserName must be one of the following
	 *  <ul>
	 *  <li>chrome</li>
	 *  <li>firefox</li>
	 *  <li>ie</li>
	 *  </ul>
	 * 
	 */

	public static void openBrowser(String browserName) {
		if (browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("ie")) {
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		} else {
			System.out.println("Invalid browser:" + browserName);
		}
	}
	
	public static void quitBrowser() {
		driver.quit();

	}
	
	public static void closeBrowser() {
		driver.close();

	}

	public  static void launchUrl(String url) {
		driver.get(url);

	}

	
	
	public  static void enterText(WebElement element,String texttoEnter) {
		element.sendKeys(texttoEnter);

	}
	
	public static void enterText(String locatorType,String locatorValue,String textToEnter) {
		getWebElement(locatorType,locatorValue).sendKeys(textToEnter);

	}
	
	public static void click(String locatorType,String locatorValue) {
		getWebElement(locatorType,locatorValue).click();

	}
	
	public static void click(WebElement element) {
		element.click();

	}
	
	
	public static WebElement getWebElement(String locatorType,String locatorValue) {
		WebElement element=null;
		if(locatorType.equalsIgnoreCase("xpath")) {
			element=driver.findElement(By.xpath(locatorValue));
		} if(locatorType.equalsIgnoreCase("css")) {
			element=driver.findElement(By.cssSelector(locatorValue));
		}if(locatorType.equalsIgnoreCase("id")) {
			element=driver.findElement(By.id(locatorValue));
		}if(locatorType.equalsIgnoreCase("class")) {
			element=driver.findElement(By.className(locatorValue));
		}if(locatorType.equalsIgnoreCase("name")) {
			element=driver.findElement(By.name(locatorValue));
		}if(locatorType.equalsIgnoreCase("tag")) {
			element=driver.findElement(By.tagName(locatorValue));
		}
		return element;

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}