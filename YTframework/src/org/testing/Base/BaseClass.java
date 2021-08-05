package org.testing.Base;

import java.io.IOException;

//@author-Md Javed

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testing.utilities.PropertiesFile;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	
	 public static WebDriver driver;
	 public Properties pr;
	 
	@BeforeMethod
	public void BrowserLaunch() throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "..//FbLogin//chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		pr=PropertiesFile.loadProperties("../YTframework/Object.properties");
	}
	
	@AfterMethod
	public void BrowserClose()
	{
		System.out.println("Browser is about to close");
		driver.close();

	}
	

}
