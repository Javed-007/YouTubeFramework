package org.testing.TestScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAssert1 {
	
	WebDriver driver;
	
	String expected="Please enter an email address or phone number";
	String actual;
	
	@Test
	public void AssertTest()
	{
		System.setProperty("webdriver.chrome.driver", "..//FbLogin//chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://in.linkedin.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		
		driver.findElement(By.xpath("//*[text()='Sign in']")).click();
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		
		actual=driver.findElement(By.xpath("//*[text()='Please enter an email address or phone number']")).getText();
		
	try {
		Assert.assertEquals(expected, actual);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		finally {
		System.out.println("Test case passed:");
		}
		
	driver.quit();
	}
	
	
	

}
