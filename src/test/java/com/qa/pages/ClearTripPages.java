package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ClearTripPages 
{
	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/div[2]/label[1]/div[1]/span")
	WebElement onewaybtn;	
	public WebElement getonewaybtn() 
	{			
		return onewaybtn;
	}
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/div[3]/div[1]/div[1]/div/div/div/input")
	WebElement fromtxtbox;	
	public WebElement getfromtxtbox() 
	{	
		
		return fromtxtbox;
	}
		
	@FindBy(xpath="//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/div[3]/div[1]/div[5]/div/div/div/input")
	WebElement totxtbox;	
	public WebElement gettotxtbox() 
	{	
		
		return totxtbox;
		
	}
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div/div[1]/div[1]/div[2]/div/div[3]/div[3]/div/div/div/div/button")
	WebElement Datefld;	
	public WebElement getDatefld() 
	{			
		return Datefld;
	}
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/div[3]/div[3]/div/div/div/div/div/ul/div[2]/div/div[2]/div[1]/div[3]/div[5]/div[4]/div[1]/div[1]")
	WebElement Datevalue;
	public WebElement getDatevalue()
	{
		return Datevalue;
	}
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div/div[1]/div[1]/div[2]/div/div[4]/div/div[1]/div[1]/div/select")
	WebElement Adultfld;	
	public Select getAdultfld() 
	{
		Select Adult = new Select(Adultfld);		
		return Adult;
	}
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div/div[1]/div[1]/div[2]/div/div[4]/div/div[1]/div[3]/div/select")
	WebElement Childfld;	
	public Select getChildfld() 
	{
		Select Child = new Select(Childfld);		
		return Child;
	}
	
	@FindBy(xpath="//*[@class='pr-1 fw-600']")
	WebElement MoreOptns;
	public WebElement getMoreOptns()
	{
		return MoreOptns;
	}
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/div[6]/div/div[1]/div/select")
	WebElement ClassofTrvl;	
	public Select getClassofTrvl() 
	{
		Select Class = new Select(ClassofTrvl);		
		return Class;
	}
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/div[6]/div/div[3]/div/div/div/input")
	WebElement Preference;	
	public WebElement getPreference() 
	{			
		return Preference;
	}
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/div[8]/div[2]/button")
	WebElement Searchbtn;	
	public WebElement getSearchbtn() 
	{			
		return Searchbtn;
	}
	
	public ClearTripPages(WebDriver rDriver) 
	{		
		this.driver = rDriver;
		PageFactory.initElements(rDriver, this);
	}
	
}
