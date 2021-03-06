package com.resonance.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends PageBase {
	private static final Logger LOG = Logger.getLogger(HomePage.class);
	
	@FindBy(css="a[href^='https://ijmeet.com/app']")
	public  WebElement joinMeeting;
	
	@FindBy(css="span.mvlogo-size-app1 img[alt='ijmeetimage']")
	public WebElement logo;
	
	
	public WebElement signUp;
	
	public void clickOnJoinMeeting() {
		joinMeeting.click();
        LOG.info("click on join meeting link ");
	}
	
	public HomePage() {
		PageFactory.initElements(driver,this);
	}
	
	
	public void clickonLogo() {
		logo.click();
        LOG.info("click on logo");
	}

	public String getTitle() {
		return driver.getTitle();
	}

	

}
