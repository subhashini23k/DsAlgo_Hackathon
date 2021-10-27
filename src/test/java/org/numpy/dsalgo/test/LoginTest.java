package org.numpy.dsalgo.test;

import org.numpy.dsalgo.Utility.TestBase;
import org.numpy.dsalgoPages.GetStartedPage;
import org.numpy.dsalgoPages.HomePage;
import org.numpy.dsalgoPages.LandingPage;
import org.numpy.dsalgoPages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Test;


public class LoginTest extends TestBase {
	
	
  @Test
  public void loginToDsAlgo() {
	  
	  GetStartedPage getStarted=PageFactory.initElements(driver, GetStartedPage.class);
	  
	  LandingPage landingPage=PageFactory.initElements(driver, LandingPage.class);
	  
	  LoginPage loginpage=PageFactory.initElements(driver, LoginPage.class);
	  
	  HomePage homePage=PageFactory.initElements(driver, HomePage.class);
	  
	  getStarted.clickGetStartedbtn();
	  
	  Reporter.log("Clicked on get started button");
	  	  
	  landingPage.clickSignInlink();
	  Reporter.log("Clicked on sign In link");

	  	  
	  loginpage.loginUser("SubhashiniK", "Charles123$");
	  Reporter.log("Entered username and pwd and clicked on login link");
	  
	  WebElement signOut= homePage.signOut;
	  
	  Reporter.log("is element displayed  " +signOut.isDisplayed());
	  
	  
	  
	 
	  
  }
}
