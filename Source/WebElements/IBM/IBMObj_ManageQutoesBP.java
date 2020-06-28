package WebElements.IBM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import WebElements.Object_Common;

public class IBMObj_ManageQutoesBP extends Object_Common
{
// ***********************	Start - Manage Quote (BP - PC/S) ********************
	
	// ***********************	Start - Manage Quote (Header Values check) ********************
	public WebElement QuoteHeaderTab()
	{
		return driver.findElement(By.xpath(".//*[@id='currentquotetab']/li/div/div[1]")); 
	}
	public WebElement QuoteHeaderTabRemove()
	{
		return driver.findElement(By.xpath(".//*[@id='currentquotetab']/li/div/div[2]/a")); 
	}
	public WebElement QuoteHeader()
	{
		return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div[3]/div/div[2]/quoteedit-page/div/div/quoteheader-page/div/div")); 
	}
	public WebElement QuoteHeaderQuoteIDLabel()
	{
		return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div[3]/div/div[2]/quoteedit-page/div/div/quoteheader-page/div/div/div[1]/div[1]"));
	}
	public WebElement QuoteHeaderQuoteIDValue()
	{
		return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div[3]/div/div[2]/quoteedit-page/div/div/quoteheader-page/div/div/div[1]/div[2]"));
	}
	public WebElement QuoteHeaderEndUserCustomerLabel()
	{
		return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div[3]/div/div[2]/quoteedit-page/div/div/quoteheader-page/div/div/div[1]/div[3]"));
	}
	public WebElement QuoteHeaderEndUserCustomerValue()
	{
		return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div[3]/div/div[2]/quoteedit-page/div/div/quoteheader-page/div/div/div[1]/div[4]/div"));
	}
	public WebElement QuoteHeaderStatusLabel()
	{
		return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div[3]/div/div[2]/quoteedit-page/div/div/quoteheader-page/div/div/div[1]/div[5]/strong/p"));
	}
	public WebElement QuoteHeaderCountryLabel()
	{
		return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div[3]/div/div[2]/quoteedit-page/div/div/quoteheader-page/div/div/div[2]/div[1]"));
	}
	public WebElement QuoteHeaderCountryValue()
	{
		return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div[3]/div/div[2]/quoteedit-page/div/div/quoteheader-page/div/div/div[2]/div[2]"));
	}
	public WebElement QuoteHeaderTier1Label()
	{
		return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div[3]/div/div[2]/quoteedit-page/div/div/quoteheader-page/div/div/div[2]/div[3]"));
	}
	public WebElement QuoteHeaderTier1Value()
	{
		return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div[3]/div/div[2]/quoteedit-page/div/div/quoteheader-page/div/div/div[2]/div[4]"));
	}
	public WebElement QuoteHeaderQuoteTitleLabel()
	{
		return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div[3]/div/div[2]/quoteedit-page/div/div/quoteheader-page/div/div/div[3]/div[1]"));
	}
	public WebElement QuoteHeaderQuoteTitleValue()
	{
		return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div[3]/div/div[2]/quoteedit-page/div/div/quoteheader-page/div/div/div[3]/div[2]"));
	}
	public WebElement QuoteHeaderTier2Label()
	{
		return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div[3]/div/div[2]/quoteedit-page/div/div/quoteheader-page/div/div/div[3]/div[3]"));
	}
	public WebElement QuoteHeaderTier2Value()
	{
		return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div[3]/div/div[2]/quoteedit-page/div/div/quoteheader-page/div/div/div[3]/div[4]"));
	}
	public WebElement QuoteHeaderOriginatedLabel()
	{
		return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div[3]/div/div[2]/quoteedit-page/div/div/quoteheader-page/div/div/div[4]/div[1]"));
	}
	public WebElement QuoteHeaderGridDateLabel()
	{
		return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div[3]/div/div[2]/quoteedit-page/div/div/quoteheader-page/div/div/div[4]/div[3]"));
	}
	public WebElement QuoteHeaderGridDateValue()
	{
		return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div[3]/div/div[2]/quoteedit-page/div/div/quoteheader-page/div/div/div[4]/div[4]"));
	}
	public WebElement QuoteHeaderBidTypeLabel()
	{
		return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div[3]/div/div[2]/quoteedit-page/div/div/quoteheader-page/div/div/div[5]/div[1]"));
	}
	public WebElement QuoteHeaderBidTypeValue()
	{
		return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div[3]/div/div[2]/quoteedit-page/div/div/quoteheader-page/div/div/div[5]/div[2]"));
	}
	public WebElement QuoteHeaderCurrencyLabel()
	{
		return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div[3]/div/div[2]/quoteedit-page/div/div/quoteheader-page/div/div/div[5]/div[3]"));
	}
	public WebElement QuoteHeaderCurrencyValue()
	{
		return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div[3]/div/div[2]/quoteedit-page/div/div/quoteheader-page/div/div/div[5]/div[4]"));
	}
	public WebElement QuoteHeaderQuoteTypeLabel()
	{
		return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div[3]/div/div[2]/quoteedit-page/div/div/quoteheader-page/div/div/div[6]/div[1]"));
	}
	public WebElement QuoteHeaderQuoteTypeValue()
	{
		return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div[3]/div/div[2]/quoteedit-page/div/div/quoteheader-page/div/div/div[6]/div[2]"));
	}
	public WebElement QuoteHeaderOpportunityIDLabel()
	{
		return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div[3]/div/div[2]/quoteedit-page/div/div/quoteheader-page/div/div/div[6]/div[3]"));
	}
	public WebElement QuoteHeaderOpportunityIDValue()
	{
		return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div[3]/div/div[2]/quoteedit-page/div/div/quoteheader-page/div/div/div[6]/div[4]"));
	}
	public WebElement QuoteHeaderRegistrationNumLabel()
	{
		return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div[3]/div/div[2]/quoteedit-page/div/div/quoteheader-page/div/div/div[7]/div[1]"));
	}
	public WebElement QuoteHeaderRegistrationNumValue()
	{
		return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div[3]/div/div[2]/quoteedit-page/div/div/quoteheader-page/div/div/div[7]/div[2]"));
	}
	public WebElement QuoteHeaderQuoteManagerLabel()
	{
		return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div[3]/div/div[2]/quoteedit-page/div/div/quoteheader-page/div/div/div[7]/div[3]"));
	}
	public WebElement QuoteHeaderQuoteManagerValue()
	{
		return driver.findElement(By.xpath(".//input[contains(@id,'quoteManagerText')]"));
	}
	public WebElement QuoteHeaderChangeQuoteManagerbutton()
	{
		return driver.findElement(By.xpath(".//button[contains(@data-ng-click,'changeQuoteManagerHeader()')]"));
	}
	// ***********************	End - Manage Quote (Header Values check) ********************
	
