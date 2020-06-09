/**
 * Designed By : Varun
 * Class Name : LoggerUtil
 * Usage : Generates log
 */
package com.evonsys.citi.util.logger;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.evonsys.citi.util.resource.ResourceUtil;


public class LoggerUtil {
	
	private static boolean root = false;
	
	public static Logger getLogger(Class cls){
		if(root){
			return Logger.getLogger(cls);
		}
		PropertyConfigurator.configure(ResourceUtil.getResourcePath("/src/main/java/com/evonsys/citi/properties/config/log4j.properties"));
		//PropertyConfigurator.configure("./src/main/java/com/evonsys/citi/properties/config/log4j.properties");
		root = true;
		return Logger.getLogger(cls);
	}
	public static void main(String[] args) {
		Logger log = LoggerUtil.getLogger(LoggerUtil.class);
		log.info("logger is configured");
	}

}
