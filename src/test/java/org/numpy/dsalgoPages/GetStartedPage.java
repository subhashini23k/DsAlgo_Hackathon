package org.numpy.dsalgoPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GetStartedPage {
	private WebDriver driver;

	public GetStartedPage(WebDriver driver)
	{
	this.driver = driver;
	}
	
	@FindBy(xpath="//button[@class='btn']") WebElement getStartedbtn;
	
	public void clickGetStartedbtn() {
		getStartedbtn.click();
	}

}
