package com.resonance.constants;

public interface Locator {
	
	public String homeScreen_closePopupBtn="XPATH##//button[contains(text(),'✕')]";
    String  homeScreen_TravelLink="XPATH##//div[contains(text(),'Travel')]";
    String  homeScreen_FromCity="XPATH##//label[contains(text(),'From')]/parent::div";
    String homeScreen_DestCity="XPATH##//label[contains(text(),'From')]/parent::div/following-sibling::div/descendant::div[contains(text(),'BOM')]";
    
    
}
