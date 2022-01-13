package com.facebook;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import com.resonance.constants.Locator;
import com.resonance.utility.PropUtil;

import static com.resonance.utility.Keyword.*;

public class Travel {
	private static final Logger LOG = Logger.getLogger(Travel.class);
	@Test
	private void verifyPickupPoint() {

		openBrowser("chrome");
		launchUrl("https://www.flipkart.com/");
		click(Locator.homeScreen_closePopupBtn);
		
		//PropUtil prop=new PropUtil();
		//click(prop.getLocator("homeScreen.TravelLink")[0],prop.getLocator("homeScreen.TravelLink")[1]);
		click(Locator.homeScreen_TravelLink);
		waitFor(5000);
		
		click(Locator.homeScreen_FromCity);
		waitFor(2000);
		LOG.info("Click on from city dropdown");
		click(Locator.homeScreen_DestCity);
		waitFor(3000);

	}

}
