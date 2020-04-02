package com.evonsys.citi.base;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.evonsys.citi.util.browserConfiguration.BrowserType;
import com.evonsys.citi.util.browserConfiguration.ChromeBrowser;
import com.evonsys.citi.util.browserConfiguration.FirefoxBrowser;
import com.evonsys.citi.util.browserConfiguration.IExplorerDriver;
import com.evonsys.citi.util.browserConfiguration.config.ObjectReader;
import com.evonsys.citi.util.browserConfiguration.config.PropertyReader;
import com.evonsys.citi.util.logger.LoggerUtil;
import com.evonsys.citi.util.resource.ResourceUtil;
import com.evonsys.citi.util.wait.WaitUtil;
import com.evonsys.citi.utils.ExtentManager;
import com.google.common.io.Files;

public class Base1 {
	public static ExtentReports extent;
	public static ExtentTest test;
	public WebDriver driver;
	private Logger log = LoggerUtil.getLogger(Base.class);
	public static File reportDirectory;
	
	@BeforeSuite
	public void beforeSuite(){
		extent = ExtentManager.getInstance();
	}
	
	@BeforeClass
	public void beforeClass(){
		test = extent.createTest(getClass().getSimpleName());//executed with the class initialized
	}
	
	@BeforeTest
	public void beforeTest(){
		try {
			ObjectReader.reader = new PropertyReader();
			reportDirectory = new File(ResourceUtil.getResourcePath("/screenshots"));
			//reportDirectory = new File("/screenshots");

			setUpDriver(ObjectReader.reader.getBrowserType());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@BeforeMethod
	public void beforeMethod(Method method){
		test.log(Status.INFO, method.getName()+" test started");//get the test method name 	
	}
	
	@AfterMethod
	public void afterMethod(ITestResult result) throws IOException{
		if(result.getStatus() == ITestResult.FAILURE){
			
			File imagePath = captureScreen(result.getName(),driver);
			//test..addScreenCaptureFromPath(imagePath);
			test.log(Status.FAIL, result.getThrowable()).addScreenCaptureFromPath(imagePath.toString());                               
		}
		else if(result.getStatus() == ITestResult.SUCCESS){
			//test.log(Status.PASS, result.getName()+" is pass");
			File imagePath = captureScreen(result.getName(), driver);
			test.log(Status.PASS, result.getName()+" is pass").addScreenCaptureFromPath(imagePath.toString());
			//test.addScreenCaptureFromPath(imagePath);
		}
		else if(result.getStatus() == ITestResult.SKIP){
			test.log(Status.SKIP, result.getThrowable());
			File imagePath = captureScreen(result.getName(),driver);
			test.addScreenCaptureFromPath(imagePath.toString());
		}
		extent.flush();
	}
	
	@AfterTest
	public void tearDown(){
		if(driver!=null){
			driver.quit();
		}
	}
	

	public WebDriver getBrowserObject(BrowserType btype) throws Exception{
		try{
			 
			switch(btype){
			case Chrome: 
				//get object of chrome browser class
				ChromeBrowser chrome = ChromeBrowser.class.newInstance();//create instance of chrome browser
				ChromeOptions option = chrome.getChromeOptions(); 
				return chrome.getChromeDriver(option);
				
			case Firefox: 
				FirefoxBrowser firefox = FirefoxBrowser.class.newInstance();
				FirefoxOptions options = firefox.getFirefoxOptions();
				return firefox.getFirefoxDriver(options);
				
			case Iexplorer:
				IExplorerDriver ie = IExplorerDriver.class.newInstance();
				InternetExplorerOptions cap = ie.getIExplorerCapabilities();
				return ie.getIExplorerDriver(cap);
				
			default: 
				throw new Exception("Driver not found.."+btype.name());
			}
			
		}catch(Exception e){
			log.info(e.getMessage());
			throw e;
		}
	}
	
	public void setUpDriver(BrowserType btype) throws Exception{
		driver = getBrowserObject(btype);
		log.info("Initialise WebDriver with hashcode :"+driver.hashCode());
		WaitUtil wait = new WaitUtil(driver);
		wait.setImplicitWait(ObjectReader.reader.getImplicitWait(), TimeUnit.SECONDS);
		wait.pageLoadTime(ObjectReader.reader.getPageLoadTime(), TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}
	
	public File captureScreen(String fileName, WebDriver driver){
		if(driver==null){
			log.info("driver is null..");
			return null;
		}
		if(fileName==""){
			fileName="blank";
		}
		File destFile = null;
		Calendar calender = Calendar.getInstance(); 
		SimpleDateFormat formater = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
		File srceFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try{
			destFile = new File(reportDirectory+"/"+fileName+"_"+formater.format(calender.getTime())+".jpeg");
			Files.copy(srceFile, destFile);
			Reporter.log("<a href='"+destFile.getAbsolutePath()+"'><img src='"+destFile+"'height='100' width='100'/></a>");
			//Reporter.log("<a href ="+destFile.getAbsolutePath()+"><img src = "+destFile.getAbsolutePath()+"height='100' width = '100'></img></a>");
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return destFile;
	}
	
	
	
}
