package com.www.test.SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");
WebDriver driver= new ChromeDriver();
 driver.get("https://en-gb.facebook.com/login/");
 driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("vivekpachange1@gmai.com");
driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("VIVPAC@46");
driver.findElement(By.xpath("//*[@id=\"loginbutton\"]")).click();
	}

}
