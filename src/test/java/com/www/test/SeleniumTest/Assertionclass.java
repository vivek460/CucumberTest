package com.www.test.SeleniumTest;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class Assertionclass {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		 driver.navigate().to("http://newtours.demoaut.com//");  
		 HomePage hp=new HomePage(driver);
		 Assert.assertTrue("Clicking on Register link",hp.clickOnRegister());
		 driver.close();
		 
		// WebElement ele=driver.findElement(By.linkText("REGISTER"));
		 
	        //Assert.assertTrue()  
	         
		
		
		
	}
	
	

}
