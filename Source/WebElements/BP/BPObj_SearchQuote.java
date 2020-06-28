package WebElements.BP;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import WebElements.Object_Common;

public class BPObj_SearchQuote extends Object_Common
{
	//***********Start of SearcQuote objects***************** 
			public WebElement SearchQuoteLink()
			{
				 return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div/div/div[2]/div/div/dashboard-page/div/div[1]/div/a[2]")); 
			}
			public WebElement SearchQuoteBreadCrumbs()
			{
				 return driver.findElement(By.xpath(".//*[@id='ibm-navigation-trail']/li[2]")); 
			}
			public WebElement SearchQuoteTab()
			{
					 return driver.findElement(By.xpath(".//*[@id='ibm-primary-tabs']/ul/li[2]/a")); 
			}
			public WebElement SearchQuoteSearchOnDropDown()
			{
				 return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div[1]/div[1]/select")); 
			}
			public WebElement SearchQuoteSearchForDropDown()
			{
				 return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div[1]/div[2]/input[1]")); 
			}
			public WebElement SearchQuoteResultDisplayList()
			{
				 return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div/div/div[2]/div/div/quotesearch-page/div/div[1]/div/input")); 
			}
			public WebElement SearchQuoteQuoteFilterQuotesTextBox()
			{
				 return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div[3]/div[1]/span/input")); 
			}
			public WebElement SearchQuoteQuoteActionsDropDown()
			{
				 return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div[3]/div[2]/select")); 
			}
			public WebElement SearchQuoteRefreshButton()
			{
				 return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div[5]/div/a")); 
			}
			public WebElement SearchQuoteResutlLabel()
			{
				 return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div[2]/div")); 
			}
			public WebElement SearchQuoteResultTable()
			{
				 return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div[4]/div")); 
			}
			public WebElement SearchResultCheckAllCheckBox()
			{
				 return driver.findElement(By.xpath(".//*[@id='chckBoxProfileCode']")); 
			}
		//***********End of SearchQuote objects***************** 
}