	// ***********************	Start - BP information tab ********************
	public WebElement BPInformationTab()
	{
		return driver.findElement(By.xpath(".//*[@id='currentquotetabs']/li[1]/div/div"));
	}
	// ***********************	End - BP information tab ********************
	// ***********************	Start - Manage customer tab ********************
	
	public WebElement ManageCustomerTab()
	{
		return driver.findElement(By.xpath(".//*[@id='currentquotetabs']/li[2]/div/div"));
	}
	//***********************	End - Manage customer tab ********************
	
	// ***********************	Start - Duplicate Checking tab (Quote status = On Hold Screening)********************
	public WebElement DuplicateCheckingTab()
	{
		return driver.findElement(By.xpath(".//*[@id='currentquotetabs']/li[3]/div/div"));
	}
	public WebElement AbbreviationexplainedTable()
	{
		return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div[3]/div/div[2]/quoteedit-page/div/div/duplicatechecking-page/div/div/table/tbody/tr[1]/td/span"));
	}
	public WebElement SubmittedQuoteTable()
	{
		return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div[3]/div/div[2]/quoteedit-page/div/div/duplicatechecking-page/div/div/div[2]/div[1]/span"));
	}
	    // ***********************	Start - Duplicate Checking - View Quote section ********************
	public WebElement ViewQuotesSection()
	{
		return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div[3]/div/div[2]/quoteedit-page/div/div/duplicatechecking-page/div/div/div[3]/div[1]/span"));
	}
	public WebElement ViewQuotesCountryDropDown()
	{
		return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div[3]/div/div[2]/quoteedit-page/div/div/duplicatechecking-page/div/div/div[3]/div[3]/div/div/select"));
	}
	public WebElement ViewQuotesSearchCriteriaDropDown()
	{
		return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div[3]/div/div[2]/quoteedit-page/div/div/duplicatechecking-page/div/div/div[3]/div[3]/div/div/table/tbody/tr/td[2]/table/tbody/tr/td[1]/select"));
	}
	public WebElement ViewQuotesInputText()
	{
		return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div[3]/div/div[2]/quoteedit-page/div/div/duplicatechecking-page/div/div/div[3]/div[3]/div/div/table/tbody/tr/td[2]/table/tbody/tr/td[2]/div[8]/input"));
	}
	public WebElement ViewQuotesEUCLocalLanguageRadio()
	{
		return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div[3]/div/div[2]/quoteedit-page/div/div/duplicatechecking-page/div/div/div[3]/div[3]/div/div/table/tbody/tr/td[2]/table/tbody/tr/td[3]/div/input"));
	}
	public WebElement ViewQuotesAddAnotherLink()
	{
		return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div[3]/div/div[2]/quoteedit-page/div/div/duplicatechecking-page/div/div/div[3]/div[3]/div/div/table/tbody/tr/td[3]/div/a/span[2]"));
	}
	public WebElement ViewQuotesViewReportButton()
	{
		return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div[3]/div/div[2]/quoteedit-page/div/div/duplicatechecking-page/div/div/div[3]/div[4]/button"));
	}
	    // ***********************	End - Duplicate Checking - View Quote section ********************
	    // ***********************	Start - Duplicate Checking - Declare potential duplicated quotes section ********************
	public WebElement DeclarePotentialDuplicatedQuotesTable()
	{
		return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div[3]/div/div[2]/quoteedit-page/div/div/duplicatechecking-page/div/div/div[5]/div[1]/span"));
	}
	public WebElement QuoteIDLine1CheckBox()
	{
		return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div[3]/div/div[2]/quoteedit-page/div/div/duplicatechecking-page/div/div/div[5]/div[5]/div[1]/div[3]/table/tbody/tr[1]/td[1]/input"));
	}
	public WebElement QuoteIDLine1Input()
	{
		return driver.findElement(By.xpath(".//*[@id='input_newQuoteId0']"));
	}
	public WebElement LegacyQuoteIDLine1Input()
	{
		return driver.findElement(By.xpath(".//*[@id='input_legacyQuoteId0']"));
	}
	public WebElement QuoteIDLine2CheckBox()
	{
		return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div[3]/div/div[2]/quoteedit-page/div/div/duplicatechecking-page/div/div/div[5]/div[5]/div[1]/div[3]/table/tbody/tr[2]/td[1]/input"));
	}
	public WebElement QuoteIDLine2Input()
	{
		return driver.findElement(By.xpath(".//*[@id='input_newQuoteId1']"));
	}
	public WebElement LegacyQuoteIDLine2Input()
	{
		return driver.findElement(By.xpath(".//*[@id='input_legacyQuoteId1']"));
	}
	public WebElement QuoteIDLine3CheckBox()
	{
		return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div[3]/div/div[2]/quoteedit-page/div/div/duplicatechecking-page/div/div/div[5]/div[5]/div[1]/div[3]/table/tbody/tr[3]/td[1]/input"));
	}
	public WebElement QuoteIDLine3Input()
	{
		return driver.findElement(By.xpath(".//*[@id='input_newQuoteId2']"));
	}
	public WebElement LegacyQuoteIDLine3Input()
	{
		return driver.findElement(By.xpath(".//*[@id='input_legacyQuoteId2']"));
	}
	public WebElement QuoteIDLine4CheckBox()
	{
		return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div[3]/div/div[2]/quoteedit-page/div/div/duplicatechecking-page/div/div/div[5]/div[5]/div[1]/div[3]/table/tbody/tr[4]/td[1]/input"));
	}
	public WebElement QuoteIDLine4Input()
	{
		return driver.findElement(By.xpath(".//*[@id='input_newQuoteId3']"));
	}
	public WebElement LegacyQuoteIDLine4Input()
	{
		return driver.findElement(By.xpath(".//*[@id='input_legacyQuoteId3']"));
	}
	public WebElement AddQuoteButton()
	{
		return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div[3]/div/div[2]/quoteedit-page/div/div/duplicatechecking-page/div/div/div[5]/div[5]/div[2]/div[1]/button[1]"));
	}
	public WebElement RemoveQuoteButton()
	{
		return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div[3]/div/div[2]/quoteedit-page/div/div/duplicatechecking-page/div/div/div[5]/div[5]/div[2]/div[1]/button[2]"));
	}
	public WebElement SendToChannelButton()
	{
		return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div[3]/div/div[2]/quoteedit-page/div/div/duplicatechecking-page/div/div/div[5]/div[5]/div[2]/div[2]/button[1]"));
	}
	public WebElement SendForDuplicateReviewButton()
	{
		return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div[3]/div/div[2]/quoteedit-page/div/div/duplicatechecking-page/div/div/div[5]/div[5]/div[2]/div[2]/button[2]"));
	}
	    // ***********************	End - Duplicate Checking - Declare potential duplicated quotes section ********************
	// ***********************	End - Duplicate Checking tab (Quote status = On Hold-Screening)********************
	
