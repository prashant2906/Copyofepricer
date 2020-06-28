package WebElements.BP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import WebElements.Object_Common;

public class BPObj_MyQuotes extends Object_Common

{
	//***********Start of My Quotes objects***************** 
	public WebElement MyQuotesBreadCrumbs()
	{
		return driver.findElement(By.xpath(".//*[@id='ibm-navigation-trail']/li[2]")); 
	}
	public WebElement MyQuotesTab()
	{
		return driver.findElement(By.xpath(".//a[contains(translate(text(),'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'),'my quote')]")); 
	}
	public WebElement MyQuoteCategoryDropDown()
	{
		return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div[1]/div[1]/select")); 
	}
	public WebElement MyQuoteFilterQuotesTextBox()
	{
		return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div[1]/div[2]/span/input")); 
	}
	public WebElement MyQuotesQuoteActionsDropDown()
	{
		return driver.findElement(By.xpath(".//*[@id='quoteaction']")); 
	}
	public WebElement MyQuoteDisplayList()
	{
		return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div/div/div[2]/div/div/myquotes-page/div/div[1]/div/input")); 
	}
	public WebElement MyQuoteResultTable()
	{
		return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div[2]/div")); 
	}
	public WebElement MyQuoteRefreshButton()
	{
		return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div[3]/div/a")); 
	}
	public WebElement MyQuoteResultCheckSingleCheckBox()
	{
		 return driver.findElement(By.xpath(".//*[@id='chckBoxPGCode0']")); 
	}
	public WebElement MyQuoteResultCheckAllCheckBox()
	{
		return driver.findElement(By.xpath(".//*[@id='chckBoxProfileCode']")); 
	}
	public WebElement MyQuoteExportToCVSLink()
	{
		return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div[2]/div/div/div/div/a")); 
	}
	public WebElement MyQuoteGOButton()
	{
		 return driver.findElement(By.xpath(".//a[contains(@data-ng-click,'quoteActionService(quoteaction);')]//span[contains(@class,'btn btn-primary')]")); 
	}
	//***********End of My Quotes objects***************** 
}
