package com.tribe.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BootcampPage {
	WebDriver driver;

	public BootcampPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Toddler Bootcamp')]")
	@CacheLookup
	WebElement toodlerBoootcampLink;
	
	
	@FindBy(how = How.XPATH, using = "/html/body/section/section/div/section/section[2]/div/div/div[2]/button")
	@CacheLookup
	WebElement bookingTimeLink;


	public boolean openToddlerLink() {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			// get the height of the webpage and scroll to the end
			js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			Thread.sleep(3000);
			toodlerBoootcampLink.click();
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			driver.quit();
			return false;
		}

	}
	
	public boolean openBookingLink() {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			// get the height of the webpage and scroll to the end
			js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			Thread.sleep(3000);
			bookingTimeLink.click();
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			driver.quit();
			return false;
		}

	}
	
	

}
