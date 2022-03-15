package com.resonance.homepage;
import org.testng.annotations.Test;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.resonance.config.BaseFramework;
import com.resonance.pages.HomePage;
import com.resonance.pages.JoinMeetingPage;
import com.resonance.utility.Keyword;

public class HomePageTests  {
	@Test
	public void verifyClickOnjoinMeeting() {
		//HomePage home=PageFactory.initElements(driver, HomePage.class);
		HomePage home=new HomePage();
		home.clickOnJoinMeeting();
		Keyword.waitFor(3000);
		//JoinMeetingPage joinmeeting=PageFactory.initElements(driver,JoinMeetingPage.class);
		//String actual=joinmeeting.getPageHeading();
		
		
		//Assert.assertEquals(actual, "Quick Join a Meeting");
		
		
		
		
		
		

	}

}
