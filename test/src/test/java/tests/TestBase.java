package tests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class TestBase {
	
	public static WebDriver driver = null;
	
	@BeforeTest
	public void initialize() throws IOException{
			
		System.setProperty("webdriver.chrome.driver", "C:/Users/malakondaiah.gola/Downloads/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();		
		//To maximize browser
                driver.manage().window().maximize();
	        //Implicit wait
        	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//To open facebook
                driver.get("https://www.facebook.com");
		
	}
	
	@AfterTest
	//Test cleanup
	public void TeardownTest()
    {
        TestBase.driver.quit();
    }

}