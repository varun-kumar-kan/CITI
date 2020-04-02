package com.evonsys.citi.util.listner;

import org.apache.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.evonsys.citi.util.logger.LoggerUtil;
import com.evonsys.citi.utils.ExtentManager;

public class ExtentListner implements ITestListener{
	
	private Logger log = LoggerUtil.getLogger(ExtentListner.class);
	public static ExtentReports extent;
	public static ExtentTest test;
	
	public void onStart(ITestContext context) {
		extent = ExtentManager.getInstance();
		//test = extent.createTest(context.getName()+"Class Started...");// or
		//test = extent.createTest(context.getCurrentXmlTest().getName()+" Class Started");
		Reporter.log(context.getCurrentXmlTest().getName()+" Class Started.."); // for emailable report of html
		log.info(context.getCurrentXmlTest().getName()+" class started..");
	}
	
	public void onTestStart(ITestResult result) {
		//test.log(Status.INFO, result.getMethod().getMethodName()+ "Test Started..");
		Reporter.log(result.getMethod().getMethodName()+" Test Started..");
		log.info(result.getMethod().getMethodName()+" Test Started..");
	}

	public void onTestSuccess(ITestResult result) {
		//test.log(Status.INFO, result.getMethod().getMethodName()+ "Test Passed..");
		Reporter.log(result.getMethod().getMethodName()+" Test Passed..");
		log.info(result.getMethod().getMethodName()+" Test Passed");
	}

	public void onTestFailure(ITestResult result) {
		//test.log(Status.FAIL, result.getThrowable());
		Reporter.log(result.getMethod().getMethodName()+" Test Failed.."+result.getThrowable());
		log.error(result.getMethod().getMethodName()+" Test Failed.. "+result.getThrowable());
	}

	public void onTestSkipped(ITestResult result) {
		//test.log(Status.SKIP, result.getThrowable());
		Reporter.log(result.getMethod().getMethodName()+" Test Skipped.."+result.getThrowable());
		log.warn(result.getMethod().getMethodName()+" Test Skipped.. "+result.getThrowable());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	

	public void onFinish(ITestContext context) {
		//extent.flush();
		//test.log(Status.INFO,  context.getName()+ "Test Finished..");
		Reporter.log(context.getName()+" Test Finished..");
		log.info(context.getName()+" Test Finished..");
	}

}
