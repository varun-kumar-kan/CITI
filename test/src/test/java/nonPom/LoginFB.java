package nonPOM;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.FbHomePage;
import pages.FbLoginPage;
import tests.TestBase;
public class LoginFB extends TestBase{
	@Test
	public static void run() 
	{
		//passing user name
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("test");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//passing password
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("test");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//click on login
		driver.findElement(By.xpath("//button[contains(text(),'Log In')]")).submit();
		
	}

	

}
