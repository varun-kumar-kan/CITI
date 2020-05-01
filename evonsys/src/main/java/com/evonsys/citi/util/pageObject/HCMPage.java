package com.evonsys.citi.util.pageObject;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.evonsys.citi.base.Base;
import com.evonsys.citi.util.browserConfiguration.config.ObjectReader;
import com.evonsys.citi.util.logger.LoggerUtil;
import com.evonsys.citi.util.wait.WaitUtil;

public class HCMPage extends Base {
	private WebDriver driver;
	private final static Logger log = LoggerUtil.getLogger(HCMPage.class);
	WaitUtil wait;
	

	
	public HCMPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WaitUtil(driver);
		new Base().getNaviationScreen(driver);
		wait.pageLoadTime(ObjectReader.reader.getPageLoadTime(), TimeUnit.SECONDS);
		log.info("Welcome to Login Page");
		test.log(Status.INFO, "Welcome to Login Page");	
		
	}
	
	
	@FindBy(id = "txtUserID")
	//@FindBy(xpath = "//input[@id='txtUserID']")
	private WebElement txt_VarunUserName;
	
	@FindBy(id="txtPassword")
	//@FindBy(xpath = "//input[@id='txtPassword']")
	private WebElement txt_VarunPassword;
	
	@FindBy(id="sub")
	//@FindBy(xpath = "//button[@id='sub']")
	private WebElement btn_Submit;
	
	public WebElement getBtn_Submit() throws IOException {
		/*log.info("I Clicked on "+btn_Submit.getText()+" button");
		test.pass("I clicked on "+btn_Submit.getText()+" button").addScreenCaptureFromPath("./screenshots");
		test.log(Status.PASS, "I clicked on Submit button").addScreenCaptureFromPath("./screenshots");
	*/	wait.waitForElementClickable(btn_Submit, 60);
		wait.pageLoadTime(ObjectReader.reader.getPageLoadTime(), TimeUnit.SECONDS);
		return btn_Submit;
	}

	public WebElement getTxt_Password() {
		/*log.info("I entered password "+txt_VarunPassword.getAttribute("value")+" in password field");
		test.log(Status.PASS, "I entered password "+txt_VarunPassword.getAttribute("value")+" in password field");
	*/	wait.waitForElement(txt_VarunPassword, 60);
		return txt_VarunPassword;
	}

	public void setTxt_Password(WebElement txt_VarunPassword) {
		this.txt_VarunPassword = txt_VarunPassword;
	}

	public WebElement getTxt_UserName() {
		/*log.info("I entered username "+txt_VarunUserName+" in username field");
		test.log(Status.PASS, "I entered username "+txt_VarunUserName+" in username field");	
	*/	wait.waitForElement(txt_VarunUserName, 60);
		return txt_VarunUserName;
	}

	

	

}
