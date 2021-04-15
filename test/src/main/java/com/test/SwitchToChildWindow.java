package com.test;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToChildWindow {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./src/main/java/drivers/chromedriver.exe"); //mention dummy path or variable that stores chrome driver path 
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");
		//click on new window button
		Thread.sleep(2000);
		driver.findElement(By.id("windowButton")).click();
		
		String pid = driver.getWindowHandle();
		Set<String> handles = driver.getWindowHandles();
		
		Iterator<String> it = handles.iterator();
		while(it.hasNext()){
			String childWindow = it.next();            
			if(!(pid.equalsIgnoreCase(childWindow))){
				driver.switchTo().window(childWindow);
				String text = driver.findElement(By.id("sampleHeading")).getText();
				System.out.println(text);
				System.out.println("child1 window title - "+driver.getTitle());
			}
		} 
		driver.switchTo().window(pid);
		System.out.println("parent window title - "+driver.getTitle());
	//------------
	/*	driver.findElement(By.cssSelector("button[id='messageWindowButton']")).click();
		while(it.hasNext()){
			String childWindow = it.next();
			System.out.println("handle is - "+driver.getWindowHandle());
			if(!(pid.equalsIgnoreCase(childWindow))){
				driver.switchTo().window(childWindow);
				System.out.println("child2 window title - "+driver.getTitle());
			}
		}*/
	}

}
