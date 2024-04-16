package com.qa.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AmazonPages {
	
	WebDriver driver;

	// Category dropdown list
	// search text field
	// maginifier button

	//	Syntax:
	//		
	//	@FindBy(locator="value")
	//	WebElement ref_name;
	//	
	//	public WebElement getref_name() {
	//		return ref_name;
	//	}


	@FindBy(id="searchDropdownBox")
	WebElement Category;	
	public Select getCategory() 
	{
		Select Cat = new Select(Category);		
		return Cat;
	}

	@FindBy(id="twotabsearchtextbox")
	WebElement SearchTxtField;

	public WebElement getSearchTxtField() {
		return SearchTxtField;
	}

	@FindBy(id="nav-search-submit-button")
	WebElement MagnifierBtn;

	public WebElement getMagnifierBtn() {
		return MagnifierBtn;
	}
	
	@FindAll(@FindBy(xpath="//span[@class='a-size-medium a-color-base a-text-normal']"))
	List<WebElement> allItems;
	
	public List<WebElement> getallItems(){
		return allItems;
	}
	
	@FindBy(linkText="Careers")
	WebElement CareersLink;
	public WebElement getCareersLink()
	{
		return CareersLink;
	}
	
	@FindBy(id="nav-logo-sprites")
	WebElement AmazonLogo;
	public WebElement getAmazonLogo()
	{
		return AmazonLogo;
	}
	
	public AmazonPages(WebDriver rDriver) {		
		this.driver = rDriver;
		PageFactory.initElements(rDriver, this);
		
	}
	
	
}
