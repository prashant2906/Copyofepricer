package Tasks.IBM;

import java.util.Date;

import org.openqa.selenium.support.ui.Select;

import Tasks.LogWriter;
import Tasks.Task_Common;
import WebElements.IBM.IBMObj_Common;
import WebElements.IBM.IBMObj_MyQuotes;
import WebElements.IBM.IBMObj_QuoteEditor;

public class IBMTask_QuoteEditor 
{
	IBMObj_QuoteEditor ibmqeobj = new IBMObj_QuoteEditor();
	IBMObj_MyQuotes ibmmqobj = new IBMObj_MyQuotes();
	Task_Common CT= new Task_Common();
	IBMObj_Common OC = new IBMObj_Common();
	
	//*********************Start - Quote Creation - Create a Quote tab Click *************************
	
	public void QuoteCreationTask()
	{
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		//LogWriter.writeLogs(" System tries to click on Create a quote ");
		ibmqeobj.CreateQuotetab().click();
		//LogWriter.writeLogs(" Create a Quote clicked ");
	}
	//*********************End - Quote Creation - Create a Quote tab Click *************************	
	//*********************Start - Quote Creation (Overview Screen - Header Values Checks) *************************
	
		public void QuoteCreationHeaderTask()
		{
			if (ibmqeobj.QuoteHeaderTab().isDisplayed())
			{
			  if( ibmqeobj.QuoteHeaderTab().getText()!="")
			  {
				  ibmqeobj.QuoteHeaderQuoteIDValue().isDisplayed();
				  //Quote ID should be same as Quote header ID
				  ibmqeobj.QuoteHeaderQuoteIDValue().equals(ibmqeobj.QuoteHeaderTab().getText());
				  //Quote Status should be open while creating new quote
				  ibmqeobj.QuoteHeaderStatusValue().getText().equalsIgnoreCase("In process");
				  System.out.println("		<Pass>Header checks are done !");
			  }
			}	
			else{
				System.out.println("		<Failed>Header checks is failed !");
			}
		}
		//*********************End - Quote Creation (Overview Screen - Header Values Checks) *************************
		
		
	
//****************Start : Overview section for Overview*************************	
		public void QuoteCreationOverviewPageTask(String flow)
		{
			if (ibmqeobj.OverviewPageSelectCounty().isDisplayed() &&
				ibmqeobj.OverviewPageQuoteName().isDisplayed() &&
				ibmqeobj.OverviewPageOppoOwnerName().isDisplayed())
					{		
					System.out.println("			<PASS> Overview Screen checks");
			
					//LogWriter.writeLogs(" Overview section is filling ");
					if (flow.equalsIgnoreCase("IBMNA"))
						{
							new Select(ibmqeobj.OverviewSelectCty()).selectByValue("US");
						}
					else if (flow.equalsIgnoreCase("IBMEMEA"))
						{
							new Select(ibmqeobj.OverviewSelectCty()).selectByValue("GB");
						}
			
					else if (flow.equalsIgnoreCase("IBMLA")) 
						{			
							new Select(ibmqeobj.OverviewSelectCty()).selectByValue("CO");
						}
			
					else if (flow.equalsIgnoreCase("IBMAP")) 
						{			
							new Select(ibmqeobj.OverviewSelectCty()).selectByValue("SG");
						}
		
					ibmqeobj.OverviewPageQuoteNameinput().sendKeys("Automation IBM Quote  "+ flow + " " + new Date());
					ibmqeobj.OverviewPageOppoIDinput().sendKeys("Automation IBM Quote  "+ flow + " " + new Date());
					ibmqeobj.OverviewPageOppoOwnerNameinput().sendKeys("Automation IBM Quote  "+ flow + " " + new Date());
					ibmqeobj.OverviewPageContactNuminput().sendKeys("123456");
					new Select(ibmqeobj.OverviewChannelIndicator()).selectByValue("O");
					//new Select(ibmqeobj.OverviewSolutionType()).selectByVisibleText("1.Standard");
					
					if (flow.equalsIgnoreCase("IBMJP"))
					{
						//new Select(ibmqeobj.OverviewSolutionType()).selectByValue("OIO");
						new Select(ibmqeobj.OverviewSolutionType()).selectByIndex(2);;
					
					}
					
					else
					{
					new Select(ibmqeobj.OverviewSolutionType()).selectByValue("OTH");
					}
					
					//ibmqeobj.OverviewPageNextLink().click();
					
					if (flow.equalsIgnoreCase("IBMNA"))
					{
						ibmqeobj.OverviewPageNextLinkNA().click();
					}
					
					if (flow.equalsIgnoreCase("IBMAP"))
					{
						ibmqeobj.OverviewPageNextLinkAP().click();
					}
					
					if (flow.equalsIgnoreCase("IBMEMEA"))
					{
						ibmqeobj.OverviewPageNextLinkEMEA().click();
					}
					
					if (flow.equalsIgnoreCase("IBMLA"))
					{
						ibmqeobj.OverviewPageNextLinkLA().click();
					}
					
					if (flow.equalsIgnoreCase("IBMJP"))
					{
						ibmqeobj.OverviewPageNextLinkJP().click();
					}
					//LogWriter.writeLogs(" Overview Page is filled");
					}
						
			}
					
