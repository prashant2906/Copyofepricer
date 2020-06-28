package WebElements.BP;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import WebElements.Object_Common;

public class BPObj_QuoteEditor extends Object_Common
{
		//***********Start of Quote Editor objects*****************
		public WebElement QuoteEditorBreadCrumbs()
		{
			 return driver.findElement(By.xpath(".//*[@id='ibm-navigation-trail']/li[2]")); 
		}
		public WebElement QuoteEditorTab()	
		{
			 return driver.findElement(By.xpath(".//*[@id='ibm-primary-tabs']/ul/li[4]/a")); 
		}
		public WebElement CreateNewQuoteIcon()
		{
			 return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div/div/div[2]/div/div/quoteedit-page/div/div/div[1]/div/a")); 
		}
		public WebElement CreateNewQuoteLabel()
		{
			 return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div/div/div[2]/div/div/quoteedit-page/div/div/div[1]/span")); 
		}
		public WebElement OverviewNum()
		{
			 return driver.findElement(By.xpath(".//*[@id='ibm-secondary-tabs']/ul/li[1]/a/svg/g/circle")); 
		}
		public WebElement ManageConfigurationNum()
		{
			 return driver.findElement(By.xpath(".//*[@id='ibm-secondary-tabs']/ul/li[2]/a/svg/g/circle")); 
		}
		public WebElement RegistrationCustomerNum()
		{
			 return driver.findElement(By.xpath(".//*[@id='ibm-secondary-tabs']/ul/li[3]/a/svg/g/circle")); 
		}
		public WebElement DealRegistrationInformation()
		{
			 return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div/div/div[2]/div/div/quoteedit-page/div/div/div[2]/quotecustomer-page/div[2]/div[1]/div[1]/h2")); 
		}
		public WebElement EndUserCustomerInformation()
		{
			 return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div/div/div[2]/div/div/quoteedit-page/div/div/div[2]/quotecustomer-page/div[3]/div[1]/div[1]/h2")); 
		}
		public WebElement SearchCustomerLink()
		{
			// return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div/div/div[2]/div/div/quoteedit-page/div/div/div[2]/quotecustomer-page/div[3]/div[3]/div[1]/a/span[2]")); 
			return driver.findElement(By.linkText("Search Customer")); 
		                                           
		}
		
		public WebElement SelectFromYourListDropDown()
		{
			 return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div/div/div[2]/div/div/quoteedit-page/div/div/div[2]/quotecustomer-page/div[3]/div[3]/div[2]/select")); 
		}
		public WebElement SaveToYourList()
		{
			 return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div/div/div[2]/div/div/quoteedit-page/div/div/div[2]/quotecustomer-page/div[3]/div[5]/div/a/span[2]")); 
		}
		public WebElement SaveToPreferences()
		{
			 return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div/div/div[2]/div/div/quoteedit-page/div/div/div[2]/quotecustomer-page/div[3]/div[9]/div/a")); 
		}
		public WebElement CustomerNumLabel()
		{
			 return driver.findElement(By.xpath(".//*[@id='customerNumber']")); 
		}
		public WebElement CustomerNameLabel()
		{
			 return driver.findElement(By.xpath(".//*[@id='customerName']")); 
		}
		public WebElement CustomerAddressLabel()
		{
			 return driver.findElement(By.xpath(".//*[@id='address']")); 
		}
		public WebElement CustomerTypeLabel()
		{
			 return driver.findElement(By.xpath(".//*[@id='customerType']")); 
		}
		public WebElement CustomerInfoDisplay()
		{
			 return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div/div/div[2]/div/div/quoteedit-page/div/div/div[2]/quotecustomer-page/div[3]/div[4]")); 
		}
		public WebElement NextToDetailsPricing()
		{
			 return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div/div/div[2]/div/div/quoteedit-page/div/div/div[2]/quotecustomer-page/div[4]/div/a[2]")); 
		}
		public WebElement OverlaySearchRetrieveCustomer()
		{
			 return driver.findElement(By.xpath(".//*[@id='ngdialog1-aria-labelledby']")); 
		}
		public WebElement OverlaySearchOnLabel()
		{
			 return driver.findElement(By.xpath(".//*[@id='ngdialog1']/div[2]/div[2]/div[1]/div[1]")); 
		}
		public WebElement OverlaySearchForLabel()
		{
			 return driver.findElement(By.xpath(".//*[@id='ngdialog1']/div[2]/div[2]/div[1]/div[2]")); 
		}
		public WebElement OverlaySearchForInput()
		{
			 return driver.findElement(By.xpath(".//*[@id='SearchFor']")); 
		}
		public WebElement OverlayStaticMessage()
		{
			return driver.findElement(By.xpath(".//*[@id='ngdialog1']/div[2]/div[2]/div[3]/div/span")); 
		}
		public WebElement OverlaySearchCustomer()
		{
			return driver.findElement(By.xpath(".//*[@id='ngdialog1']/div[2]/div[2]/div[4]/div/div/a/span[2]")); 
		}
		public WebElement OverlaySelectCustomer()
		{
			return driver.findElement(By.xpath(".//*[@id='ngdialog1']/div[2]/div[2]/div[6]/div[2]/div/div/a/span[2]")); 
		}
		public WebElement OverlayClose()
		{
			return driver.findElement(By.xpath(".//*[@id='ngdialog1']/div[2]/div[3]")); 
		}
		public WebElement OverlayButton1()
		{
			return driver.findElement(By.xpath(".//*[@id='chckBoxPGCode0']")); 
		}
		public WebElement UndefinedRecordsFound()
		{
			return driver.findElement(By.xpath(".//*[@id='ngdialog1']/div[2]/div[2]/div[5]/div/span")); 
		}		
		public WebElement OverlayDialog()
		{
			return driver.findElement(By.xpath(".//*[@id='ngdialog2']/div[2]")); 
		}	
		public WebElement OverlayRetrievedNumber()
		{
			return driver.findElement(By.xpath(".//*[@id='ngdialog5']/div[2]/div[2]/div[6]/div[1]/div/table/tbody/tr/td[2]")); 
		}
		public WebElement OverlayRetrievedName()
		{
			return driver.findElement(By.xpath(".//*[@id='ngdialog7']/div[2]/div[2]/div[6]/div[1]/div/table/tbody/tr/td[3]")); 
		}
		public WebElement OverlayRetrievedAddress1()
		{
			return driver.findElement(By.xpath(".//*[@id='ngdialog7']/div[2]/div[2]/div[6]/div[1]/div/table/tbody/tr/td[4]")); 
		}
		public WebElement OverlayRetrievedAddress2()
		{
			return driver.findElement(By.xpath(".//*[@id='ngdialog7']/div[2]/div[2]/div[6]/div[1]/div/table/tbody/tr/td[5]")); 
		}
		public WebElement OverlayRetrievedCity()
		{
			return driver.findElement(By.xpath(".//*[@id='ngdialog7']/div[2]/div[2]/div[6]/div[1]/div/table/tbody/tr/td[6]")); 
		}
		

