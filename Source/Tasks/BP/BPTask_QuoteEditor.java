package Tasks.BP;

import java.util.Date;

import org.openqa.selenium.support.ui.Select;

import Tasks.Task_Common;
import WebElements.BP.BPObj_MyQuotes;
import WebElements.BP.BPObj_QuoteEditor;

public class BPTask_QuoteEditor 
{
	BPObj_QuoteEditor bpqeobj = new BPObj_QuoteEditor();
	BPObj_MyQuotes bpmqobj = new BPObj_MyQuotes();
	Task_Common CT= new Task_Common();
	
	//*********************Start - Quote Creation - Create a Quote tab Click *************************
	
	public void QuoteCreationTask()
	{
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		bpqeobj.CreateQuotetab().click();
		
	}
	//*********************End - Quote Creation - Create a Quote tab Click *************************	
	//*********************Start - Quote Creation (Overview Screen - Header Values Checks) *************************
	
		public void QuoteCreationHeaderTask()
		{
			if (bpqeobj.QuoteHeaderTab().isDisplayed())
			{
			  if( bpqeobj.QuoteHeaderTab().getText()!="")
			  {
				  bpqeobj.QuoteHeaderQuoteIDValue().isDisplayed();
				  //Quote ID should be same as Quote header ID
				  bpqeobj.QuoteHeaderQuoteIDValue().equals(bpqeobj.QuoteHeaderTab().getText());
				  //Quote Status should be open while creating new quote
				  bpqeobj.QuoteHeaderStatusValue().getText().equalsIgnoreCase("In process");
				  System.out.println("		<Pass>Header checks are done !");
			  }
			}	
			else{
				System.out.println("		<Failed>Header checks is failed !");
			}
		}
		//*********************End - Quote Creation (Overview Screen - Header Values Checks) *************************
		
		
	
//****************Start : Overview section for Overview*************************	
		public void QuoteCreationOverviewPageTask()
		{
			if (bpqeobj.OverviewPageSelectCounty().isDisplayed() &&
			bpqeobj.OverviewPageQuoteTitle().isDisplayed() &&
			bpqeobj.OverviewPageSelectBidType().isDisplayed())
			{		
				//bpqeobj.OverviewPageSelectBidType().getText().equalsIgnoreCase("Select One");
				System.out.println("			<PASS> Overview Screen checks");
				if (bpqeobj.OverviewPageSelectBidType().getText() != null && ! bpqeobj.OverviewPageSelectBidType().getText().equalsIgnoreCase("Select One"))
				{
					//bpqeobj.OverviewPageNextLink().click();
					bpqeobj.OverviewPageQuoteTitle().sendKeys("Automation Quote - "+ new Date());
					new Select (bpqeobj.OverviewPageSelectBidType()).selectByIndex(4);
					bpqeobj.OverviewPageNextLink().click();
				}
			}
			else
			{
				System.out.println("         <Failed>Something went wrong in Overview section dueing quote creation");
			}
		}
		//****************End : Overview section for Overview*************************
	
		//****************Start : Overview section for Manage Configuration*************************
		//*********************Start - Quote Creation (Manage Configuration (Add configuration)) *************************
		
		public void QuoteCreationManageConfigAddConfigFile(String CFRPath)
		{
			if (bpqeobj.ManageConfAddConfigLabel().isDisplayed())
			{
				System.out.println("			<PASS> Configuration section displayed...");
				if (bpqeobj.ManageConfAddConfigUploadButton().isDisplayed())
				{
					System.out.println("--> CFR Path ------- >  "+CT.BrowseCFR());
					bpqeobj.ManageConfAddConfigBrowseTextValue().sendKeys(CT.BrowseCFR());
					//System.out.println(CFRPath);
					bpqeobj.ManageConfAddConfigDisableChecksumCheckBox().click();
					System.out.println("			<PASS> Checksum checkbox checked");
					bpqeobj.ManageConfAddConfigWorkOtherCountryCFRCheckBox().click();
					System.out.println("			<PASS> Other country checkbox checked");
					bpqeobj.ManageConfAddConfigUploadButton().click();
					System.out.println("			<PASS> Upload link checked");
					
					// **** Removing this code as no use in Sanity Suite *******
					/*if (bpqeobj.ManageConfUploadCFRError().isDisplayed())
					{
						if(!bpqeobj.ManageConfUploadCFRError().getText().isEmpty())
							System.out.println("		<Failed> Manage Configuration - CFR could not upload successfully.");
					}
					
					if(bpqeobj.ManageConfRemoveConfig().isDisplayed())
					{
						System.out.println(bpqeobj.ManageConfRemoveConfig().getText());
						System.out.println("		<PASS> Manage Configuration - CFR added successfully.");
					}
					*/
				}
			}
		}
		//*********************End - Quote Creation (Manage Configuration (Add configuration)) *************************
		
