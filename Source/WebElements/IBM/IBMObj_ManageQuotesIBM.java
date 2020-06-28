package WebElements.IBM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import WebElements.Object_Common;

public class IBMObj_ManageQuotesIBM extends Object_Common
{
	public WebElement CreateANewQuoteLink()
	{
		return driver.findElement(By.xpath(".//a[contains(translate(text(), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'),'create a new quote')]"));
	}
	
	// *********** Start - Overview Tab ************

	public WebElement OverviewTabSelectCounty()
	{
		 return driver.findElement(By.xpath(".//select[contains(@title,'Select Country')]")); 
	}
	public WebElement OverviewTabRequesterPhone()
	{
		 return driver.findElement(By.xpath(".//input[contains(@title,'Requester Phone')]")); 
	}
	public WebElement OverviewTabQuoteName()
	{
		 return driver.findElement(By.xpath(".//input[contains(@title,'Quote Name')]")); 
	}
	public WebElement OverviewTabOpportunityID()
	{
		 return driver.findElement(By.xpath(".//input[contains(@title,'Opportunity Id')]")); 
	}
	public WebElement OverviewTabOpportunityOwnerName()
	{
		 return driver.findElement(By.xpath(".//input[contains(@title,'Opportunity Owner Name')]")); 
	}
	public WebElement OverviewTabChannelIndicator()
	{
		 return driver.findElement(By.xpath(".//select[contains(@name,'Select Channel Indicator')]")); 
	}
	public WebElement OverviewTabSolutionType()
	{
		 return driver.findElement(By.xpath(".//select[contains(@name,'Select Solution type')]")); 
	}
	public WebElement OverviewTabSaveAndContinueButton()
	{
		 return driver.findElement(By.xpath(".//button[contains(@data-ng-click,'saveQuoteOverview()')]")); 
	}

	// *********** End - Overview Tab ************
	
	// *********** Start - Manage Configuration Tab ************
	
	public WebElement ManageConfigTabBrowseText()
	{
		 return driver.findElement(By.xpath(".//input[contains(@title,'Upload file')]")); 
	}
	
	
	// *********** End - Manage Configuration Tab ************
}
