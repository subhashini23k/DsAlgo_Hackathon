package org.numpy.dsalgoPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class RegistrationPage {

	WebDriver driver;

	public RegistrationPage(WebDriver driver){this.driver = driver;}

	@FindBy(xpath="//input[@name='username']") WebElement userName;
	@FindBy(xpath="//input[@name='password1']") WebElement passWord1;
	@FindBy(xpath="//input[@name='password2']") WebElement passWord2;
	@FindBy(xpath="//input[@type='submit']") WebElement registerBtn;
	@FindBy(xpath="//a[@href='/login' and contains(text(),'Login ')]") WebElement loginLink;



	public void registerUser(String username,String password1,String password2) {

		userName.sendKeys(username);

		passWord1.sendKeys(password1);

		passWord2.sendKeys(password2);

		registerBtn.click();
		
		Reporter.log("Clicked on register button");

	}

	public void clickLoginInRegistrationPage() {
		loginLink.click();
	}



}
