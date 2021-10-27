package org.numpy.dsalgo.Utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class LaunchBrowser {

	public static WebDriver launchBrowser(WebDriver driver, String browsername, String appurl)

	{
		System.out.println("url: " + appurl);
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();

		System.out.println("Browser is unavailable");

		//Launch url
		driver.get(appurl);

		//To maximize the browser
		driver.manage().window().maximize();
		//Reporter.log("Page is scrolled by pixel");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// Thread.sleep(2000);

		return driver;

	}

	public static void quitBrowser(WebDriver driver)
	{
		driver.close();
		driver.quit();
	}
}
