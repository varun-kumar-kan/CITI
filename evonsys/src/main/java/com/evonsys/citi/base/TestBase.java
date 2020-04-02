package com.evonsys.citi.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeClass;

import com.evonsys.citi.utils.WaitLoadUtil;
import com.evonsys.qa.pageObject.LoginPage;

public class TestBase {
	LoginPage loginPage = new LoginPage();//instance variable
	public static WebDriver driver;//static variable
	public static Properties prop;
	public TestBase() {
		// TODO Auto-generated constructor stub
		prop = new Properties();
		try {
			FileInputStream fi = new FileInputStream(System.getProperty("user.dir")+"/src/main/java/com/evonsys/qa/config/config.properties");
			prop.load(fi);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}

	public static void initialization(){
		String browserName = prop.getProperty("browser");
		if(browserName.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "/evonsys/src/main/java/com/evonsys/qa/drivers/chromedriver.exe");
			driver = new ChromeDriver();
			
		}else if(browserName.equals("firefox")){
			System.setProperty("webdriver.ie.driver", "/evonsys/src/main/java/com/evonsys/qa/drivers/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(WaitLoadUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(WaitLoadUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
	}
	
	
}
