/**
 * Designed By : Varun
 * Class Name : Retry
 * Usage : Listens the failed Test Cases and executes for 3 times again
 */
package com.evonsys.citi.util.listner;

import org.apache.log4j.Logger;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

import com.evonsys.citi.util.logger.LoggerUtil;

public class Retry implements IRetryAnalyzer {
	
	private Logger log = LoggerUtil.getLogger(Retry.class);
	private int retryCount = 0;
	private int maxRetryCount = 3;

	
	public boolean retry(ITestResult arg0) {
		if(retryCount<maxRetryCount){
			retryCount++;
			log.info("Retry Test "+arg0.getName()+ " with status "+ getResultStatusName(arg0.getStatus())+" for the "+(retryCount+1)+" times");
			return true;
		}
		return false;
	}

	public String getResultStatusName(int status){
		String resultName = null;
		if(status == 1){
			resultName = "SUCCESS";
		}
		if(status ==2 ){
			resultName = "FAIL";
		}
		if(status == 3){
			resultName = "SKIP";
		}
		return resultName;
	}
}
