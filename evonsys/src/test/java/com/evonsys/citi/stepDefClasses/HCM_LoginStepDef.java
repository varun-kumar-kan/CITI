package com.evonsys.citi.stepDefClasses;

import java.io.IOException;

import org.apache.log4j.Logger;

import com.evonsys.citi.base.Base;
import com.evonsys.citi.base.BaseCucumber;
import com.evonsys.citi.testng.HCM_Login;
import com.evonsys.citi.util.assertion.VerificationUtil;
import com.evonsys.citi.util.browserConfiguration.config.ObjectReader;
import com.evonsys.citi.util.javaScript.JavaScriptUtil;
import com.evonsys.citi.util.logger.LoggerUtil;
import com.evonsys.citi.util.pageObject.HCMPage;
import com.evonsys.citi.util.wait.WaitUtil;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HCM_LoginStepDef extends Base{
	private final Logger log = LoggerUtil.getLogger(HCM_Login.class);
	
	  WaitUtil wait = new WaitUtil(driver);
	  
	  @Given("^I am on login page$")
	  public void i_am_on_login_page() throws Throwable {
		JavaScriptUtil js = new JavaScriptUtil(driver);
		HCMPage hcmPage = new HCMPage(driver);
		VerificationUtil v = new VerificationUtil(driver);
		v.isDisplayed(hcmPage.getTxt_UserName());
		
		//HCMPage hcmPage = new HCMPage(driver);
		  
		  /*hcmPage.getTxt_UserName().sendKeys(ObjectReader.reader.getVarunUserName());
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
		 
	   */
		
		System.out.println(1);
	}

	  @When("^I entered \"([^\"]*)\" in username field$")
	  public void i_entered_in_username_field(String arg1) throws Throwable {
	     
	  }
	  @Then("^I entered \"([^\"]*)\" in password field$")
	  public void i_entered_in_password_field(String arg1) throws Throwable {
	     
	  }


	  @Then("^I click on Submit button$")
	  public void i_click_on_Submit_button() throws Throwable {
	      
	  }

	@Then("I should see same page again")
	public void i_should_see_same_page_again() {
	  
	}

	@Given("I am testing Junit Number {string}")
	public void i_am_testing_Junit_Number(String string) {
	   System.out.println(string);
	}

}
