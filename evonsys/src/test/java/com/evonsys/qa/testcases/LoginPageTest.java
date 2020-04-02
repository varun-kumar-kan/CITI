package com.evonsys.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.evonsys.citi.base.TestBase;
import com.evonsys.qa.pageObject.HomePage;
import com.evonsys.qa.pageObject.LoginPage;

public class LoginPageTest extends TestBase{
	LoginPage loginPage;
	
	@Test(priority = 1)
	 public void verifyLoginPage(String un){
		String title = driver.getTitle();
		Assert.assertEquals(title, "");
		
	}
	
	public HomePage login(String un, String pwd){
		loginPage.getTxt_username().sendKeys(un);
		loginPage.getBtn_Next().click();
		return new HomePage();
	}
	@BeforeClass
	public void launchURL(){
		initialization();
		loginPage  = new LoginPage();
	}
	public LoginPageTest(){
		super();
	}
	
	@AfterClass
	public void tearDown(){
		driver.quit();
	}

}
