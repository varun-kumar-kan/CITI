package pomPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FbLoginPagePOM {
	WebDriver driver;

    public FbLoginPagePOM(WebDriver driver){ 
            this.driver=driver; 
    }

	
	By UserName=By.xpath("//input[@id='email']");

	By Password=By.xpath("//input[@id='pass']");
	
	By Login=By.xpath("//button[contains(text(),'Log In')]");
	
	public void setUserName(String UName)
	{
		 driver.findElement(UserName).sendKeys(UName);
	}
	
	public void setPassWord(String Pwd)
	{
		 driver.findElement(Password).sendKeys(Pwd);
	}
		
	public void clickLogin()
	{
		 driver.findElement(Login).click();
	}

}
