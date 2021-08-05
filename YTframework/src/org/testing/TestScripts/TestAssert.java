package org.testing.TestScripts;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestAssert {
	
	public static void main(String[] args) throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver", "..//FbLogin//chromedriver.exe");
	
	String expectedemail="testutube202@gmail.com";
	
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.youtube.com/");
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//*[text()='Sign in'][1]")).click();
	driver.findElement(By.xpath("//input[@type='email']")).sendKeys(expectedemail);
	driver.findElement(By.xpath("//span[text()='Next']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Password@007");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[text()='Next']")).click();
	System.out.println("Logged in successfully");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id='avatar-btn']")).click();
	Thread.sleep(2000);
	WebElement emailid=driver.findElement(By.xpath("//*[@title='testutube202@gmail.com']"));
	Thread.sleep(2000);
	
	Assert.assertEquals(expectedemail, emailid.getText());	

}}