		//**************Start - Quote Creation ***********************************	
		public WebElement CreateQuotetab()
		{
			 return driver.findElement(By.xpath(".//a[contains(translate(text(),'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'),'create a new quote')]")); 
		}
						
		// ***********************	Start - Quote creation (Header Values check) ********************		
		public WebElement QuoteHeaderTab()
		{
			return driver.findElement(By.xpath(".//*[@id='currentquotetab']/li/div/div[1]")); 
		}
		public WebElement QuoteHeader()
		{
			return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div/div/div[2]/div/div/quoteedit-page/div/div/div[2]/quoteheader-page/div")); 
		}
		public WebElement QuoteHeaderQuoteIDLabel()
		{
			return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div/div/div[2]/div/div/quoteedit-page/div/div/div[2]/quoteheader-page/div/div[1]/table/tbody/tr[1]/td[1]/div/div[1]"));
		}
		public WebElement QuoteHeaderQuoteIDValue()
		{
			return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div/div/div[2]/div/div/quoteedit-page/div/div/div[2]/quoteheader-page/div/div[1]/table/tbody/tr[1]/td[1]/div/div[2]"));
		}
		public WebElement QuoteHeaderBusinessPartnerIDLabel()
		{
			return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div/div/div[2]/div/div/quoteedit-page/div/div/div[2]/quoteheader-page/div/div[1]/table/tbody/tr[1]/td[2]/div/div[1]"));
		}
		public WebElement QuoteHeaderBusinessPartnerIDValue()
		{
			return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div/div/div[2]/div/div/quoteedit-page/div/div/div[2]/quoteheader-page/div/div[1]/table/tbody/tr[1]/td[2]/div/div[2]"));
		}
		public WebElement QuoteHeaderStatusLabel()
		{
			return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div/div/div[2]/div/div/quoteedit-page/div/div/div[2]/quoteheader-page/div/div[1]/table/tbody/tr[2]/td[1]/div/div[1]"));
		}
		public WebElement QuoteHeaderStatusValue()
		{
			return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div/div/div[2]/div/div/quoteedit-page/div/div/div[2]/quoteheader-page/div/div[1]/table/tbody/tr[2]/td[1]/div/div[2]"));
		}
		public WebElement QuoteHeaderCurrencyLabel()
		{
			return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div/div/div[2]/div/div/quoteedit-page/div/div/div[2]/quoteheader-page/div/div[1]/table/tbody/tr[2]/td[2]/div/div[1]"));
		}
		public WebElement QuoteHeaderCurrencyValue()
		{
			return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div/div/div[2]/div/div/quoteedit-page/div/div/div[2]/quoteheader-page/div/div[1]/table/tbody/tr[2]/td[2]/div/div[2]"));
		}
		
		//**************Start - Overview Page Objects ***********************************	
			public WebElement OverviewPage()
			{
				return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div/div/div[2]/div/div/quoteedit-page/div/div/div[2]/quoteoverview-page/div[1]"));
			}
		public WebElement OverviewPageSelectCounty()
		{
			return driver.findElement(By.xpath(".//select[contains(@name,'Select Country')]"));
		}
		public WebElement OverviewPageSelectCountyValue()
		{
				return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div/div/div[2]/div/div/quoteedit-page/div/div/div[2]/quoteoverview-page/div[2]/div[1]/div[2]/select"));
		}
		public WebElement OverviewPageQuoteTitle()
		{
			return driver.findElement(By.xpath(".//input[contains(@title,'Quote title')]"));
		}
		public WebElement OverviewPageSelectBidType()
		{
			return driver.findElement(By.xpath(".//select[contains(@title,'Select bid type')]"));
		}
		public WebElement OverviewPageNextLink()
		{
			//return driver.findElement(By.xpath(".//button[contains(@bdata-ng-click,'checkSuspendedBPAndProceed()')]"));
		
			return driver.findElement(By.xpath(".//*[@id='ibm-columns-main']/div/div[2]/div/div/quoteedit-page/div/div/div/div/quoteoverview-page/div[2]/div/button"));
					}
		
		
		//**************End - Overview Page Objects ***********************************			
		// *********************** End - Quote creation (Header Values check) ********************
				
