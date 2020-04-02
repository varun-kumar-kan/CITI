package com.evonsys.citi.utils;

import org.apache.log4j.Logger;
import org.testng.SkipException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.evonsys.citi.base.Base;
import com.evonsys.citi.util.logger.LoggerUtil;

public class LoginTestWithDataDrivenTesting extends Base{
 private final Logger log = LoggerUtil.getLogger(LoginTestWithDataDrivenTesting.class);
 
 @DataProvider(name="testData") //name value is user defined name
 public Object[][] testData(){
	 Object[][] data = getExcelData("TestData.xlsx", "LoginData");
	 for(Object[] d: data){
		 System.out.println(d);
	 }
	 return data;
 }
 
 @Test(dataProvider="testData")//here name value should be same as @DataProvider method name 
 public void loginData(String username, String password, String runMode){ // we need to write the parameter based on columns in excel sheet
	 if(runMode.equalsIgnoreCase("n")){
		 throw new SkipException("Run Mode for this set of data is marked as N");
	 }
	 System.out.println(username+":"+password);
 }
 
}
