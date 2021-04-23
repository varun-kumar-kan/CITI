package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.FbHomePage;
import pages.FbLoginPage;
public class FbLoginTest extends TestBase{
	
	@Test
	public void init() throws Exception{

			//driver.get("https://www.facebook.com");
			FbLoginPage loginpage = PageFactory.initElements(driver, FbLoginPage.class);
			loginpage.setEmail("wewosi2318@laraskey.com");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			loginpage.setPassword("Test@1234");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			loginpage.clickOnLoginButton();
			
			
			/*FbHomePage homepage = PageFactory.initElements(driver, FbHomePage.class);
			homepage.clickOnProfileDropdown();
			homepage.verifyLoggedInUserNameText();
			homepage.clickOnLogoutLink();*/	
		}
	
}