		//**************End - Manage configuration (Add/Remove CFR) ***********************************				
		public WebElement ManageConfAddConfigLabel()
		{
			return driver.findElement(By.xpath(".//strong[contains(translate(text(),'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'),'add products via configuration file/manually')]"));
		}		
		public WebElement ManageConfAddConfigBrowseTextValue()
		{
			return driver.findElement(By.xpath(".//input[contains(@title,'Upload file')]"));
		}				
		public WebElement ManageConfAddConfigUploadButton()
		{
		//return driver.findElement(By.xpath(".//span[contains(translate(),'Upload_CFR(s)')]"));
			return driver.findElement(By.xpath(".//*[@id='ibm-columns-main']/div/div[2]/div/div/quoteedit-page/div/div/div/div/quoteconfiguration-page/div/div[2]/div/div[2]/div[2]/div[2]/button[1]"));
           //return driver.findElement(By.xpath(".//button[contains(@data-ng-model,'setFileMode('cdr');uploadFile()')]"));
//return driver.findElement(By.xpath(".//button[contains(@data-ng-click,'setFileMode('cdr');uploadFile()')]"));
		
		}	
		
		
		public WebElement ManageConfAddConfigDisableChecksum()
		{
			return driver.findElement(By.id("cfrsort"));
		}		
		public WebElement ManageConfAddConfigDisableChecksumCheckBox()
		{
			return driver.findElement(By.xpath(".//*[@id='cfrsort']"));
		}		
		public WebElement ManageConfAddConfigWorkOtherCountryCFR()
		{
			return driver.findElement(By.id("cfrsort"));
		}		
		public WebElement ManageConfAddConfigWorkOtherCountryCFRCheckBox()
		{
			return driver.findElement(By.xpath(".//*[@id='cfrsort1']"));
		}
				
		//************ Check whether is passed or Failed ****************		
		public WebElement ManageConfRemoveConfig()
		{
			return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div/div/div[2]/div/div/quoteedit-page/div/div/div[2]/quoteconfiguration-page/div/div[2]/div[last()-2]"));
		}
		public WebElement ManageConfUploadCFRError()
		{
			return driver.findElement(By.xpath(".//div[contains(text(), 'CFR upload failed')]"));
		}				
			
		//**************End - Manage configuration (Add/Remove CFR) ***********************************	
		
		//**************Start - Add/Remove Manual Component ***********************************
		public WebElement AddManualComponentLink()
		{
			return driver.findElement(By.xpath(".//span[contains(text(),'Add product manually')]"));
		}
		public WebElement AddManualComponentBox()
		{
			return driver.findElement(By.xpath(".//h2[contains(text(),'Adding product manually')]"));
		}
		
		public WebElement CloseDialog()
		{
			driver.switchTo().frame("mm_sync_back_ground");
			return driver.findElement(By.xpath(".//*[@id='ngdialog1']/div[2]/div[2]"));
	}
		
		
		
		public WebElement AddManualComponentQuantity()
		{
			return driver.findElement(By.xpath(".//*[@id='componentquantity']"));
		}
		
		
		public WebElement AddManualComponentSelectCategoryDropdown()
		{
			return driver.findElement(By.xpath(".//*[@id='categoryselected']"));
		}
		public WebElement AddManualComponentSelectNewCategoryRadio()
		{
			return driver.findElement(By.xpath(".//*[@id='featurerpqNew']"));
		}
		public WebElement AddManualComponentSelectMESCategoryRadio()
		{
			return driver.findElement(By.xpath(".//*[@id='featurerpqMes']"));
		}
		public WebElement AddManualComponentType()
		{
			return driver.findElement(By.xpath(".//*[@id='type']"));
		}		
		public WebElement AddManualComponentModel()
		{
			return driver.findElement(By.xpath(".//*[@id='model']"));
		}		
		public WebElement AddManualComponentFeature()
		{
			return driver.findElement(By.xpath(".//*[@id='featurerpqmanual']"));
		}	
		public WebElement AddManualComponentFetureQuantity()
		{
			return driver.findElement(By.xpath(".//input[contains(@data-ng-model,'quantitymanual')]"));
		}		
		public <list> WebElement AddManualComponentFeatureAddLink()
		{
			return driver.findElement(By.xpath(".//a[contains(@data-ng-click,'addfeatureproductManually(addFeatureData.featurerpqmanual,addFeatureData.quantitymanual)')]"));
		}
		public WebElement AddManualComponentFeatureAddCSVPathTextbox()
		{
			return driver.findElement(By.xpath(".//*[@id='uploadfile']"));
		}
		public WebElement AddManualComponentFeatureAddCSVLink()
		{
			return driver.findElement(By.xpath(".//*[@id='ngdialog4']/div[2]/div[2]/div[3]/div[3]/a"));
		}
		public WebElement AddManualComponentFeatureRemoveLink()
		{
			return driver.findElement(By.xpath(".//*[@id='ngdialog4']/div[2]/div[2]/div[4]/div[2]/a"));
		}
		public WebElement AddManualComponentAddComponentLink()
		{
			return driver.findElement(By.xpath(".//span[contains(translate(text(), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'),'add and close')]"));
		}	
		public WebElement SolutionComponentsSection()
		{
			return driver.findElement(By.xpath(".//strong[contains(translate(text(), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'),'solution components')]"));
		}
		public WebElement SolutionComponentsCheckboxAll()
		{
			return driver.findElement(By.id("chckBoxSelectAll"));
		}
		public WebElement SolutionComponentsCollectPricingLink()
		{
			
		return driver.findElement(By.xpath(".//span[contains(translate(text(), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'),'collect pricing')]"));
			//return driver.findElement(By.xpath(".//button[contains(@data-ng-click,'collectPricing()')]"));
		
		}
		public WebElement SolutionComponentsRemoveItemLink()
		{
			return driver.findElement(By.linkText("Remove Item(s)"));
		}
		public WebElement SolutionComponentsUpdateQuantityLink()
		{
			return driver.findElement(By.linkText("Update Quantity"));
		}
		public WebElement ManageConfigSaveContinueButton()
		{
			return driver.findElement(By.xpath(".//button[contains(@data-ng-click,'showQuoteStep(quoteStepList[2]')]"));
		}
		
