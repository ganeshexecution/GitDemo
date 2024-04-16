package com.qa.testng;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

public class TC_OrangeHRMlogoSS extends TestBase
{
	
	@Test(priority=1)
	public void elementScreenshot() throws IOException 
	{
		File src = orangehrmOR.getOrangeHRMlogo().getScreenshotAs(OutputType.FILE);
		String path = System.getProperty("user.dir")+"/Screenshots/" + "OrangeHRMlogo.png";
		File target = new File(path);
		FileUtils.copyFile(src, target);		
	}
}
	
