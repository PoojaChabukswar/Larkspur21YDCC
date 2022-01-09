package com.facebook;

import java.time.Duration;

import org.testng.annotations.Test;

import com.testcase.config.Baseclass;
import com.testcase.utility.Keyword;

public class Facebook extends Baseclass {
	@Test
	public  void verifySignUp() throws InterruptedException {
		// Keyword.openBrowser("chrome");
		Keyword.launchUrl("https://www.facebook.com");
		Keyword.click("css", "a[data-testid='open-registration-form-button']");
	    
	   
		Keyword.enterText("css", "input[name='firstname']", "Pooja");
		Keyword.enterText("css", "input[name='lastname']", "Chabukswar");
		Keyword.enterText("css", "input[name='reg_email__']", "pooja123@gmail.com");
        Keyword.enterText("css", "input[name='reg_email_confirmation__']", "pooja123@gmail.com");
        Keyword.enterText("css", "input#password_step_input", "54321");
        
        
        
        
	}

}
