package com.www.test.SeleniumTest;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	public HomePage(WebDriver driver) {
		super();
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(linkText="REGISTER") WebElement reg;
	
	public boolean clickOnRegister() {
		try {
			reg.click();
			return false;
		}catch(NoSuchElementException ex) {
			System.out.println("Element not found ");
			return false;
		}
	}

}
