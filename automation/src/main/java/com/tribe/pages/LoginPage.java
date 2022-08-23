package com.tribe.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.ID, using = "email")
	@CacheLookup
	WebElement email;
	@FindBy(how = How.ID, using = "password")
	@CacheLookup
	WebElement password;
	@FindBy(how = How.XPATH, using = "//*[@id=\"loginForm\"]/section/fieldset/div[4]/input")
	@CacheLookup
	WebElement submitButton;

	public boolean loginToApplication(String use, String pass) {
		try {
			email.sendKeys(use);
			Thread.sleep(3000);
			password.sendKeys(pass);
			Thread.sleep(3000);
			submitButton.click();
			return true;
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			driver.quit();
			e.printStackTrace();
			return false;
		}
	}
}
