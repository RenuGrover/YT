package org.testing.Pages;

import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testing.Base.Base;

public class Video_Play
{
	public Properties pr;
	public ChromeDriver driver;
	
	public Video_Play(ChromeDriver driver, Properties pr)
	{
		this.driver=driver;
		this.pr=pr;
	}
	
	public void VideoPlay() throws InterruptedException
	{
		List<WebElement> allvideo=driver.findElements(By.xpath(pr.getProperty("Video")));
		System.out.println("Number of Videos " + allvideo.size());
		allvideo.get(2).click();
		Thread.sleep(2000);
	}
	
}
