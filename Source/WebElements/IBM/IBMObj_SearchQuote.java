package WebElements.IBM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import WebElements.Object_Common;

public class IBMObj_SearchQuote extends Object_Common{
	
	public WebElement SearchQuoteTab()
	{
		 return driver.findElement(By.xpath("/html/body/div[1]/div/div/div/main/div/div/div/div/div[3]")); 
	}
	/*****************************************************************************************************************************************************************************************************************************/

	public WebElement SearchQuoteTextBar()
	{
		 return driver.findElement(By.xpath("/html/body/div[1]/div/div/div/main/div/div/div/div/div[3]/div/div[2]/quotesearch-page/div")); 
	}
	
	/*****************************************************************************************************************************************************************************************************************************/

	public WebElement QuoteTypeAll()
	{
		 return driver.findElement(By.xpath("/html/body/div[1]/div/div/div/main/div/div/div/div/div[3]/div/div[2]/quotesearch-page/div/div[3]")); 
	}
	
	/*****************************************************************************************************************************************************************************************************************************/

	public WebElement QuoteTypeInternal()
	{
		 return driver.findElement(By.xpath("/html/body/div[1]/div/div/div/main/div/div/div/div/div[3]/div/div[2]/quotesearch-page/div/div[3]")); 
	}
	
	/*****************************************************************************************************************************************************************************************************************************/

	public WebElement QuoteTypeBP()
	{	
		 return driver.findElement(By.xpath("/html/body/div[1]/div/div/div/main/div/div/div/div/div[3]/div/div[2]/quotesearch-page/div/div[3]/div[1]/div/table/tbody/tr/td[1]/table/tbody")); 
	}
	
	/*****************************************************************************************************************************************************************************************************************************/

	public WebElement DropDownForSearchCriteria()
	{	
		 return driver.findElement(By.xpath("")); 
	}
	
	/*****************************************************************************************************************************************************************************************************************************/

	public WebElement RemoveLink()
	{	
		 return driver.findElement(By.xpath("/html/body/div[1]/div/div/div/main/div/div/div/div/div[3]/div/div[2]/quotesearch-page/div/div[3]/div[1]/div/table/tbody/tr/td[1]/table/tbody")); 
	}
	
	/*****************************************************************************************************************************************************************************************************************************/

	public WebElement AddAnotherLink()
	{	
		 return driver.findElement(By.xpath("/html/body/div[1]/div/div/div/main/div/div/div/div/div[3]/div/div[2]/quotesearch-page/div/div[3]/div[1]/div/table/tbody/tr/td[2]/div")); 
	}
	
	/*****************************************************************************************************************************************************************************************************************************/

	public WebElement SearchButton()
	{	
		 return driver.findElement(By.xpath("/html/body/div[1]/div/div/div/main/div/div/div/div/div[3]/div/div[2]/quotesearch-page/div/div[3]/div[2]/div/table/tbody/tr/td[2]/a")); 
	}
	
	/*****************************************************************************************************************************************************************************************************************************/

	public WebElement UpdateShowDetailsButton()
	{	
		 return driver.findElement(By.xpath("/html/body/div[1]/div/div/div/main/div/div/div/div/div[3]/div/div[2]/quotesearch-page/div/div[3]/div[2]/div/table/tbody/tr/td[2]/strong[1]")); 
	}
	
	/*****************************************************************************************************************************************************************************************************************************/

	public WebElement ClearAllbutton()
	{	
		 return driver.findElement(By.xpath("/html/body/div[1]/div/div/div/main/div/div/div/div/div[3]/div/div[2]/quotesearch-page/div/div[3]/div[2]/div/table/tbody/tr/td[2]/strong[2]/span/a")); 
	}
	
	/*****************************************************************************************************************************************************************************************************************************/

	public WebElement QuoteActionDropdown()
	{	
		 return driver.findElement(By.xpath("/html/body/div[1]/div/div/div/main/div/div/div/div/div[3]/div/div[2]/quotesearch-page/div/div[3]/div[4]/div[1]/div[2]/select")); 
	}
	
	/*****************************************************************************************************************************************************************************************************************************/

	public WebElement GoButton()
	{	
		 return driver.findElement(By.xpath("/html/body/div[1]/div/div/div/main/div/div/div/div/div[3]/div/div[2]/quotesearch-page/div/div[3]/div[4]/div[1]/div[2]/a")); 
	}
	
	/*****************************************************************************************************************************************************************************************************************************/

