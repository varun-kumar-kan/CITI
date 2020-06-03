package com.evonsys.citi.testng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.evonsys.citi.base.Base;
import com.evonsys.citi.util.browserConfiguration.config.ConfigReader;
import com.evonsys.citi.util.browserConfiguration.config.ObjectReader;
import com.evonsys.citi.util.browserConfiguration.config.PropertyReader;
import com.evonsys.citi.util.pageObject.HCM_ServiceRequestPage;
import com.evonsys.citi.util.pageObject.HCM_UatLoginPage;
import com.evonsys.citi.util.select.DropDownUtil;
import com.evonsys.citi.util.wait.WaitUtil;

public class HCM_ServiceRequest extends Base {
	WaitUtil wait;
	PropertyReader reader;
	@Test
	public void login() {
		
		try {
			HCM_UatLoginPage hcmUat = new HCM_UatLoginPage(driver);
			wait = new WaitUtil(driver);
			reader = new PropertyReader();
			hcmUat.getTxt_Username().sendKeys(reader.getHcmCreationOperator6());
			wait.waitForElement(hcmUat.getTxt_Pwd(), ObjectReader.reader.getExplicitWait());
			hcmUat.getTxt_Pwd().sendKeys(reader.getVarunPassword());
			wait.waitForElement(hcmUat.getTxt_Pwd(), reader.getExplicitWait());
			hcmUat.getTxt_Pwd().sendKeys(Keys.ENTER);
			Thread.sleep(3000);
			hcmUat.getSrvce_Req().click();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test(alwaysRun = true, dependsOnMethods = "login")
	public void Srvc_Rqst(){
		try{
		HCM_ServiceRequestPage hcmSrvcReq = new HCM_ServiceRequestPage(driver);
		DropDownUtil drpdwn = new DropDownUtil(driver);
		wait = new WaitUtil(driver);
		
		reader = new PropertyReader();
		hcmSrvcReq.getSrvce_Req().click();
		//wait.waitTillFrameToBeAvailableAndSwitchTo(driver.switchTo().frame("PegaGadget1Ifr"), ObjectReader.reader.getExplicitWait());
		Thread.sleep(3000);
		//driver.switchTo().frame("PegaGadget1Ifr");
		driver.switchTo().frame(hcmSrvcReq.getFrameCurrentServicePage());
		wait.waitForElement(hcmSrvcReq.getCrt_Srvce_Req(), reader.getExplicitWait());
		hcmSrvcReq.getCrt_Srvce_Req().click();
		//drpdwn.selectByVisibleText(hcmSrvcReq.getDeptDrpdwn(), "IT")
		driver.switchTo().defaultContent();
		Thread.sleep(4000);
		driver.switchTo().frame(hcmSrvcReq.getFrameForm());
		//wait.waitForElement(hcmSrvcReq.getDeptDrpdwn(), reader.getExplicitWait());
		Thread.sleep(4000);
		drpdwn.selectByVisibleText(hcmSrvcReq.getDeptDrpdwn(), "IT");
		hcmSrvcReq.getDeptDrpdwn().sendKeys(Keys.TAB); //to enter another fielsd by tab
		//hcmSrvcReq.getDeptDrpdwn().sendKeys(Keys.BACK_SPACE);
		hcmSrvcReq.getTxtBox().sendKeys(Keys.BACK_SPACE);
		//hcmSrvcReq.getSuggetionBox().click();
		Thread.sleep(3000);
		List<WebElement> els = hcmSrvcReq.getSugBxs();
		//System.out.println(hcmSrvcReq.getSugs().size());
		
		for(int i=0; i<hcmSrvcReq.getSugBxs().size(); i++){
			System.out.println(hcmSrvcReq.getSugBxs().get(i).getText());
			if (hcmSrvcReq.getSugBxs().get(i).getText().contains("Lap")){
				System.out.println("___________inner");
				hcmSrvcReq.getSugBxs().get(i).click();
				//System.out.println(hcmSrvcReq.getSugBxs().get(i));
				
				//hcmSrvcReq.getDrpDwn().sendKeys(Keys.ENTER);			
			}
				
		}
		Thread.sleep(3000);
		Select select = new Select(hcmSrvcReq.getDrpDwn());
		select.selectByVisibleText("3 - Severe issue");
		
		
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}

}