		//*************** Start - Registration and Customer Page *********************
		
		//************** Start - Deal Reg Information and Retrieve ****************
		public WebElement RegCustDealRegInformationSection()
		{
			return driver.findElement(By.xpath(".//span[contains(translate(text(), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'),'deal registration information')]"));
		}
		public WebElement PCS_RegCustDealRegTextBox()
		{
			return driver.findElement(By.xpath("//*[@id='x.id']"));
		}
		public WebElement PSAT_RegCustDealRegTextBox()
		{
			return driver.findElement(By.xpath(".//div[contains(@id,'deal_reg_details_id')]//input[contains(@class,'form-control ng-pristine ng-untouched ng-valid ng-valid-required')]"));
		}
		public WebElement PCS_RegCustDealRegRtrieveButton()
		{
			//return driver.findElement(By.xpath(".//button[contains(@data-ng-click,'validateAndApplyDealReg(agreementApproval,seldealregnumber)')]"));
			return driver.findElement(By.xpath(".//button[contains(@data-ng-click,'validateAndApplyDealReg(currentQuote.quoteCustomer.agreementapproval,seldealregnumber)')]"));
		}
		
		
		
		public WebElement PSAT_RegCustDealRegRtrieveButton()
		{
			return driver.findElement(By.xpath(".//button[contains(@data-ng-click,'validateAndApplyDealReg(currentQuote.quoteCustomer.agreementapproval,currentQuote.quoteCustomer.seldealregnumber)')]"));
			//return driver.findElement(By.xpath(".//button[contains(@data-ng-click,'validateAndApplyDealReg(currentQuote.quoteCustomer.agreementapproval,seldealregnumber)')]"));
			
		}
		
		//************** Start - End User Customer Information ****************
		public WebElement RegCustEUCInfornationSection()
		{
			return driver.findElement(By.xpath(".//span[contains(translate(text(), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'),'end user customer information')]"));
		}
		public WebElement RegCustEUCISearchCustButton()
		{
			return driver.findElement(By.xpath(".//button[contains(@data-ng-click,'showPopupSearch')]"));
		}
		public WebElement RegCustEUCISearchCustFor()
		{
			return driver.findElement(By.xpath(".//*[@id='SearchFor']"));
		}
		public WebElement RegCustEUCISearchCustForByName()
		{
			return driver.findElement(By.xpath(".//input[contains(@data-ng-model,'form.searchOnName')]"));
		}
		public WebElement RegCustEUCISearchCustLink()
		{
			//return driver.findElement(By.xpath(".//a[contains(@data-ng-click,'searchCustomer()')]"));
			//return driver.findElement(By.linkText("Search Customer"));
			//return driver.findElement(By.xpath("//span[contains(@class,'title')]  [contains(text(),'Search Customer')]"));
		
			//return driver.findElement(By.xpath(".//*[@id='ngdialog2']/div[2]/div[1]/div/div[2]/div/div[2]/button"));
			
			return driver.findElement(By.xpath(".//button[@data-ng-click='searchCustomer();']"));   // change the xpath to adapt the dynamic xpath
			                                    
			//return driver.findElement(By.xpath(".//span[@class='ng-scope']"));
			//span[@class='ng-scope']
		}
		
		public WebElement PSATRegCustEUCISearchCustLink()
		{
			//return driver.findElement(By.xpath(".//a[contains(@data-ng-click,'searchCustomer()')]"));
			//return driver.findElement(By.linkText("Search Customer"));
			//return driver.findElement(By.xpath("//span[contains(@class,'title')]  [contains(text(),'Search Customer')]"));
			return driver.findElement(By.xpath(".//button[@data-ng-click='searchCustomer();']"));   // change the xpath to adapt the dynamic xpath
			//return driver.findElement(By.xpath(".//*[@id='ngdialog2']/div[2]/div[1]/div/div[2]/div/div[3]/div/div[2]/button"));
			                                    
			//return driver.findElement(By.xpath(".//span[@class='ng-scope']"));
			//span[@class='ng-scope']
		}
		
		
		
		
		
