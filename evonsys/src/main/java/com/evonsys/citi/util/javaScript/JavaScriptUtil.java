package com.evonsys.citi.util.javaScript;

import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.evonsys.citi.util.logger.LoggerUtil;

public class JavaScriptUtil {
	private WebDriver driver;
	private Logger log = LoggerUtil.getLogger(JavaScriptUtil.class);

	public JavaScriptUtil(WebDriver driver){
		this.driver = driver;
		log.info("JavaScript Helper has been initialized");
	}
	
	public Object executeScript(String script){
		JavascriptExecutor exe = (JavascriptExecutor)driver;
		return exe.executeScript(script);
		
	}
	
	public Object executeScript(String script, Object...arg){
		JavascriptExecutor js = (JavascriptExecutor) driver;
		return js.executeScript(script, arg);
	}
	
	public void scrollToElement(WebElement element){
	executeScript("window.scrollTo(arguments[0], arguments[1])", element.getLocation().x, element.getLocation().y);
	log.info("scroll to WebElement");
	}
	
	public void scrollToElementAndClick(WebElement element){
		scrollToElement(element);
		element.click();
		log.info("element is clicked : "+element.toString());
	}
	
	public void scrollIntoView(WebElement element){
		log.info("scroll to element : "+element.toString());
		executeScript("arguments[0].scrollIntoView()", element);
	}
	
	public void scrollIntoViewAndClick(WebElement element){
		scrollIntoView(element);
		element.click();
		log.info("element is clicked : "+element.toString());
	}
	
	public void scrollDownVertically(){
		executeScript("window.scrollTo(0, document.body.scrollHeight)");
		log.info("scroll down vertically");
	}
	
	public void scrollUpVertically(){
		executeScript("window.scrollTo(0, -document.body.scrollHeight)");
		log.info("scroll up vertically");
	}
	
	
	/**
	 * this method will scroll till given pixel(ex: 1500)
	 * @param pixel
	 */
	public void scrollDownByPixel(int pixel){;
		executeScript("window.scrollBY(0, "+pixel+")");
	}
	
	public void scrollUpByPixel(int pixel){
		executeScript("window.scrollBY(0,-"+pixel+")");
	}
	
	/**
	 * this method will zoom screen by given percentage%(ex: 100%)
	 */
	public void zoomScreenByPercentage(int percentage){
		executeScript("document.body.style.zoom = '"+percentage+"%'");
	}
	
	/**
	 * this method will click on element
	 * @param element
	 */
	public void clickElement(WebElement element){
		executeScript("arguments[0].click();", element);
		log.info("click on element");
	}
}
