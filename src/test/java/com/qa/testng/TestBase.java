package com.qa.testng;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.qa.pages.AmazonPages;
import com.qa.pages.ClearTripPages;
import com.qa.pages.OrangeHRMpages;


public class TestBase 
{
	WebDriver driver;
	AmazonPages AmazonOR;
	OrangeHRMpages orangehrmOR;
	ClearTripPages clrtrp;
	FileInputStream fileLoc;
	Properties prop;
	JavascriptExecutor Js;
	
	@Parameters({"Browser","Url"})
	@BeforeClass
	public void setUp(String Browser,String Url) throws IOException {
		
		fileLoc = new FileInputStream("C:\\Users\\sperike\\eclipse-workspace\\TestingDay_1.Selenium\\src\\test\\java\\com\\qa\\testdata\\credentials.properties");
		prop = new Properties();
		prop.load(fileLoc);
		
		if(Browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Capgemini\\Downloads-Selenium+Java\\Module 4\\chromedriver.exe");
			driver = new ChromeDriver();
		}else if(Browser.equalsIgnoreCase("Edge")) {
			System.setProperty("webdriver.edge.driver", "D:\\Tools\\SeleniumDrivers\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();		
		driver.get(Url);
		
		orangehrmOR = new OrangeHRMpages(driver);
		AmazonOR = new AmazonPages(driver);
		clrtrp = new ClearTripPages(driver);
		
	}
	
	@AfterClass
	public void tearDown() 
	{
		driver.quit();
	}
	
	//tName : name of method annotated as @Test/ so that the screenshot should be saved with testname.png
		public void captureScreenshot(WebDriver driver, String tName) throws IOException
		{		
			TakesScreenshot ts = (TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			File target = new File(System.getProperty("user.dir")+"/Screenshots/"+tName+".png");		
			FileUtils.copyFile(source, target);
		}

}