	public WebElement ExportToCsv()
	{	
		 return driver.findElement(By.xpath("/html/body/div[1]/div/div/div/main/div/div/div/div/div[3]/div/div[2]/quotesearch-page/div/div[3]/div[4]/div[1]/div[3]/a/strong/span/b")); 
	}
	
	/*****************************************************************************************************************************************************************************************************************************/

	public WebElement RefineByQuoteID()
	{	
		 return driver.findElement(By.xpath("/html/body/div[1]/div/div/div/main/div/div/div/div/div[3]/div/div[2]/quotesearch-page/div/div[3]/div[4]/div[3]/div[1]/table[2]/tbody/tr[1]/td/span[1]")); 
	}
	public WebElement RefineByQuoteIDTextBox()
	{	
		 return driver.findElement(By.xpath("/html/body/div[1]/div/div/div/main/div/div/div/div/div[3]/div/div[2]/quotesearch-page/div/div[3]/div[4]/div[3]/div[1]/table[2]/tbody/tr[1]/td/span[2]/input")); 
	}
	
	/*****************************************************************************************************************************************************************************************************************************/

	public WebElement RefineByCountry()
	{	
		 return driver.findElement(By.xpath("/html/body/div[1]/div/div/div/main/div/div/div/div/div[3]/div/div[2]/quotesearch-page/div/div[3]/div[4]/div[3]/div[1]/table[2]/tbody/tr[2]/td/span[1]/b")); 
	}
	public WebElement RefineByCountryCanadaCheckBox()
	{	
		 return driver.findElement(By.xpath("/html/body/div[1]/div/div/div/main/div/div/div/div/div[3]/div/div[2]/quotesearch-page/div/div[3]/div[4]/div[3]/div[1]/table[2]/tbody/tr[2]/td/span[2]/span[1]/input")); 
	}
	public WebElement RefineByCountryUSCheckBox()
	{	
		 return driver.findElement(By.xpath("/html/body/div[1]/div/div/div/main/div/div/div/div/div[3]/div/div[2]/quotesearch-page/div/div[3]/div[4]/div[3]/div[1]/table[2]/tbody/tr[2]/td/span[2]/span[2]/input")); 
	}
	
	/*****************************************************************************************************************************************************************************************************************************/

	public WebElement RefinebyLegacyQuoteId()
	{	
		 return driver.findElement(By.xpath("/html/body/div[1]/div/div/div/main/div/div/div/div/div[3]/div/div[2]/quotesearch-page/div/div[3]/div[4]/div[3]/div[1]/table[2]/tbody/tr[3]/td/span[1]/b")); 
	}
	public WebElement RefinebyLegacyQuoteIdTextBox()
	{	
		 return driver.findElement(By.xpath("/html/body/div[1]/div/div/div/main/div/div/div/div/div[3]/div/div[2]/quotesearch-page/div/div[3]/div[4]/div[3]/div[1]/table[2]/tbody/tr[3]/td/span[2]/input")); 
	}
	
	
	/*****************************************************************************************************************************************************************************************************************************/

	public WebElement RefineByQuoteType()
	{	
		 return driver.findElement(By.xpath("/html/body/div[1]/div/div/div/main/div/div/div/div/div[3]/div/div[2]/quotesearch-page/div/div[3]/div[4]/div[3]/div[1]/table[2]/tbody/tr[4]/td/span[1]")); 
	}
	public WebElement RefineByQuoteTypeInternalCheckBox()
	{	
		 return driver.findElement(By.xpath("/html/body/div[1]/div/div/div/main/div/div/div/div/div[3]/div/div[2]/quotesearch-page/div/div[3]/div[4]/div[3]/div[1]/table[2]/tbody/tr[4]/td/span[2]/span/input[1]")); 
	}


	public WebElement RefineByQuoteTypeBPCheckBox()
	{	
		 return driver.findElement(By.xpath("/html/body/div[1]/div/div/div/main/div/div/div/div/div[3]/div/div[2]/quotesearch-page/div/div[3]/div[4]/div[3]/div[1]/table[2]/tbody/tr[4]/td/span[2]/span/input[2]")); 
	}

	/*****************************************************************************************************************************************************************************************************************************/

	public WebElement RefineByTier1Name()
	{	
		 return driver.findElement(By.xpath("/html/body/div[1]/div/div/div/main/div/div/div/div/div[3]/div/div[2]/quotesearch-page/div/div[3]/div[4]/div[3]/div[1]/table[2]/tbody/tr[5]/td/span[1]/span[1]")); 
	}
	
	
	public WebElement RefineByTier1NameTextBox()
	{	
		 return driver.findElement(By.xpath("/html/body/div[1]/div/div/div/main/div/div/div/div/div[3]/div/div[2]/quotesearch-page/div/div[3]/div[4]/div[3]/div[1]/table[2]/tbody/tr[5]/td/span[2]/input")); 
	}

