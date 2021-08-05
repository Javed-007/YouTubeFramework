package org.testing.TestScripts;

import org.testing.Base.BaseClass;
import org.testing.Pages.HomePage;
import org.testing.Pages.Login;
import org.testing.Pages.Logout;
import org.testng.annotations.Test;

public class TC2 extends BaseClass {
	
	@Test
	public void ClickOnHistory() throws Exception
	{
		Login login=new Login(driver,pr);
		login.signin("testutube202@gmail.com", "Password@007");
		Thread.sleep(2000);
		
	HomePage history=new HomePage(driver,pr);
	history.clickHistory();	
	Logout signOut=new Logout(driver,pr);
	signOut.signOut();
		
	}
}
