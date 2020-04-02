package com.evonsys.citi.utils;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


public class ExtentReportDemo {
	public WebDriver driver;
	public ExtentHtmlReporter htmlReporter; // this class is reponsible for look and feel of report
	public ExtentReports extent;
	public ExtentTest test; // to create new entry in report, update status,logs
	@BeforeTest
	public void setExtent(){
		htmlReporter = new ExtentHtmlReporter("./test-output/test.html");
		htmlReporter.config().setDocumentTitle("Automation Report");//title of report
		htmlReporter.config().setReportName("Functional report");//name of report
		htmlReporter.config().setTheme(Theme.DARK);
		
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		extent.setSystemInfo("Hostname","LocalHost");
		extent.setSystemInfo("Tester Name", "Varun");
		extent.setSystemInfo("Browser ","Chrome");
		extent.setSystemInfo("OS", "Windows10");
		
	}
	
	@AfterTest
	public void endReport(){
		extent.flush();
	}
	
	@Test
	public void test(){
		
		test = extent.createTest("functionality test");
		test.log(Status.PASS, "test is passed");
	}
}