		public WebElement RegCustEUCISelectCustFormSearchResults()
		{
			return driver.findElement(By.xpath(".//*[@id='checkBoxPGCode0']"));
		}
		public WebElement RegCustEUCISelectCustomerLink()
		{
			//return driver.findElement(By.xpath(".//a[contains(@data-ng-click,'selectCustomer()')]"));
			//return driver.findElement(By.xpath(".//*[@id='ngdialog2']/div[2]/div[1]/div/div[2]/div/div[7]/div[2]/button"));
			
			return driver.findElement(By.xpath(".//button[@data-ng-click='selectCustomer();']"));   // change the xpath to adapt the dynamic xpath for select customer from the serach result list
		}
		public WebElement PSAT_RegCustEUCILedByIBMRadiobutton()
		{
			return driver.findElement(By.xpath(".//span[contains(@title,'ledByI')]//input[contains(@value,'I')]"));
		}
		public WebElement PSAT_RegCustEUCILedByBPRadiobutton()
		{
			return driver.findElement(By.xpath(".//span[contains(@title,'ledByB')]//input[contains(@value,'B')]"));
		}
		public WebElement RegCustEUCICustList()
		{
			return driver.findElement(By.xpath(".//*[@id='endCustomerNumber']"));
		}
		public WebElement RegCustEUCISelectCustButton()
		{
			return driver.findElement(By.xpath(".//strong[contains(text(),'Select customer')]"));
		}
		public WebElement RegCustEUCISP2BPCompanyName()
		{
			return driver.findElement(By.xpath(".//*[@id='bpCompanyName']"));
		}
		public WebElement RegCustEUCISP2CustList()
		{
			return driver.findElement(By.xpath(".//select[contains(@title,'SP2 name and email')]"));
		}
		public WebElement PSAT_RegCustEUCISP2CEID()
		{
			return driver.findElement(By.xpath(".//*[@id='psat.sp2bpceid']"));
		}
		public WebElement PSAT_RegCustEUCISP2BPCompanyName()
		{
			return driver.findElement(By.xpath(".//*[@id='psat.sp2bpcompanyname']"));
		}
		
			public WebElement RegCustSaveContinue()
			{
			return driver.findElement(By.xpath(".//button[contains(@data-ng-click,'showQuoteStep(quoteStepList[3])')]"));
			//return driver.findElement(By.xpath(".//*[@id='ibm-columns-main']/div/div[2]/div/div/quoteedit-page/div/div/div/div/quotecustomer-page/form/div[4]/div/button[2]]"));	
			}
		
		public WebElement DetailPricingCustSaveContinue()
		{
			return driver.findElement(By.xpath(".//button[contains(@data-ng-click,'showQuoteStep(quoteStepList[4])')]"));
			//return driver.findElement(By.xpath(".//*[@id='ibm-columns-main']/div/div[2]/div/div/quoteedit-page/div/div/div/div/quotecustomer-page/form/div[4]/div/button[2]]"));	
		}
		
		//*************** End - Registration and Customer Page *********************
		
		//*************** Start - Details Pricing Page *********************
		public WebElement DetailsPriceSectionViewEditConfig()
		{
			return driver.findElement(By.xpath(".//button[contains(@data-ng-click,'viewEditConfiguration()')]"));
		}
		
		public WebElement DetailsPricingTab()
		{
			return driver.findElement(By.xpath(".//button[contains(@data-ng-click,'viewEditConfiguration()')]"));
		}
		
		public WebElement DetailsPriceSection()
		{
			return driver.findElement(By.xpath(".//span[contains(translate(text(), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'),'details pricing')]"));
		}
		public WebElement PSAT_DetailsPriceRequestPriceExceptionCheckBox()
		{
			//return driver.findElement(By.xpath(".//*[@id='requestpriceexception']"));
			//return driver.findElement(By.xpath(".//span[contains(@text,' Does this quote qualify for a different price than the one displayed? This may require a pre-approved exception or additional information about another approved transaction this quote is associated with.')]"));
			//return driver.findElement(By.xpath(".//span[contains(@text,' Does this quote qualify for a different price than the one displayed? This may require a pre-approved exception or additional information about another approved transaction this quote is associated with.')]"));
			return driver.findElement(By.xpath(".//*[@id='cfrSortByCompenent']"));	
		}
		public WebElement SubmmitPriceRequestTab()
		{
			return driver.findElement(By.xpath(".//*[@id='ibm-columns-main']/div/div[2]/div/div/quoteedit-page/div/div/div/div/svg/g[5]/text"));
		}
		public WebElement DetailsPriceRefershPricesButton()
		{
			return driver.findElement(By.xpath(".//button[contains(@data-ng-click,'refreshPricing();')]"));
		}
		public WebElement DetailsPricePreviewVSOButton()
		{
			return driver.findElement(By.xpath(".//button[contains(@data-ng-click,'previewAddendum()')]"));
		}
		public WebElement DetailsPriceAcceptVSOButton()
		{
			return driver.findElement(By.xpath(".//button[contains(@data-ng-click,'saveValueSellerBid(false)')]"));
			//return driver.findElement(By.xpath(".//*[@title='Accept value seller offer']"));
			//return driver.findElement(By.xpath(".//button[contains(@title,'Accept value seller offer')]"));
		}
		
