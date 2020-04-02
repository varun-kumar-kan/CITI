package com.evonsys.citi.util.window;

import java.util.Set;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.evonsys.citi.util.logger.LoggerUtil;

public class WindowUtil {

	private WebDriver driver;
	private Logger log = LoggerUtil.getLogger(WindowUtil.class);
	
	public WindowUtil(WebDriver driver){
		this.driver = driver;
	}
	
	/**
	 * this method will switch to Parent Window
	 */
	public void switchToParentWidow(){
		driver.switchTo().defaultContent();
		log.info("Switch to Parent window");
	}
	
	/**
	 * this method will switch to child window based on index
	 * @param index
	 */
	public void switchToWindow(int index){
		Set<String> windows = driver.getWindowHandles();
		int i = 1;
		for(String window: windows){
			if(i == index){
				driver.switchTo().window(window);
				log.info("switch to "+index+ " window");
			}else{
				i++;
			}
		}
	}
	
	/**
	 * this method will close all tab windows and switch to main window
	 */
	public void closeAllTabsAndSwitchToMainWindow(){
		Set<String> handles = driver.getWindowHandles();
		String handle = driver.getWindowHandle();
		for(String h:handles){
			if(!h.equalsIgnoreCase(handle)){
				driver.close();
			}
		}
		driver.switchTo().window(handle);
		log.info("Switch to main window");
	}
	
	/**
	 * this method will do browser back navigate
	 */
	public void navigateBack(){
		driver.navigate().back();
		log.info("Navigate back");
	}
	
	/**
	 * this method will do browser forward navigate
	 */
	public void navigateForward(){
		driver.navigate().forward();
		log.info("Navigate forward");
	}
	
}
