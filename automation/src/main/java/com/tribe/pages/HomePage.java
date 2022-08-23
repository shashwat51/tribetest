package com.tribe.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {

	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//*[@id=\"bzng-nav\"]/div[2]/a[8]")
	@CacheLookup
	WebElement amenitiesLink;
	
	@FindBy(how = How.CLASS_NAME, using = "page-header-content")
	@CacheLookup
	WebElement homePageMessage;
	
	public boolean homePageLoad() {
		try {
			Thread.sleep(3000);
			homePageMessage.isDisplayed();
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			driver.quit();
			return false;
		}
		
	}

	public boolean amenitiesPageLoad() {
		try {
			Thread.sleep(3000);
			amenitiesLink.click();
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			driver.quit();
			return false;
		}
	}

}
