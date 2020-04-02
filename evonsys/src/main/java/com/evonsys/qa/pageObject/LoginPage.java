package com.evonsys.qa.pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.evonsys.citi.base.TestBase;

public class LoginPage extends TestBase{
	//initializing the page object
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	//page elements
	@FindBy(name="identifier")
	private WebElement txt_username;
	
	@FindBy(id="identifierNext")
	private WebElement btn_Next;

	public WebElement getTxt_username() {
		return txt_username;
	}

	public WebElement getBtn_Next() {
		return btn_Next;
	}


}
