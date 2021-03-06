

package com.evonsys.citi.util.pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.Status;
import com.evonsys.citi.base.Base;
import com.evonsys.citi.util.browserConfiguration.config.ObjectReader;
import com.evonsys.citi.util.logger.LoggerUtil;
import com.evonsys.citi.util.wait.WaitUtil;

public class LoginPage {
	private WebDriver driver;
	private final Logger log = LoggerUtil.getLogger(LoginPage.class);
	WaitUtil waitHelper;
	
	//page objects
	@FindBy(xpath = "input[class='_2zrpKA _1dBPDZ']")
	WebElement signin;
	
	 @FindBy(how=How.ID,using="userName")                
	WebElement ele;
	
	//============ initialise page=====
	public LoginPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitUtil(driver);
		//wait.pageLoadTime(ObjectReader.reader.getPageLoadTime(), TimeUnit.SECONDS);
		//waitHelper.waitForElement(signin, ObjectReader.reader.getExplicitWait());
		new Base().getNaviationScreen(driver);
		log.info("Login Page Object created");
		Base.test.log(Status.INFO, "Lpgin Page Object created");
		
	}
	

}









































