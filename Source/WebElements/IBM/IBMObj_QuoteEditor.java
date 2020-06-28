package WebElements.IBM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import WebElements.Object_Common;

public class IBMObj_QuoteEditor extends Object_Common
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
		
		public WebElement OverviewChannelIndicator()
		{		
			return driver.findElement(By.name("Select Channel Indicator"));
				                                    
		}
		
		public WebElement OverviewSolutionType()
		{		
			return driver.findElement(By.name("Select Solution type"));
				                                    
		}
		
		public WebElement OverviewSelectCty()
		{		
			return driver.findElement(By.name("Select Country"));
				                                    
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
			// return driver.findElement(By.xpath(".//a[contains(translate(text(),'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'),'create quote')]")); 
			//return driver.findElement(By.xpath(".//*[@id='ibm-pagetitle-h1']/div[3]/div[1]/table/tbody/tr[2]/td[5]/a")); 
			return driver.findElement(By.linkText("Create quote"));
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
		
		
		public WebElement OverviewPageQuoteName()
		{
			return driver.findElement(By.xpath(".//*[@id='ibm-pagetitle-h1']/div[3]/div[2]/quoteedit-page/div/div/quoteoverview-page/div/div/div[4]/div[1]/span"));
		}
		
		public WebElement OverviewPageQuoteNameinput()
		{
			return driver.findElement(By.xpath(".//*[@id='ibm-pagetitle-h1']/div[3]/div[2]/quoteedit-page/div/div/quoteoverview-page/div/div/div[4]/div[2]/input"));
		}
	
		public WebElement OverviewPageOppoID()
		{
			return driver.findElement(By.xpath(".//*[@id='ibm-pagetitle-h1']/div[3]/div[2]/quoteedit-page/div/div/quoteoverview-page/div/div/div[5]/div[1]/span"));
		}
		
		public WebElement OverviewPageOppoIDinput()
		{
			return driver.findElement(By.xpath(".//*[@id='ibm-pagetitle-h1']/div[3]/div[2]/quoteedit-page/div/div/quoteoverview-page/div/div/div[5]/div[2]/input"));
		}
		
		public WebElement OverviewPageOppoOwnerName()
		{
			return driver.findElement(By.xpath(".//*[@id='ibm-pagetitle-h1']/div[3]/div[2]/quoteedit-page/div/div/quoteoverview-page/div/div/div[6]/div[1]/span"));
		}
		
		public WebElement OverviewPageOppoOwnerNameinput()
		{
			return driver.findElement(By.xpath(".//*[@id='ibm-pagetitle-h1']/div[3]/div[2]/quoteedit-page/div/div/quoteoverview-page/div/div/div[6]/div[2]/input"));
		}
		
		public WebElement OverviewPageContactNuminput()
		{
			return driver.findElement(By.xpath(".//*[@id='ibm-pagetitle-h1']/div[3]/div[2]/quoteedit-page/div/div/quoteoverview-page/div/div/div[3]/div[2]/input"));
		}                                      
		
		public WebElement OverviewPageNextLinkNA()
		{
			//return driver.findElement(By.xpath(".//button[contains(@bdata-ng-click,'checkSuspendedBPAndProceed()')]"));
			//return driver.findElement(By.xpath(".//button[contains(@data-ng-click,'saveQuoteOverview('')')]"));
			
			return driver.findElement(By.xpath(".//*[@id='ibm-pagetitle-h1']/div[3]/div[2]/quoteedit-page/div/div/quoteoverview-page/div/div/div[11]/div/button"));
			                              //     .//*[@id='ibm-pagetitle-h1']/div[3]/div[2]/quoteedit-page/div/div/quoteoverview-page/div/div/div[10]/div/button                                      
		}
		
		public WebElement OverviewPageNextLinkAP()
		{
			//return driver.findElement(By.xpath(".//button[contains(@bdata-ng-click,'checkSuspendedBPAndProceed()')]"));
			//return driver.findElement(By.xpath(".//button[contains(@data-ng-click,'saveQuoteOverview('')')]"));
			
			return driver.findElement(By.xpath(".//*[@id='ibm-pagetitle-h1']/div[3]/div[2]/quoteedit-page/div/div/quoteoverview-page/div/div/div[10]/div/button"));
			                              //     .//*[@id='ibm-pagetitle-h1']/div[3]/div[2]/quoteedit-page/div/div/quoteoverview-page/div/div/div[10]/div/button                                      
		}
		
		//**************End - Overview Page Objects ***********************************			
		// *********************** End - Quote creation (Header Values check) ********************
		
		//*******************Start Customer Page*********************
		
		public WebElement OverviewPageNextLinkEMEA()
		{				
			return driver.findElement(By.xpath(".//*[@id='ibm-pagetitle-h1']/div[3]/div[2]/quoteedit-page/div/div/quoteoverview-page/div/div/div[10]/div/button"));
			                                    
		}
		
		public WebElement OverviewPageNextLinkLA()
		{				
			return driver.findElement(By.xpath(".//*[@id='ibm-pagetitle-h1']/div[3]/div[2]/quoteedit-page/div/div/quoteoverview-page/div/div/div[10]/div/button"));
			                                    
		}
		
		public WebElement OverviewPageNextLinkJP()
		{				
			return driver.findElement(By.xpath(".//*[@id='ibm-pagetitle-h1']/div[3]/div[2]/quoteedit-page/div/div/quoteoverview-page/div/div/div[10]/div/button"));
			                                    
		}
		
		public WebElement CustomerPageSearchCusomterLink()
		{				
			return driver.findElement(By.xpath(".//*[@id='ibm-pagetitle-h1']/div[3]/div[2]/quoteedit-page/div/div/quotecustomer-page/div/div[2]/div[2]/div[4]/div[3]/strong/button"));
			                                   
		}
		
		public WebElement IBMMasterCustomerRadio()
		{				
			return driver.findElement(By.xpath(".//*[@id='ngdialog1']/div[2]/div[1]/div[2]/div[4]/div[3]"));
			                                   
		}
		
		
		public WebElement CustomerPageSearchOnList()
		{		
			return driver.findElement(By.xpath(".//*[@id='ngdialog1']/div[2]/div[1]/div[2]/div[2]/div[1]/select"));
			                                     
		//	return driver.findElement(By.name("customername"));
			                                    
		}
		
		public WebElement CustomerPageNonLagCusInput()
		{			
			//return driver.findElement(By.xpath(".//*[@id='ngdialog1']/div[2]/div[1]/div[2]/div[2]/div[2]/div[2]/input"));
			return driver.findElement(By.xpath(".//*[@id='ngdialog1']/div[2]/div[1]/div[2]/div[2]/div[2]/div[2]/input"));
			//return driver.findElement(By.xpath(".//input[contains(@data-ng-class,'ng-pristine ng-untouched ng-valid input-control focusedRed')]"));
			
			                                   
			                                    
		}
		
		public WebElement CustomerPageCusNameInput()
		{			
			return driver.findElement(By.xpath(".//*[@id='ngdialog2']/div[2]/div[1]/div[2]/div[2]/div[2]/div[2]/input"));
			                                   
			                                    
		}
		
		public WebElement CustomerPageCusResultindex0()
		{			
			return driver.findElement(By.xpath(".//*[@id='radio_PGCode0']"));
			                                    
		}

		public WebElement CustomerPageSelectCusButton()
		{			
			return driver.findElement(By.xpath(".//*[@id='ngdialog1']/div[2]/div[1]/div[2]/div[11]/div[2]/div/button"));
			                                    
		}
		
		public WebElement CustomerPageSearchonButton()
		{			
			return driver.findElement(By.xpath(".//*[@id='ngdialog1']/div[2]/div[1]/div[2]/div[4]/div[4]/button"));
                                 
		}
		
		public WebElement CustomerPageSaveContinueButton()
		{			
					return driver.findElement(By.xpath(".//button[contains(@data-ng-click,'validateSave()')]"));
				
		}
	                                    
	
		
		
		
		
		//*******************End Customer Page**********************
				
		//**************End - Manage configuration (Add/Remove CFR) ***********************************				
		public WebElement ManageConfAddConfigLabel()
		{
			return driver.findElement(By.xpath(".//strong[contains(translate(text(),'Add products via configuration file/manually'),'Add products via configuration file/manually')]"));
		}		
		public WebElement ManageConfAddConfigBrowseTextValue()
		{
			//return driver.findElement(By.xpath(".//input[contains(@title,'Upload file')]"));
			
			return driver.findElement(By.xpath(".//*[@id='ibm-pagetitle-h1']/div[3]/div[2]/quoteedit-page/div/div/quoteconfig-page/div/div/div[3]/div/div[2]/div[1]/input"));

		}
		
		
		public WebElement SaveMangeConfigEMEA()
		{
			return driver.findElement(By.xpath(".//*[@id='ibm-pagetitle-h1']/div[3]/div[2]/quoteedit-page/div/div/quoteconfig-page/div/div/div[3]/button[2]"));
	  	}
		
		public WebElement SaveMangeConfigNA()
		{
			//return driver.findElement(By.xpath(".//button/strong[@[text()='Save & Continue ']"));
			                              //      .//button[@datangclick='showQuoteStep(quoteStepList[3])']/div[3]/div[2]/quoteedit-page/div/div/quoteconfig-page/div/div/div[4]/button[2]		
			return driver.findElement(By.xpath(".//button[contains(@data-ng-click,'showQuoteStep(quoteStepList[3])')]"));                              
			//span/button[text()='Checkout'][1]                          
		}
		
		//Object_Common.driver.findElement(By.xpath(".//*[@id='ibm-pagetitle-h1']/div[3]/div[2]/quoteedit-page/div/div/quoteconfig-page/div/div/div[4]/button[2]")).click();

		
		public WebElement ManageConfAddConfigUploadButton()
		{
			//return driver.findElement(By.xpath(".//span[contains(text(),'Upload CFR(s)')]"));
			return driver.findElement(By.xpath(".//*[@id='ibm-pagetitle-h1']/div[3]/div[2]/quoteedit-page/div/div/quoteconfig-page/div/div/div[3]/div/div[2]/div[2]/div[2]/span[1]"));
		}			
		public WebElement ManageConfAddConfigDisableChecksum()
		{
			return driver.findElement(By.id("cfrsort"));
		}		
		public WebElement ManageConfAddConfigDisableChecksumCheckBox()
		{
			//return driver.findElement(By.xpath(".//*[@id='cfrsort']"));
			return driver.findElement(By.xpath(".//*[@id='ibm-pagetitle-h1']/div[3]/div[2]/quoteedit-page/div/div/quoteconfig-page/div/div/div[3]/div/div[2]/div[2]/div[1]/div[1]/span[1]/input"));
		}		
		public WebElement ManageConfAddConfigWorkOtherCountryCFR()
		{
			return driver.findElement(By.id("cfrsort"));
		}		
		public WebElement ManageConfAddConfigWorkOtherCountryCFRCheckBox()
		{
			return driver.findElement(By.xpath(".//*[@id='ibm-pagetitle-h1']/div[3]/div[2]/quoteedit-page/div/div/quoteconfig-page/div/div/div[3]/div/div[2]/div[2]/div[1]/div[1]/span[2]/input"));
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
			return driver.findElement(By.xpath(".//*[@id='ibm-pagetitle-h1']/div[3]/div[2]/quoteedit-page/div/div/quoteconfig-page/div/div/div[3]/div/div[2]/div[2]/div[2]/span[3]/span"));
		}
		public WebElement AddManualComponentBox()
		{
			return driver.findElement(By.xpath(".//h2[contains(text(),'Add product manually')]"));
		//	return driver.findElement(By.xpath(".//*[@id='ngdialog1']/div[2]"));
		//	return driver.findElement(By.id("ngdialog1-aria-labelledby"));

		}
		public WebElement AddManualComponentSelectCategoryDropdown()
		{
	//		return driver.findElement(By.xpath(".//*[@id='ngdialog1']/div[2]/div/div[1]/div[2]/div[2]/select"));
			return driver.findElement(By.xpath(".//Select[@id='']"));
												
		}
		public WebElement AddManualComponentSelectComponenTypeRadio()
		{
			return driver.findElement(By.xpath(".//*[@id='lineRadioHardware']/div[2]/fieldset/span[1]/input"));
		}
		public WebElement AddManualComponentSelectMESCategoryRadio()
		{
			return driver.findElement(By.xpath(".//*[@id='featurerpqMes']"));
		}
		public WebElement AddManualComponentType()
		{
			return driver.findElement(By.xpath(".//*[@id='type']"));
			//return driver.findElement(By.xpath(".//input[contains(@data-ng-model,'currentQuote.manageConfigData.internalManualComp.identifierValue')]");
			                
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
		public WebElement AddManualComponentAddAndCloseLink()
		{
			return driver.findElement(By.xpath(".//*[@id='addComponenttrue']"));
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
			//return driver.findElement(By.xpath(".//button[contains(@data-ng-click,'collectPricing()')]"));
			
			return driver.findElement(By.xpath(".//*[@id='ibm-pagetitle-h1']/div[3]/div[2]/quoteedit-page/div/div/quoteconfig-page/div/div/div[1]/div/div[2]/div[2]/span[1]"));
			
			//return driver.findElement(By.xpath(".//span[contains(translate(text(), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'),'collect pricing')]"));
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
		
		public WebElement RequestApprovalTab()
		{
			return driver.findElement(By.linkText("Request approval"));
		}
		
		public WebElement ManageConfigSaveContinueButton()
		{
			//return driver.findElement(By.xpath(".//button[contains(@data-ng-click,'showQuoteStep(quoteStepList[3]')]"));
			
		//	return driver.findElement(By.linkText("Save & Continue"));
			                                  
			return driver.findElement(By.xpath(".//*[@data-ng-click = 'showQuoteStep(quoteStepList[3])']"));
				                                   
			
		}
		
		public WebElement PriceNavigate()
		{
			//return driver.findElement(By.xpath(".//*[@id='ibm-pagetitle-h1']/div[3]/div[2]/quoteedit-page/div/div/div[2]/svg/g[4]/polygon"));
			return driver.findElement(By.xpath(".//*[@id='ibm-pagetitle-h1']/div[3]/div[2]/quoteedit-page/div/div/div[2]/svg/g[4]/text"));
			
		}
		
		//*************** Start - Registration and Customer Page *********************
		
		
		//*************** Start - Pricing ******************
		
		public WebElement PriceSortCompoentcheckbox()
		{
			return driver.findElement(By.xpath(".//*[@id='pricingCheckbox']/input"));
		}
		
		public WebElement PriceQuickApplybutton()
		{
			return driver.findElement(By.xpath(".//*[@translate='Quick_apply']"));
		}
		
		public WebElement PriceDiscountapplybutton()
		{
			return driver.findElement(By.xpath(".//button[@data-ng-click='quickApply();']"));
		}
		
		public WebElement PriceDiscountinput()
		{
			return driver.findElement(By.xpath(".//*[@id='comapprovedpercent']"));
		}
		
	
		
	
		public WebElement PriceRequestApprovebutton()
		{
//			//return driver.findElement(By.xpath(".//*[@id='ibm-pagetitle-h1']/div[3]/div[2]/quoteedit-page/div/div/quoteprices-page[1]/div/div/ul/li[4]/a"));
			return driver.findElement(By.xpath(".//*[@id='ibm-pagetitle-h1']/div[3]/div[2]/quoteedit-page/div/div/quoteprices-page[1]/div/div[1]/ul/li[4]/a"));
			//return driver.findElement(By.linkText("Request approval"));
		}
			
		
		public WebElement PriceSaveandContinuebutton()
		{
			return driver.findElement(By.xpath(".//*[@id='ibm-pagetitle-h1']/div[3]/div[2]/quoteedit-page/div/div/quoteprices-page[1]/div/requestapproval-page/div/div/div[2]/div/button[1]"));
		}
		
				
		public WebElement PriceCancelNotification()
		{
			return driver.findElement(By.xpath(".//*[@id='ngdialog2']/div[2]/div[1]/div[2]/div[9]/div/p/a[2]"));
		}
		
		
		public WebElement ApproveButton()
		{
			//return driver.findElement(By.xpath(".//*[@id='ibm-pagetitle-h1']/div[3]/div[2]/quoteedit-page/div/div/quoteprices-page[1]/div/div/ul/li[4]/a"));
			return driver.findElement(By.linkText("Approval"));
		}
		
		
		
		public WebElement ApproveRadio()
		{
			return driver.findElement(By.xpath(".//*[@id='radio_Approval_approve']"));
		}
		
		public WebElement LeveloneIDInput()
		{
			return driver.findElement(By.xpath(".//*[@id='CUE_BUE_RTL_ID']"));
		}
		
		public WebElement SpecialBidCode()
		{
			return driver.findElement(By.xpath(".//*[@id='backupgroupnameid1']/option[1]"));
		}
		
		public WebElement SubmitButton()
		{
			//return driver.findElement(By.xpath(".//*[@id='ibm-pagetitle-h1']/div[3]/div[2]/quoteedit-page/div/div/quoteprices-page[1]/div/approval-page/div/div/div/div[5]/div[15]/div[3]/div/div/button"));
			return driver.findElement(By.xpath(".//*[@data-ng-click = 'submitApproval()']"));
			
		}
		
		public WebElement CancelNotification2()
		{
			return driver.findElement(By.xpath(".//*[@id='ngdialog3']/div[2]/div[1]/div[2]/div[9]/div/p/a[2]"));
		}
		
		public WebElement MyQuotes()
		{
			return driver.findElement(By.linkText("My quotes"));
		}
		
		public WebElement Search()
		{
			return driver.findElement(By.linkText("Search quotes"));
		}
		
		public WebElement SearchButton()
		{
			//return driver.findElement(By.xpath("//button[contains[@text='Search']"));
			return driver.findElement(By.xpath(".//*[@id='ibm-pagetitle-h1']/div[3]/div[2]/quotesearch-page/div/div[2]/div[2]/div/table/tbody/tr/td[2]/a/strong/span"));
				
		}
		
		
		public WebElement SearchInputBox()
		{
			//return driver.findElement(By.xpath("//input[@class='GOBLEOOO']")));
			//return driver.findElement(By.xpath("//input[@class='ng-pristine ng-valid input-control focusedRed ng-touched'][@title ='Enter quoteid']"));
			return driver.findElement(By.xpath(".//*[@id='ibm-pagetitle-h1']/div[3]/div[2]/quotesearch-page/div/div[2]/div[1]/div/table/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/div[13]/input"));
			//return driver.findElement(By.xpath(".//*[@id='ibm-pagetitle-h1']/div[3]/div[2]/quotesearch-page/div/div[1]/div[3]/input"));
		}
		
		public WebElement QuoteIDTabs()
		{
			return driver.findElement(By.xpath(".//*[@id='ibm-pagetitle-h1']/div[3]/div[2]/quoteedit-page/div/div/quoteheader-page/div/div[2]/div[2]/div[2]"));

			
		}
			public WebElement Reports()
		{
			//return driver.findElement(By.linkText("My quotes"));
			return driver.findElement(By.xpath(".//*[@id='ibm-pagetitle-h1']/div[3]/div[2]/quoteedit-page/div/div/div[2]/svg/g[6]/text"));
			
		}
			
		public WebElement CloseCurrentQuote()
			{
				//return driver.findElement(By.linkText("My quotes"));
				return driver.findElement(By.xpath(".//*[@id='currentquotetab']/li/div/div[2]/a"));
				
			}
				
		public WebElement StandardReport()
		{
			//return driver.findElement(By.linkText("My quotes"));
			return driver.findElement(By.xpath(".//*[@id='ibm-pagetitle-h1']/div[3]/div[2]/quoteedit-page/div/div/quotecommunicationreport-page/div/div/div[3]/div[2]/div[2]/div/div[1]/button"));

			//data-ng-click="getReport(currentQuote.communicationReportData.REPORT_TYPE_INTERNAL_STANDARD, 'IBM e-Pricer | Report')
			
		}
		
		public WebElement HistoryReport()
		{
			//return driver.findElement(By.linkText("My quotes"));
			return driver.findElement(By.xpath(".//*[@id='ibm-pagetitle-h1']/div[3]/div[2]/quoteedit-page/div/div/quotecommunicationreport-page/div/div/div[3]/div[2]/div[4]/div/div[1]/button"));

			//data-ng-click="getReport(currentQuote.communicationReportData.REPORT_TYPE_INTERNAL_STANDARD, 'IBM e-Pricer | Report')
			
		}
		

		//************* Start request for approve for LA ********************* 
		
		public WebElement RequestLA1()
		
		{
			return driver.findElement(By.xpath(".//*[@id='ibm-pagetitle-h1']/div[3]/div[2]/quoteedit-page/div/div/quoteprices-page/div/requestapproval-page/div/div/div[1]/div[5]/div[1]/div/div[2]/div/input"));
			                                    
		}
		
		public WebElement RequestLA2()
		
		{
			return driver.findElement(By.xpath(".//*[@id='ibm-pagetitle-h1']/div[3]/div[2]/quoteedit-page/div/div/quoteprices-page/div/requestapproval-page/div/div/div[1]/div[5]/div[2]/div/div[2]/div/input"));
		}
		
		public WebElement  RequestLA3()
		
		{
			return driver.findElement(By.xpath(".//*[@id='ibm-pagetitle-h1']/div[3]/div[2]/quoteedit-page/div/div/quoteprices-page/div/requestapproval-page/div/div/div[1]/div[5]/div[3]/div/div[2]/div/input"));
		}
		
		public WebElement RequestLA4()
		
		{
			return driver.findElement(By.xpath(".//*[@id='ibm-pagetitle-h1']/div[3]/div[2]/quoteedit-page/div/div/quoteprices-page/div/requestapproval-page/div/div/div[1]/div[5]/div[4]/div/div[2]/div/span[1]/input"));
		}
		
		public WebElement RequestLA5()
		
		{
			return driver.findElement(By.xpath(".//*[@id='ibm-pagetitle-h1']/div[3]/div[2]/quoteedit-page/div/div/quoteprices-page/div/requestapproval-page/div/div/div[1]/div[5]/div[5]/div/div[2]/div/span[2]/input"));
		}
		
		public WebElement RequestLA6()
		
		{
			return driver.findElement(By.xpath(".//*[@id='ibm-pagetitle-h1']/div[3]/div[2]/quoteedit-page/div/div/quoteprices-page/div/requestapproval-page/div/div/div[1]/div[5]/div[6]/div/div[2]/div/span[2]/input"));
		}
		
		public WebElement RequestLA7()
		
		{
			return driver.findElement(By.xpath(".//*[@id='ibm-pagetitle-h1']/div[3]/div[2]/quoteedit-page/div/div/quoteprices-page/div/requestapproval-page/div/div/div[1]/div[5]/div[7]/div/div[2]/div/span[2]/input"));
		}
		
		public WebElement RequestLA8()
		
		{
			return driver.findElement(By.xpath(".//*[@id='ibm-pagetitle-h1']/div[3]/div[2]/quoteedit-page/div/div/quoteprices-page/div/requestapproval-page/div/div/div[1]/div[5]/div[8]/div/div[2]/div/span[2]/input"));
		}
		
		public WebElement RequestLA9()
		
		{
			return driver.findElement(By.xpath(".//*[@id='ibm-pagetitle-h1']/div[3]/div[2]/quoteedit-page/div/div/quoteprices-page/div/requestapproval-page/div/div/div[1]/div[5]/div[9]/div/div[2]/div/span[2]/input"));
		}
		public WebElement RequestLA10()
		
		{
			return driver.findElement(By.xpath(".//*[@id='ibm-pagetitle-h1']/div[3]/div[2]/quoteedit-page/div/div/quoteprices-page/div/requestapproval-page/div/div/div[1]/div[5]/div[10]/div/div[2]/div/input"));
		}
		
		public WebElement RequestLA11()
		
		{
			return driver.findElement(By.xpath(".//*[@id='ibm-pagetitle-h1']/div[3]/div[2]/quoteedit-page/div/div/quoteprices-page/div/requestapproval-page/div/div/div[1]/div[5]/div[11]/div/div[2]/div/input"));
		}
		
		public WebElement RequestLA12()
		
		{
			return driver.findElement(By.xpath(".//*[@id='ibm-pagetitle-h1']/div[3]/div[2]/quoteedit-page/div/div/quoteprices-page/div/requestapproval-page/div/div/div[1]/div[5]/div[12]/div/div[2]/div/input"));
		}
		
		public WebElement RequestLA13()
		
		{
			return driver.findElement(By.xpath(".//*[@id='ibm-pagetitle-h1']/div[3]/div[2]/quoteedit-page/div/div/quoteprices-page/div/requestapproval-page/div/div/div[1]/div[5]/div[13]/div/div[2]/div/input"));
		}
		
		public WebElement RequestLA14()
		
		{
			return driver.findElement(By.xpath(".//*[@id='ibm-pagetitle-h1']/div[3]/div[2]/quoteedit-page/div/div/quoteprices-page/div/requestapproval-page/div/div/div[1]/div[5]/div[14]/div/div[2]/div/input"));
		}
		
		public WebElement RequestLA15()
		
		{
			return driver.findElement(By.xpath(".//*[@id='ibm-pagetitle-h1']/div[3]/div[2]/quoteedit-page/div/div/quoteprices-page/div/requestapproval-page/div/div/div[1]/div[5]/div[15]/div/div[2]/div/input"));
		}
		
		public WebElement RequestLA16()
		
		{
			return driver.findElement(By.xpath(".//*[@id='ibm-pagetitle-h1']/div[3]/div[2]/quoteedit-page/div/div/quoteprices-page/div/requestapproval-page/div/div/div[1]/div[5]/div[16]/div/div[2]/div/input"));
		}
		
		public WebElement RequestLA17()
		
		{
			return driver.findElement(By.xpath(".//*[@id='ibm-pagetitle-h1']/div[3]/div[2]/quoteedit-page/div/div/quoteprices-page/div/requestapproval-page/div/div/div[1]/div[5]/div[17]/div/div[2]/div/input"));
		}
		
		public WebElement RequestLA18()
		
		{
			return driver.findElement(By.xpath(".//*[@id='ibm-pagetitle-h1']/div[3]/div[2]/quoteedit-page/div/div/quoteprices-page/div/requestapproval-page/div/div/div[1]/div[5]/div[18]/div/div[2]/div/input"));
		}
		
		public WebElement RequestLA19()
		
		{
			return driver.findElement(By.xpath(".//*[@id='ibm-pagetitle-h1']/div[3]/div[2]/quoteedit-page/div/div/quoteprices-page/div/requestapproval-page/div/div/div[1]/div[5]/div[19]/div/div[2]/div/input"));
		}
		
		public WebElement RequestLA20()
		
		{
			return driver.findElement(By.xpath(".//*[@id='ibm-pagetitle-h1']/div[3]/div[2]/quoteedit-page/div/div/quoteprices-page/div/requestapproval-page/div/div/div[1]/div[5]/div[20]/div/div[2]/div/input"));
		}
		
		public WebElement RequestLA21()
		
		{
			return driver.findElement(By.xpath(".//*[@id='ibm-pagetitle-h1']/div[3]/div[2]/quoteedit-page/div/div/quoteprices-page/div/requestapproval-page/div/div/div[1]/div[5]/div[21]/div/div[2]/div/input"));
		}
		
		public WebElement RequestLA22()
		
		{
			return driver.findElement(By.xpath(".//*[@id='ibm-pagetitle-h1']/div[3]/div[2]/quoteedit-page/div/div/quoteprices-page/div/requestapproval-page/div/div/div[1]/div[5]/div[22]/div/div[2]/div/input"));
		}
		
		public WebElement RequestLA23()
		
		{
			return driver.findElement(By.xpath(".//*[@name='3523']"));
		}
		
		public WebElement RequestLA24()
		
		{
			return driver.findElement(By.xpath(".//*[@name='3530']"));
		}
		
		public WebElement RequestLA25()
		
		{
			return driver.findElement(By.xpath(".//*[@name='3537']"));
		}
		
public WebElement RequestApprovalSaveContinue()
		
		{
			return driver.findElement(By.xpath(".//button[contains(@data-ng-click,'submitRequestApproval()')]"));
			
		}



public WebElement CancelNotificationOverlay()
{
	//return driver.findElement(By.xpath(".//button[contains(@data-ng-click,'cancelRequest('overlay')')]"));
	return driver.findElement(By.xpath(".//*[@id='ngdialog2']/div[2]/div[1]/div[2]/div[9]/div/p/a[2]"));
	
}
		
		
		//************* End request for approve for LA ********************* 
		
		
		
		
		
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
		
			return driver.findElement(By.xpath(".//*[@id='ngdialog2']/div[2]/div[1]/div/div[2]/div/div[2]/button"));
			                                    
			//return driver.findElement(By.xpath(".//span[@class='ng-scope']"));
			//span[@class='ng-scope']
		}
		
		public WebElement PSATRegCustEUCISearchCustLink()
		{
			//return driver.findElement(By.xpath(".//a[contains(@data-ng-click,'searchCustomer()')]"));
			//return driver.findElement(By.linkText("Search Customer"));
			//return driver.findElement(By.xpath("//span[contains(@class,'title')]  [contains(text(),'Search Customer')]"));
		
			return driver.findElement(By.xpath(".//*[@id='ngdialog2']/div[2]/div[1]/div/div[2]/div/div[3]/div/div[2]/button"));
			                                    
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
			return driver.findElement(By.xpath(".//*[@id='ngdialog2']/div[2]/div[1]/div/div[2]/div/div[7]/div[2]/button"));
			
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
			return driver.findElement(By.xpath(".//button[contains(@data-ng-click,'showQuoteStep(quoteStepList[3]')]"));
		}
		
		//*************** End - Registration and Customer Page *********************
		
		//*************** Start - Details Pricing Page *********************
		
		public WebElement DetailsPriceSection()
		{
			return driver.findElement(By.xpath(".//span[contains(translate(text(), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'),'details pricing')]"));
		}
		public WebElement PSAT_DetailsPriceRequestPriceExceptionCheckBox()
		{
			return driver.findElement(By.xpath(".//*[@id='requestpriceexception']"));
		}
		public WebElement DetailsPriceViewEidtConfigButton()
		{
			return driver.findElement(By.xpath(".//button[contains(@data-ng-click,'viewEditConfiguration();')]"));
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
			driver.switchTo().frame("ui-tinymce-1_ifr");
			System.out.println("GOT FOCUS  in text input");
			//return driver.findElement(By.xpath(".//iframe[contains(@title,'Rich Text Area. Press ALT-F9 for menu. Press ALT-F10 for toolbar. Press ALT-0 for help')]"));
			driver.findElement(By.id("tinymce")).sendKeys("This is Bid Justification text");
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
			return driver.findElement(By.xpath(".//button[contains(@data-ng-click,'submit()')]"));
			//return driver.findElement(By.xpath(".//button[contains(@data-ng-click,'showQuoteStep(quoteStepList[4])')]"));
			//return driver.findElement(By.xpath(".//*[@id='ibm-columns-main']/div/div[2]/div/div/quoteedit-page/div/div/div/div/quotepricerequestpsat-page/div[2]/form/div[9]/button[1]"));
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
