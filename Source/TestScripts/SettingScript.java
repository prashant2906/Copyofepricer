package TestScripts;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Tasks.Task_Common;
import Tasks.TestReport;
import Tasks.Setting.*;
import WebElements.Object_Common;

//@Listeners(TestReport.class)
public class SettingScript
{
	SettingTask_Common stcmtsk = new SettingTask_Common();
	SettingTask_LNM stlnmtsk = new SettingTask_LNM();
	Task_Common CT = new Task_Common();

	  @BeforeTest
	  @Parameters("browser")
	  public void BrowserCallSettingLogin() 
	  {
		  Object_Common.BrowserCall("browser", Task_Common.getProperty("SETTINGSDev"));
		  CT.ImplicitWait();
		  stcmtsk.selectSettingGroupandLaunch();
	  } 
	
	  @Test
	  public void QuickCheck()
	  {
		  
	 stlnmtsk.Launch_ManageLSCDFiles_Task();
	 stlnmtsk.Launch_ManageReferenceTables_Task();
	 stlnmtsk.Launch_AssociateReferenceTablesList_Task();
	 stlnmtsk.Launch_ManageRestrictedProducts_Task();
	 stlnmtsk.Launch_ManageRoutingParameter_Task();
	 stlnmtsk.Launch_ManageDistributionList_Task();
	 stlnmtsk.Launch_ManageBPParameters_Task();
	 stlnmtsk.Launch_ManageLanguageList_Task();
	 stlnmtsk.Launch_ManageNLS_Task();
	 stlnmtsk.Launch_ManageNLSCurrency_Task();
	 stlnmtsk.Launch_ManageNLSReference_Task();
	 stlnmtsk.Launch_ManageNLSRevenueDivisionCode_Task();
	 stlnmtsk.Launch_ManageNLSSpecialBidCodes_Task();
	 stlnmtsk.Launch_ManageNLSTermsAndConditions_Task();
	 stlnmtsk.Launch_ManageBPCalculatorParameters_Task();
	 stlnmtsk.Launch_ManageEntitledPrice_Task();
	 stlnmtsk.Launch_ManageTemplatesAssociations_Task();
	 stlnmtsk.Launch_ManageSelectedHouseAccountList_Task();
	 stlnmtsk.Launch_ManageBPTermsAndConditions_Task();
	 stlnmtsk.Launch_ManageRegistrationNumber_Task();
	 stlnmtsk.Launch_ManageAdditionalSBCCriteria_Task();
	 stlnmtsk.Launch_ManageSBCTermsAndConditions_Task();
	 stlnmtsk.Launch_UploadBPPCLogic_Task();
	 stlnmtsk.Launch_ManageBidTypeRules_Task();
	 stlnmtsk.Launch_ManageBidTypeTermsandCondition_Task();
	 
	 stlnmtsk.Launch_RetrieveQuoteAttachments_Task();
	 stlnmtsk.Launch_ManageGeoHierarchy_Task();
	 stlnmtsk.Launch_ManagePricingAnalysis_Task();
	 stlnmtsk.Launch_ManageValueSellerPrice_Task();
	 stlnmtsk.Launch_ManageWarningParameters_Task();
	 stlnmtsk.Launch_ManageAgogConfiguration_Task();
	 stlnmtsk.Launch_ManageBpMarginParameters_Task(); 
	 stlnmtsk.Launch_ManageEROAccount_Task();
	 stlnmtsk.Launch_ManageLTEAccount_Task();
	 stlnmtsk.Launch_ManageP4VParameters_Task();
	 stlnmtsk.Launch_ManageP4VProductGroups_Task();
	 stlnmtsk.Launch_ManageP4VBPMarginParameters_Task();
	 stlnmtsk.Launch_ManageCountryOption_Task();
	 stlnmtsk.Launch_ManageNewsLink_Task();
	  }
	 
	  @AfterSuite
	  public void TestReportResultMail()
	  	{
	  		//CT.TestResultMail();
	  		
	  	}
	  	

}

