package com.evonsys.citi.util.robert;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.evonsys.citi.util.logger.LoggerUtil;
import com.evonsys.citi.util.select.DropDownUtil;

public class RobertUtil {
	private Logger log = LoggerUtil.getLogger(RobertUtil.class);
	private WebDriver driver;
	Robot robot;       
	public RobertUtil(WebDriver driver) throws AWTException{
		this.driver = driver;
		log.info("RobertUtil object is created.");
		robot = new Robot();
	}
	public void pressTabKey() throws  InterruptedException, AWTException{		
		robot.keyPress(KeyEvent.VK_TAB);
		log.info("Entered Tab key from keyboard");
		Thread.sleep(2000);	
	}
	public void pressEnterKey() throws InterruptedException, AWTException{
		robot.keyPress(KeyEvent.VK_ENTER);
		log.info("Pressed 'Enter' key from keyboard");
		Thread.sleep(2000);
	}
	public void press0() throws AWTException{
		robot.keyPress(KeyEvent.VK_0);
		log.info("Pressed 0 from keyboard");
	}
	
	public void pess1() throws AWTException{
		robot.keyPress(KeyEvent.VK_1);	
		log.info("Pressed 1 from keyboard");
	}
	
	public void press2() throws AWTException{
		robot.keyPress(KeyEvent.VK_2);
		log.info("Pressed 2 from keyboard");
	}
	public void press3(){
		robot.keyPress(KeyEvent.VK_3);
		log.info("Pressed 3 from keyboard");
	}
	public void press4(){
		robot.keyPress(KeyEvent.VK_4);
		log.info("Pressed 4 from keyboard");
	}
	public void press5(){
		robot.keyPress(KeyEvent.VK_5);
		log.info("Pressed 5 from keyboard");
	}
	public void press6(){
		robot.keyPress(KeyEvent.VK_6);
		log.info("Pressed 6 from keyboard");
	}
	public void press7(){
		robot.keyPress(KeyEvent.VK_7);
		log.info("Pressed 7 from keyboard");
	}
	public void press8(){
		robot.keyPress(KeyEvent.VK_8);
		log.info("Pressed 8 from keyboard");
	}
	public void press9(){
		robot.keyPress(KeyEvent.VK_9);
		log.info("Pressed 9 from keyboard");
	}
	public void pressAddSymbol(){
		robot.keyPress(KeyEvent.VK_ADD);
		log.info("Pressed + symbol from keyboard");
	}
	public void pressALTSymbol(){
		robot.keyPress(KeyEvent.VK_ALT);
		log.info("Pressed ALT from keyboard");
	}
	public void pressAtTheRateSymbo(){
		robot.keyPress(KeyEvent.VK_AT);
		log.info("Pressed @ from keyboard");
	}
	public void pressBackSlashSymbol(){
		robot.keyPress(KeyEvent.VK_BACK_SLASH);
		log.info("Pressed '\' from keyboard");
	}
	public void pressCircumflexSymbol(){
		robot.keyPress(KeyEvent.VK_CIRCUMFLEX);
		log.info("Pressed '^' from keyboard");
	}
	public void pressCapsLock(){
		robot.keyPress(KeyEvent.VK_CAPS_LOCK);
		log.info("Pressed 'CAPS_Lock' from keyboard");
	}
	public void pressCloseBracket(){
		robot.keyPress(KeyEvent.VK_CLOSE_BRACKET);
		log.info("Pressed ']' from keyboard");
	}
	public void pressColon(){
		robot.keyPress(KeyEvent.VK_COLON);
		log.info("Pressed ':' from keyboard");
	}
	public void pressDollar(){
		robot.keyPress(KeyEvent.VK_DOLLAR);
		log.info("Pressed '$' from keyboard");
	}
	public void pressComma(){
		robot.keyPress(KeyEvent.VK_COMMA);
		log.info("Pressed ',' from keyboard");
	}
	public void pressControl(){
		robot.keyPress(KeyEvent.VK_CONTROL);
		log.info("Pressed 'Control' from keyboard");
	}
	public void pressDownArrow(){
		robot.keyPress(KeyEvent.VK_KP_DOWN);
		log.info("Pressed Down Arrow key from keyboard");
	}
	public void pressLeftArrow(){
		robot.keyPress(KeyEvent.VK_KP_LEFT);
		log.info("Pressed 'Left' Arrow key from keyboard");
	}
	public void pressRightArrow(){
		robot.keyPress(KeyEvent.VK_KP_RIGHT);
		log.info("Pressed Right Arrow key from keyboard");
	}
	public void pressUpArrow(){
		robot.keyPress(KeyEvent.VK_KP_UP);
		log.info("Pressed Up Arrow key from keyboard");
	}
	public void pressEndArrowKey(){
		robot.keyPress(KeyEvent.VK_END);
		log.info("Pressed End key from keyboard");
	}
	public void pressUnderscoreSymbol(){
		robot.keyPress(KeyEvent.VK_UNDERSCORE);
		log.info("Pressed '_' Arrow key from keyboard");
	}
	
	public void pressEqualsSymbol(){
		robot.keyPress(KeyEvent.VK_EQUALS);
		log.info("Pressed '=' Arrow key from keyboard");
	}
	public void pressDeleteKey(){
		robot.keyPress(KeyEvent.VK_DELETE);
		log.info("Pressed 'Delete' key from keyboard");
	}
	public void pressInsertKey(){
		robot.keyPress(KeyEvent.VK_INSERT);
		log.info("Pressed 'Insert' key from keyboard");
	}
	
}