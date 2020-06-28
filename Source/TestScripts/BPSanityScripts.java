package TestScripts;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Tasks.Task_Common;
import Tasks.BP.BPTask_AssignBackup;
import Tasks.BP.BPTask_Common;
import Tasks.BP.BPTask_Dashboard;
import Tasks.BP.BPTask_MyQuotes;
import Tasks.BP.BPTask_Preference;
import Tasks.BP.BPTask_QuoteEditor;
import WebElements.Object_Common;

public class BPSanityScripts {
	
	Task_Common CT = new Task_Common();
	BPTask_Dashboard bpdstsk = new BPTask_Dashboard();
	BPTask_Common bpcmtsk = new BPTask_Common();
	BPTask_QuoteEditor bpqetsk = new BPTask_QuoteEditor();
	BPTask_MyQuotes bpmqtsk = new BPTask_MyQuotes();
	BPTask_AssignBackup bpabtsk= new BPTask_AssignBackup();
	BPTask_Preference bpptsk = new BPTask_Preference();
	
	// BP Launch Test cases
	@BeforeTest
	@Parameters("browser")
	public void BPLaunchTC(String browser) 
	{
		Object_Common.BrowserCall(browser, Task_Common.getProperty("BPDev"));
	//	CT.ImplicitWait();
	}
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
			bpcmtsk.PSATGBGroupSelection();
		}
		
		else if (flow.equalsIgnoreCase("PSATJP")) 
		{
			bpcmtsk.BPByPassPCSPSATTask(flow);
			bpcmtsk.PSATJPGroupSelection();
		}
		bpcmtsk.BPLaunchButton();
	}
	
	@Test
	public void MyQuoteScreenTest()
	{
		bpmqtsk.MyQuotePage();
		bpqetsk.CloseQuoteandRetrieveID();
	}
	
	@Parameters("flow")
	@Test
	public void ValueSellerSanity(String flow)
	{
		CT.ThreadSleepMethod();
		bpqetsk.QuoteCreationTask();
		CT.ThreadSleepMethod();
		bpqetsk.QuoteCreationOverviewPageTask();
		CT.ThreadSleepMethod();
		bpqetsk.QuoteCreationManageConfigAddConfigFile(Task_Common.getProperty("CFRPath"));
		CT.ThreadSleepMethod();
		bpqetsk.AddManualComponent();
		CT.ThreadSleepMethod();
		bpqetsk.ValidateAndCollectPricingAddedComponent();
		CT.ThreadSleepMethod();
		if (flow.equalsIgnoreCase("PCS"))
		{
			bpqetsk.PCS_DealCustDealRegRetrieve();
			CT.ThreadSleepMethod();
			bpqetsk.DealCustCustomerSearchRetrieve(flow);
		}else if(flow.equalsIgnoreCase("PSATEM") || flow.equalsIgnoreCase("PSATJP")) 
		{
			bpqetsk.PSAT_DealCustDealRegCustomerRetrieve(flow);
		}
		CT.ThreadSleepMethod();
		bpqetsk.DetailsPricingChecks("Value Seller Sanity", flow);
		CT.ThreadSleepMethod();
		bpqetsk.AcceptValueSellerBid();
		CT.ThreadSleepMethod();
		bpqetsk.CloseQuoteandRetrieveID();
	}
	
	@Parameters("flow")
	@Test
	public void SpecialBidSanity(String flow)
	{
		bpqetsk.QuoteCreationTask();
		CT.ThreadSleepMethod();
		bpqetsk.QuoteCreationOverviewPageTask();
		CT.ThreadSleepMethod();
		bpqetsk.QuoteCreationManageConfigAddConfigFile(Task_Common.getProperty("CFRPath"));
		CT.ThreadSleepMethod();
		bpqetsk.AddManualComponent();
		CT.ThreadSleepMethod();
		bpqetsk.ValidateAndCollectPricingAddedComponent();
		CT.ThreadSleepMethod();
		if (flow.equalsIgnoreCase("PCS"))
		{
			bpqetsk.PCS_DealCustDealRegRetrieve();
			CT.ThreadSleepMethod();
			bpqetsk.DealCustCustomerSearchRetrieve(flow);
		}else if(flow.equalsIgnoreCase("PSATEM") || flow.equalsIgnoreCase("PSATJP")) 
		{
			bpqetsk.PSAT_DealCustDealRegCustomerRetrieve(flow);
		}
		CT.ThreadSleepMethod();
		bpqetsk.DetailsPricingChecks("Special Bid Sanity", flow);
		CT.ThreadSleepMethod();
		if (flow.equalsIgnoreCase("PCS"))
		{
			bpqetsk.PCS_SubmitPriceActions();
			try { Thread.sleep(10000); } catch (InterruptedException e) { e.printStackTrace();}
		}else if(flow.equalsIgnoreCase("PSATEM") || flow.equalsIgnoreCase("PSATJP")) 
		{
			bpqetsk.PSAT_SubmitPriceActions();
			try { Thread.sleep(10000); } catch (InterruptedException e) { e.printStackTrace();}
		}
	}
	
	@Test
	public void tinymce_Examples()
	{
		bpptsk.Tinymce_Example();
	}
}
