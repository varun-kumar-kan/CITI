package com.evonsys.citi.stepDefClasses;

import java.io.IOException;
import java.util.Set;

import org.apache.log4j.Logger;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import com.evonsys.citi.base.Base;
//import com.evonsys.citi.testng.HCM_Login;
import com.evonsys.citi.util.browserConfiguration.config.ObjectReader;
import com.evonsys.citi.util.javaScript.JavaScriptUtil;
import com.evonsys.citi.util.logger.LoggerUtil;
import com.evonsys.citi.util.pageObject.ApplicationText;
import com.evonsys.citi.util.pageObject.EmployeePage;
import com.evonsys.citi.util.pageObject.HCMPage;
import com.evonsys.citi.util.pageObject.HCM_ExpensePage;
import com.evonsys.citi.util.pageObject.HCM_HomePage;
import com.evonsys.citi.util.pageObject.ServiceRequest;
import com.evonsys.citi.util.select.DropDownUtil;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HCM_ServiceRequest extends Base {
	private final Logger log = LoggerUtil.getLogger(HCM_ServiceRequest.class);
	 HCMPage hcmPage = new HCMPage(driver);
	 HCM_ExpensePage expensePage = new HCM_ExpensePage(driver);
	 DropDownUtil drpdwn = new DropDownUtil(driver);
	 
	@Given("I Login with user credentials")
	public void i_Login_with_user_credentials() throws InterruptedException, IOException {
		 hcmPage.getTxt_UserName().sendKeys(ObjectReader.reader.getVarunUserName());
		  captureScreen("I entered Username", driver);
		  test.pass("I entered username "+ObjectReader.reader.getVarunUserName()+" in username field").addScreenCaptureFromPath("./screenshots");
		  log.info("I entered username "+ObjectReader.reader.getVarunUserName()+" in username field");
		  
		  hcmPage.getTxt_Password().sendKeys(ObjectReader.reader.getVarunPassword());
		  captureScreen("I entered password", driver);
		  test.pass("I entered Password "+ObjectReader.reader.getVarunPassword()+" in password field").addScreenCaptureFromPath("./screenshots");
		  log.info("I entered Password "+ObjectReader.reader.getVarunPassword()+" in pasword field");
		  
		  
		  hcmPage.getBtn_Submit().click();	
		  captureScreen("I clicked on Login button", driver);
		  log.info("I clicked on Login button");
		  test.pass("I clicked on Login button").addScreenCaptureFromPath("./screenshots");
	}
	
	@When("^I navigate to Employee page$")
	public void i_navigate_to_Employee_page() throws Throwable {
		HCM_HomePage homePage = new HCM_HomePage(driver);
	//  js.clickElement(homePage.getIcn_LaunchWebInterface());
	 // act.click(homePage.getIcn_LaunchWebInterface());
	  homePage.getIcn_LaunchWebInterface().click(); 
	  captureScreen("i clicked o Launch Web Interface icon", driver);
	  log.info("I clicked on Launch Web Interface icon");
	  test.pass("I clicked on Launch Web Interface icon");
	  
	  Thread.sleep(4000);
	  homePage.getLnk_Employee().click();
	  captureScreen("I clicked on Employee option", driver);
	  log.info("I clicked on Employee option");
	  test.pass("I clicked on Employee option");
	  Thread.sleep(4000);
	  
		String pid = driver.getWindowHandle();
		  Set<String> handles = driver.getWindowHandles();
		  for(String h: handles){
			  if(h!=pid){
				  driver.switchTo().window(h);
				  //Actions act = new Actions(driver);
				  //act.click((WebElement) driver.switchTo().window(h));
				  log.info("I switched to child window");
				  test.pass("I switched to child window");
			  }
		  }
	}
	@When("^I check the different tabs$")
	public void i_check_the_different_tabs() throws Throwable {
	
		  EmployeePage ePage = new EmployeePage(driver);
		  
		  ePage.getLnk_MyProfile().click(); 
		  captureScreen("I clicked on My Profile tab", driver);
		  log.info("I clicked on My Profile tab");
		  test.pass("I clicked on My Profile tab");
		  Thread.sleep(4000);
		  
		  ePage.getLnk_TimeSheet().click();
		  captureScreen("I clicked on TimeSheet tab", driver);
		  log.info("I clicked on TimeSheet tab");
		  test.pass("I clicked on TimeSheet tab");
		  Thread.sleep(4000);
		  
		  ePage.getLnk_TimeOff().click();
		  captureScreen("I clicked on TimeOff tab", driver);
		  log.info("I clicked o TimeOff tab");
		  test.pass("I clicked on TimeOff tab");
		  Thread.sleep(4000);
		  
		  ePage.getLnk_Expense().click();
		  captureScreen("I clicked on Expense tab", driver);
		  log.info("I clicked on Expense tab");
		  test.pass("I clicked on Expense tab");
		  Thread.sleep(4000);
		 
		  ePage.getLnk_PerformanceAppraisal().click();
		  captureScreen("I clicked on PerformanceAppraisal tab", driver);
		  log.info("I clicked on PerfomanceAppraisal tab");
		  test.pass("I clicked on PerformanceAppraisal tab");
		  Thread.sleep(4000);
		  
		  ePage.getLnk_ServiceRequest().click();
		  captureScreen("I clicked on Service Request tab", driver);
		  log.info("I clicked on Service Request tab");
		  test.pass("I clicked on Service Request tab");
		  Thread.sleep(4000);
		  
		  ePage.getLnk_Policies().click();
		  captureScreen("I clicked on Policies tab", driver);
		  log.info("I clicked on Policies tab");
		  test.pass("I clicked on Policies Request tab");
		  Thread.sleep(4000);
		  
		  ePage.getLnk_Documents().click();
		  captureScreen("I clicked on Documents tab", driver);
		  log.info("I clicked on Documents tab");
		  test.pass("I clicked on Documents tab");
		  Thread.sleep(4000);
		  
		  ePage.getLnk_Pulse().click();
		  captureScreen("I clicked on Pulse tab", driver);
		  log.info("I clicked on Pulse tab");
		  test.pass("I clicked on Pulse tab");
		  Thread.sleep(4000);
		  
		  ePage.getLnk_Cases().click();
		  captureScreen("I clicked on Cases tab", driver);
		  log.info("I clicked on Cases tab");
		  test.pass("I clicked on Cases tab");
		  Thread.sleep(4000);
	}
	@When("I enter into Service Request tab and fill the form and submit")
	public void i_enter_into_Service_Request_tab_and_fill_the_form_and_submit() throws InterruptedException {
		 try {
			  EmployeePage ePage = new EmployeePage(driver);
			  ePage.getLnk_ServiceRequest().click();
			  captureScreen("I clicked on Service Request tab", driver);
			  log.info("I clicked on Service Request tab");
			  test.pass("I clicked on Service Request tab");
			  Thread.sleep(6000);
			  
			  ServiceRequest sRequest = new ServiceRequest(driver);
			  ApplicationText a = new ApplicationText();
			  driver.switchTo().frame(a.iframe);
			 // driver.switchTo().frame("PegaGadget5Ifr");
			  //driver.switchTo().frame(sRequest.getiFrame());
			  Thread.sleep(6000);
			  
			  
			  sRequest.getBtn_CreateServiceRequest().click();
			  captureScreen("I clicked on Create Service Request button", driver);
			  log.info("I clicked on Create Service Request button");
			  test.pass("I clicked on Create service Request button");
			  
			  Thread.sleep(6000);
			  driver.switchTo().defaultContent();
			  Thread.sleep(2000);
			 // driver.switchTo().defaultContent();
			  driver.switchTo().frame("PegaGadget10Ifr");
			//  Thread.sleep(5000);
			  DropDownUtil drp = new DropDownUtil(driver);
			  
			  Actions act = new Actions(driver);
			  
			  act.moveToElement(sRequest.getDrp_Department()).perform();
			  //act.click(sRequest.getDrp_Department()).perform();
			  
			  drp.selectByIndex(sRequest.getDrp_Department(), 1); 
			  Thread.sleep(2000);
			  sRequest.getDrp_Category().sendKeys(a.category_G);
			  
			  Thread.sleep(2000);
			  drp.selectByIndex(sRequest.getDrp_Impact(), 1);
			  
			  Thread.sleep(2000);
			  sRequest.getTxt_BriefDescription().sendKeys(a.briefDescription);
			  Thread.sleep(2000);
			  
			  //driver.switchTo().defaultContent();
			  Thread.sleep(2000);
			 // driver.switchTo().frame("Rich Text Editor, PEGACKEDITOR0");
			 // driver.switchTo().frame(sRequest.getIframeExplanation()); -- commented
			  JavaScriptUtil js = new JavaScriptUtil(driver);
			  js.scrollIntoView(sRequest.getTxt_Explanation());
			  //
			  Thread.sleep(3000);
			  act.moveToElement(sRequest.getTxt_Explanation()).perform();
			  Thread.sleep(2000);
			  sRequest.getTxt_Explanation().click();
			  sRequest.getTxt_Explanation().sendKeys(a.explanation);
			  
			  Thread.sleep(2000);
			  driver.switchTo().defaultContent();
			  Thread.sleep(2000);
			  driver.switchTo().frame("PegaGadget10Ifr");
			  Thread.sleep(4000);
			  js.scrollIntoView(sRequest.getBtn_Cancel());
			  act.moveToElement(sRequest.getBtn_Cancel()).perform();
			  Thread.sleep(1000);
			  sRequest.getBtn_Cancel().click();
			  
			  
			  String img = System.getProperty("user.dir")+"/Sikuli_Images/ok.PNG";
			  Screen s = new Screen();
			  Pattern p = new Pattern(img);
			  s.wait(p, 2000);
			  s.click();
			  s.click();
			  
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (FindFailed e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			  	  
	}
	@When("^I clicked on Expenses tab$")
	public void i_clicked_on_Expenses_tab() throws Throwable {
	   expensePage.getExpenseTab().click();
		  captureScreen("I clicked on Expense tab", driver);
		  log.info("I clicked on Expense tab");
		  test.pass("I clicked on Expense tab");
		  Thread.sleep(2000);
	}

	@When("^I entered mandatory fields and click on Submit button$")
	public void i_entered_mandatory_fields_and_click_on_Submit_button() throws Throwable {
	    driver.switchTo().frame("PegaGadget1Ifr");
		Thread.sleep(2000);
		expensePage.getBtnCreate().click();
	    captureScreen("I clicked on Create Expense button", driver);
		  log.info("I clicked on Create Expense button");
		  test.pass("I clicked on Create Expense button");	
		  Actions act = new Actions(driver);
		  driver.switchTo().defaultContent();
		  Thread.sleep(2000);
		  driver.switchTo().frame("PegaGadget2Ifr");
		 
		  Thread.sleep(2000);
		  act.moveToElement(expensePage.getTxtBusinessReason()).perform();

		  expensePage.getTxtBusinessReason().sendKeys("test");
		  captureScreen("I test in Business Reason field", driver);
		  log.info("I test in Business Reason field");
		  test.pass("I test in Business Reason field"); 
		  
		  act.moveToElement(expensePage.getTxtBusinessReason()).perform();
		  expensePage.getTxtDate().sendKeys("04/06/2020");
		  captureScreen("I entered 04/06/2020 in date field", driver);
		  log.info("I entered 04/06/2020 in date field");
		  test.pass("I entered 04/06/2020 in date field");	
		  
		  Thread.sleep(2000);
		  //act.moveToElement(expensePage.getDrpCategory()).perform();
		  drpdwn.selectByVisibleText(expensePage.getDrpCategory(), "Business Meals");
		  captureScreen("I selected Business Meals option from Category dropdown", driver);
		  log.info("I selected Business Meals option from Category dropdown");
		  test.pass("I selected Business Meals option from Category dropdown");
		  
		  Thread.sleep(2000);
		  expensePage.getTxtRecAmt().sendKeys("1000");
		  captureScreen("I entered 1000 rs in Receipt Amount", driver);
		  log.info("I entered 1000 rs in Receipt Amount");
		  test.pass("I entered 1000 rs in Receipt Amount");
		  
		  drpdwn.selectByVisibleText(expensePage.getDrpCurrency(), "INR");
		  captureScreen("I selected INR in Currency dropdown", driver);
		  log.info("I selected INR in Currency dropdown");
		  test.pass("I selected INR in Currency dropdown");
		  
		  expensePage.getLnkAttachReceipt().click();
		  log.info("I clicked on Attach Receipt link");
		  test.pass("I clicked on Attach Receipt link");
		  
		  Thread.sleep(2000);
		  expensePage.getBtnSelectReceipt().sendKeys("C:\\Users\\varun.kandukuri\\Desktop\\1.txt");
		  
		  
	}

	@Then("^I should see Thank you! The next step in this case has been routed appropriately\\.$")
	public void i_should_see_Thank_you_The_next_step_in_this_case_has_been_routed_appropriately() throws Throwable {
	   
	}
	@Then("I should get success message")
	public void i_should_get_success_message() throws InterruptedException {
		 
	}
	



	
}
