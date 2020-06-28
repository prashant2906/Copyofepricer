package TestScripts;


import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Tasks.Task_Common;

import Tasks.BP.*;
import WebElements.Object_Common;

//@Listeners(TestReport.class) --- not required here as it is defined in XML with class path for listener
public class BPTestScript 
{
	Task_Common CT = new Task_Common();
	BPTask_Dashboard bpdstsk = new BPTask_Dashboard();
	BPTask_Common bpcmtsk = new BPTask_Common();
	BPTask_QuoteEditor bpqetsk = new BPTask_QuoteEditor();
	BPTask_AssignBackup bpabtsk= new BPTask_AssignBackup();

	
	
// BP Launch Test cases
	@BeforeTest
	@Parameters("browser")
	public void BPLaunchTC(String browser) 
	{
		Object_Common.BrowserCall(browser, Task_Common.getProperty("BPDev"));
	//	CT.ImplicitWait();
	}
	
//Prashant - Sprint 1 Scrum 1 : BP PCS/PSAT
	@Parameters("flow")
	@Test
	public void LoginTC(String flow)
	{
		if (flow.equalsIgnoreCase("PCS"))
		{
			bpcmtsk.BPByPassPCSPSATTask(flow);
			bpcmtsk.PCSGroupSelection();
		}
		else if (flow.equalsIgnoreCase("PSATEM"))
		{
			bpcmtsk.BPByPassPCSPSATTask(flow);
			//bptsk.LabelValidationSelectGroupScreen();
			bpcmtsk.PSATGBGroupSelection();
		}
		
		else if (flow.equalsIgnoreCase("PSATJP"))
		{
			bpcmtsk.BPByPassPCSPSATTask(flow);
			//bptsk.LabelValidationSelectGroupScreen();
			bpcmtsk.PSATJPGroupSelection();
		}
		
		bpcmtsk.BPLaunchButton();
		
		//Dashboard Validations 
		
		/*bpdstsk.QuotePanel();
		bpdstsk.ExpriringQuotePanel();
		bpdstsk.NewsPanel();
		if (flow.equalsIgnoreCase("PCS"))
		{
			bpcmtsk.ReturnToPCS();
		}
		else if (flow.equalsIgnoreCase("PSATEM")||flow.equalsIgnoreCase("PSATJP"))
		{
			bpcmtsk.ReturnToPSAT();
		}*/
		
	}
// Create a Quote Test cases
	// Overview screen checks
	@Test
	public void CreateAQuoteTC()
	{
		//BPLaunchTC(AppURL);
		CT.ImplicitWait();
		bpqetsk.QuoteCreationTask();
		bpqetsk.QuoteCreationHeaderTask();
		bpqetsk.QuoteCreationOverviewPageTask();
		//System.out.println("Overview Screen Tests are passed.");
	}
// Manas - Sprint 1 Scrum 2 : Assigned Backup
		@Test
		
		public void AssignBackup() 
		{
			bpabtsk.AssignedBackupTabClick();
			bpabtsk.AssignBackup_AnotherPerson();
			bpabtsk.CheckValidations();
			bpabtsk.AddAssignBackup();
			bpabtsk.EditAssignBackup();
			bpabtsk.AssignBackup_RemoveBackup();
		 }
//Pradeep - Sprint 1 Scrum 3 : Manage Configuration File
	@Test
	public void ManageConfigurationTC()
	{
		//CT.ImplicitWait();
		bpqetsk.QuoteCreationManageConfigAddConfigFile(Task_Common.getProperty("CFRPath"));
		bpqetsk.ManageConfigRemoveConfigFile();
	}
//Eduardo : Sprint 1 Scrum 4 : Add/Remove Manual components 
	@Test
	public void AddRemoveManualComponents()
	{
		bpqetsk.AddManualComponent();
		/*bpqetsk.AddManualComponent();
		bpqetsk.AddManualComponent();*/
		bpqetsk.ValidateAndCollectPricingAddedComponent();
		bpqetsk.RemoveManualComponent();
	
	}
	
@AfterSuite
	public void TestReportMail()
	{
		//CT.TestResultMail();
	}

}

