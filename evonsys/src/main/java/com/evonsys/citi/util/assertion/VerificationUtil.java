package com.evonsys.citi.util.assertion;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.Status;
import com.evonsys.citi.base.Base;
import com.evonsys.citi.util.logger.LoggerUtil;

public class VerificationUtil {
	private WebDriver driver;
	private Logger log = LoggerUtil.getLogger(VerificationUtil.class);
	
	public VerificationUtil(){
		this.driver = driver;
	}
	
	public boolean isDisplayed(WebElement element){
		try{
			element.isDisplayed();
			//Base.writeReport("element is displayed :"+element.toString());
			return true;
		}catch(Exception e){
			log.error("element is not displayed : "+e.getMessage(), e.getCause());
			Base.test.log(Status.ERROR,"Element is not displayed : "+e.getMessage());
			return false;
		}
	}
	
	public boolean isNotDisplayed(WebElement element){
		try{
			element.isDisplayed();
			//Base.writeReport("element is displayed :"+element.toString());
			return false;
		}catch(Exception e){
			//("element is not displayed : "+element.toString());
			return true;
		}
	}

	public String getText(WebElement element){
		if(null == element){
			log.info("WebElement is null..");
			return null;
		}boolean status = isDisplayed(element);
		if(status){
			log.info("element text is : "+element.getText());
			return element.getText();
		}else{
			return null;
		}
	}
	
	public String getTitle(){
		log.info("Page Title is : "+driver.getTitle());
		return driver.getTitle();
	}
}
