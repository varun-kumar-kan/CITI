package com.evonsys.citi.util.files;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import com.evonsys.citi.base.Base;
import com.evonsys.citi.util.browserConfiguration.ChromeBrowser;
import com.evonsys.citi.util.resource.ResourceUtil;
 
public class DownloadFiles extends Base{

	//static File folder = new File("./downloads");
	@Test
	public static void downloadFile() throws InterruptedException{
	/*	WebElement elm = driver.findElement(By.linkText("img.jpg"));
		elm.click();
		Thread.sleep(2000);*/
//		ChromeBrowser cg = new ChromeBrowser();
		//cg.folder.mkdir();
		//folder.mkdir();
		//String downloadFilePath = ResourceUtil.getResourcePath("/downloads");
		/*File folder = new File("./downloads");
		folder.mkdir();
		ChromeOptions options = new ChromeOptions();
		Map<String, Object> prefs = new HashMap<String,Object>();
		prefs.put("download.default_directory", downloadFilePath);
		options.setExperimentalOption("prefs", prefs);
		
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		cap.setCapability(ChromeOptions.CAPABILITY, options);
		WebDriver driver = new ChromeDriver(cap);*/
		
		/*File listOfFiles[]=cg.folder.listFiles();
		for(File file:listOfFiles){
			System.out.println(file.length());
		}*/
	}
	public static void main(String[] args) throws InterruptedException {
		
		/*System.setProperty("webdriver.chrome.driver", "./src/main/java/com/evonsys/citi/drivers/chromedriver.exe");
		
		folder.mkdir();
		ChromeOptions options = new ChromeOptions();
		Map<String, Object> prefs = new HashMap<String,Object>();
		prefs.put("download.default_directory", folder);
		options.setExperimentalOption("prefs", prefs);
		
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		cap.setCapability(ChromeOptions.CAPABILITY, options);
		@SuppressWarnings("deprecation")
		WebDriver driver = new ChromeDriver(cap);
	
		driver.get("https://the-internet.herokuapp.com/download");*/
		
	}
}
