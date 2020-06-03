package com.evonsys.citi.util.pageObject;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.Status;
import com.evonsys.citi.base.Base;
import com.evonsys.citi.util.browserConfiguration.config.ObjectReader;
import com.evonsys.citi.util.logger.LoggerUtil;
import com.evonsys.citi.util.wait.WaitUtil;

/*public class HCM_ServiceRequestPage extends Base{
	private WebDriver driver;
	private final static Logger log = LoggerUtil.getLogger(HCM_ServiceRequestPage.class);
	public HCM_ServiceRequestPage(WebDriver driver) {
		Base.driver = driver;
	PageFactory.initElements(driver, this);
	}*/
	
	public class HCM_ServiceRequestPage extends Base {

		private WebDriver driver;
		private final static Logger log = LoggerUtil.getLogger(HCM_ServiceRequestPage.class);
		WaitUtil wait;

		public HCM_ServiceRequestPage(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
			wait = new WaitUtil(driver);
			new Base().getNaviationScreen(driver);
			wait.pageLoadTime(ObjectReader.reader.getPageLoadTime(), TimeUnit.SECONDS);
			log.info("Welcome to Service Request Page");
			test.log(Status.INFO, "Welcome to Login Page");

		}

	
	@FindBy(xpath="//span[contains(text(),'Service Request')]")	
	private WebElement Srvce_Req;
	
	public WebElement getSrvce_Req() {
		return Srvce_Req;
	}
	public void setSrvce_Req(WebElement srvce_Req) {
		Srvce_Req = srvce_Req;
	}
	
		
	@FindBy(xpath="//button[starts-with(@name,'ServiceRequestHeader')]")
	private WebElement Crt_Srvce_Req;
	public WebElement getCrt_Srvce_Req() {
		return Crt_Srvce_Req;
	}
	public void setCrt_Srvce_Req(WebElement crt_Srvce_Req) {
		Crt_Srvce_Req = crt_Srvce_Req;
	}
	
	
	@FindBy(xpath="//iframe[@name='PegaGadget1Ifr']")
	private WebElement frameCurrentServicePage;
	public WebElement getFrameCurrentServicePage() {
		return frameCurrentServicePage;
	}
	public void setFrameCurrentServicePage(WebElement frameCurrentServicePage) {
		this.frameCurrentServicePage = frameCurrentServicePage;
	}
		
	//@FindBy(xpath="//select[starts-with(@ data-change,'[['postValue",[':event']]]')]")
	
	@FindBy(xpath="//select[starts-with(@name,'$PpyWorkPage$pDepartment')]") //******starts-with	
	private WebElement deptDrpdwn;
	public WebElement getDeptDrpdwn() {
		return deptDrpdwn;
	}
	public void setDeptDrpdwn(WebElement deptDrpdwn) {
		this.deptDrpdwn = deptDrpdwn;
	}
	
	@FindBy(xpath="//div[@id='PegaWebGadget2']/child::iframe")  //*******************child
	private WebElement frameForm;
	public WebElement getFrameForm() {
		return frameForm;
	}
	public void setFrameForm(WebElement frameForm) {
		this.frameForm = frameForm;
	}
	
	@FindBy(xpath="//input[@class='autocomplete_input ac_']")
	private WebElement txtBox;
	public WebElement getTxtBox() {
		return txtBox;
	}
	public void setTxtBox(WebElement txtBox) {
		this.txtBox = txtBox;
	}
	@FindBy(xpath="//ul[@class='pz-po-c-ul']")
	private WebElement suggetionBox;
	public WebElement getSuggetionBox() {
		return suggetionBox;
	}
	public void setSuggetionBox(WebElement suggetionBox) {
		this.suggetionBox = suggetionBox;
	}
	@FindBy(xpath = "//td[contains(@class,'autocompleteAGleft')]")//"//td[@class='grid-category-cell-value']")
	private List<WebElement> sugBxs;
	
	
	public List<WebElement> getSugBxs() {
		return sugBxs;
	}
	public void setSugBxs(List<WebElement> sugBxs) {
		this.sugBxs = sugBxs;
	}


	@FindBy(xpath ="//div[@class='oflowDivM']")// "//td[@class='grid-category-cell-value']")
	private List<WebElement> sugs;

	public List<WebElement> getSugs() {
		return sugs;
	}
	public void setSugs(List<WebElement> sugs) {
		this.sugs = sugs;
	}
	
	
	
	
	@FindBy(xpath = "//select[@id='e88885bc']")
	private WebElement drpDwn;

	public WebElement getDrpDwn() {
		return drpDwn;
	}
	public void setDrpDwn(WebElement drpDwn) {
		this.drpDwn = drpDwn;
	}
	
	
	
	}	
	

