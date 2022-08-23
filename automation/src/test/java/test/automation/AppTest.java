package test.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.tribe.config.Config;
import com.tribe.pages.BootcampPage;
import com.tribe.pages.HomePage;
import com.tribe.pages.LoginPage;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
    	 WebDriver driver ;
    	 Config newconfig = new Config();
    	 driver= newconfig.initialize();
    	 driver.get("update the URL here");
    	 try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	 LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
    	 assertTrue(loginPage.loginToApplication("usernameUpdateHere", "passwordUpdateHere"));
    	 HomePage homePage = PageFactory.initElements(driver, HomePage.class);
    	 assertTrue(homePage.homePageLoad());
    	 assertTrue (homePage.amenitiesPageLoad());
    	 BootcampPage bootPage = PageFactory.initElements(driver, BootcampPage.class);
    	 assertTrue(bootPage.openToddlerLink());
    	 assertTrue(bootPage.openBookingLink());
     
    }
}