		public WebElement PCSDetailsPriceAcceptVSOButton()
		{
			return driver.findElement(By.xpath(".//*[@id='ibm-columns-main']/div/div[2]/div/div/quoteedit-page/div/div/div/div/quoteprices-page/div[4]/div[4]/button"));
		}
		
		public WebElement DetailsPriceSpecialBidButton()
		{
			//return driver.findElement(By.xpath(".//button[contains(@data-ng-click,'loadSBCData()')]"));
			
			return driver.findElement(By.xpath(".//button[contains(@data-ng-click,'showQuoteStep(quoteStepList[4])')]"));
			//return driver.findElement(By.xpath(".//*[@id='ibm-columns-main']/div/div[2]/div/div/quoteedit-page/div/div/div/div/quoteprices-page/div[7]/div[5]/button"));		
		}
		
		//*************** End - Details Pricing Page *********************
		
		//*************** Start - View Quote Data (Value seller approved Bid) Page *********************
		
		public WebElement ValueSellerApprovedBidHeaderStatus()
		{
			//return driver.findElement(By.xpath(".//p[contains(text(),'Value seller approved ')]"));
			return driver.findElement(By.xpath(".//*[@id='ibm-columns-main']/div/div[2]/div/div/quoteedit-page/div/div/div/div/quoteheader-page/div/div/div[1]/div[6]/strong/span"));
			
		}
		public WebElement ValueSellerApprovedBidViewQuoteDataTab()
		{
			return driver.findElement(By.xpath(".//a[contains(translate(text(), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'),'view quote data')]"));
		}
		public WebElement ValueSellerApprovedBidAddendumTab()
		{
			return driver.findElement(By.xpath(".//a[contains(text(),'Addendum')]"));
		}
		public WebElement ValueSellerApprovedApprovedSummaryTab()
		{
			return driver.findElement(By.xpath(".//a[contains(translate(text(), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'),'approved summary')]"));
		}
		
		//*************** End - View Quote Data (Value seller approved Bid) Page *********************
		
		//*************** Start - PCS Redirection - Submit Pricing Request Page *********************
		
		//*************** Start - Decision Maker Section Objects **************
		public WebElement PriceRequestDecisionMakerSection()
		{
			return driver.findElement(By.xpath(".//span[contains(translate(text(), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'),'decision maker')]"));
		}
		public WebElement PriceRequestDecisionMakerName()
		{
			return driver.findElement(By.xpath(".//*[@id='decisionmakername']"));
		}
		public WebElement PriceRequestDecisionMakerTitle()
		{
			return driver.findElement(By.xpath(".//*[@id='decisionmakertitle']"));
		}
		public WebElement PriceRequestDecisionMakerEMail()
		{
			return driver.findElement(By.xpath(".//*[@id='decisionmakeremail']"));
		}
		public WebElement PriceRequestDecisionMakerProjectName()
		{
			return driver.findElement(By.xpath(".//*[@id='projectname']"));
		}
		//*************** Start - IBM Channel Contact Objects ******************
		public WebElement PriceRequestIBMChannelContactSection()
		{
			return driver.findElement(By.xpath(".//span[contains(translate(text(), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'),'ibm channel contact')]"));
		}
		public WebElement PriceRequestIBMChannelContactName()
		{
			return driver.findElement(By.xpath(".//*[@id='name']"));
		}
		public WebElement PriceRequestIBMChannelContactPhone()
		{
			return driver.findElement(By.xpath(".//*[@id='phoneNumber']"));
		}
		public WebElement PriceRequestIBMChannelContactInternetID()
		{
			return driver.findElement(By.xpath(".//*[@id='enterContactEmail']"));
		}
		//*************** Start - Quote Level Special Bid Codes Objects ******************
		public WebElement PriceRequestQuoteLevelSBCsSection()
		{
			return driver.findElement(By.xpath(".//span[contains(translate(text(), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'),'quote level special bid codes')]"));
		}
		public WebElement PriceRequestQuoteLevelSBCsDropDown()
		{
			return driver.findElement(By.xpath(".//select[contains(translate(@title, 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'),'header level sbc')]"));
		}
		public WebElement PriceRequestQuoteLevelUnApplyALLSBCsButton()
		{
			return driver.findElement(By.xpath(".//button[contains(@data-ng-click,'clearSBCSelection()')]"));
		}
		
