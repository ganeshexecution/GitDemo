package com.qa.testng;


import java.io.IOException;



import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_Login001 extends TestBase
{
	
	
	@Test
	public void verifyLoginTest() throws InterruptedException, IOException
	{
		
		orangehrmOR.getuserName().sendKeys(prop.getProperty("uname"));
		orangehrmOR.getpassword().sendKeys(prop.getProperty("pwd"));
		orangehrmOR.getloginbtn().click();
		Thread.sleep(3000);
		
		boolean title= driver.getCurrentUrl().contains("dashboard");
		
		if (title)
		{
			System.out.println("the user is landed on dashboard");
			Assert.assertTrue(title);			
		}
		else
		{
			captureScreenshot(driver,"TC_Login001");
			System.out.println("the user is not landed on dashboard");
			Assert.assertTrue(title);
		}	
	
	}

	
	
	
	
	
	
	
}
