/**
 * Designed By : Varun
 * Class Name : HCM_UatLoginPage
 * Usage : Maintains Login Page elements
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

public class HCM_UatLoginPage extends Base {

	private WebDriver driver;
	private final static Logger log = LoggerUtil.getLogger(HCM_UatLoginPage.class);
	WaitUtil wait;

	public HCM_UatLoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WaitUtil(driver);
		new Base().getNaviationScreen(driver);
		wait.pageLoadTime(ObjectReader.reader.getPageLoadTime(), TimeUnit.SECONDS);
		log.info("Welcome to Login Page");
		test.log(Status.INFO, "Welcome to Login Page");

	}

	@FindBy(id = "txtUserID")
	private WebElement txt_Username;

	@FindBy(id = "txtPassword")
	private WebElement txt_Pwd;

	@FindBy(id = "sub")
	private WebElement btn_Submit;
	
	@FindBy(xpath="//span[contains(text(),'Service Request')]")	
	private WebElement Srvce_Req;
	

	public void setTxt_Username(WebElement txt_Username) {
		this.txt_Username = txt_Username;
	}

	public void setTxt_Pwd(WebElement txt_Pwd) {
		this.txt_Pwd = txt_Pwd;
	}

	public void setBtn_Submit(WebElement btn_Submit) {
		this.btn_Submit = btn_Submit;
	}
	
	public void setSrvce_Req(WebElement srvce_Req) {
		Srvce_Req = srvce_Req;
	}

	public WebElement getTxt_Username() {
		return txt_Username;
	}

	public WebElement getTxt_Pwd() {
		return txt_Pwd;
	}

	public WebElement getBtn_Submit() {
		return btn_Submit;
	}
	
	
	public WebElement getSrvce_Req() {
		return Srvce_Req;
	}
	
	

}
