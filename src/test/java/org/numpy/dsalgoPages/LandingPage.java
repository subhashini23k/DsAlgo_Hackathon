package org.numpy.dsalgoPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingPage {
	 WebDriver driver;

	public LandingPage(WebDriver driver){this.driver = driver;}
	
	@FindBy(xpath="//a[@href='/register']") WebElement registerLink;
	@FindBy(xpath="//a[@href='/login']") WebElement signInLink;

	public void clickRegisterlink() {registerLink.click();}
	
	public void clickSignInlink() {signInLink.click();}


}
