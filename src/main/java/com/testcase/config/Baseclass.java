package com.testcase.config;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.testcase.utility.Keyword;

public class Baseclass {
	
	@BeforeMethod
	public void setUp() {
		Keyword.openBrowser("chrome");
	}
	
/*	@AfterMethod
	public void tearDown() {
	Keyword.quitBrowser();

	}*/

}
