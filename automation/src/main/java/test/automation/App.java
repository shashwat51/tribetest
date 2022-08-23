package test.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.tribe.config.Config;
import com.tribe.pages.BootcampPage;
import com.tribe.pages.HomePage;
import com.tribe.pages.LoginPage;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
    	 WebDriver driver ;
    	 Config newconfig = new Config();
    	 driver= newconfig.initialize();
    	 driver.get("https://macallan-app-qa.tribehome.com/");
    	 Thread.sleep(3000);
    	 LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
    	 loginPage.loginToApplication("usernameUpdateHere", "passwordUpdateHere");
    	 HomePage homePage = PageFactory.initElements(driver, HomePage.class);
    	 homePage.homePageLoad();
    	 homePage.amenitiesPageLoad();
    	 BootcampPage bootPage = PageFactory.initElements(driver, BootcampPage.class);
    	 bootPage.openToddlerLink();
    	 bootPage.openBookingLink();
  	  
    }
    
}
