package com.evonsys.citi.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.BrowserType;

import com.evonsys.citi.util.browserConfiguration.OS;
import com.evonsys.citi.util.browserConfiguration.config.ObjectReader;

public class BaseCucumber {
	
	public static WebDriver driver;
	
	public WebDriver setBrowser(String browser){
		if(System.getProperty("os.name").contains("Window")){
			if(browser.equalsIgnoreCase("chrome")){
				System.setProperty("webdriver.chrome.driver", "./src/main/java/com/evonsys/citi/drivers/chromedriver.exe");
				driver = new ChromeDriver();
			}else if(browser.equalsIgnoreCase(BrowserType.FIREFOX.toLowerCase())){
				System.setProperty("webdriver.gecko.driver", "./src/main/java/com/evonsys/citi/drivers/geckodriver.exe");
				driver = new FirefoxDriver();
			}else if(browser.equalsIgnoreCase(BrowserType.IE.toLowerCase())){
				System.setProperty("webdriver.ie.driver", "./src/main/java/com/evonsys/citi/drivers/IEDriverServer.exe");
			}
		}
		else if(System.getProperty("os.name").toLowerCase().contains(OS.MAC.name().toLowerCase())){
			if(browser.equalsIgnoreCase(BrowserType.CHROME.toLowerCase())){
				System.setProperty("webdriver.chrome.driver", "./src/main/java/com/evonsys/citi/drivers/chromedriver_mac");
				driver = new ChromeDriver();
			} else if(browser.equalsIgnoreCase(BrowserType.FIREFOX.toLowerCase())){
				System.setProperty("webdriver.firefox.driver", "./src/main/java/com/evonsys/citi/drivers/geckodriver_mac");
				driver = new FirefoxDriver();
			}
		}
		return driver;
	}
	
	public void getApplicationUrl(){
		driver.get(ObjectReader.reader.getUrl());
	}
}
