package com.qa.testscripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class TC_Google_001 
{

	
	public  void openbrowser() throws InterruptedException 
	{
		//1. Open the browser
		System.setProperty("webdriver.chrome.driver","C:\\Capgemini\\Downloads-Selenium+Java\\Module 4\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// 2. Launch URL
		driver.get("http://www.google.in/");		

		//  3. Type Automation Testing in search field 
		driver.findElement(By.name("q")).sendKeys("Automation Testing");
		Thread.sleep(3000);

		// 4. Get all the items displayed from the auto suggest drop list
		List<WebElement> allItems = driver.findElements(By.className("sbct"));
		System.out.println("Total no. of items loaded are: " + allItems.size());
		for (WebElement item : allItems)
		{
			System.out.println(item.getText());
		}

		// 5.Submit the input
		driver.findElement(By.name("q")).submit();
		Thread.sleep(3000);

		// 6. Check the title has search term or not  
		System.out.println(driver.getTitle());
		boolean a = driver.getTitle().contains("Automation Testing - Google Search");
		if(a) { System.out.println("The user is on title page"); }
		else { System.out.println("The user is not on the tite page"); }
		Thread.sleep(3000);
		//  7. close the browser
		driver.close();

	}

}
