package org.testing.Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public class Base
{
public Properties pr;
public ChromeDriver driver;
ChromeOptions options=new ChromeOptions();

@BeforeMethod
public void launch() throws IOException
{

	File f = new File("../org.testing.TestCases/OR.properties");
	FileInputStream fi=new FileInputStream(f);
	pr=new Properties();
	pr.load(fi);
	
	System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
	options.addArguments("--disable-notifications");
	driver= new ChromeDriver(options);
    //Thread.sleep(2000);
	driver.get("https://www.youtube.com");
	driver.manage().window().maximize();
	
	
}
@AfterTest
public void AfterMethod() throws InterruptedException
{
	Thread.sleep(5000);
	driver.close();
}
}