	/*****************************************************************************************************************************************************************************************************************************/

	public WebElement RefineByTier2Name()
	{	
		 return driver.findElement(By.xpath("/html/body/div[1]/div/div/div/main/div/div/div/div/div[3]/div/div[2]/quotesearch-page/div/div[3]/div[4]/div[3]/div[1]/table[2]/tbody/tr[6]/td/span[1]/span[1]")); 
	}


	public WebElement RefineByTier2NameTextBox()
	{	
		 return driver.findElement(By.xpath("/html/body/div[1]/div/div/div/main/div/div/div/div/div[3]/div/div[2]/quotesearch-page/div/div[3]/div[4]/div[3]/div[1]/table[2]/tbody/tr[6]/td/span[2]/input")); 
	}

	/*****************************************************************************************************************************************************************************************************************************/

	public WebElement RefineByEUCustomerName()
	{	
		 return driver.findElement(By.xpath("/html/body/div[1]/div/div/div/main/div/div/div/div/div[3]/div/div[2]/quotesearch-page/div/div[3]/div[4]/div[3]/div[1]/table[2]/tbody/tr[7]/td/span[1]/span[1]")); 
	}


	public WebElement RefineByEUCustomerNameTextBox()
	{	
		 return driver.findElement(By.xpath("/html/body/div[1]/div/div/div/main/div/div/div/div/div[3]/div/div[2]/quotesearch-page/div/div[3]/div[4]/div[3]/div[1]/table[2]/tbody/tr[7]/td/span[2]/input")); 
	}

	/*****************************************************************************************************************************************************************************************************************************/

	public WebElement RefineByCreationDate()
	{	
		 return driver.findElement(By.xpath("/html/body/div[1]/div/div/div/main/div/div/div/div/div[3]/div/div[2]/quotesearch-page/div/div[3]/div[4]/div[3]/div[1]/table[2]/tbody/tr[8]/td/span[1]/span[1]")); 
	}


	public WebElement RefineByCreationDateDropDown()
	{	
		 return driver.findElement(By.xpath("/html/body/div[1]/div/div/div/main/div/div/div/div/div[3]/div/div[2]/quotesearch-page/div/div[3]/div[4]/div[3]/div[1]/table[2]/tbody/tr[8]/td/span[2]/select")); 
	}

	/*****************************************************************************************************************************************************************************************************************************/

	public WebElement RefineByQuoteStatus()
	{	
		 return driver.findElement(By.xpath("/html/body/div[1]/div/div/div/main/div/div/div/div/div[3]/div/div[2]/quotesearch-page/div/div[3]/div[4]/div[3]/div[1]/table[2]/tbody/tr[9]/td/span[1]/span[2]")); 
	}


	public WebElement RefineByQuoteStatusSignedByCustomerCheckbox()
	{	
		 return driver.findElement(By.xpath("/html/body/div[1]/div/div/div/main/div/div/div/div/div[3]/div/div[2]/quotesearch-page/div/div[3]/div[4]/div[3]/div[1]/table[2]/tbody/tr[9]/td/span[2]/span/table/tbody/tr[1]/td[1]/input")); 
	}

	public WebElement RefineByQuoteStatusOngoingTransactionCheckbox()
	{	
		 return driver.findElement(By.xpath("/html/body/div[1]/div/div/div/main/div/div/div/div/div[3]/div/div[2]/quotesearch-page/div/div[3]/div[4]/div[3]/div[1]/table[2]/tbody/tr[9]/td/span[2]/span/table/tbody/tr[2]/td[1]/input")); 
	}


	public WebElement RefineByQuoteStatusSubmittedToDistributorCheckbox()
	{	
		 return driver.findElement(By.xpath("/html/body/div[1]/div/div/div/main/div/div/div/div/div[3]/div/div[2]/quotesearch-page/div/div[3]/div[4]/div[3]/div[1]/table[2]/tbody/tr[9]/td/span[2]/span/table/tbody/tr[3]/td[1]/input")); 
	}


	public WebElement RefineByQuoteStatusReturnedFromDistributorCheckbox()
	{	
		 return driver.findElement(By.xpath("/html/body/div[1]/div/div/div/main/div/div/div/div/div[3]/div/div[2]/quotesearch-page/div/div[3]/div[4]/div[3]/div[1]/table[2]/tbody/tr[9]/td/span[2]/span/table/tbody/tr[4]/td[1]/input")); 
	}


