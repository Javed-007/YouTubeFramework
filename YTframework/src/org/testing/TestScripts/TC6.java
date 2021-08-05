package org.testing.TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testing.Base.BaseClass;
import org.testing.Pages.HomePage;
import org.testing.Pages.Login;
import org.testing.Pages.Logout;
import org.testng.annotations.Test;

public class TC6 extends BaseClass {

@Test
public void CommentOnVideo() throws Exception
{
	
	Actions ac=new Actions(driver);
	
	Login signin=new Login(driver,pr);
	signin.signin("testutube202@gmail.com","Password@007");
	
	HomePage trending=new HomePage(driver,pr);
	trending.trendingVideo();
	Thread.sleep(2000);
	ac.sendKeys(Keys.PAGE_DOWN).perform();
	Thread.sleep(2000);
	
	//Comment
	driver.findElement(By.xpath(pr.getProperty("click_comment"))).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath(pr.getProperty("comment"))).sendKeys("Nice");
	Thread.sleep(2000);
	System.out.println("Commented");
	
	Logout logout=new Logout(driver,pr);
	logout.signOut();
	System.out.println("Signed out successfully");
}

}