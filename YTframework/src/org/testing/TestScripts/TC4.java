package org.testing.TestScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testing.Base.BaseClass;
import org.testing.Pages.HomePage;
import org.testing.Pages.Login;
import org.testing.Pages.Logout;
import org.testng.annotations.Test;

public class TC4 extends BaseClass {
	
	@Test
	public void like() throws Exception
	{
		Login signin=new Login(driver,pr);
		signin.signin("testutube202@gmail.com","Password@007");
		
		HomePage trending=new HomePage(driver,pr);
		trending.trendingVideo();
		
		/*Click on Trending videos
		driver.findElement(By.id("video-title")).click();
		Thread.sleep(2000);
		System.out.println("Trending video has been clicked");
		Thread.sleep(2000);
		*/
		
		//Like
		List<WebElement> ls=driver.findElements(By.xpath(pr.getProperty("like_button")));
		Thread.sleep(2000);
		ls.get(6).click();
		
		Logout logout=new Logout(driver,pr);
		logout.signOut();
		System.out.println("Signed out successfully");
		
		
	}
	
}