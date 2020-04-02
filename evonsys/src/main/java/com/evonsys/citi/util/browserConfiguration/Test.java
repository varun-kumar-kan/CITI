package com.evonsys.citi.util.browserConfiguration;



import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Test {
   private static ChromeDriverService service;
   private static WebDriver driver;

 
   public static void createAndStartService() throws IOException {
     service = new ChromeDriverService.Builder()
         .usingDriverExecutable(new File("./src/main/java/com/evonsys/citi/drivers/chromedriver.exe"))
         .usingAnyFreePort()
         .build();
     service.start();
     driver = new RemoteWebDriver(service.getUrl(),
             DesiredCapabilities.chrome());
   }

	public static void main(String[] args) throws IOException {
		createAndStartService();
		driver.get("http://www.google.com");
	}
	 
	 
	
}
