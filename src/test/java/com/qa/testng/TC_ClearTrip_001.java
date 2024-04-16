package com.qa.testng;

import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.qa.utilities.ExcelUtility;

public class TC_ClearTrip_001 extends TestBase
{

	
	@Test(dataProvider="getData")
	public void verifysearchFlightsTest(String from, String to) throws InterruptedException, IOException
	{
		SoftAssert sAssert = new SoftAssert();		
		boolean radiobutton = clrtrp.getonewaybtn().isSelected();
		System.out.println(radiobutton);
		if(radiobutton)
		{
			Reporter.log("One Way Radio Button is selected by Default", true);
			sAssert.assertTrue(radiobutton);
		}
		else
		{
			captureScreenshot(driver,"SearchFlights");
			Reporter.log("One Way Radio Button is not selected by Default", true);
			sAssert.assertTrue(radiobutton);
		}
		
		clrtrp.getfromtxtbox().sendKeys(from);
		Thread.sleep(2000);
		
		clrtrp.gettotxtbox().sendKeys(to);
		Thread.sleep(2000);
		
		clrtrp.getDatefld().click();
		Thread.sleep(2000);
		
		clrtrp.getDatevalue().click();
		Thread.sleep(2000);
		
		clrtrp.getAdultfld().selectByValue("2");
		Thread.sleep(2000);
		
		clrtrp.getChildfld().selectByValue("2");
		Thread.sleep(2000);
		
		clrtrp.getMoreOptns().click();
		Thread.sleep(2000);
		
		clrtrp.getSearchbtn().click();
		Thread.sleep(2000);
		
	}
	
	@DataProvider
	public String[][] getData() throws IOException{
		String xFile="C:\\Users\\sperike\\eclipse-workspace\\TestingDay_1.Selenium\\src\\test\\java\\com\\qa\\testdata\\New Microsoft Excel Worksheet.xlsx";
		String xSheetName="Sheet1";
		
		int rowCount = ExcelUtility.getRowCount(xFile, xSheetName);
		int cellCount = ExcelUtility.getCellCount(xFile, xSheetName, rowCount);
		
		String[][] data = new String[rowCount][cellCount];
		
		for(int i=1; i<=rowCount ;i++) {
			for(int j=0; j<cellCount; j++) {
				data[i-1][j] = ExcelUtility.getCellData(xFile, xSheetName, i, j);
			}
		}
		
//		Object[][] data = new Object[3][2];
//		// Category
//		data[0][0] = "Books";
//		data[1][0] = "Electronics";
//		data[2][0] = "Furniture";
//		
//		
//		//ItemName
//		data[0][1] = "Da vinci code";
//		data[1][1] = "Mobile phones";
//		data[2][1] = "Wooden Tables";
//		
		return data;
	}

}


