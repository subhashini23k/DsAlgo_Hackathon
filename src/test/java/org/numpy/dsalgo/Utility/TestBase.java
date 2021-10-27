package org.numpy.dsalgo.Utility;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class TestBase {
	
	  public WebDriver driver;

	 @BeforeClass
	  public void beforeClass()
	  {
	  driver = LaunchBrowser.launchBrowser(driver, "Chrome", "https://dsportalapp.herokuapp.com");
	  Reporter.log("Welcome to Home page");
	  }

	  @AfterClass
	  public void afterClass()
	  {
		  LaunchBrowser.quitBrowser(driver);
	  }

}
