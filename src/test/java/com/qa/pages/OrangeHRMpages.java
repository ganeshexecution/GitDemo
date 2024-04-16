package com.qa.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRMpages 
{
	WebDriver driver;
	
	@FindBy(id="txtUsername")
	
	WebElement userNamefld;
	public WebElement getuserName()
	{		
		return userNamefld;
	}	
	
	@FindBy(id="txtPassword")
	
	WebElement passwordfld;
	public WebElement getpassword()
	{		
		return passwordfld;
	}
	
	@FindBy(id="btnLogin")
	
	WebElement loginbtn;
	public WebElement getloginbtn()
	{		
		return loginbtn;
	}
	
//	@FindBy(linkText="")
//	WebElement asgnlvebtn;
//	public WebElement getasgnlvebtn()
//	{
//		return asgnlvebtn;
//	}
	
	@FindBy(xpath="//*[@id=\"divLogo\"]/img")
	
	WebElement OrangeHRMlogo;
	public WebElement getOrangeHRMlogo()
	{		
		return OrangeHRMlogo;
	}
	
	public OrangeHRMpages(WebDriver rDriver) 
	{		
		this.driver = rDriver;
		PageFactory.initElements(rDriver, this);
	}
}