		//*********************Start -  Added/Remove Manual Component )) *************************
		public void AddManualComponent()
		{
			bpqeobj.AddManualComponentLink().click();
			if(bpqeobj.AddManualComponentBox().isDisplayed())
			{
				new Select(bpqeobj.AddManualComponentSelectCategoryDropdown()).selectByVisibleText("Hardware");
				bpqeobj.AddManualComponentSelectNewCategoryRadio().click();
				bpqeobj.AddManualComponentType().sendKeys("3957");
				bpqeobj.AddManualComponentModel().sendKeys("VEB");
				bpqeobj.AddManualComponentQuantity().sendKeys("1100");
				//Adding Feature within Component 
				AddManualComponentFeature();
				bpqeobj.AddManualComponentAddComponentLink().click();
			}else
			{
				System.out.println("---> No dilog box has appeared for adding Components manually");
			}
		}
		
		public void ValidateAndCollectPricingAddedComponent()
		{
			if (bpqeobj.SolutionComponentsSection().isDisplayed())
			{
				//bpqeobj.SolutionComponentsCheckboxAll().click();
				bpqeobj.SolutionComponentsCollectPricingLink().click();
				try { Thread.sleep(5000); } catch (InterruptedException e) {e.printStackTrace();}
				bpqeobj.ManageConfigSaveContinueButton().click();
			}else
			{
				System.out.println("---> No components is been added so collect price does not work, please add some component before collect prices");
			}
		}
		
		public void RemoveManualComponent()
		{
			if (bpqeobj.SolutionComponentsSection().isDisplayed())
			{
				bpqeobj.SolutionComponentsCheckboxAll().click();
				if(!bpqeobj.SolutionComponentsCheckboxAll().isSelected())
					{	
						System.out.println("			Checkbox is not selected, hence selection for removeing");
						bpqeobj.SolutionComponentsCheckboxAll().click();
					}
				else
					{
						System.out.println("			Checkbox is already selected");
						
						bpqeobj.SolutionComponentsRemoveItemLink().click();
						System.out.println(CT.closeAlertAndGetItsText());
						
					}
			}
		}	
		
		//****** Method to add Products Manually
		public void AddManualComponentFeature()
		{
			bpqeobj.AddManualComponentFeature().sendKeys("4016");
			bpqeobj.AddManualComponentFetureQuantity().sendKeys("2");
			bpqeobj.AddManualComponentFeatureAddLink();
		}
		
		public void AddManualComponentUpdteQuantity()
		{
			if (bpqeobj.SolutionComponentsSection().isDisplayed())
			{
				bpqeobj.SolutionComponentsCheckboxAll().click();
				if(!bpqeobj.SolutionComponentsCheckboxAll().isSelected())
					{	
						System.out.println("			Checkbox is not selected, hence selection for updating quantity");
						bpqeobj.SolutionComponentsCheckboxAll().click();
						bpqeobj.SolutionComponentsUpdateQuantityLink().click();
					}
				else
					{
						
					}
			}
		
		}		
		//*********************End -  Added/Remove Manual Component)) *************************
		//*********************Start -  Remove Added configuration)) *************************
		
