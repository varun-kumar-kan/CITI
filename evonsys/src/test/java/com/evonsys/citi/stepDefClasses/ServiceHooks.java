package com.evonsys.citi.stepDefClasses;

import org.openqa.selenium.remote.BrowserType;

import com.evonsys.citi.base.BaseCucumber;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class ServiceHooks {
	
	BaseCucumber base;
	
	@Before
	public void initializeTest(){
		base = new BaseCucumber();
		base.setBrowser(BrowserType.CHROME);
		base.getApplicationUrl();
		
	}

	@After
	public void endTest(){
		BaseCucumber.driver.quit();
	}
}
