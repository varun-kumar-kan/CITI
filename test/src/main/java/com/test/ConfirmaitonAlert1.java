package com.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmaitonAlert1 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./src/main/java/drivers/chromedriver.exe"); //mention dummy path or variable that stores chrome driver path 
	WebDriver driver = new ChromeDriver(); 
	String URL = "https://selenium08.blogspot.com/2019/07/alert-test.html"; 
	 driver.get(URL);
	 Thread.sleep(5000);
	driver.manage().window().maximize();
	Thread.sleep(4000);
	WebElement element = driver.findElement(By.xpath("//button[@id='confirm']")); 
	Thread.sleep(3000);  
	element.click();
	  Thread.sleep(3000);
	// Switching to alert from web page. 
	   Alert alert = driver.switchTo().alert(); 

	   //alert.accept(); 
	   alert.dismiss();
	 // driver.close(); 
}
}