		public void ManageConfigRemoveConfigFile()
		{
			if (bpqeobj.ManageConfRemoveConfig().isDisplayed())
			{
				String str = bpqeobj.ManageConfRemoveConfig().getText();
				if(str.contains("Remove Cfr"))
				{
					System.out.println("			CFR file which can be removed");
				}
				else
				{System.out.println("			No CFR ava. to be removed ");}
			}
				
		}
		
		//*********************End -  Remove Added configuration)) *************************
		
		//****************End : Overview section for Manage Configuration*************************

		//****************Start - Registration and Customer Page *************************	
		//--Below Tasks has pre-requisites : Quote Creation Started, until Registration and Customer page is displayed--
		
		//************** Start - Deal registration Information section verification (Registration and Customer Page) **************
		
		//***** PCS Deal registration retrieval method ******
		public void PCS_DealCustDealRegRetrieve()
		{
			if (bpqeobj.RegCustDealRegInformationSection().isDisplayed())
			{
				//System.out.println("--->			Deal registration section is passed.");
				//bpqeobj.PCS_RegCustDealRegTextBox().sendKeys("S16X39X");
				bpqeobj.PCS_RegCustDealRegTextBox().sendKeys("REGNUM");
				bpqeobj.PCS_RegCustDealRegRtrieveButton().click();
				System.out.println("--->			PCS Deal registration section is passed.");
			}else
			{
				System.out.println("--->			PCS Deal registration section does not displayed.");
			}
		}
		
		
		//***** PSAT Deal registration retrieval method ******
		public void PSAT_DealCustDealRegCustomerRetrieve(String flow)
		{
		
			/*
			if (bpqeobj.RegCustDealRegInformationSection().isDisplayed())
			{
				
			//	bpqeobj.PSAT_RegCustDealRegTextBox().sendKeys("" + Keys.ENTER);
				
			//	bpqeobj.PSAT_RegCustDealRegRtrieveButton().click();
				
				try { Thread.sleep(3000); } catch (InterruptedException e) { e.printStackTrace();}
				
				
				
				if (!CT.isAlertPResent())
				{
					System.out.println("--->			PSAT Deal registration section is passed.");
					try { Thread.sleep(5000); } catch (InterruptedException e) { e.printStackTrace();}
					bpqeobj.RegCustSaveContinue().click();
					
					
					if (CT.isAlertPResent())
					{
						CT.closeAlertAndGetItsText();
					}	
				}
			    else
				
				{
					System.out.println("--->			PSAT Deal does not retrived so adding customer " + CT.closeAlertAndGetItsText());
					//System.out.println("--->			PSAT Deal does not retrived so adding customer ");
					
					//CT.closeAlertAndGetItsText();
					DealCustCustomerSearchRetrieve(flow);
				
				}
				
			}else
			{
				System.out.println("--->			PSAT Deal registration section does not displayed.");
			}
			*/
			DealCustCustomerSearchRetrieve(flow);
		}
		
		
		//***** Customer retrieval from Preference List ******
		public void DealCustCustomerRetrieve()
		{
			if (bpqeobj.RegCustEUCInfornationSection().isDisplayed() && bpqeobj.RegCustEUCICustList().isDisplayed())
			{
				new Select(bpqeobj.RegCustEUCICustList()).selectByVisibleText("MERRILL LYNCH INC/0299606");
				bpqeobj.RegCustEUCISelectCustButton().click();
				try { Thread.sleep(3000); } catch (InterruptedException e) { e.printStackTrace();}
				//****** Fill all mandatory fields ********
				bpqeobj.RegCustEUCISP2BPCompanyName().sendKeys("Sanity Suite");
				bpqeobj.RegCustSaveContinue().click();
			}
		}
		//***** Search customer and retrieve it ******
		public void DealCustCustomerSearchRetrieve(String flow)
		{
			if (bpqeobj.RegCustEUCInfornationSection().isDisplayed())
			{
				bpqeobj.RegCustEUCISearchCustButton().click();
				if (flow.equalsIgnoreCase("PCS"))
				{
					bpqeobj.RegCustEUCISearchCustFor().sendKeys("2098624");
					bpqeobj.RegCustEUCISearchCustLink().click();
					try { Thread.sleep(5000); } catch (InterruptedException e) { e.printStackTrace();}
					//bpqeobj.RegCustEUCISelectCustFormSearchResults().click();
					//bpqeobj.RegCustEUCISelectCustomerLink().click();
					//try { Thread.sleep(5000); } catch (InterruptedException e) { e.printStackTrace();}
					//****** Fill all mandatory fields ********
					bpqeobj.RegCustEUCISP2BPCompanyName().sendKeys("Sanity-RS-Unix US");
					try { Thread.sleep(5000); } catch (InterruptedException e) { e.printStackTrace();}
					
					bpqeobj.RegCustSaveContinue().click();
					try { Thread.sleep(5000); } catch (InterruptedException e) { e.printStackTrace();}
					
				}else
				{
					bpqeobj.RegCustEUCISearchCustForByName().sendKeys("Bank*");
					bpqeobj.PSATRegCustEUCISearchCustLink().click();
					try { Thread.sleep(8000); } catch (InterruptedException e) { e.printStackTrace();}
					bpqeobj.RegCustEUCISelectCustFormSearchResults().click();
					bpqeobj.RegCustEUCISelectCustomerLink().click();
					try { Thread.sleep(5000); } catch (InterruptedException e) { e.printStackTrace();}
					//****** Fill all mandatory fields ********
					bpqeobj.PSAT_RegCustEUCILedByIBMRadiobutton().click();
					bpqeobj.PSAT_RegCustEUCISP2CEID().sendKeys("qw23re2s");
					bpqeobj.PSAT_RegCustEUCISP2BPCompanyName().sendKeys("IBM India Pvt. Ltd.");
					bpqeobj.RegCustSaveContinue().click();
					//CT.closeAlertAndGetItsText();
				
				}
			}else
			{
				System.out.println("--->			Customer Search Retrival Section does not displayed.");
			}
		}
		
