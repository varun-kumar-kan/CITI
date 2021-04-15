package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ConfirmationAlert {
	public static void main(String[] args)  throws NoAlertPresentException,InterruptedException {
		System.setProperty("webdriver.chrome.driver","./src/main/java/drivers/chromedriver.exe"); //mention dummy path or variable that stores chrome driver path 
		WebDriver driver = new ChromeDriver(); 
		driver.navigate().to("https://www.testandquiz.com/selenium/testing.html");   
		  driver.manage().window().maximize();
		  new Actions(driver).moveToElement(driver.findElement(By.xpath("//button[text()='Generate Confirm Box']")));
        //Handling alert boxes  
        //Click on generate alert button  
        driver.findElement(By.xpath("//button[text()='Generate Confirm Box']")).click();  
          Thread.sleep(5000);
        //Using Alert class to first switch to or focus to the alert box  
          org.openqa.selenium.Alert alert =  driver.switchTo().alert();  
          System.out.println(((org.openqa.selenium.Alert) alert).getText());
        //Using accept() method to accept the alert box  
        ((org.openqa.selenium.Alert) alert).accept();  
        //  ((org.openqa.selenium.Alert) alert).dismiss();
	}

}
