package com.evonsys.citi.testng;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import com.evonsys.citi.base.Base;
import com.evonsys.citi.util.logger.LoggerUtil;
import com.evonsys.citi.util.pageObject.HCMPage;

public class InvalidLoginCredientials extends Base {
	private final Logger log = LoggerUtil.getLogger(InvalidLoginCredientials.class);
  @Test
  public void invalidLogin() throws IOException {
	//  try{
		  HCMPage hcmPage = new HCMPage(driver);
	  
	  
	  hcmPage.getTxt_UserName().sendKeys("");
	  captureScreen("I entered  Invalid Username", driver);
	  test.pass("I dint entered username field").addScreenCaptureFromPath("./screenshots");
	  log.info("I dint entered username  in username field");
	  
	  hcmPage.getTxt_Password().sendKeys("Install@123");
	  captureScreen("I entered Invalid Password 'Install@123' in password field", driver);
	  test.pass("I entered Password 'Install@123' in password field");
	  log.info("I entered Password 'Install@123' in password field");
	  
	  hcmPage.getBtn_Submit().click();
	  test.pass("i clicked on submit button");
	  log.info("I clicked on Submit button");
	  /*}catch(Exception e){
		  e.printStackTrace();
	  }*/
  }
}
