package org.testing.TestScripts;

import org.testing.Base.BaseClass;
import org.testing.Pages.HomePage;
import org.testing.Pages.Login;
import org.testing.Pages.Logout;
import org.testng.annotations.Test;

public class TC3 extends BaseClass {
		
	@Test
	public void ClickOnSubscription() throws Exception
	{
		Login login=new Login(driver,pr);
		login.signin("testutube202@gmail.com", "Password@007");
		Thread.sleep(2000);
	
		HomePage sub=new HomePage(driver,pr);
		sub.clickSubscription();
		System.out.println("Subscribed Succesfully");
		
		Logout signout=new Logout(driver,pr);
		signout.signOut();	
	}
	
}

