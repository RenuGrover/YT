package org.testing.TestCases;

import org.testng.annotations.Test;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testing.Assertion.Assert;
import org.testing.Base.Base;
import org.testing.Pages.Login;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testing.Utilities.Logs;
import org.testing.Utilities.Screenshot;
import org.testng.annotations.Test;

@Test
public class TC1 extends Base
{	
	public void test() throws IOException 
	{
		try
		{
			Login l = new Login(driver, pr);
			Logs.Takelogs("TC1", "login successfully done");
			l.Signin("renugrover654@gmail.com", "renu@18mp");
			Thread.sleep(6000);
			
			WebElement Trend = driver.findElement(By.xpath(pr.getProperty("Trending")));
			Trend.click();
			Screenshot.TakeScreenshot(driver, "D:\\ScreenshotTC's\\1.png");
			Logs.Takelogs("TC1", "Testcase1 pass succesfully");
			String expected_url="https://www.youtube.com/feed/trending";
			//Assert.assertEquals(driver.getCurrentUrl(), expected_url);
			//Assert.Stringcompare(driver.getCurrentUrl(), expected_url);
			Assert.Stringcompare(driver.getCurrentUrl(), expected_url);
			org.testng.Assert.assertTrue(Assert.Stringcompare(driver.getCurrentUrl(), expected_url));
			
			Thread.sleep(8000);
		}
		catch(Exception e)
		{
			Screenshot.TakeScreenshot(driver, "D:\\ScreenshotTC's\\2.png");
		}
	
	}
	
	
}
