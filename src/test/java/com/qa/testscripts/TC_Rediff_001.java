package com.qa.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_Rediff_001 
{

	public static void main(String[] args) throws InterruptedException 
	{
		//1. Open the browser
		System.setProperty("webdriver.chrome.driver","C:\\Capgemini\\Downloads-Selenium+Java\\Module 4\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// 2. Launch URL
		driver.get("http://www.rediff.com/");
		Thread.sleep(3000);



		// 3. Check if your on home page
		System.out.println(driver.getTitle());
		
		 boolean a = driver.getTitle().contains("Rediff.com: News | Rediffmail | Stock Quotes | Shopping");
		  
		  if(a) { System.out.println("The user is on home page"); }
		  
		  else { System.out.println("The user is not on the home page"); }
		  Thread.sleep(3000);
		 

		//4.Click Sign in button 
		driver.findElement(By.linkText("Sign in")).click();	
		Thread.sleep(3000);
		System.out.println(driver.getTitle());

		//5. Check if your navigated away to Login page. 
		 boolean b = driver.getTitle().contains("Rediffmail");
		  
		  if(b) { System.out.println("The user is on Login page"); }
		  
		  else { System.out.println("The user is not on the Login page"); }
		  Thread.sleep(3000);
		 
		

		//6.Close the browser
		driver.close();

	}

}
