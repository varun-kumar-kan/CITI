package com.evonsys.citi.utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


public class ExtentManager {
	
	static ExtentTest test;
	static ExtentReports extent;
	
	public static ExtentReports getInstance(){
		if(extent == null){
			return createInstance("test-output/extent.html");
		}else{
			return extent;
		}
	}
	public static ExtentReports createInstance(String fileName){
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(fileName);
		htmlReporter.config().setTheme(Theme.STANDARD);
		htmlReporter.config().setDocumentTitle(fileName);
		htmlReporter.config().setEncoding("utf-8");
		htmlReporter.config().setReportName("Automation Report");
		
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		return extent;
		
		}	
	
}