		//****************End : Overview section for Overview*************************
	
		//****************Start : Overview section for Manage Configuration*************************
		//*********************Start - Quote Creation (Manage Configuration (Add configuration)) *************************
		
		public void QuoteCreationManageConfigAddConfigFile(String CFRPath)
		{
			//if (ibmqeobj.ManageConfAddConfigLabel().isDisplayed())
			//{
				System.out.println("			<PASS> Configuration section displayed...");
				//if (ibmqeobj.ManageConfAddConfigUploadButton().isDisplayed())
				//{
				//LogWriter.writeLogs(" ");
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
				
					System.out.println("--> CFR Path ------- >  "+CFRPath);
				
					ibmqeobj.ManageConfAddConfigBrowseTextValue().sendKeys(CT.BrowseCFR1());
					//System.out.println(CFRPath);
					try {
						Thread.sleep(5000);
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
					
					ibmqeobj.ManageConfAddConfigDisableChecksumCheckBox().click();
					System.out.println("			<PASS> Checksum checkbox checked");
					ibmqeobj.ManageConfAddConfigWorkOtherCountryCFRCheckBox().click();
					System.out.println("			<PASS> Other country checkbox checked");
					ibmqeobj.ManageConfAddConfigUploadButton().click();
					System.out.println("			<PASS> Upload link checked");
					
					try {
						Thread.sleep(10000);
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
					
					ibmqeobj.SolutionComponentsCollectPricingLink().click();
					
					try { Thread.sleep(10000); } catch (InterruptedException e) {e.printStackTrace();}
					System.out.println("after collect pricing click");
					//OC.mousehover();
				//	try { Thread.sleep(10000); } catch (InterruptedException e) {e.printStackTrace();}
			
					//ibmqeobj.ManageConfigSaveContinueButton().click();
					//ibmqeobj.PriceNavigate().click();
					
					
		
									
				//	System.out.println(" clicked the save button");
					// **** Removing this code as no use in Sanity Suite *******
					/*if (ibmqeobj.ManageConfUploadCFRError().isDisplayed())
					{
						if(!ibmqeobj.ManageConfUploadCFRError().getText().isEmpty())
							System.out.println("		<Failed> Manage Configuration - CFR could not upload successfully.");
					}
					if(ibmqeobj.ManageConfRemoveConfig().isDisplayed())
					{
						System.out.println(ibmqeobj.ManageConfRemoveConfig().getText());
						System.out.println("		<PASS> Manage Configuration - CFR added successfully.");
					}*/
				//}
			}
			
	
		
		
		//*********************End - Quote Creation (Manage Configuration (Add configuration)) *************************
		
		//*********************Start -  Added/Remove Manual Component )) *************************
		public void AddManualComponent()
		{
			ibmqeobj.AddManualComponentLink().click();
			
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
//			if(ibmqeobj.AddManualComponentBox().isDisplayed())
//			{
//		new Select(ibmqeobj.AddManualComponentSelectCategoryDropdown()).selectByValue("HP");
				ibmqeobj.AddManualComponentSelectComponenTypeRadio().click();
				ibmqeobj.AddManualComponentType().sendKeys("3957");
				ibmqeobj.AddManualComponentModel().sendKeys("VEB");
				//Adding Feature within Component 
				//AddManualComponentFeature();
				ibmqeobj.AddManualComponentAddAndCloseLink().click();
//			}else
//			{
//				System.out.println("---> No dilog box has appeared for adding Components manually");
//			}
		}
		
		/*
		public void ValidateAndCollectPricingAddedComponent()
		{
		//	if (ibmqeobj.SolutionComponentsSection().isDisplayed())
			//{
				//ibmqeobj.SolutionComponentsCheckboxAll().click();
				ibmqeobj.SolutionComponentsCollectPricingLink().click();
				try { Thread.sleep(10000); } catch (InterruptedException e) {e.printStackTrace();}
				System.out.println("before collect pricing click");
				ibmqeobj.ManageConfigSaveContinueButton().click();
				System.out.println("after collect pricing click");
			//}else
			//{
				//System.out.println("---> No components is been added so collect price does not work, please add some component before collect prices");
			//}
		}
		
		*/
		
		
		public void SaveMangeConfigEMEA()
		{
			ibmqeobj.SaveMangeConfigEMEA().click();		  	
		}
		
		public void SaveMangeConfigNA()
		{
			ibmqeobj.SaveMangeConfigNA().click();		  	
		}
		
		
		public void RemoveManualComponent()
		{
			if (ibmqeobj.SolutionComponentsSection().isDisplayed())
			{
				ibmqeobj.SolutionComponentsCheckboxAll().click();
				if(!ibmqeobj.SolutionComponentsCheckboxAll().isSelected())
					{	
						System.out.println("			Checkbox is not selected, hence selection for removeing");
						ibmqeobj.SolutionComponentsCheckboxAll().click();
					}
				else
					{
						System.out.println("			Checkbox is already selected");
						
						ibmqeobj.SolutionComponentsRemoveItemLink().click();
						System.out.println(CT.closeAlertAndGetItsText());
						
					}
			}
		}	
		
		//****** Method to add Products Manually
		public void AddManualComponentFeature()
		{
			ibmqeobj.AddManualComponentFeature().sendKeys("4016");
			ibmqeobj.AddManualComponentFetureQuantity().sendKeys("2");
			ibmqeobj.AddManualComponentFeatureAddLink();
		}
		
		public void AddManualComponentUpdteQuantity()
		{
			if (ibmqeobj.SolutionComponentsSection().isDisplayed())
			{
				ibmqeobj.SolutionComponentsCheckboxAll().click();
				if(!ibmqeobj.SolutionComponentsCheckboxAll().isSelected())
					{	
						System.out.println("			Checkbox is not selected, hence selection for updating quantity");
						ibmqeobj.SolutionComponentsCheckboxAll().click();
						ibmqeobj.SolutionComponentsUpdateQuantityLink().click();
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
			if (ibmqeobj.ManageConfRemoveConfig().isDisplayed())
			{
				String str = ibmqeobj.ManageConfRemoveConfig().getText();
				if(str.contains("Remove Cfr"))
				{
					System.out.println("			CFR file which can be removed");
				}
				else
				{System.out.println("			No CFR ava. to be removed ");}
			}
				
		}
		
		//*********************End -  Remove Added configuration)) *************************
		
	// jacob add to add customer into an IBM quote
		//manas updated
		
		public void QuoteCreationOverviewCustomerTask(String flow)
		{
			//if (ibmqeobj.CustomerPageCusInfo().isDisplayed())
			{
				System.out.println("			Try to Search a Customer");
				//LogWriter.writeLogs(" Search a customer");
				ibmqeobj.CustomerPageSearchCusomterLink().click();
				
				ibmqeobj.IBMMasterCustomerRadio().click();
				if (ibmqeobj.CustomerPageSearchOnList().isDisplayed())
				{
					try {
						Thread.sleep(5000);
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
					
						
					
					try {
						Thread.sleep(5000);
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
					
					
					
					if (flow.equalsIgnoreCase("IBMNA"))
					{
						new Select(ibmqeobj.CustomerPageSearchOnList()).selectByValue("cmrnb");
						
					    ibmqeobj.CustomerPageNonLagCusInput().sendKeys("9232802");
						//ibmqeobj.CustomerPageCusNameInput().sendKeys("FCA US LLC*");
					}
					else if (flow.equalsIgnoreCase("IBMEMEA"))
					{
						new Select(ibmqeobj.CustomerPageSearchOnList()).selectByValue("nonlegacycustomernb");
						
						ibmqeobj.CustomerPageNonLagCusInput().sendKeys("0035284634");
					//	ibmqeobj.CustomerPageCusNameInput().sendKeys("RAPT*");
					}
					
					else if (flow.equalsIgnoreCase("IBMLA")) 
					{	
						new Select(ibmqeobj.CustomerPageSearchOnList()).selectByValue("cmrnb");
						
					ibmqeobj.CustomerPageNonLagCusInput().sendKeys("004288");
					//	ibmqeobj.CustomerPageCusNameInput().sendKeys("BR COMUNICACOES LTDA*");
					}
					
					else if (flow.equalsIgnoreCase("IBMAP")) 
					{		
						new Select(ibmqeobj.CustomerPageSearchOnList()).selectByValue("nonlegacycustomernb");
						
						ibmqeobj.CustomerPageNonLagCusInput().sendKeys("0037443846");
					//	ibmqeobj.CustomerPageCusNameInput().sendKeys("BANK OF CHINA");
					}
					
					else if (flow.equalsIgnoreCase("IBMJP")) 
					{	
						new Select(ibmqeobj.CustomerPageSearchOnList()).selectByValue("nonlegacycustomernb");
						
						ibmqeobj.CustomerPageNonLagCusInput().sendKeys("0018086680");
					//	ibmqeobj.CustomerPageCusNameInput().sendKeys("BANK OF CHINA");
					}
					
					
					
					ibmqeobj.CustomerPageSearchonButton().click();
					
					try {
						Thread.sleep(10000);
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
					//LogWriter.writeLogs(" Customer Searched");
					ibmqeobj.CustomerPageSaveContinueButton().click();
					
				}
			}
		}
					
					/*
					ibmqeobj.CustomerPageCusResultindex0().click();
					if (ibmqeobj.CustomerPageCusResultindex0().isSelected())
					{
						ibmqeobj.CustomerPageSelectCusButton().click();
						System.out.println("			Customer Selected");
						try {
							Thread.sleep(5000);
						} catch (InterruptedException e) {
							
							e.printStackTrace();
						}
						ibmqeobj.CustomerPageSaveContinueButton().click();
					}
					
					
				}
					
			}
			else
			{	
				System.out.println("			The Customer page is not displayed");}
		}
		
		*/
		
		
		
		// ************* Jacob add to request for approval
		
			
		
		public void RequestforApprovaTask(String flow) {
			System.out.println(" try to click request");
			
			ibmqeobj.RequestApprovalTab().click();
			
			CT.acceptalert();
			
			if (CT.isAlertPResent())
			{
				//CT.closeAlertAndGetItsText();
				CT.closeAlert();
			}
			if (flow.equalsIgnoreCase("IBMLA"))
			{
				ibmqeobj.RequestLA1().sendKeys("test");
				ibmqeobj.RequestLA2().sendKeys("test");
				ibmqeobj.RequestLA3().sendKeys("test");
				ibmqeobj.RequestLA4().click();
				ibmqeobj.RequestLA5().click();
				ibmqeobj.RequestLA6().click();
				ibmqeobj.RequestLA7().click();
				ibmqeobj.RequestLA8().click();
				ibmqeobj.RequestLA9().click();
				ibmqeobj.RequestLA10().sendKeys("test");
				ibmqeobj.RequestLA11().sendKeys("test");
				ibmqeobj.RequestLA12().sendKeys("test");
				ibmqeobj.RequestLA13().sendKeys("test");
				ibmqeobj.RequestLA14().sendKeys("test");
				ibmqeobj.RequestLA15().sendKeys("test");
				ibmqeobj.RequestLA16().sendKeys("test");
				ibmqeobj.RequestLA17().sendKeys("test");
				ibmqeobj.RequestLA18().sendKeys("test");
				ibmqeobj.RequestLA19().sendKeys("test");
				ibmqeobj.RequestLA20().sendKeys("test");
				ibmqeobj.RequestLA21().sendKeys("test");
				ibmqeobj.RequestLA22().sendKeys("test");
			}
			
			//ibmqeobj.PriceSortCompoentcheckbox().click();
			//ibmqeobj.PriceQuickApplybutton().click();
			//ibmqeobj.PriceDiscountinput().clear();
			//ibmqeobj.PriceDiscountinput().sendKeys("1");
			
			//ibmqeobj.PriceDiscountapplybutton().click();
			
			/*
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			System.out.println("			<PASS> The discount applied");
			ibmqeobj.PriceRequestApprovebutton().click();
			
			if (flow.equalsIgnoreCase("IBMLA")) 
			{			
				ibmqeobj.RequestLA1().sendKeys("Automated");
				ibmqeobj.RequestLA2().sendKeys("Automated");
				ibmqeobj.RequestLA3().sendKeys("Automated");
				ibmqeobj.RequestLA8().sendKeys("Automated");
				ibmqeobj.RequestLA9().sendKeys("Automated");
				ibmqeobj.RequestLA10().sendKeys("Automated");
				ibmqeobj.RequestLA11().sendKeys("Automated");
				ibmqeobj.RequestLA12().sendKeys("Automated");
				ibmqeobj.RequestLA14().sendKeys("Automated");
				ibmqeobj.RequestLA15().sendKeys("Automated");
				ibmqeobj.RequestLA16().sendKeys("Automated");
				ibmqeobj.RequestLA4().click();
				ibmqeobj.RequestLA5().click();
				ibmqeobj.RequestLA6().click();
				ibmqeobj.RequestLA7().click();
				ibmqeobj.RequestLA13().click();
				ibmqeobj.RequestLA17().click();
				ibmqeobj.RequestLA18().click();
				ibmqeobj.RequestLA19().click();
				ibmqeobj.RequestLA20().click();
				ibmqeobj.RequestLA21().click();
				ibmqeobj.RequestLA22().click();
				ibmqeobj.RequestLA23().click();
				ibmqeobj.RequestLA24().click();
				ibmqeobj.RequestLA25().click();
			}
			
			*/
			
			//ibmqeobj.PriceSaveandContinuebutton().click();
			//ibmqeobj.PriceCancelNotification().click();
			
			ibmqeobj.RequestApprovalSaveContinue().click();
			
			System.out.println("			<PASS> The Quote request for approval");
			
			ibmqeobj.CancelNotificationOverlay().click();
		
		}
		
		public void QuoteApprovalTask(String flow)
		{
			
			ibmqeobj.ApproveButton().click();
			ibmqeobj.ApproveRadio().click();
		
			ibmqeobj.LeveloneIDInput().sendKeys(Task_Common.getProperty("emailid"));
			//ibmqeobj.PriceCancelNotification().click();
			

                    if (flow.equalsIgnoreCase("IBMNA") || flow.equalsIgnoreCase("IBMLA"))
						{
                    		ibmqeobj.SpecialBidCode().click();
						}
                   
                    
			ibmqeobj.SubmitButton().click();
			ibmqeobj.CancelNotification2().click();
			System.out.println("			<PASS> The quote approved");
	
		}
		
		public void Reports()
		{
			//ibmqeobj.Reports().click();
			ibmqeobj.StandardReport().click();
			System.out.println("			<PASS> opened Standard Report");
			ibmqeobj.HistoryReport().click();
			System.out.println("			<PASS> opened History Report");	
			//ibmqeobj.driver.close();
			//System.out.println("			<PASS> closed Standard Report");
		
		}
		public void CloseCurrentQuote()
		{
			ibmqeobj.CloseCurrentQuote().click();
		}
		
		public void MyQuotes()
		{
			ibmqeobj.MyQuotes().click();			
			
		}
		
		
		public void Search(String flow)
		{
			
			String QuoteID1 = ibmqeobj.QuoteIDTabs().getText();
			ibmqeobj.Search().click();
			System.out.println(flow+" --> "+QuoteID1) ;	
			//QuoteID1 = "14000";
			ibmqeobj.SearchInputBox().sendKeys(QuoteID1);
			ibmqeobj.SearchButton().click();
	
		}
		
		public void CloseBrowser()
		{
			ibmqeobj.driver.quit();			
			
		}
		
		public void RetrieveQuoteID()
		{
			String QuoteID = ibmqeobj.QuoteIDTabs().getText();
				System.out.println("Quote ID is -----> " + QuoteID);
				//ibmqeobj.CloseQuoteID().click();
			}
		
		
		/// Code written by Anshoo ******
		public void EndUserCustomerVerify()
		{
			ibmqeobj.EndUserCustomerInformation().isDisplayed();
			ibmqeobj.SearchCustomerLink().isDisplayed();
			ibmqeobj.SaveToPreferences().isDisplayed();
			ibmqeobj.SaveToYourList().isDisplayed();
			ibmqeobj.SelectFromYourListDropDown().getText().equalsIgnoreCase("None");
			System.out.println("			Search End User Customer Screen are Passed.");
						
			
		}

		//*********************Task for Search Customer*********************
		public void CustomerSearchFlow()
		{
			ibmqeobj.SearchCustomerLink().click();
			if(ibmqeobj.OverlayDialog().isDisplayed())
			{
				ibmqeobj.OverlaySearchRetrieveCustomer().isDisplayed();
				ibmqeobj.OverlayStaticMessage().isDisplayed();
				ibmqeobj.OverlaySearchForInput().sendKeys("0009163");
				ibmqeobj.OverlaySearchCustomer().click();
			}
			if (ibmqeobj.UndefinedRecordsFound().isDisplayed())
			{
				System.out.println("			There are no existing records to display.");
			}
			else
			{
				ibmqeobj.OverlaySelectCustomer().isDisplayed();
				System.out.println("			Search Customer is completed.");
			}
		
		}

		//*********************Task for Retrieve Customer*********************
		public void CustomerRetrieveFlow()
		//---Pre-requisite: Customer SearchFlow is done.---
		{
			if (ibmqeobj.OverlayButton1().isDisplayed())
			{
				ibmqeobj.OverlayButton1().isEnabled();
				ibmqeobj.OverlayRetrievedNumber().getText().equalsIgnoreCase("0009163");
				System.out.println("			Searched customer is successfully found from the database.");
				ibmqeobj.OverlaySelectCustomer().click();
				
		//---Codes in here is applied if application intends to close the Overlay after selecting customer---
		//		if (ibmqeobj.OverlayDialog().isDisplayed())
		//		{
		//			System.out.println("Error: Overlay screen must close after Selecting the Customer.");
		//		}
		//---Otherwise, do the following if statements.
			if (ibmqeobj.OverlayDialog().isDisplayed())
			{
				ibmqeobj.OverlayClose().click();
			}
				
			ibmqeobj.CustomerNumLabel().isDisplayed();
			ibmqeobj.CustomerNameLabel().isDisplayed();
			ibmqeobj.CustomerAddressLabel().isDisplayed();
			ibmqeobj.CustomerTypeLabel().isDisplayed();
			System.out.println("			A Customer has been Retrieved.");
					
			if (ibmqeobj.CustomerInfoDisplay().getText().contains("0009163"))
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
			ibmqeobj.SelectFromYourListDropDown().isDisplayed();
			ibmqeobj.SelectFromYourListDropDown().click();
			new Select(ibmqeobj.SelectFromYourListDropDown()).selectByVisibleText("MERRILL LYNCH INC/0299609");
				
				if (ibmqeobj.CustomerNumLabel().isDisplayed())
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
			ibmqeobj.CustomerNumLabel().isDisplayed();
			ibmqeobj.CustomerNameLabel().isDisplayed();
			ibmqeobj.CustomerAddressLabel().isDisplayed();
			ibmqeobj.CustomerTypeLabel().isDisplayed();
			ibmqeobj.CustomerInfoDisplay().getText().contains("0009163");
			ibmqeobj.SaveToYourList().click();
				if (new Select(ibmqeobj.SelectFromYourListDropDown()).getAllSelectedOptions().toString().contains("GLOBAL LLC/0009163"))
				{
					System.out.println("			Saving Customer to User Preferences is Successful.");
				}
				else
				{
					System.out.println("			Saving Customer to User Prefernces has Failed.");
				}
		}

	

		

	

}
