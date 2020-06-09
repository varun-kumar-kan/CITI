/**
 * Designed By : Varun
 * Class Name : EmployeePage
 * Usage : Maintains Employee Page elements
 */
package com.evonsys.citi.util.pageObject;

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

public class EmployeePage extends Base {
	private WebDriver driver;
	private final Logger log = LoggerUtil.getLogger(HCM_HomePage.class);
	WaitUtil wait;
	
	public EmployeePage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WaitUtil(driver);
		wait.pageLoadTime(ObjectReader.reader.getPageLoadTime(), TimeUnit.SECONDS);
		new Base().getNaviationScreen(driver);
		log.info("Welcome to Employee Page...");
		test.log(Status.INFO, "Welcome to Employee Page....");
	}
	
	@FindBy(xpath = "//span[contains(text(),'My Profile')]")
	private WebElement lnk_MyProfile;
	
	@FindBy(xpath = "//span[contains(text(),'TimeSheet')]")
	private WebElement lnk_TimeSheet;
	
	@FindBy(xpath = "//span[contains(text(),'TimeOff')]")
	private WebElement lnk_TimeOff;
	
	@FindBy(xpath="//span[contains(text(),'Expense')]")
	private WebElement lnk_Expense;
	
	@FindBy(xpath="//span[contains(text(),'Performance Appraisal')]")
	private WebElement lnk_PerformanceAppraisal;
	
	@FindBy(xpath = "//span[contains(text(),'Service Request')]")
	private WebElement lnk_ServiceRequest;
	
	@FindBy(xpath = "//span[contains(text(),'Policies')]")
	private WebElement lnk_Policies;
	
	@FindBy(xpath = "//span[contains(text(),'Documents')]")
	private WebElement lnk_Documents;
	
	@FindBy(xpath = "//span[contains(text(),'Pulse')]")
	private WebElement lnk_Pulse;
	
	@FindBy(xpath = "//span[contains(text(),'Cases')]")
	private WebElement lnk_Cases;
	



	public WebElement getLnk_Documents() {
		wait.waitForElementClickable(lnk_Documents, 60);
		wait.waitForElement(lnk_Documents, 30);
		return lnk_Documents;
	}



	public void setLnk_Documents(WebElement lnk_Documents) {
		this.lnk_Documents = lnk_Documents;
	}



	public WebElement getLnk_Pulse() {
		wait.waitForElementClickable(lnk_Pulse, 60);
		wait.waitForElement(lnk_Pulse, 30);
		return lnk_Pulse;
	}



	public void setLnk_Pulse(WebElement lnk_Pulse) {
		this.lnk_Pulse = lnk_Pulse;
	}



	public WebElement getLnk_Cases() {
		wait.waitForElementClickable(lnk_Cases, 60);
		wait.waitForElement(lnk_Cases, 30);
		return lnk_Cases;
	}



	public void setLnk_Cases(WebElement lnk_Cases) {
		this.lnk_Cases = lnk_Cases;
	}



	public WebElement getLnk_Policies() {
		return lnk_Policies;
	}



	public void setLnk_Policies(WebElement lnk_Policies) {
		this.lnk_Policies = lnk_Policies;
	}



	public WebElement getLnk_ServiceRequest() {
		return lnk_ServiceRequest;
	}



	public void setLnk_ServiceRequest(WebElement lnk_ServiceRequest) {
		this.lnk_ServiceRequest = lnk_ServiceRequest;
	}



	public WebElement getLnk_PerformanceAppraisal() {
		wait.waitForElementClickable(lnk_PerformanceAppraisal, 60);
		wait.waitForElement(lnk_PerformanceAppraisal, 30);
		return lnk_PerformanceAppraisal;
	}



	public void setLnk_PerformanceAppraisal(WebElement lnk_PerformanceAppraisal) {
		this.lnk_PerformanceAppraisal = lnk_PerformanceAppraisal;
	}



	public WebElement getLnk_Expense() {
		wait.waitForElementClickable(lnk_Expense, 60);
		wait.waitForElement(lnk_Expense, 30);
		return lnk_Expense;
	}



	public void setLnk_Expense(WebElement lnk_Expense) {
		this.lnk_Expense = lnk_Expense;
	}



	public WebElement getLnk_TimeOff() {
		wait.waitForElementClickable(lnk_TimeOff, 60);
		wait.waitForElement(lnk_TimeOff, 30);
		return lnk_TimeOff;
	}



	public void setLnk_TimeOff(WebElement lnk_TimeOff) {
		this.lnk_TimeOff = lnk_TimeOff;
	}



	public WebElement getLnk_TimeSheet() {
		wait.waitForElementClickable(lnk_TimeSheet, 60);
		wait.waitForElement(lnk_TimeSheet, 30);
		return lnk_TimeSheet;
	}



	public void setLnk_TimeSheet(WebElement lnk_TimeSheet) {
		this.lnk_TimeSheet = lnk_TimeSheet;
	}



	public WebElement getLnk_MyProfile() {
		wait.waitForElementClickable(lnk_MyProfile, 60);
		wait.waitForElement(lnk_MyProfile, 30);
		return lnk_MyProfile;
	}



	public void setLnk_MyProfile(WebElement lnk_MyProfile) {
		this.lnk_MyProfile = lnk_MyProfile;
	}

}