		//******** End - Details Pricing page and Check Value seller approved bid *************
		
		//******** Start - Details Pricing page and Check Value seller approved bid *************
		
		public void DetailsPricingChecks(String SanitySuite, String flow)
		{
			if (bpqeobj.DetailsPriceSection().isDisplayed())
			{
				if (SanitySuite.equalsIgnoreCase("Value Seller Sanity"))
				{
					bpqeobj.DetailsPriceAcceptVSOButton().click();
				} 
				if (SanitySuite.equalsIgnoreCase("Special Bid Sanity"))
				{
					if (flow.equalsIgnoreCase("PCS"))
					{
						bpqeobj.DetailsPriceSpecialBidButton().click();
					}else
					{
						bpqeobj.PSAT_DetailsPriceRequestPriceExceptionCheckBox().click();
						try { Thread.sleep(5000); } catch (InterruptedException e) { e.printStackTrace();}
						
						bpqeobj.DetailsPriceSpecialBidButton().click();
						try { Thread.sleep(5000); } catch (InterruptedException e) { e.printStackTrace();}
						
					}
				}
				System.out.println("--->			Details Pricing Screen Test Passed.");
			}else
			{
				System.out.println("--->			Details Pricing Screen does not displayed");
			}
		}
		
		//********** Start - Value Seller approved bid validation ******
		public void AcceptValueSellerBid()
		{
			String VSApprovedBid = bpqeobj.ValueSellerApprovedBidHeaderStatus().getText();
			System.out.println("--->" + VSApprovedBid);
			if (VSApprovedBid.equalsIgnoreCase("Value seller approved"))
			{
				System.out.println("--->			Bid Got approved.");
				try { Thread.sleep(5000); } catch (InterruptedException e) { e.printStackTrace();}
				bpqeobj.ValueSellerApprovedBidAddendumTab().click();
				try { Thread.sleep(5000); } catch (InterruptedException e) { e.printStackTrace();}
				bpqeobj.ValueSellerApprovedApprovedSummaryTab().click();
				System.out.println("--->			All tabs check are done for Value seller Approved bid.");
			}else
			{
				System.out.println("--->			Check are failed for Value seller Approved bid.");
			}
		}
		
		//******** End - Details Pricing page and Check Value seller approved bid *************
		
