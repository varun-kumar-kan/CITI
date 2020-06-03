package com.evonsys.citi.util.browserConfiguration.config;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import com.evonsys.citi.util.browserConfiguration.BrowserType;
import com.evonsys.citi.util.resource.ResourceUtil;

public class PropertyReader implements ConfigReader {
	
	public static FileInputStream file;
	public static Properties OR;
	
	public PropertyReader(){
	try {
		String filepath = ResourceUtil.getResourcePath("/src/main/java/com/evonsys/citi/properties/config/config.properties");
		 file = new FileInputStream(new File(filepath));
		 OR = new Properties();
		 OR.load(file);
		 
		/* //if tomarrow 1 more config file is created, just follow below uncomment below code with the path change
		 String filepath1 = ResourceHelper.getResourcePath("/src/main/java/com/evonsys/citi/properties/config/config1.properties");
		 file = new FileInputStream(new File(filepath1));
		 OR = new Properties();
		 OR.load(file);*/
		 
		} catch (Exception e) {		
			e.printStackTrace();
		}
			
	}

	public int getImplicitWait() {
		return Integer.parseInt(OR.getProperty("implicitwait"));
	}

	public int getExplicitWait() {
		return Integer.parseInt(OR.getProperty("explicitwait"));
	}

	public int getPageLoadTime() {
		return Integer.parseInt(OR.getProperty("pageloadtime"));
	}

	public BrowserType getBrowserType() {
		return BrowserType.valueOf(OR.getProperty("browsertype"));
	}
	
	public String getUrl() {
		/*if(System.getProperty("url1")!=null){
			return System.getProperty("url1");
		}*/
		;
		return OR.getProperty("url");
	}

	public String getVarunUserName() {
		
		/*if(System.getProperty("userName")!=null){
			return System.getProperty("userName");
		}*/
		return OR.getProperty("varunUserName");
	}

	public String getVarunPassword() {
		/*if(System.getProperty("password")!=null){
			return System.getProperty("password");
		}*/
		return OR.getProperty("varunPassword");
	}
	
	public String get_HCM_UAT_Url(){
		return OR.getProperty("hcmUAT");
		
		
	}
public String getHcmCreationOperator6(){
	return OR.getProperty("hcmCreationOperator6");
}
public String getHcmApprovedOperator1(){
	return OR.getProperty("hcmApprovedOperator1");
}



	
	
	
	
}
