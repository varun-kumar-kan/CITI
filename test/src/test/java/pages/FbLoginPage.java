package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FbLoginPage {

	WebDriver driver;

        public FbLoginPage(WebDriver driver){ 
                 this.driver=driver; 
        }

	//Using FindBy for locating elements
	@FindBy(how=How.XPATH, using="//input[@id='email']") WebElement emailTextBox;
	@FindBy(how=How.XPATH, using="//input[@id='pass']") WebElement passwordTextBox;
	@FindBy(xpath="//button[contains(text(),'Log In')]") WebElement signinButton;
	
        // Defining all the user actions (Methods) that can be performed in the Facebook home page

        // This method is to set Email in the email text box
	public void setEmail(String strEmail){
		emailTextBox.sendKeys(strEmail);
	}
	// This method is to set Password in the password text box
	public void setPassword(String strPassword){
		passwordTextBox.sendKeys(strPassword);
	}
	// This method is to click on Login Button
	public void clickOnLoginButton(){
		signinButton.submit();;
	}	
}