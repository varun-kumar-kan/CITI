package com.evonsys.citi.util.browserConfiguration;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.evonsys.citi.util.resource.ResourceUtil;

public class ChromeBrowser {
	public ChromeOptions getChromeOptions(){
		ChromeOptions option = new ChromeOptions();
		option.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		option.addArguments("--test-type--");
		option.addArguments("--disable -popup-blocking");
		option.addArguments("start-maximized");
		option.addArguments("enable-automation");
		option.addArguments("--disable-infobars"); 
		option.addArguments("--disable-dev-shm-usage"); 
		option.addArguments("--disable-browser-side-navigation"); 
		option.addArguments("--disable-gpu");
		option.addArguments("--whitelisted-ips");
		option.addArguments("--dns-prefetch-disable");
		DesiredCapabilities chrome = DesiredCapabilities.chrome();
		chrome.setJavascriptEnabled(true);
		
		option.setCapability(ChromeOptions.CAPABILITY, chrome);
		
		//Linux
		if(System.getProperty("os.name").contains("Linux")){
			option.addArguments("--headless", "window-size=1024,768", "--no-sandbox");
		}
		return option;
	}
	public WebDriver getChromeDriver(ChromeOptions cap) {

		if (System.getProperty("os.name").contains("Mac")){
			System.setProperty("webdriver.chrome.driver", ResourceUtil.getResourcePath("./src/main/java/com/evonsys/citi/drivers/chromedriver_mac"));
			return new ChromeDriver(cap);
		}
		else if(System.getProperty("os.name").contains("Window")){
			System.setProperty("webdriver.chrome.driver", ResourceUtil.getResourcePath("./src/main/java/com/evonsys/citi/drivers/chromedriver.exe"));
			return new ChromeDriver(cap);
		}
		else if(System.getProperty("os.name").contains("Linux")){
			System.setProperty("webdriver.chrome.driver", "./src/main/java/com/evonsys/citi/drivers/chromedriver_Linux");
			return new ChromeDriver(cap);
		}
		return null;
	}
	public static void main(String[] args) {
		ChromeBrowser obj = new ChromeBrowser();
		WebDriver driver = obj.getChromeDriver(obj.getChromeOptions());
		System.out.println(System.getProperty("user.dir"));
		
		/*System.setProperty("webdriver.chrome.driver", "./src/main/java/com/evonsys/citi/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();*/
		driver.get("http://www.google.com");
	}
}