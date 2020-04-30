package com.evonsys.citi.util.browserConfiguration.config;

import com.evonsys.citi.util.browserConfiguration.BrowserType;

public interface ConfigReader {
	public int getImplicitWait();
	public int getExplicitWait();
	public int getPageLoadTime();
	public BrowserType getBrowserType();
	public String getUrl();
	public String getVarunUserName();
	public String getVarunPassword();
}
