package org.testing.TestScripts;
import org.testing.Base.BaseClass;
import org.testing.Pages.HomePage;
import org.testing.Pages.Login;
import org.testing.Pages.Logout;
import org.testng.annotations.Test;

public class TC1 extends BaseClass {
	
	@Test
	public void trending() throws Exception
	{
		
		Login login=new Login(driver,pr);
		login.signin("testutube202@gmail.com","Password@007");
		System.out.println("Logged in successfully");
		
		HomePage play=new HomePage(driver,pr);
		play.trendingVideo();
		
		Logout logout=new Logout(driver,pr);
		logout.signOut();
		System.out.println("Signed out successfully");
		
		//Click on Trending videos
		/*driver.findElement(By.id("video-title")).click();
		Thread.sleep(2000);
		System.out.println("Trending video has been clicked");
		Thread.sleep(2000);
		
		//Logout
		driver.findElement(By.xpath("//*[@id='avatar-btn']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Sign out']")).click();
		System.out.println("Succesfully Logged out");
		*/	
	}
}
