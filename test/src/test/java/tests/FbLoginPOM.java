package tests;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import pomPages.FbLoginPagePOM;
public class FbLoginPOM extends TestBase {
	@Test
	public static void execute() {
 
	FbLoginPagePOM login= new FbLoginPagePOM(driver);
	
	login.setUserName("userName");
	
	login.setPassWord("password");
	
	login.clickLogin();
	
	
	
	}
	
	

}
