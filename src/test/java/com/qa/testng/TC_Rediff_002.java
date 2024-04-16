package com.qa.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.qa.pages.RediffPages;

public class TC_Rediff_002
{

	@Test
	public void openrediff() throws InterruptedException 
	{
		//1. Open the browser
		System.setProperty("webdriver.chrome.driver","C:\\Capgemini\\Downloads-Selenium+Java\\Module 4\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// 2. Launch URL
		driver.get("http://www.rediff.com/");
				
				RediffPages Page = new RediffPages(driver);
								
				// 3. Click on create account
				Page.getCreate().click();
								
				String s= driver.getCurrentUrl();
				if(s.contentEquals("http://register.rediff.com/register/register.php?FormName=user_details"))
				{
					System.out.println("User is on Create account page");
				}
				else
				{
					System.out.println("User is not on Create account page");
				}
				
				// 4. enter name as Kim smith
				Page.getName().sendKeys("Kim smith");
				
				// 5. enter email as smith_test
				Page.getmail().sendKeys("smith_test");
				Thread.sleep(3000);
				
				driver.close();
				
				
	}

}
