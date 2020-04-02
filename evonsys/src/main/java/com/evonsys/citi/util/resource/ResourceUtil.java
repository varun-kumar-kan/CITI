package com.evonsys.citi.util.resource;

import org.apache.log4j.Logger;

import com.evonsys.citi.util.logger.LoggerUtil;

public class ResourceUtil {
	private static Logger log = LoggerUtil.getLogger(ResourceUtil.class);
	public static String getResourcePath(String path){
		String basePath = System.getProperty("user.dir");
		
		return basePath+path;
	}
	public static void main(String[] args) {
		String path = ResourceUtil.getResourcePath("/src/main/java/com/evonsys/citi/helper/resource/ResourceHelper.java");
		System.out.println(path);
	}
}