	// ***********************	Start - BP Duplicated Bids tab (Quote status = On Hold-Duplicate/On Hold-Channel)********************
	public WebElement BPDuplicatedBidsTab()
	{
		return driver.findElement(By.xpath(".//*[@id='currentquotetabs']/li[3]/div/div"));
	}
	public WebElement BPDuplicatedBidsLabel()
	{
		return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div[3]/div/div[2]/quoteedit-page/div/div/quotebpduplicatedbids-page/div/div[1]"));
	}
	   //***********************	Start - Quick Apply Boxes (QAB) section ********************
	public WebElement QuickApplyBoxesLabel()
	{
		return driver.findElement(By.xpath(".//*[@id='bidscontainer']/div/div[1]/div[1]/strong"));
	}	
	public WebElement QABExpandCollapseLink()
	{
		return driver.findElement(By.xpath(".//*[@id='bidscontainer']/div/div[1]/div[2]/a"));
	}	
	public WebElement QABRemovefromHoldContinueProcessRadio()
	{
		return driver.findElement(By.xpath(".//*[@id='bidscontainer']/div/div[1]/div[3]/div[2]/div/input"));
	}	
	public WebElement QABChangeQuoteStatusToRadio()
	{
		return driver.findElement(By.xpath(".//*[@id='bidscontainer']/div/div[1]/div[3]/div[3]/div[1]/input"));
	}	
	public WebElement QABSelectQuoteStatusDropDown()
	{
		return driver.findElement(By.xpath(".//*[@id='bidscontainer']/div/div[1]/div[3]/div[3]/div[2]/select"));
	//	return driver.findElement(By.xpath(".//select[contains(@data-ng-model,'currentQuote.bpduplicatebidsData.changestatus')]"));
	}	
	public WebElement QABReasonCodeDropDown()
	{
		return driver.findElement(By.xpath(".//*[@id='bidscontainer']/div/div[1]/div[3]/div[3]/div[3]/select"));
	}
	public WebElement QABCertificationReasonCodeDropDown()
	{
		return driver.findElement(By.xpath(".//*[@id='bidscontainer']/div/div[1]/div[3]/div[4]/div/select"));
	}
	public WebElement QABReasonCommentLabel()
	{
		return driver.findElement(By.xpath(".//*[@id='bidscontainer']/div/div[1]/div[3]/div[5]/div[1]/label"));
	}
	public WebElement QABReasonCommentTextBox()
	{
		return driver.findElement(By.xpath(".//*[@id='bidscontainer']/div/div[1]/div[3]/div[5]/div[2]/textarea"));
	}
	public WebElement QABApplyButton()
	{
	    //return driver.findElement(By.xpath(".//*[@id='bidscontainer']/div/div[1]/div[3]/div[6]/button"));
		return driver.findElement(By.xpath(".//button[contains(@data-ng-click,'quickApply();')]"));
	}
	public WebElement BPDduplicatedBidsSubmitButton()
	{
		return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div[3]/div/div[2]/quoteedit-page/div/div/quotebpduplicatedbids-page/div/div[5]/button[1]"));
	}
	public WebElement BPDduplicatedBidsResetButton()
	{
		return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div[3]/div/div[2]/quoteedit-page/div/div/quotebpduplicatedbids-page/div/div[5]/button[2]"));
	}
	   //***********************	End - Quick Apply Boxes (QAB) section ********************
	   //***********************	Start - List of BP duplicated bids section ********************
	public WebElement ListOfBPDuplicatedBidsTable()
	{
		return driver.findElement(By.xpath(".//*[@id='bidscontainer']/div/div[2]/div/strong"));
	}
	public WebElement ListQuoteIDLine1CheckBox()
	{
		return driver.findElement(By.xpath(".//*[@id='bidscontainer']/div/div[2]/table/tbody[1]/tr[1]/td[1]/input"));
		
	}
	public WebElement ListQuoteIDLine1Label()
	{
		return driver.findElement(By.xpath(".//*[@id='bidscontainer']/div/div[2]/table/tbody[1]/tr[1]/td[2]/strong/label"));
		
	}
	   //***********************	End - List of BP duplicated bids section ********************
	   //***********************	Start - BP Duplicated Bids - View Quotes section ********************
	public WebElement ListViewQuotesTable()
	{
		return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div[3]/div/div[2]/quoteedit-page/div/div/quotebpduplicatedbids-page/div/div[3]/div[1]/strong"));
		
	}
	public WebElement ListViewQuotesSearchCriteriaLable()
	{
		return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div[3]/div/div[2]/quoteedit-page/div/div/quotebpduplicatedbids-page/div/div[3]/div[3]/div/div/table/tbody/tr/td[1]/div/label"));
	}
	public WebElement ListViewQuotesSearchCriteriaDropDown()
	{
		return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div[3]/div/div[2]/quoteedit-page/div/div/quotebpduplicatedbids-page/div/div[3]/div[3]/div/div/table/tbody/tr/td[2]/table/tbody/tr/td[1]/select"));
	}
	public WebElement ListViewQuotesSearchCriteriaInputBox()
	{
		return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div[3]/div/div[2]/quoteedit-page/div/div/quotebpduplicatedbids-page/div/div[3]/div[3]/div/div/table/tbody/tr/td[2]/table/tbody/tr/td[2]/div[8]/input"));
	}
	public WebElement ListViewQuotesEUCLocalLanguageRadio()
	{
		return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div[3]/div/div[2]/quoteedit-page/div/div/quotebpduplicatedbids-page/div/div[3]/div[3]/div/div/table/tbody/tr/td[2]/table/tbody/tr/td[3]/div/input"));
	}
	public WebElement ListViewQuotesAddAnotherLink()
	{
		return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div[3]/div/div[2]/quoteedit-page/div/div/quotebpduplicatedbids-page/div/div[3]/div[3]/div/div/table/tbody/tr/td[3]/div/a"));
	}
	public WebElement ListViewQuotesViewReportButton()
	{
		return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div[3]/div/div[2]/quoteedit-page/div/div/quotebpduplicatedbids-page/div/div[3]/div[4]/button"));
	}
	   //***********************	End - BP Duplicated Bids - View Quotes section ********************
	   //***********************	End - BP Duplicated Bids - Declare potential duplicated quotes section ********************
	public WebElement BDBDeclarePotentialDuplicatedQuotesTable()
	{
		return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div[3]/div/div[2]/quoteedit-page/div/div/quotebpduplicatedbids-page/div/div[4]/div[1]/strong"));
	}
	public WebElement BDBQuoteIDLine1CheckBox()
	{
		return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div[3]/div/div[2]/quoteedit-page/div/div/quotebpduplicatedbids-page/div/div[4]/div[5]/div[1]/div[3]/table/tbody/tr[1]/td[1]/input"));
	}
	public WebElement BDBQuoteIDLine1Input()
	{
		return driver.findElement(By.xpath(".//*[@id='input_newQuoteId0']"));
	}
	public WebElement BDBLegacyQuoteIDLine1Input()
	{
		return driver.findElement(By.xpath(".//*[@id='input_legacyQuoteId0']"));
	}
	public WebElement BDBQuoteIDLine2CheckBox()
	{
		return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div[3]/div/div[2]/quoteedit-page/div/div/quotebpduplicatedbids-page/div/div[4]/div[5]/div[1]/div[3]/table/tbody/tr[2]/td[1]/input"));
	}
	public WebElement BDBQuoteIDLine2Input()
	{
		return driver.findElement(By.xpath(".//*[@id='input_newQuoteId1']"));
	}
	public WebElement BDBLegacyQuoteIDLine2Input()
	{
		return driver.findElement(By.xpath(".//*[@id='input_legacyQuoteId1']"));
	}
	public WebElement BDBQuoteIDLine3CheckBox()
	{
		return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div[3]/div/div[2]/quoteedit-page/div/div/quotebpduplicatedbids-page/div/div[4]/div[5]/div[1]/div[3]/table/tbody/tr[3]/td[1]/input"));
	}
	public WebElement BDBQuoteIDLine3Input()
	{
		return driver.findElement(By.xpath(".//*[@id='input_newQuoteId2']"));
	}
	public WebElement BDBLegacyQuoteIDLine3Input()
	{
		return driver.findElement(By.xpath(".//*[@id='input_legacyQuoteId2']"));
	}
	public WebElement BDBQuoteIDLine4CheckBox()
	{
		return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div[3]/div/div[2]/quoteedit-page/div/div/quotebpduplicatedbids-page/div/div[4]/div[5]/div[1]/div[3]/table/tbody/tr[4]/td[1]/input"));
	}
	public WebElement BDBQuoteIDLine4Input()
	{
		return driver.findElement(By.xpath(".//*[@id='input_newQuoteId3']"));
	}
	public WebElement BDBLegacyQuoteIDLine4Input()
	{
		return driver.findElement(By.xpath(".//*[@id='input_legacyQuoteId3']"));
	}
	public WebElement BDBAddQuoteButton()
	{
		return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div[3]/div/div[2]/quoteedit-page/div/div/quotebpduplicatedbids-page/div/div[4]/div[5]/div[2]/div[1]/button[1]"));
	}
	public WebElement BDBRemoveQuoteButton()
	{
		return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div[3]/div/div[2]/quoteedit-page/div/div/quotebpduplicatedbids-page/div/div[4]/div[5]/div[2]/div[1]/button[2]"));
	}
	public WebElement BDBSendToChannelButton()
	{
		return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div[3]/div/div[2]/quoteedit-page/div/div/quotebpduplicatedbids-page/div/div[4]/div[5]/div[2]/div[2]/button[1]"));
	}
	public WebElement BDBSendForDuplicateReviewButton()
	{
		return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div[3]/div/div[2]/quoteedit-page/div/div/quotebpduplicatedbids-page/div/div[4]/div[5]/div[2]/div[2]/button[2]"));
	}
	   //***********************	End - BP Duplicated Bids - Declare potential duplicated quotes section ********************
	// ***********************	End - BP Duplicated Bids tab (Quote status = On Hold-Duplicate/On Hold-Channel) ********************
	
	
	// ***********************	Start - comments/change status tab ********************
	public WebElement CommentsChangeStatusTab()
	{
		return driver.findElement(By.xpath(".//*[@id='currentquotetabs']/li[4]/div/div"));
	}
	public WebElement RemoveFromHoldContinueProcessRadio()
	{
		return driver.findElement(By.xpath(".//*[@id='commentsIdRfh']"));
	}
	public WebElement ChangeStatusOption()
	{
		return driver.findElement(By.xpath(".//*[@id='commentsId']"));
	}
	public WebElement CommentsTextBox()
	{
		return driver.findElement(By.xpath(".//*[@id='commentsBPTextArea']"));
	}
	public WebElement ApplyButton()
	{
		return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div[3]/div/div[2]/quoteedit-page/div/div/quotecomments-page/div/button']"));
		//return driver.findElement(By.xpath(".//button[contains(@data-ng-click,'savecomments();')]"));
	}
	// ***********************	End - comments/change status tab ********************
	