	public WebElement RefineByQuoteStatusWaitingForApprovalCheckbox()
	{	
		 return driver.findElement(By.xpath("/html/body/div[1]/div/div/div/main/div/div/div/div/div[3]/div/div[2]/quotesearch-page/div/div[3]/div[4]/div[3]/div[1]/table[2]/tbody/tr[9]/td/span[2]/span/table/tbody/tr[5]/td[1]/input")); 
	}


	public WebElement RefineByQuoteStatusRequestPricingCheckbox()
	{	
		 return driver.findElement(By.xpath("/html/body/div[1]/div/div/div/main/div/div/div/div/div[3]/div/div[2]/quotesearch-page/div/div[3]/div[4]/div[3]/div[1]/table[2]/tbody/tr[9]/td/span[2]/span/table/tbody/tr[6]/td[1]/input")); 
	}


	public WebElement RefineByQuoteStatusOnHoldCheckbox()
	{	
		 return driver.findElement(By.xpath("/html/body/div[1]/div/div/div/main/div/div/div/div/div[3]/div/div[2]/quotesearch-page/div/div[3]/div[4]/div[3]/div[1]/table[2]/tbody/tr[9]/td/span[2]/span/table/tbody/tr[7]/td[1]/input")); 
	}

		public WebElement RefineByQuoteStatusIBMApprovedCheckbox()
	{	
		 return driver.findElement(By.xpath("/html/body/div[1]/div/div/div/main/div/div/div/div/div[3]/div/div[2]/quotesearch-page/div/div[3]/div[4]/div[3]/div[1]/table[2]/tbody/tr[9]/td/span[2]/span/table/tbody/tr[8]/td[1]/input")); 
	}
		
	public WebElement RefineByQuoteStatusIBMWithdrawnCheckbox()
	{	
		 return driver.findElement(By.xpath("/html/body/div[1]/div/div/div/main/div/div/div/div/div[3]/div/div[2]/quotesearch-page/div/div[3]/div[4]/div[3]/div[1]/table[2]/tbody/tr[9]/td/span[2]/span/table/tbody/tr[9]/td[1]/input")); 
	}
	
	/*****************************************************************************************************************************************************************************************************************************/
	
	public WebElement RefineByNonStandardTC()
	{
		 return driver.findElement(By.xpath("/html/body/div[1]/div/div/div/main/div/div/div/div/div[3]/div/div[2]/quotesearch-page/div/div[3]/div[4]/div[3]/div[1]/table[2]/tbody/tr[10]/td/span[1]/span[1]")); 
	
	}
	
	public WebElement RefineByNonStandardTcYesChecBox()
	{	
		 return driver.findElement(By.xpath("/html/body/div[1]/div/div/div/main/div/div/div/div/div[3]/div/div[2]/quotesearch-page/div/div[3]/div[4]/div[3]/div[1]/table[2]/tbody/tr[10]/td/span[2]/span/input[1]")); 
	}

	public WebElement RefineByNonStandardTcNOChecBox()
	{	
		 return driver.findElement(By.xpath("/html/body/div[1]/div/div/div/main/div/div/div/div/div[3]/div/div[2]/quotesearch-page/div/div[3]/div[4]/div[3]/div[1]/table[2]/tbody/tr[10]/td/span[2]/span/input[2]")); 
	}
	/*****************************************************************************************************************************************************************************************************************************/
	public WebElement RefineByLockStatus()
	{	
		 return driver.findElement(By.xpath("/html/body/div[1]/div/div/div/main/div/div/div/div/div[3]/div/div[2]/quotesearch-page/div/div[3]/div[4]/div[3]/div[1]/table[2]/tbody/tr[11]/td/span[1]/span[1]")); 
	}

	public WebElement RefineByLockStatusYESCheckBox()
	{	
		 return driver.findElement(By.xpath("/html/body/div[1]/div/div/div/main/div/div/div/div/div[3]/div/div[2]/quotesearch-page/div/div[3]/div[4]/div[3]/div[1]/table[2]/tbody/tr[11]/td/span[2]/span/input[1]")); 
	}


	public WebElement RefineByLockStatusNOCheckBox()
	{	
		 return driver.findElement(By.xpath("/html/body/div[1]/div/div/div/main/div/div/div/div/div[3]/div/div[2]/quotesearch-page/div/div[3]/div[4]/div[3]/div[1]/table[2]/tbody/tr[11]/td/span[2]/span/input[2]")); 
	}

/**********************************************************************************************************************************************************************************************************************************/


}