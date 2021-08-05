package org.testing.TestScripts;

import org.openqa.selenium.By;
import org.testing.Base.BaseClass;
import org.testing.Pages.HomePage;
import org.testing.Pages.Login;
import org.testing.Pages.Logout;
import org.testng.annotations.Test;

	public class TC5 extends BaseClass {
		
		@Test
		public void SubscribeChannel() throws Exception
		{
			
			Login signin=new Login(driver,pr);
			signin.signin("testutube202@gmail.com","Password@007");
			
			HomePage trending=new HomePage(driver,pr);
			trending.trendingVideo();
			Thread.sleep(2000);
			
			//Click on Channel subscriptions			
			driver.findElement(By.xpath(pr.getProperty("channel_subscription"))).click();
			Thread.sleep(2000);
			System.out.println("Channel has been suscribed");	
			
			Logout logout=new Logout(driver,pr);
			logout.signOut();
			System.out.println("Signed out successfully");
		}
		
	}

	
