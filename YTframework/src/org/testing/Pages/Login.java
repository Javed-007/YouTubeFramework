package org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login
{
	WebDriver driver;
	Properties pr;
	
	public Login(WebDriver driver,Properties pr)
	{
		this.driver=driver;
		this.pr=pr;
	}

	public void signin(String username,String password) throws Exception
	{
		driver.findElement(By.xpath(pr.getProperty("sign_in_button"))).click();
		driver.findElement(By.xpath(pr.getProperty("email"))).sendKeys(username);
		driver.findElement(By.xpath(pr.getProperty("next_button_after_email"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(pr.getProperty("password"))).sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(By.xpath(pr.getProperty("next_button_after_password"))).click();
		Thread.sleep(3000);	
	}
	
	
}
