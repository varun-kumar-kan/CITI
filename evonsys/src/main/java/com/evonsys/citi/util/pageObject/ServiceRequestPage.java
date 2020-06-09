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

public class ServiceRequestPage extends Base {
	private WebDriver driver;
	private final Logger log = LoggerUtil.getLogger(HCM_HomePage.class);
	WaitUtil wait;
	
	public ServiceRequestPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WaitUtil(driver);
		wait.pageLoadTime(ObjectReader.reader.getPageLoadTime(), TimeUnit.SECONDS);
		new Base().getNaviationScreen(driver);
		log.info("Welcome to Service Request page");
		test.log(Status.INFO, "Welcome to ServiceRequest Page.");
	}
	
	@FindBy(xpath = "//button[@data-test-id='201908230944180890305201' and @type='button']")
	private WebElement btn_CreateServiceRequest;
	
	@FindBy(xpath = "//iframe[@id = 'PegaGadget5Ifr']")
	private WebElement iFrame;
	
	@FindBy(className="leftJustifyStyle")
	private WebElement txt_BriefDescription;
	
	
	@FindBy(xpath="//select[contains(@name,'DepartmentType')]")
	private WebElement drp_Department;
	
	@FindBy(xpath = "//input[contains(@class,'autocomplete_input')]")
	private WebElement  drp_Category;
	
	@FindBy(xpath="//select[contains(@name,'Impact')]")
	private WebElement drp_Impact;
	
	@FindBy(xpath="//button[@title='Cancel']")
	private WebElement btn_Cancel;
	
	@FindBy(xpath ="//iframe[contains(@class,'cke_wysiwyg_frame')]")
	private WebElement iframeExplanation;
	
	@FindBy(xpath = "//textarea[@data-test-id='201910251034520230203579']")
	//@FindBy(xpath = "//body[contains(@class,'cke_editable')]")
	private WebElement txt_Explanation;
	
	public WebElement getTxt_Explanation() {
		return txt_Explanation;
	}



	public void setTxt_Explanation(WebElement txt_Explanation) {
		this.txt_Explanation = txt_Explanation;
	}



	public WebElement getIframeExplanation() {
		return iframeExplanation;
	}



	public void setIframeExplanation(WebElement iframeExplanation) {
		this.iframeExplanation = iframeExplanation;
	}



	public WebElement getDrp_Department() {
		return drp_Department;
	}



	public void setDrp_Department(WebElement drp_Department) {
		this.drp_Department = drp_Department;
	}



	public WebElement getDrp_Category() {
		return drp_Category;
	}



	public void setDrp_Category(WebElement drp_Category) {
		this.drp_Category = drp_Category;
	}



	public WebElement getDrp_Impact() {
		return drp_Impact;
	}



	public void setDrp_Impact(WebElement drp_Impact) {
		this.drp_Impact = drp_Impact;
	}



	public WebElement getBtn_Cancel() {
		return btn_Cancel;
	}



	public void setBtn_Cancel(WebElement btn_Cancel) {
		this.btn_Cancel = btn_Cancel;
	}



	public WebElement getTxt_BriefDescription() {
		wait.waitForElement(txt_BriefDescription, 30);
		return txt_BriefDescription;
	}



	public void setTxt_BriefDescription(WebElement txt_BriefDescription) {
		this.txt_BriefDescription = txt_BriefDescription;
	}



	public WebElement getiFrame() {
		wait.waitTillFrameToBeAvailableAndSwitchTo(iFrame, 30);
		return iFrame;
	}



	public void setiFrame(WebElement iFrame) {
		this.iFrame = iFrame;
	}


	public WebElement getBtn_CreateServiceRequest() {
		wait.waitForElementClickable(btn_CreateServiceRequest, 30);
		return btn_CreateServiceRequest;
	}

	public void setBtn_CreateServiceRequest(WebElement btn_CreateServiceRequest) {
		this.btn_CreateServiceRequest = btn_CreateServiceRequest;
	}
	
	
}
