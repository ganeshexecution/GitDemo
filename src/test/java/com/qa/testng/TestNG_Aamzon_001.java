package com.qa.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_Aamzon_001 
{
	WebDriver driver;

	@BeforeMethod
	public void setUp() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Capgemini\\Downloads-Selenium+Java\\Module 4\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://www.amazon.com");
		Thread.sleep(3000);
	}
	@Test(priority=1)
	public void verifyPageTitleTest()
	{
		String title = driver.getTitle();
		System.out.println("the title of the page is :" + title);

		Assert.assertEquals(title,"Amazon.com. Spend less. Smile more.");
	}
	@Test(priority=2)
	public void verifySearchBarTest()
	{
		boolean x = driver.findElement(By.id("twotabsearchtextbox")).isDisplayed();
		Assert.assertTrue(x);
	}

	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
