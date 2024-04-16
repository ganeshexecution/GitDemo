package com.qa.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TC_Guru_001 
{

	public static void main(String[] args) throws InterruptedException 
	{
		//1. Open the browser
		System.setProperty("webdriver.chrome.driver","C:\\Capgemini\\Downloads-Selenium+Java\\Module 4\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// 2. Launch URL
		driver.get("https://demo.guru99.com/test/newtours/");
		Thread.sleep(3000);
		
		// 3. Enter username as mercury
		driver.findElement(By.name("userName")).sendKeys("mercury");
		

		// 4. Enter password as mercury
		driver.findElement(By.name("password")).sendKeys("mercury");
		

		// 5. Click Submit button
		driver.findElement(By.xpath("//input[@type='submit']")).click();

		// 6. Click flights link
		driver.findElement(By.linkText("Flights")).click();

		// 7. Check if the user is landed on book a flight page.
		System.out.println(driver.getTitle());
		boolean a = driver.getTitle().contains("Find a Flight: Mercury Tours");
		if(a) { System.out.println("The user is on flights page"); }
		else { System.out.println("The user is not on the flights page"); }
		Thread.sleep(3000);
		
		//  8. Select the passenger count as '2'
		Select passengers = new Select(driver.findElement(By.name("passCount")));
		passengers.selectByValue("2");
		
		//  9. Select departure location as "London"
		Select depart = new Select(driver.findElement(By.name("fromPort")));
		depart.selectByValue("London");
		
		// 10. Select arrival location as "Paris" 
		Select arrive = new Select(driver.findElement(By.name("toPort")));
		arrive.selectByValue("Paris");
		
		// 11.  Close the browser.
		driver.close();

	}

}
