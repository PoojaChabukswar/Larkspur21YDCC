package com.resonance.config;

import static com.resonance.utility.Keyword.*;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.cucumber.java.After;
import io.cucumber.java.Before;



public class BaseFramework {
	public static RemoteWebDriver driver;
	//@BeforeMethod
	@Before
	public void setUp() {
		this.driver=openBrowser("Chrome");
		//launchUrl("https://www.facebook.com");
		Config conf=new Config();
		launchUrl(conf.getAppUrl());
	}
	
	//@AfterMethod
	@After
	public void tearDown() {
	 driver.quit();

	}

}
