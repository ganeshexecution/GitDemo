package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffPages
{
				WebDriver driver;

				@FindBy(linkText="Create Account")
				public
				WebElement Create;
				public WebElement getCreate()
				{		
					return Create;
				}
			
				
				@FindBy(xpath="html/body/center/form/div/table[2]/tbody/tr[3]/td[3]/input")
				public
				WebElement Name;
				public WebElement getName()
				{
					return Name;
				}
				
				
				@FindBy(xpath="html/body/center/form/div/table[2]/tbody/tr[7]/td[3]/input")
				public
				WebElement mail;
				public WebElement getmail()
				{
					return mail;
		
				}
				public RediffPages(WebDriver rDriver) 
				{		
					this.driver = rDriver;
					PageFactory.initElements(rDriver, this);
				}
				
	}