		//******** Start - PCS Submit Price Request Page *************
		
		public void PCS_SubmitPriceActions()
		{
			//  Decision Maker Section Fields entering
			if (bpqeobj.PriceRequestDecisionMakerSection().isDisplayed())
			{
				bpqeobj.PriceRequestDecisionMakerName().sendKeys("Sanity Suite");
				bpqeobj.PriceRequestDecisionMakerTitle().sendKeys("Mr.");
				bpqeobj.PriceRequestDecisionMakerProjectName().sendKeys("ePricer-Sanity");
				bpqeobj.PriceRequestDecisionMakerEMail().sendKeys("pradeepkumar08@in.ibm.com");
			}
			// ** This information coming auto filled when user login with distributor profile so commenting this peace of code
			/*if (bpqeobj.PriceRequestIBMChannelContactSection().isDisplayed())
			{
				bpqeobj.PriceRequestIBMChannelContactName().sendKeys("Channel Contact Name");
				bpqeobj.PriceRequestIBMChannelContactPhone().sendKeys("+91-9871813475");
				bpqeobj.PriceRequestIBMChannelContactInternetID().sendKeys("pradeepkumar08@in.ibm.com");
			}*/
			// Quote level Special Bid Codes apply
			if (bpqeobj.PriceRequestQuoteLevelSBCsSection().isDisplayed())
			{
				System.out.println("--->			Quote Leve SBC's is Passed");
				new Select(bpqeobj.PriceRequestQuoteLevelSBCsDropDown()).selectByVisibleText("610-PPMaint");
			}else
			{
				System.out.println("--->			Quote Leve SBC's is Failed.");
			}
			// Set Requested Price/Discount and set for all added components
			if (bpqeobj.PriceRequestSetRequestedPriceDiscountSection().isDisplayed())
			{
				System.out.println("--->			Set Requested Price/Discount is Passed");
				bpqeobj.PriceRequestSetRequestedPriceDiscountQuickApplyTextBox().sendKeys("10");
				bpqeobj.PriceRequestSetRequestedPriceDiscountAllCheckBox().click();
				bpqeobj.PriceRequestSetRequestedPriceDiscountDiscountQuickApplyButton().click();
				try { Thread.sleep(10000); } catch (InterruptedException e) { e.printStackTrace();}
				//bpqeobj.PCS_PriceRequesCertificationCommentsTextBox().sendKeys("Sanity Suite because it's mandatory so adding it !!!!");
				bpqeobj.SwitchtoDefault();
				System.out.println("--->			AFTER Justification");
				try { Thread.sleep(3000); } catch (InterruptedException e) { e.printStackTrace();}
				//bpqeobj.PriceRequestSetRequestedPriceDiscountCommentTextBox().sendKeys("This is Sanity Suite and we are creating this bid by using automation.");
				bpqeobj.PriceRequestSubmitButton().click();
			}else
			{
				System.out.println("--->			Set Requested Price/Discount is Failed.");
			}
		}
		
		//******** End - PCS Submit Price Request Page *************
		
		//******** Start - PSAT Submit Price Request Page *************
		
