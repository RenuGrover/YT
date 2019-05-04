package org.testing.TestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testing.Base.Base;
import org.testing.Pages.Login;
import org.testing.Utilities.Screenshot;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC2 extends Base
{
	
	@Test
	public void test() throws InterruptedException, IOException
	{
		try
		{
			Login l = new Login(driver, pr);
			l.Signin("renugrover654@gmail.com", "renu@18mp");
			
			WebElement subscription=driver.findElement(By.xpath(pr.getProperty("Subscription")));
			Thread.sleep(6000);
			subscription.click();	
			Screenshot.TakeScreenshot(driver, "D:\\ScreenshotTC's\\tc2_run.png");
			Thread.sleep(6000);
		}
		catch(Exception e)
		{
			Screenshot.TakeScreenshot(driver, "D:\\ScreenshotTC's\\tc2_fail.png");
		}
	
		
		
		
		
	}
	
}
