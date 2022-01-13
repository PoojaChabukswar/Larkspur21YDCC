package com.resonance.config;

import static com.resonance.utility.Keyword.*;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;



public class BaseFramework {
	
	@BeforeMethod
	public void setUp() {
		openBrowser("Chrome");
		launchUrl("https://www.facebook.com");
	}
	
	@AfterMethod
	public void tearDown() {
	 driver.quit();

	}

}