		//*************** Start - Set Requested Price/Discount Objects ******************
		public WebElement PriceRequestSetRequestedPriceDiscountSection()
		{
			return driver.findElement(By.xpath(".//div[contains(translate(text(), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'),'set requested price/discount')]"));
		}
		public WebElement PriceRequestSetRequestedPriceDiscountQuickApplyTextBox()
		{
			return driver.findElement(By.xpath(".//input[contains(translate(@title, 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'),'quick apply percent')]"));
		}
		public WebElement PriceRequestSetRequestedPriceDiscountAllCheckBox()
		{
			return driver.findElement(By.xpath(".//*[@id='currentQuote.quotePriceRequest.checkAllFlag']"));
		}
		public WebElement PriceRequestSetRequestedPriceDiscountDiscountQuickApplyButton()
		{
			return driver.findElement(By.xpath(".//button[contains(translate(@title, 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'),'quick apply percent button')]"));
		}
		public WebElement PriceRequestSetRequestedPriceDiscountApplyButton()
		{
			return driver.findElement(By.xpath(".//button[contains(translate(@title, 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'),'apply button')]"));
		}
		public WebElement PriceRequestSetRequestedPriceDiscountCommentTextBox()
		{
			return driver.findElement(By.xpath(".//*[@id='tinymce']/p"));  
		}
		public WebElement PriceRequestSetRequestedPriceDiscountBrowser()
		{
			return driver.findElement(By.xpath(".//input[contains(translate(@title, 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'),'multiple')]"));
		}
		public WebElement PCS_PriceRequesCertificationCommentsTextBox()
		{
			driver.switchTo().frame(".//*[@id='mceu_74']");
			//driver.switchTo().frame(".//*[@id='ibm-columns-main']/div/div[2]/div/div");
			//return driver.findElement(By.xpath(".//iframe[contains(@title,'Rich Text Area. Press ALT-F9 for menu. Press ALT-F10 for toolbar. Press ALT-0 for help')]"));
			//return driver.findElement(By.id(".//*[@id='mceu_13']")); 
			
			return driver.findElement(By.id(".//*[@id='tinymce']/p"));
			//return driver.findElement(By.tagName("body"));
		}
		public WebElement PriceRequestSetRequestedPriceDiscountSaveButton()
		{
			return driver.findElement(By.xpath(".//*[@id='save']"));
		}
		public WebElement PriceRequestSubmitButton()
		{
			return driver.findElement(By.xpath(".//*[@id='submit']"));
		}
		public WebElement PriceRequestSubmitSendNotificationButton()
		{
			return driver.findElement(By.xpath(".//*[@id='submitandsendnotification']"));
		}
		//************ Start - Send notification overlay **********
		public WebElement PriceRequestSendNotificationSection()
		{
			return driver.findElement(By.xpath(".//*[@id='ngdialog1-aria-labelledby']"));
		}
	
		
		public WebElement PriceRequestSendNotificationTo()
		{
			return driver.findElement(By.xpath(".//input[contains(@data-ng-model,'sendnotification.displaySelectedAddTOList')]"));
		}
		
		public WebElement PriceRequestSendNotificationCC()
		{
			return driver.findElement(By.xpath(".//input[contains(@data-ng-model,'sendnotification.displaySelectedAddCCList')]"));
		}
		public WebElement PriceRequestSendNotificationCommentTextbox()
		{
			return driver.findElement(By.xpath(".//*[@id='tinymce']/p"));
		}
		public WebElement PriceRequestSendNotificationSendLink()
		{
			return driver.findElement(By.xpath(".//a[contains(@data-ng-click,'sendNotificationEmail()')]"));
		}
		
		//*************** End - PCS Redirection - Submit Pricing Request Page *********************
		
		
		//*************** Start - PSAT Redirection - Submit Pricing Request Page *********************
		
		//************** General Information Tab Objects ***********
		public WebElement PSAT_PriceRequestGeneralInfoSection()
		{
			return driver.findElement(By.xpath(".//span[contains(translate(text(), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'),'general information')]"));
		}
		public WebElement PSAT_PriceRequestGeneralInfoOpportunitytypeDropDown()
		{
			return driver.findElement(By.xpath(".//*[@id='opportunitytype']"));
		}
		public WebElement PSAT_PriceRequestGeneralInfoOpportunityprojectnameTextBox()
		{
			return driver.findElement(By.xpath(".//input[contains(translate(@title, 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'),'opportunity project name')]"));
		}
		//************** Channel Information Tab Objects ***********
		public WebElement PSAT_PriceRequesChannelInfoTAB()
		{
			return driver.findElement(By.xpath(".//*[@id='psatcurrentquotetabs']//div[contains(translate(text(), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'),'ibm channel info')]"));
		}
		public WebElement PSAT_PriceRequestChannelInfoSection()
		{
			return driver.findElement(By.xpath(".//div[contains(@ng-show,'!currentQuote.quotePriceRequest.channelinfo.showLoading')]//span[contains(translate(text(), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'),'ibm channel contact')]"));
		}
		public WebElement PSAT_PriceRequestChannelInfoName()
		{
			return driver.findElement(By.xpath(".//*[@id='channelinfoname']"));
		}
		public WebElement PSAT_PriceRequestChannelInfoPhone()
		{
			return driver.findElement(By.xpath(".//*[@id='channelinfophone']"));
		}
		public WebElement PSAT_PriceRequestChannelInfoInternetID()
		{
			return driver.findElement(By.xpath(".//*[@id='channelinfointernetid']"));
		}
		//************** Pricing Request Tab Objects ***********
		public WebElement PSAT_PriceRequesRequestPricingTAB()
		{
			return driver.findElement(By.xpath(".//*[@id='psatcurrentquotetabs']//div[contains(translate(text(), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'),'request pricing')]"));
		}
		public WebElement PSAT_PriceRequesRequestPricingSection()
		{
			return driver.findElement(By.xpath(".//span[contains(translate(text(), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'),'request pricing')]"));
		}
		public WebElement PSAT_PriceRequesRequestPricingRequestedEndUserPriceTextBox()
		{
			return driver.findElement(By.xpath(".//*[@id='requestedEndUserPrice_id']"));
		}
		public WebElement PSAT_PriceRequesRequestPricingRequestedEndUserDiscountTextBox()
		{
			return driver.findElement(By.xpath(".//*[@id='requested_end_user_percent_id']"));
		}
		public WebElement PSAT_PriceRequesRequestPricingAPPLYButton()
		{
			return driver.findElement(By.xpath(".//button[contains(@data-ng-click,'submitAndSendNotification()')]"));  
			//return driver.findElement(By.xpath(".//*[@id='ibm-columns-main']/div/div[2]/div/div/quoteedit-page/div/div/div/div/quotepricerequestpsat-page/div[2]/form/div[5]/div/div[5]/div/div/div/button"));

		}
		// ******* Certifications Tab Objects **************************
		public WebElement PSAT_PriceRequesCertificationTAB()
		{
			//return driver.findElement(By.xpath(".//*[@id='psatcurrentquotetabs']//div[contains(text(),'Certifications')]"));
			return driver.findElement(By.xpath(".//*[@id='psatcurrentquotetabs']/li[5]/div/div"));
			
		
		}
		public WebElement PSAT_PriceRequesCertificationSection()
		{
			return driver.findElement(By.xpath(".//*[@id='ibm-columns-main']/div/div[2]/div/div/quoteedit-page/div/div/div/div/quotepricerequestpsat-page/div[2]/form/div[3]/div[4]"));
		}
		
