package com.evonsys.citi.util.assertion;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.evonsys.citi.util.logger.LoggerUtil;

public class AssertionUtil {
	private WebDriver driver;
	private static Logger log = LoggerUtil.getLogger(AssertionUtil.class);

	public AssertionUtil(WebDriver driver){
		this.driver = driver;
	}
	public static void verifyText(String actual, String expected){
		log.info("verify text "+actual +" with "+ expected	);
		Assert.assertEquals(actual, expected);
	}
	
	public static void makeTrue(){
		Assert.assertTrue(true);
		log.info("making script PASS..");
	}
	public static void makeTrue(String message){
		log.info("making script PASS.."+message);
		Assert.assertTrue(true, message);
	}
	
	public static void makeFalse(){
		log.info("making script FAIL..");
		Assert.assertTrue(false);
	}
	
	public static void makeFalse(String message){
		log.info("making script FAIL.."+message);
		Assert.assertTrue(false, message);
	}
	
	public static void verifyTrue(boolean status){
		Assert.assertTrue(status);
	}
	
	public static void verifyFalse(boolean status){
		Assert.assertFalse(status);
	}
	
	public static void verifyNull(String nullObject){
		Assert.assertNull(nullObject);
		log.info("verify object is null..");
	}
	
	public static void verifyNotNull(String notNullObject){
		Assert.assertNotNull(notNullObject);
		log.info("verify object is not null");
	}
	
	public static void fail(){
		Assert.assertTrue(false);
	}
	
	public static void pass(){
		Assert.assertTrue(true);
	}
	
	public static void updateTestStatus(boolean status){
		if(status){
			pass();
		}else{
			fail();
		}
	}
}
