package WebElements.IBM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import WebElements.Object_Common;

public class IBMObj_InitialDupScreen extends Object_Common {
	public WebElement InitialDupScreenTab()
	{
		 return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div[3]/div/div[1]/table/tbody/tr[3]/td[4]/a")); 
	}
	public WebElement CountryDropDown()
	{
		 return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div[3]/div/div[2]/initialduplicatescreening-page/div/div/div[2]/div[3]/div/div/select")); 
	}
	public WebElement SearchCriteriaDropDown()
	{
		 return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div[3]/div/div[2]/initialduplicatescreening-page/div/div/div[2]/div[3]/div/div/table/tbody/tr/td[2]/table/tbody/tr/td[1]/select")); 
	}
	public WebElement SearchCriteriaTextBox()
	{
		 return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div[3]/div/div[2]/initialduplicatescreening-page/div/div/div[2]/div[3]/div/div/table/tbody/tr/td[2]/table/tbody/tr/td[2]/div[8]/input")); 
	}
	public WebElement SearchCriteriaCheckBox()
	{
		 return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div[3]/div/div[2]/initialduplicatescreening-page/div/div/div[2]/div[3]/div/div/table/tbody/tr/td[2]/table/tbody/tr/td[3]/div/input")); 
	}
	public WebElement AddAnother()
	{
		 return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div[3]/div/div[2]/initialduplicatescreening-page/div/div/div[2]/div[3]/div/div/table/tbody/tr/td[3]/div/a/span[2]")); 
	}
	public WebElement ViewReport()
	{
		 return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div[3]/div/div[2]/initialduplicatescreening-page/div/div/div[2]/div[4]/button")); 
	}
	public WebElement DuplicatedQuotesCheckbox1()
	{
		 return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div[3]/div/div[2]/initialduplicatescreening-page/div/div/div[3]/div[5]/div[1]/div[3]/table/tbody/tr[1]/td[1]/input")); 
	}
	public WebElement DuplicatedQuotesCheckboxQuiteidTextbox1()
	{
		 return driver.findElement(By.xpath(".//*[@id='input_newQuoteId0']")); 
	}
	public WebElement DuplicatedQuotesCheckboxLegacyQuiteidTextbox1()
	{
		 return driver.findElement(By.xpath(".//*[@id='input_legacyQuoteId0']")); 
	}
	public WebElement DuplicatedQuotesCheckbox2()
	{
		 return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div[3]/div/div[2]/initialduplicatescreening-page/div/div/div[3]/div[5]/div[1]/div[3]/table/tbody/tr[2]/td[1]/input")); 
	}
	public WebElement DuplicatedQuotesCheckboxQuiteidTextbox2()
	{
		 return driver.findElement(By.xpath(".//*[@id='input_newQuoteId1']']")); 
	}
	public WebElement DuplicatedQuotesCheckboxLegacyQuiteidTextbox2()
	{
		 return driver.findElement(By.xpath(".//*[@id='input_legacyQuoteId1']")); 
	}
	public WebElement DuplicatedQuotesCheckbox3()
	{
		 return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div[3]/div/div[2]/initialduplicatescreening-page/div/div/div[3]/div[5]/div[1]/div[3]/table/tbody/tr[3]/td[1]")); 
	}
	public WebElement DuplicatedQuotesCheckboxQuiteidTextbox3()
	{
		 return driver.findElement(By.xpath(".//*[@id='input_newQuoteId2']")); 
	}
	public WebElement DuplicatedQuotesCheckboxLegacyQuiteidTextbox3()
	{
		 return driver.findElement(By.xpath(".//*[@id='input_legacyQuoteId2']")); 
	}
	public WebElement DuplicatedQuotesCheckbox4()
	{
		 return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div[3]/div/div[2]/initialduplicatescreening-page/div/div/div[3]/div[5]/div[1]/div[3]/table/tbody/tr[4]/td[1]/input")); 
	}
	public WebElement DuplicatedQuotesCheckboxQuiteidTextbox4()
	{
		 return driver.findElement(By.xpath(".//*[@id='input_newQuoteId3']")); 
	}
	public WebElement DuplicatedQuotesCheckboxLegacyQuiteidTextbox4()
	{
		 return driver.findElement(By.xpath(".//*[@id='input_legacyQuoteId3']")); 
	}
	public WebElement DuplicatedQuotesCheckbox5()
	{
		 return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div[3]/div/div[2]/initialduplicatescreening-page/div/div/div[3]/div[5]/div[1]/div[3]/table/tbody/tr[5]/td[1]/input")); 
	}
	public WebElement DuplicatedQuotesCheckboxQuiteidTextbox5()
	{
		 return driver.findElement(By.xpath(".//*[@id='input_newQuoteId4']")); 
	}
	public WebElement DuplicatedQuotesCheckboxLegacyQuiteidTextbox5()
	{
		 return driver.findElement(By.xpath(".//*[@id='input_legacyQuoteId4']")); 
	}
	public WebElement AddQuote()
	{
		 return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div[3]/div/div[2]/initialduplicatescreening-page/div/div/div[3]/div[5]/div[2]/div[1]/button[1]")); 
	}
	public WebElement RemoveQuote()
	{
		 return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div[3]/div/div[2]/initialduplicatescreening-page/div/div/div[3]/div[5]/div[2]/div[1]/button[2]")); 
	}
	public WebElement SendtoChannel()
	{
		 return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div[3]/div/div[2]/initialduplicatescreening-page/div/div/div[3]/div[5]/div[2]/div[2]/button[1]")); 
	}
	public WebElement SendforDuplicateReview()
	{
		 return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div[3]/div/div[2]/initialduplicatescreening-page/div/div/div[3]/div[5]/div[2]/div[2]/button[2]")); 
	}
}