		public void PSAT_SubmitPriceActions()
		{
			//***** Fill all entries on General information tab *****
			if (bpqeobj.PSAT_PriceRequestGeneralInfoSection().isDisplayed())
			{
				new Select(bpqeobj.PSAT_PriceRequestGeneralInfoOpportunitytypeDropDown()).selectByVisibleText("Competitive bid");
				bpqeobj.PSAT_PriceRequesChannelInfoTAB().click();
				try { Thread.sleep(10000); } catch (InterruptedException e) { e.printStackTrace();}
				if (CT.isAlertPResent())
				{
					//CT.closeAlertAndGetItsText();
					CT.closeAlert();
				}
			}
			//***** Fill all entries on IBM Channel information tab *****
			if (bpqeobj.PSAT_PriceRequestChannelInfoSection().isDisplayed())
			{
				bpqeobj.PSAT_PriceRequestChannelInfoName().sendKeys("Pradeep");
				bpqeobj.PSAT_PriceRequestChannelInfoPhone().sendKeys("+91-9871813475");
				bpqeobj.PSAT_PriceRequestChannelInfoInternetID().sendKeys("pradeepkumar08@in.ibm.com");
				bpqeobj.PSAT_PriceRequesRequestPricingTAB().click();
				try { Thread.sleep(10000); } catch (InterruptedException e) { e.printStackTrace();}
				if (CT.isAlertPResent())
				{
					//CT.closeAlertAndGetItsText();
					CT.closeAlert();
				}
			}
			if (bpqeobj.PSAT_PriceRequesRequestPricingSection().isDisplayed())
			{
				bpqeobj.PSAT_PriceRequesRequestPricingRequestedEndUserDiscountTextBox().sendKeys("15");
				bpqeobj.PSAT_PriceRequesRequestPricingAPPLYButton().click();
				if (CT.isAlertPResent())
				{
					//CT.closeAlertAndGetItsText();
					CT.closeAlert();
				}
				try { Thread.sleep(7000); } catch (InterruptedException e) { e.printStackTrace();}
				  bpqeobj.PSAT_PriceRequesCertificationTAB().click();
				if (CT.isAlertPResent())
				{
					//CT.closeAlertAndGetItsText();
					CT.closeAlert();
				}
			}
	//		if (bpqeobj.PSAT_PriceRequesCertificationSection().isDisplayed())
	//		{
				System.out.println("Entering something in text input");
				//bpqeobj.PSAT_PriceRequesCertificationCommentsTextBox().sendKeys(Keys.CONTROL + "a");
				//bpqeobj.PSAT_PriceRequesCertificationCommentsTextBox().click();
				//bpqeobj.PSAT_PriceRequesCertificationCommentsTextBox().sendKeys("Sanity Suite because it's mandatory so adding it !!!!");
				bpqeobj.PSAT_PriceRequesCertificationCommentsTextBox();
				System.out.println("Before switch to default ");
				bpqeobj.SwitchtoDefault();
				System.out.println("After switch to default ");
			bpqeobj.PSATEMJP_PriceRequestSUBMITButton().click();
				//bpqeobj.PriceRequestSubmitButton().click();
				//bpqeobj.PriceRequestSubmitSendNotificationButton();		
				
				if (CT.isAlertPResent())
				{
					CT.closeAlert();
				}
				try { Thread.sleep(5000); } catch (InterruptedException e) { e.printStackTrace();}
				
				//bpqeobj.PriceRequestSendNotificationTo()bpmqobj.
				//bpqeobj.PriceRequestSendNotificationTo().sendKeys("mbhatna2@in.ibm.com");
				try { Thread.sleep(5000); } catch (InterruptedException e) { e.printStackTrace();}
				
				//bpqeobj.PriceRequestSendNotificationSendLink();
				
				
				
				
			}
	//	}
		
		//******** End - PSAT Submit Price Request Page *************
		
		//******** Start - Closing the quote and retrieving its ID *******
		public void CloseQuoteandRetrieveID()
		{
			if (bpqeobj.QuoteIDTab().isDisplayed())
			{
				String QuoteID = bpqeobj.GetQuoteID().getText();
				System.out.println("Quote ID is -----> " + QuoteID);
				bpqeobj.CloseQuoteID().click();
			}
		}
		//******** End - Closing the quote and retrieving its ID *******
		
		/// Code written by Anshoo ******
		public void EndUserCustomerVerify()
		{
			bpqeobj.EndUserCustomerInformation().isDisplayed();
			bpqeobj.SearchCustomerLink().isDisplayed();
			bpqeobj.SaveToPreferences().isDisplayed();
			bpqeobj.SaveToYourList().isDisplayed();
			bpqeobj.SelectFromYourListDropDown().getText().equalsIgnoreCase("None");
			System.out.println("			Search End User Customer Screen are Passed.");
						
			
		}

