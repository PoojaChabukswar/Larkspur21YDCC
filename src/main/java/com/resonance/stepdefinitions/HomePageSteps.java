package com.resonance.stepdefinitions;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.resonance.pages.HomePage;
import com.resonance.pages.JoinMeetingPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageSteps {
@When("User click on Join Meeting from homepage")
	   public void clickOnJoinMeeting() {
		HomePage home=new HomePage();
		home.clickOnJoinMeeting();

	}

@Then("Verify that user redirects on Quick Join Meeting page")
public void verify_that_user_redirects_on_quick_join_meeting_page() {
	JoinMeetingPage joinmeeting=new JoinMeetingPage();
	String actual=joinmeeting.getPageHeading();
	Assert.assertEquals(actual, "Quick Join a Meeting");
	}

@Then("Verify title of ijmeet home page is {string}")
public void verifyTitle(String expectedTitle) {
	HomePage home=new HomePage();
	String title=home.getTitle();
	Assert.assertEquals(title, expectedTitle);

}

}




