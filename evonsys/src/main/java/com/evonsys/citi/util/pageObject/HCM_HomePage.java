package com.evonsys.citi.util.pageObject;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.Status;
import com.evonsys.citi.base.Base;
import com.evonsys.citi.util.browserConfiguration.config.ObjectReader;
import com.evonsys.citi.util.logger.LoggerUtil;
import com.evonsys.citi.util.wait.WaitUtil;

public class HCM_HomePage extends Base {
	private WebDriver driver;
	private final Logger log = LoggerUtil.getLogger(HCM_HomePage.class);
	WaitUtil wait;
	
	public HCM_HomePage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WaitUtil(driver);
		wait.pageLoadTime(ObjectReader.reader.getPageLoadTime(), TimeUnit.SECONDS);
		new Base().getNaviationScreen(driver);
		log.info("Welcome to Home Page");
		test.log(Status.INFO, "Welcome to Home Page.");
	}
	

	@FindBy(name = "pzStudioHeader_pyDisplayHarness_26")
	//@FindBy(xpath = "//*[@id='RULE_KEY']/div[1]/div[6]/span/a")
	//@FindBy(xpath = "//a[@data-test-id='20140927131516034349915']")
	//@FindBy(xpath = "//a[starts-with(@name,'pzStudioHeader_pyDisplayHarness_26')]")
	private WebElement icn_LaunchWebInterface;
	
	@FindBy(xpath="//span[contains(text(),'Employee')]")
	private WebElement lnk_Employee;
	



	public WebElement getLnk_Employee() {
		
		wait.waitForElementClickable(lnk_Employee, 990);
		return lnk_Employee;
	}



	public void setLnk_Employee(WebElement lnk_Employee) {
		this.lnk_Employee = lnk_Employee;
	}

	

	public WebElement getIcn_LaunchWebInterface() {	
		
		wait.waitForElementClickable(icn_LaunchWebInterface, 30);
		return icn_LaunchWebInterface;
	}
	
	
}
