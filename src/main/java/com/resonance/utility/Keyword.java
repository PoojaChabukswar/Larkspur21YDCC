package com.resonance.utility;

import java.time.Duration;

import org.apache.log4j.Logger;
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
    private static WebDriverWait wait;
    public static final Logger LOG=Logger.getLogger(Keyword.class);
	/**
	 * This keyword is used to launch specified browser.
	 * 
	 * @param browserName must be one of the following
	 *  <ul>
	 *  <li>Chrome</li>
	 *  <li>Firefox</li>
	 *  <li>Ie</li>
	 *  </ul>
	 * 
	 */

	public static RemoteWebDriver openBrowser(String browserName) {
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
			LOG.error("Invalid browser name:" + browserName);
		}
		LOG.info(browserName+" is launch successfully");
		wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		return driver;
	}
	
	public static void quitBrowser() {
		driver.quit();

	}
	
	public static void closeBrowser() {
		driver.close();

	}
    /**
     * This method will launch specified url in currently opened browser window
     * @param url
     */
	public  static void launchUrl(String url) {
		driver.get(url);

	}

	
	
	public  static void enterText(WebElement element,String texttoEnter) {
		element.sendKeys(texttoEnter);

	}
	
	
	
	
	/**
	 * This method will perform click operation on specified {@code WebElement}
	 * @param element on which you want to perform click
	 */
	public static void click(WebElement element) {
		element.click();

	}
	/**
	 * 
	 * @param duration is in milliseconds
	 */
	public static void waitFor(long duration) {
		try {
			Thread.sleep(duration);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	
	private static WebElement getWebElement(String locatorType,String locatorValue) {
		WebElement element=null;
		if(locatorType.equalsIgnoreCase("xpath")) {
			element=driver.findElement(By.xpath(locatorValue));
		}else if(locatorType.equalsIgnoreCase("css")) {
			element=driver.findElement(By.cssSelector(locatorValue));
		}else if(locatorType.equalsIgnoreCase("id")) {
			element=driver.findElement(By.id(locatorValue));
		}else if(locatorType.equalsIgnoreCase("class")) {
			element=driver.findElement(By.className(locatorValue));
		}else if(locatorType.equalsIgnoreCase("name")) {
			element=driver.findElement(By.name(locatorValue));
		}else if(locatorType.equalsIgnoreCase("tag")) {
			element=driver.findElement(By.tagName(locatorValue));
		}else
			LOG.error("Invalid locator type:"+locatorType);
		return element;

	}
	
	
	public static void enterText(String locatorType,String locatorValue,String textToEnter) {
		getWebElement(locatorType,locatorValue).sendKeys(textToEnter);

	}
	
	public static void enterText(String locator,String textToEnter) {
		String[] parts=locator.split("##");
		getWebElement(parts[0],parts[1]).sendKeys(textToEnter);

	}
	
	
	public static void click(String locatorType,String locatorValue) {
		getWebElement(locatorType,locatorValue).click();

	}
	
	public static void click(String locator) {
	String[] parts=locator.split("##");
	getWebElement(parts[0],parts[1]).click();
		
	}
	
	public static void click(By by) {
		driver.findElement(by).click();

	}
	
	
	
	
	
	
	
	
	
	
	
	
}