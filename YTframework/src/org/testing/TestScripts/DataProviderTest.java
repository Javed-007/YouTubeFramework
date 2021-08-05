package org.testing.TestScripts;
import java.io.File;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class DataProviderTest 
{
	WebDriver driver;
	@Test(dataProvider="dp")
	public void testcase(String name,String Password) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "..//FbLogin//chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys(name);
		Thread.sleep(2000);
		driver.findElement(By.name("pass")).sendKeys(Password);
		
	}
	
	@DataProvider
	
	public Object[][] dp() throws BiffException, IOException
	{
		File f=new File("C:\\Users\\91987\\Desktop\\Book1.xls");
		Workbook wk=Workbook.getWorkbook(f);
		Sheet st=wk.getSheet(0);
		
		int r=st.getRows();
		int c=st.getColumns();
		
		Object[][] ob=new Object[3][2];
		
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				Cell wc=st.getCell(j, i);
				ob[i][j]=wc.getContents();	
			}
		}
		return ob;
		
	}
	
	
}

