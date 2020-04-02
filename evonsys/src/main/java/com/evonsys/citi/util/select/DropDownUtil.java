package com.evonsys.citi.util.select;

import java.util.LinkedList;
import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.evonsys.citi.util.logger.LoggerUtil;

public class DropDownUtil {
	private Logger log = LoggerUtil.getLogger(DropDownUtil.class);
	private WebDriver driver;
	Select sel;        
	public DropDownUtil(WebDriver driver){
		this.driver = driver;
		log.info("DropDown Helper object is created.");
	}
	
	public void selectByValue(WebElement element, String value){
		sel = new Select(element);
		sel.selectByValue(value);
		log.info("selected the value : "+value);
	}
	
	public void selectByIndex(WebElement element, int index){
		sel = new Select(element);
		sel.selectByIndex(index);
		log.info("selected by index : "+index);
	}
	
	public void selectByVisibleText(WebElement element, String visibleText){
		sel = new Select(element);
		sel.selectByVisibleText(visibleText);
		log.info("selected by visibile text : "+ visibleText);
	}
	
	public void deselectByValue(WebElement element, String value){
		sel = new Select(element);
		sel.deselectByValue(value);
		log.info("deselect by value : "+ value);
	}
	
	public void deselectByIndex(WebElement element, int index){
		sel = new Select(element);
		sel.deselectByIndex(index);
		log.info("deselect by index : "+index);
	}
	
	public void deselectByVisibleText(WebElement element, String visibleText){
		sel = new Select(element);
		sel.deselectByVisibleText(visibleText);
		log.info("deselect by visible text : "+visibleText);
	}
	
	public List<String> getAllDropDownData(WebElement element){
		sel = new Select(element);
		List<WebElement> elementList = sel.getOptions();
		List<String> opts = new LinkedList<String>();
		for(WebElement e: elementList){
			log.info(e.getText());
			opts.add(e.getText());
		}
		return opts;
	}
}
