package org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	WebDriver driver;
	Properties pr;
	
	public HomePage(WebDriver driver,Properties pr)
	{
		this.driver=driver;
		this.pr=pr;
	
	}
	
	public void trendingVideo() throws InterruptedException
	{
		driver.findElement(By.id(pr.getProperty("trending_video"))).click();
		Thread.sleep(2000);
		System.out.println("Trending video has been clicked");
		Thread.sleep(2000);
	}
	
	public void clickHistory() throws InterruptedException
	{
		driver.findElement(By.xpath(pr.getProperty("guide_icon"))).click();;
		Thread.sleep(2000);
		driver.findElement(By.xpath(pr.getProperty("history"))).click();;	
		Thread.sleep(3000);
		System.out.println("History has been clicked");
	}
	
	public void clickSubscription()
	{
		driver.findElement(By.xpath(pr.getProperty("subscription"))).click();
		
	}
	
	public void watchlater() throws InterruptedException
	{
		driver.findElement(By.xpath(pr.getProperty("guide_icon"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(pr.getProperty("watch_later"))).click();
		Thread.sleep(2000);
	}
	
	public void clicklibrary() throws InterruptedException
	{
		driver.findElement(By.xpath(pr.getProperty("guide_icon"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(pr.getProperty("library"))).click();;
		Thread.sleep(1000);
		System.out.println("Inside Library");
	}
	
}

		

