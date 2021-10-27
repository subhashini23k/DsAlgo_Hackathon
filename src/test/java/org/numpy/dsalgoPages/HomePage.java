package org.numpy.dsalgoPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

	WebDriver driver;

	public HomePage(WebDriver driver){this.driver = driver;}
	
	@FindBy(xpath="//a[@href='/logout']")
	public WebElement signOut;



}