		public void PSAT_PriceRequesCertificationCommentsTextBox()
		{
			//driver.switchTo().frame("ui-tinymce-1_ifr"); ui-tinymce-1_ifr
			
			System.out.println("GOING INSIDE  in text input");
			driver.switchTo().frame("ui-tinymce-0_ifr");
			System.out.println("GOT FOCUS  in text input");
			//return driver.findElement(By.xpath(".//iframe[contains(@title,'Rich Text Area. Press ALT-F9 for menu. Press ALT-F10 for toolbar. Press ALT-0 for help')]"));
			driver.findElement(By.id("tinymce")).sendKeys("This is Bid Justification text");
		}
		public void PSAT_PriceRequesCertificationCommentsTextBox1()
		{
			//driver.switchTo().frame("ui-tinymce-1_ifr"); ui-tinymce-1_ifr
			Actions action = new Actions(driver);  
			action.sendKeys(Keys.TAB);
			System.out.println("GOING INSIDE  in text input");
			//driver.switchTo().frame("ui-tinymce-1_ifr");
			System.out.println("GOT FOCUS  in text input");
			//return driver.findElement(By.xpath(".//iframe[contains(@title,'Rich Text Area. Press ALT-F9 for menu. Press ALT-F10 for toolbar. Press ALT-0 for help')]"));
			driver.findElement(By.id("tinymce")).sendKeys("This is Bid Justification text");
			//action.sendKeys(Keys.valueOf("This is Bid Justification text"));
		}
		public void SwitchtoDefault()
		{
			System.out.println("---->                      Started - Page has been switched into default !!!");
			driver.switchTo().defaultContent(); 
			System.out.println("---->                      Completed - Page has been switched into default !!!");
		}
		
		
		// ******* Common objects **************************
		public WebElement PSAT_PriceRequestGeneralInfoSAVEButton()
		{
			return driver.findElement(By.xpath(".//button[contains(@data-ng-click,'savePriceRequestPSAT(currentQuote.quotePriceRequest.psattab, true, false)')]"));
		}
		public WebElement PSAT_PriceRequestSUBMITButton()
		{
			//return driver.findElement(By.xpath(".//button[contains(@data-ng-click,'submit()')]"));
			return driver.findElement(By.xpath(".//button[contains(@data-ng-click,'showQuoteStep(quoteStepList[4])')]"));
			//return driver.findElement(By.xpath(".//*[@id='ibm-columns-main']/div/div[2]/div/div/quoteedit-page/div/div/div/div/quotepricerequestpsat-page/div[2]/form/div[9]/button[1]"));
		}
		
		
		public WebElement PSATEMJP_PriceRequestSUBMITButton()
		{
			//return driver.findElement(By.xpath(".//button[contains(@data-ng-click,'submit()')]"));
			//return driver.findElement(By.xpath(".//button[contains(@title,'Submit')]"));
			return driver.findElement(By.xpath(".//button[@class='btn btn-primary btn-lg'][@value='submitbutton'] [@name='Submit']"));
			//return driver.findElement(By.xpath(".//*[@id='ibm-columns-main']/div/div[2]/div/div/quoteedit-page/div/div/div/div/quotepricerequestpsat-page/div[2]/form/div[9]/button[1]"));
			//return driver.findElement(By.xpath("submitAndSendNotification()"));
					
					//input[@name='email'][@value='Email or Phone']
		}
					
		
		public WebElement PSAT_PriceRequestSubmitSendNotificationButton()
		{
			return driver.findElement(By.xpath("submitAndSendNotification()"));
		}
		
		
		//*************** End - PSAT Redirection - Submit Pricing Request Page *********************
		
		//*********** Start - Component for closing this bid and getting quote ID
		
		public WebElement QuoteIDTab()
		{
			return driver.findElement(By.xpath(".//*[@id='currentquotetab']/li"));
		}
		public WebElement GetQuoteID()
		{
			return driver.findElement(By.xpath(".//*[@id='currentquotetab']/li/div/div[1]"));
		}
		public WebElement CloseQuoteID()
		{
			return driver.findElement(By.xpath(".//a[contains(@ng-click,'removeCurrentQuote(item)')]"));
		}
		//*********** End - Component for closing this bid and getting quote ID
				
//**************End - Quote Creation ***********************************		
		
//***********End of Quote Editor objects***************** 
}
