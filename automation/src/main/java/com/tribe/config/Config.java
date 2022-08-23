package com.tribe.config;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Config {

	public static WebDriver driver;
	private static OSType os;

	public static WebDriver getDriver() {
		return driver;
	}

	public static void setDriver(WebDriver driver) {
		Config.driver = driver;
	}

	public OSType getOs() {
		return os;
	}

	public void setOs(OSType os) {
		this.os = os;
		 
	}

	public Config() {

	}

	public static WebDriver initialize() {
	  
	  Config conf = new Config();
	  if (System.getProperty("os.name").contains("Windows") ) {
		  conf.setOs(os.WIN);
	  } else if (System.getProperty("os.name").contains("Mac")) {
		  conf.setOs(os.MAC);
		  
	  } 
	  System.setProperty("webdriver.chrome.driver", "C:/Software/chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  
	  
	  return driver;
	  
	  
  }

}

