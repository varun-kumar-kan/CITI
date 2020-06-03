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

public class HCM_ExpensePage extends Base {
	private WebDriver driver;
	private final Logger log = LoggerUtil.getLogger(HCM_ExpensePage.class);
	WaitUtil wait;
	
	public HCM_ExpensePage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WaitUtil(driver);
		wait.pageLoadTime(ObjectReader.reader.getPageLoadTime(), TimeUnit.SECONDS);
		new Base().getNaviationScreen(driver);
		log.info("Welcome to HCM_ExpensePage Page...");
		test.log(Status.INFO, "Welcome to HCM_ExpensePage Page....");
	}
	
	@FindBy(xpath="//span[contains(text(),'Expense')]")
	private WebElement expenseTab;
	
	@FindBy(xpath="//button[contains(text(),'Create Expense')]")
	private WebElement btnCreate;
	
	@FindBy(name = "$PpyWorkPage$pBusinessReason")
	private WebElement txtBusinessReason;
	
	@FindBy(xpath="//select[@name='$PpyWorkPage$pExpenseItemList$l1$pExpenseCategory']")
	private WebElement drpCategory;
	
	@FindBy(xpath="//input[contains(@name,'pReceiptAmount')]")
	private WebElement txtRecAmt;
	
	@FindBy(xpath="//select[contains(@name,'Currency')]")
	private WebElement drpCurrency;
	
	@FindBy(linkText = "Attach Receipt")
	private WebElement lnkAttachReceipt;
	
	@FindBy(id="Browsefiles")
	private WebElement btnSelectReceipt;
	
	
	public WebElement getBtnSelectReceipt() {
		return btnSelectReceipt;
	}

	public void setBtnSelectReceipt(WebElement btnSelectReceipt) {
		this.btnSelectReceipt = btnSelectReceipt;
	}

	public WebElement getDrpCategory() {
		return drpCategory;
	}

	public void setDrpCategory(WebElement drpCategory) {
		this.drpCategory = drpCategory;
	}

	public WebElement getBtnCreate() {
		return btnCreate;
	}

	public void setBtnCreate(WebElement btnCreate) {
		this.btnCreate = btnCreate;
	}

	public WebElement getTxtBusinessReason() {
		return txtBusinessReason;
	}

	public void setTxtBusinessReason(WebElement txtBusinessReason) {
		this.txtBusinessReason = txtBusinessReason;
	}

	public WebElement getTxtDate() {
		return txtDate;
	}

	public void setTxtDate(WebElement txtDate) {
		this.txtDate = txtDate;
	}

	public WebElement getTxtRecAmt() {
		return txtRecAmt;
	}

	public void setTxtRecAmt(WebElement txtRecAmt) {
		this.txtRecAmt = txtRecAmt;
	}

	public WebElement getDrpCurrency() {
		return drpCurrency;
	}

	public void setDrpCurrency(WebElement drpCurrency) {
		this.drpCurrency = drpCurrency;
	}

	public WebElement getLnkAttachReceipt() {
		return lnkAttachReceipt;
	}

	public void setLnkAttachReceipt(WebElement lnkAttachReceipt) {
		this.lnkAttachReceipt = lnkAttachReceipt;
	}

	@FindBy(className = "inactvDtTmTxt")
	private WebElement txtDate;//dd/mm/yyyy
	
	

	public WebElement getExpenseTab() {
		return expenseTab;
	}

	public void setExpenseTab(WebElement expenseTab) {
		this.expenseTab = expenseTab;
	}
	
}
