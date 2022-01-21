package com.resonance.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class JoinMeetingPage extends PageBase {
	public By quickJoinMeetingTxt=By.cssSelector("h2.m-txt");
	
	
	//@FindBy(css="h2.m-txt")
	//public WebElement quickJoinMeeting;
	/**
	 * This page return "Quick Join Meeting"if join meeting page loads successfully
	 */
	public String getPageHeading() {
	return driver.findElement(quickJoinMeetingTxt).getText();

	}

}
