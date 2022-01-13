package com.facebook;
import static com.resonance.utility.Keyword.*;

import java.time.Duration;

import org.testng.annotations.Test;

import com.resonance.config.BaseFramework;
import com.resonance.constants.LocatorType;
import com.resonance.utility.Keyword;

public class Facebook extends BaseFramework  {
	@Test
	public  void verifySignUp()  {
		// Keyword.openBrowser("chrome");
		//launchUrl("https://www.facebook.com");
		click("css", "a[data-testid='open-registration-form-button']");
	    waitFor(3000);
	   
		enterText(LocatorType.css, "input[name='firstname']", "Pooja");
		enterText(LocatorType.css, "input[name='lastname']", "Chabukswar");
		enterText(LocatorType.css, "input[name='reg_email__']", "pooja123@gmail.com");
        enterText(LocatorType.css, "input[name='reg_email_confirmation__']", "pooja123@gmail.com");
        enterText(LocatorType.css, "input#password_step_input", "54321");
        
        
        
        
	}

}
