package com.evonsys.citi.util.wait;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.evonsys.citi.util.logger.LoggerUtil;

public class WaitUtil {
	private WebDriver driver;
	public WaitUtil(WebDriver driver){
		this.driver = driver;
		log.info("WaitHelper object created.");
	}
	private Logger log = LoggerUtil.getLogger(WaitUtil.class);
	
	/**
	 * This is implicit wait method
	 * @param timeOut
	 * @param unit
	 */
	public void setImplicitWait(long timeOut, TimeUnit unit){
		driver.manage().timeouts().implicitlyWait(timeOut, unit);
		log.info("Implicit Wait has been set to "+timeOut+" "+unit);
	}
	
	/**
	 * this is WebDriverWait wait
	 * @param timeOutInSeconds
	 * @param pollingEveryInMilliSec
	 * @return
	 */
	private WebDriver getWait(int timeOutInSeconds, int pollingEveryInMilliSec){
		WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
		wait.pollingEvery(Duration.ofMillis(pollingEveryInMilliSec));
		wait.ignoring(NoSuchElementException.class);
		wait.ignoring(ElementNotVisibleException.class);
		wait.ignoring(StaleElementReferenceException.class);
		wait.ignoring(NoSuchFrameException.class);
		return (WebDriver) wait;
	}
	/**
	 * element is visible
	 * @param element
	 * @param timeOutInSeconds
	 * @param pollingEveryInMilliSec
	 */
	public void waitForElementVisibleWithPollingTime(WebElement element, int timeOutInSeconds, int pollingEveryInMilliSec){
		WebDriverWait wait = (WebDriverWait) getWait(timeOutInSeconds,  pollingEveryInMilliSec );
		
		wait.until(ExpectedConditions.visibilityOf(element));
		log.info("Waiting for "+ element.toString()+ " for :  "+timeOutInSeconds+ " seconds");
		log.info("Element is visible now");
	}
	/**
	 * wait till element clickable
	 * @param element
	 * @param timeOutInSeconds
	 */
	
	public void waitForElementClickable(WebElement element, int timeOutInSeconds){
		WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
		wait.until(ExpectedConditions.elementToBeClickable(element));
		log.info("Waiting for "+ element.toString()+ " for :  "+timeOutInSeconds+ " seconds");
		log.info("Element is clickable now");
	}

	/**
	 * wait for element not present
	 * @param element
	 * @param timeOutInSeconds
	 * @return
	 */
	public boolean waitForElementNotPresent(WebElement element, long timeOutInSeconds){
		WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
		boolean status = wait.until(ExpectedConditions.invisibilityOf(element));
		log.info("Waiting for "+ element.toString()+ " for :  "+timeOutInSeconds+ " seconds");
		log.info("Element is invisible now");
		return status;
	}
	/**
	 * wait till frame to be available and switch to it
	 * @param element
	 * @param timeOutInSeconds
	 */
	public void waitTillFrameToBeAvailableAndSwitchTo(WebElement element, long timeOutInSeconds){
		WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(element));
		log.info("Wait for frame"+timeOutInSeconds+" to be available and switch to it");
	}
	
	/**
	 * fluent wait 
	 * @param timeOutInSeconds
	 * @param pollingEveryInMilliSec
	 * @return
	 */
	private Wait<WebDriver> getFluentWait(int timeOutInSeconds, int pollingEveryInMilliSec){
		Wait<WebDriver> fwait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(timeOutInSeconds))
				.pollingEvery(Duration.ofMillis(pollingEveryInMilliSec))
				.ignoring(NoSuchElementException.class);
		return fwait;
	}
	
	public WebElement waitForElement(WebElement element,int timeOutInSeconds, int pollingEveryInMilliSec){
		Wait<WebDriver> fwait = getFluentWait(timeOutInSeconds, pollingEveryInMilliSec);
		fwait.until(ExpectedConditions.visibilityOf(element));
		return element;
	}
	
	public void pageLoadTime(long timeOut, TimeUnit unit){
		driver.manage().timeouts().pageLoadTimeout(timeOut, unit);
		log.info("Waiting for Page Load Time of "+timeOut+" "+unit);
		log.info("Page is loded");
	}
	
	public void waitForElement(WebElement element, int timeOutInSeconds){
		log.info("Waiting for "+element.toString() +" upto "+timeOutInSeconds+" seconds");
		WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
		wait.until(ExpectedConditions.visibilityOf(element));
		log.info(element.toString()+" is visible");
		System.out.println("element is visible");
	}
}