		//*********************Task for Search Customer*********************
		public void CustomerSearchFlow()
		{
			bpqeobj.SearchCustomerLink().click();
			if(bpqeobj.OverlayDialog().isDisplayed())
			{
				bpqeobj.OverlaySearchRetrieveCustomer().isDisplayed();
				bpqeobj.OverlayStaticMessage().isDisplayed();
				bpqeobj.OverlaySearchForInput().sendKeys("0009163");
				bpqeobj.OverlaySearchCustomer().click();
			}
			if (bpqeobj.UndefinedRecordsFound().isDisplayed())
			{
				System.out.println("			There are no existing records to display.");
			}
			else
			{
				bpqeobj.OverlaySelectCustomer().isDisplayed();
				System.out.println("			Search Customer is completed.");
			}
		
		}

		//*********************Task for Retrieve Customer*********************
		public void CustomerRetrieveFlow()
		//---Pre-requisite: Customer SearchFlow is done.---
		{
			if (bpqeobj.OverlayButton1().isDisplayed())
			{
				bpqeobj.OverlayButton1().isEnabled();
				bpqeobj.OverlayRetrievedNumber().getText().equalsIgnoreCase("0009163");
				System.out.println("			Searched customer is successfully found from the database.");
				bpqeobj.OverlaySelectCustomer().click();
				
		//---Codes in here is applied if application intends to close the Overlay after selecting customer---
		//		if (bpqeobj.OverlayDialog().isDisplayed())
		//		{
		//			System.out.println("Error: Overlay screen must close after Selecting the Customer.");
		//		}
		//---Otherwise, do the following if statements.
			if (bpqeobj.OverlayDialog().isDisplayed())
			{
				bpqeobj.OverlayClose().click();
			}
				
			bpqeobj.CustomerNumLabel().isDisplayed();
			bpqeobj.CustomerNameLabel().isDisplayed();
			bpqeobj.CustomerAddressLabel().isDisplayed();
			bpqeobj.CustomerTypeLabel().isDisplayed();
			System.out.println("			A Customer has been Retrieved.");
					
			if (bpqeobj.CustomerInfoDisplay().getText().contains("0009163"))
			{
				System.out.println("			Correct Customer has been Retrieved.");
			}
			else
			{
				System.out.println("			Incorrect data retrieved");
			}
					
			}
			else
			{
				System.out.println("Can't Proceed to Retrieving Customer. No Records to display.");
			}
		}
		
		//*********************Task for Select Customer From List*********************
		public void SelectFromUserListFlow()
		{
			bpqeobj.SelectFromYourListDropDown().isDisplayed();
			bpqeobj.SelectFromYourListDropDown().click();
			new Select(bpqeobj.SelectFromYourListDropDown()).selectByVisibleText("MERRILL LYNCH INC/0299609");
				
				if (bpqeobj.CustomerNumLabel().isDisplayed())
				{
					System.out.println("			Retrieving Customer from User Preference is Successful.");
				}
				else
				{
					System.out.println("			Retrieving Customer from User Prefence has Failed.");
				}
		}
		
		//*********************Task for Add Customer To List*********************	
		public void SaveToUserListFlow()
		{
			//---Pre-requisite: Customer SearchFlow is done. Customer Number selected should be 0009163.---		
			bpqeobj.CustomerNumLabel().isDisplayed();
			bpqeobj.CustomerNameLabel().isDisplayed();
			bpqeobj.CustomerAddressLabel().isDisplayed();
			bpqeobj.CustomerTypeLabel().isDisplayed();
			bpqeobj.CustomerInfoDisplay().getText().contains("0009163");
			bpqeobj.SaveToYourList().click();
				if (new Select(bpqeobj.SelectFromYourListDropDown()).getAllSelectedOptions().toString().contains("GLOBAL LLC/0009163"))
				{
					System.out.println("			Saving Customer to User Preferences is Successful.");
				}
				else
				{
					System.out.println("			Saving Customer to User Prefernces has Failed.");
				}
		}
//****************End : Overview section for Registration and Customer*************************
	
//****************Start : Overview section for Details Pricing*************************	
//****************End : Overview section for Details Pricing*************************
	
//****************Start : Overview section for Submit Price Request*************************	
//****************End : Overview section for Submit Price Request*************************
	

}
