package org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testing.Base.Base;

public class Login 
//if we extend base here then browser get launched again and again
{	
	public Properties pr;
	public ChromeDriver driver;
	
	public Login(ChromeDriver driver,Properties pr) 
	{
		this.driver=driver;
		this.pr=pr;
	}

	public void Signin(String user,String pass) throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement Signin= driver.findElement(By.xpath(pr.getProperty("Signin")));
		Signin.click();
		
		WebElement email=driver.findElement(By.xpath(pr.getProperty("Email")));
		email.sendKeys("renugrover654@gmail.com");
		Thread.sleep(2000);
		
		WebElement Next=driver.findElement(By.xpath(pr.getProperty("Next1")));
		Next.click();
		Thread.sleep(2000);

		WebElement password=driver.findElement(By.xpath(pr.getProperty("Password")));
		password.sendKeys("renu@18mp");
		Thread.sleep(6000);

		WebElement Nxt= driver.findElement(By.xpath(pr.getProperty("Next2")));
		Nxt.click();
		Thread.sleep(10000);
	}
	
}