	// ***********************	Start - Manage configuration tab ********************
	public WebElement ManageConfigurationTab()
	{
		return driver.findElement(By.xpath(".//*[@id='currentquotetabs']/li[5]/div/div"));
	}
	public WebElement SolutionComponentsSection()
	{
		return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div[3]/div/div[2]/quoteedit-page/div/div/quoteconfig-page/div/div/div[2]/div[1]/div[1]/strong"));
	}
	public WebElement ManageConfigShowDropDown()
	{
		return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div[3]/div/div[2]/quoteedit-page/div/div/quoteconfig-page/div/div/div[2]/div[1]/div[2]/span/span[2]/select"));
	}
	public WebElement ManageConfigFilterDropDown()
	{
		return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div[3]/div/div[2]/quoteedit-page/div/div/quoteconfig-page/div/div/div[2]/div[1]/div[2]/span/span[4]/input"));
	}
	public WebElement ManageConfigSelectAllCheckBox()
	{
		return driver.findElement(By.xpath(".//*[@id='chckBoxSelectAll']"));
	}
	public WebElement ConfigarationTableManualComExpand()
	{
		return driver.findElement(By.xpath(".//*[@id='configTable']/tbody/tr[1]/td[2]/span/span/a/span[1]/svg[1]"));
	}
	public WebElement ConfigarationTableTypeModelExpand()
	{
		return driver.findElement(By.xpath(".//*[@id='0']/span[1]/svg[2]"));
	}
	// ***********************	End - Manage configuration tab ********************
	
	// ***********************	Start - Prices tab ********************
	public WebElement PricesTab()
	{
		return driver.findElement(By.xpath(".//*[@id='currentquotetabs']/li[6]/div/div"));
	}
	// ***********************	End - Prices tab ********************
	
	// ***********************	Start - Communication/Reports ********************
	public WebElement CommunicationReportsTab()
	{
		return driver.findElement(By.xpath(".//*[@id='currentquotetabs']/li[7]/div/div"));
	}
	// ***********************	End - Communication/Reports ********************
	
	//***********************	Start - Review/Documents ********************
	public WebElement ReviewDocumentsTab()
	{
		return driver.findElement(By.xpath(".//*[@id='currentquotetabs']/li[8]/div/div"));
	}
	//***********************	End - Review/Documents ********************
}

//***********************	End- Manage Quote (BP - PC/S) ********************