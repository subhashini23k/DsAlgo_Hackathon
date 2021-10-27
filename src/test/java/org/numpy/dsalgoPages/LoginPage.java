package org.numpy.dsalgoPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver){this.driver = driver;}

	@FindBy(xpath="//input[@name='username']") WebElement userName;
	@FindBy(xpath="//input[@name='password']") WebElement passWord;
	@FindBy(xpath="//input[@value='Login']") WebElement loginBtn;

	public void loginUser(String username,String password)
	{

		userName.sendKeys(username);

		passWord.sendKeys(password);

		loginBtn.click();

		Reporter.log("Clicked the login btn in LoginPage");
	}



}
