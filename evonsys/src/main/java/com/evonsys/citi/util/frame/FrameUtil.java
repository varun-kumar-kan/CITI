/**
 * Designed By : Varun
 * Class Name : Frame Util
 * Usage : Deals with frames reusable code
 **/
package com.evonsys.citi.util.frame;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.evonsys.citi.util.logger.LoggerUtil;

public class FrameUtil {
	FrameUtil(WebDriver driver){
		this.driver = driver;
	}
	private WebDriver driver;
	private Logger log = LoggerUtil.getLogger(FrameUtil.class);
	
	/**
	 * switch to frame by index
	 * @param index
	 */
	public void switchToFrame(int index){
		driver.switchTo().frame(index);
		log.info("switch to "+index+" frame");
	}
	
	/**
	 * switch to frame by frameName
	 * @param frameName
	 */
	public void switchToFrame(String frameName){
		driver.switchTo().frame(frameName);
		log.info("switch to : "+frameName+" frame");
	}
	
	/**
	 * switch to frame by element
	 * @param element
	 */
	public void switchToFrame(WebElement element){
		driver.switchTo().frame(element);
		log.info("switch to : "+element.toString() +" frame");
	}
}
