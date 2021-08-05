package org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Logout 
{

	WebDriver driver;
	Properties pr;
	
	public Logout(WebDriver driver,Properties pr)
	{
		this.driver=driver;
		this.pr=pr;
	}
	
	public void signOut() throws InterruptedException
	{
		driver.findElement(By.xpath(pr.getProperty("account_icon_click"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(pr.getProperty("sign_out_button"))).click();
	}
		
}
