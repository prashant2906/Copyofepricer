package WebElements.IBM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import WebElements.Object_Common;

public class IBMObj_MyQuotes extends Object_Common{
	
	public WebElement MyQuotesTab()
	{
		 return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div[3]/div/div[1]/table/tbody/tr[3]/td[3]/a")); 
	}
	public WebElement QuoteActionsDropDown()
	{
		 return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div[3]/div/div[2]/myquotes-page/div/div[2]/div[1]/div[2]/select")); 
	}
	public WebElement QuoteActionsGo()
	{
		 return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div[3]/div/div[2]/myquotes-page/div/div[2]/div[1]/div[2]/a/strong/span/b")); 
	}
	public WebElement UpdateShowDetails()
	{
		 return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div[3]/div/div[2]/myquotes-page/div/div[2]/div[1]/div[3]/strong/span/a")); 
	}
	public WebElement ExportToCSV()
	{
		 return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div[3]/div/div[2]/myquotes-page/div/div[2]/div[1]/div[3]/a/strong/span/b")); 
	}
	public WebElement LNMQuoteId()
	{
		 return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div[3]/div/div[2]/myquotes-page/div/div[2]/div[3]/div[1]/table[2]/tbody/tr[1]/td/span[1]/span[2]")); 
	}
	public WebElement LNMQuoteIdTextBox()
	{
		 return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div[3]/div/div[2]/myquotes-page/div/div[2]/div[3]/div[1]/table[2]/tbody/tr[1]/td/span[2]/input")); 
	}
	public WebElement LNMCountry()
	{
		 return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div[3]/div/div[2]/myquotes-page/div/div[2]/div[3]/div[1]/table[2]/tbody/tr[2]/td/span[1]/span[2]")); 
	}
	public WebElement LNMCountryCheckboxCA()
	{
		 return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div[3]/div/div[2]/myquotes-page/div/div[2]/div[3]/div[1]/table[2]/tbody/tr[2]/td/span[2]/span[1]/input")); 
	}
	public WebElement LNMCountryCheckboxUS()
	{
		 return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div[3]/div/div[2]/myquotes-page/div/div[2]/div[3]/div[1]/table[2]/tbody/tr[2]/td/span[2]/span[2]/input")); 
	}
	public WebElement LNMLegacyQuoteId()
	{
		 return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div[3]/div/div[2]/myquotes-page/div/div[2]/div[3]/div[1]/table[2]/tbody/tr[3]/td/span[1]/span[1]")); 
	}
	public WebElement LNMLegacyQuoteIdTextBox()
	{
		 return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div[3]/div/div[2]/myquotes-page/div/div[2]/div[3]/div[1]/table[2]/tbody/tr[3]/td/span[2]/input")); 
	}
	public WebElement LNMQuoteType()
	{
		 return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div[3]/div/div[2]/myquotes-page/div/div[2]/div[3]/div[1]/table[2]/tbody/tr[4]/td/span[1]/span[2]")); 
	}
	public WebElement LNMQuoteTypeCheckboxInternal()
	{
		 return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div[3]/div/div[2]/myquotes-page/div/div[2]/div[3]/div[1]/table[2]/tbody/tr[4]/td/span[2]/span/input[1]")); 
	}
	public WebElement LNMQuoteTypeCheckboxBP()
	{
		 return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div[3]/div/div[2]/myquotes-page/div/div[2]/div[3]/div[1]/table[2]/tbody/tr[4]/td/span[2]/span/input[2]")); 
	}
	public WebElement LNMTier1name()
	{
		 return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div[3]/div/div[2]/myquotes-page/div/div[2]/div[3]/div[1]/table[2]/tbody/tr[5]/td/span[1]/span[2]")); 
	}
	public WebElement LNMTier1nameTextBox()
	{
		 return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div[3]/div/div[2]/myquotes-page/div/div[2]/div[3]/div[1]/table[2]/tbody/tr[5]/td/span[2]/input")); 
	}
	public WebElement LNMTier2name()
	{
		 return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div[3]/div/div[2]/myquotes-page/div/div[2]/div[3]/div[1]/table[2]/tbody/tr[6]/td/span[1]/span[2]")); 
	}
	public WebElement LNMTier2nameTextBox()
	{
		 return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div[3]/div/div[2]/myquotes-page/div/div[2]/div[3]/div[1]/table[2]/tbody/tr[6]/td/span[2]/input")); 
	}
	public WebElement LNMEUCustomername()
	{
		 return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div[3]/div/div[2]/myquotes-page/div/div[2]/div[3]/div[1]/table[2]/tbody/tr[7]/td/span[1]/span[2]")); 
	}
	public WebElement LNMEUCustomernameTextBox()
	{
		 return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div[3]/div/div[2]/myquotes-page/div/div[2]/div[3]/div[1]/table[2]/tbody/tr[7]/td/span[2]/input")); 
	}
	public WebElement LNMCreationDate()
	{
		 return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div[3]/div/div[2]/myquotes-page/div/div[2]/div[3]/div[1]/table[2]/tbody/tr[8]/td/span[1]/span[2]")); 
	}
	public WebElement LNMCreationDateDropDown()
	{
		 return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div[3]/div/div[2]/myquotes-page/div/div[2]/div[3]/div[1]/table[2]/tbody/tr[8]/td/span[2]/select")); 
	}
	public WebElement LNMQuoteStatus()
	{
		 return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div[3]/div/div[2]/myquotes-page/div/div[2]/div[3]/div[1]/table[2]/tbody/tr[9]/td/span[1]/span[1]")); 
	}
	public WebElement LNMQuoteStatusCheckbox()
	{
		 return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div[3]/div/div[2]/myquotes-page/div/div[2]/div[3]/div[1]/table[2]/tbody/tr[9]/td/span[2]/span/table/tbody/tr/td[1]/input")); 
	}
	public WebElement LNMNonStandardTC()
	{
		 return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div[3]/div/div[2]/myquotes-page/div/div[2]/div[3]/div[1]/table[2]/tbody/tr[10]/td/span[1]/span[2]")); 
	}
	public WebElement LNMNonStandardTCCheckboxY()
	{
		 return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div[3]/div/div[2]/myquotes-page/div/div[2]/div[3]/div[1]/table[2]/tbody/tr[10]/td/span[2]/span/input[1]")); 
	}
	public WebElement LNMNonStandardTCCheckboxN()
	{
		 return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div[3]/div/div[2]/myquotes-page/div/div[2]/div[3]/div[1]/table[2]/tbody/tr[10]/td/span[2]/span/input[2]")); 
	}
	public WebElement LNMLockStatus()
	{
		 return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div[3]/div/div[2]/myquotes-page/div/div[2]/div[3]/div[1]/table[2]/tbody/tr[11]/td/span[1]/span[2]")); 
	}
	public WebElement LNMLockStatusCheckboxY()
	{
		 return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div[3]/div/div[2]/myquotes-page/div/div[2]/div[3]/div[1]/table[2]/tbody/tr[11]/td/span[2]/span/input[1]")); 
	}
	public WebElement LNMLockStatusCheckboxN()
	{
		 return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div[3]/div/div[2]/myquotes-page/div/div[2]/div[3]/div[1]/table[2]/tbody/tr[10]/td/span[2]/span/input[2]")); 
	}
	public WebElement LNMSearchResultsCheckbox()
	{
		 return driver.findElement(By.xpath(".//*[@id='chckBoxPGCode0']")); 
	}
	
	
	
	
}
