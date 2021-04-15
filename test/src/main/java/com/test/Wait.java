package com.test;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

//import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {
	private WebDriver driver;
	public void fluentWait(Object WebDriver){
		@SuppressWarnings("deprecation")
		FluentWait<org.openqa.selenium.WebDriver> wait = new FluentWait<WebDriver>(driver)							
				.withTimeout(30, TimeUnit.SECONDS) 			
				.pollingEvery(5, TimeUnit.SECONDS) 			
				.ignoring(NoSuchElementException.class);

	}
	/*private Wait<WebDriver> getFluentWait(int timeOutInSeconds, int pollingEveryInMilliSec){
		Wait<WebDriver> fwait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(timeOutInSeconds))
				.pollingEvery(Duration.ofMillis(pollingEveryInMilliSec))
				.ignoring(NoSuchElementException.class);
		return fwait;
	}*/
public void explicitWait(){
	WebDriverWait wait = new WebDriverWait(driver, 30);
	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("")));
}
//implicit wait
public void implicitWait(){
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
}

}
