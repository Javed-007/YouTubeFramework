package org.testing.TestScripts;

import org.testing.Base.BaseClass;
import org.testing.Pages.HomePage;
import org.testing.Pages.Login;
import org.testing.Pages.Logout;
import org.testng.annotations.Test;

public class TC8 extends BaseClass {
	
	@Test
	public void clickLibrary() throws Exception
	{
		Login signin=new Login(driver,pr);
		signin.signin("testutube202@gmail.com","Password@007");
		
		//Click on Library
		 HomePage lib=new HomePage(driver,pr);
		 lib.clicklibrary();
		 
		 Logout logout=new Logout(driver,pr);
			logout.signOut();
			System.out.println("Signed out successfully");
			
	}
}
