 package TestScripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Tasks.LogWriter;
import Tasks.Task_Common;
import Tasks.IBM.IBMTask_AssignBackup;
import Tasks.IBM.IBMTask_Common;
import Tasks.IBM.IBMTask_Dashboard;
import Tasks.IBM.IBMTask_MyQuotes;
import Tasks.IBM.IBMTask_Preference;
import Tasks.IBM.IBMTask_QuoteEditor;
import WebElements.Object_Common;


@Test
public class IBMSanityScripts {
	
	Task_Common CT = new Task_Common();
	IBMTask_Dashboard ibmdstsk = new IBMTask_Dashboard();
	IBMTask_MyQuotes ibmmqtsk = new IBMTask_MyQuotes();
	IBMTask_AssignBackup ibmabtsk= new IBMTask_AssignBackup();
	IBMTask_Preference ibmptsk = new IBMTask_Preference();
	IBMTask_QuoteEditor ibmqetsk = new IBMTask_QuoteEditor();
	IBMTask_Common ibmcmtsk = new IBMTask_Common();
	Object_Common oc = new Object_Common();
	private  String browser = null;
	private  String env = null;
	
	
	// IBM GUI Launch Test cases	

	@DataProvider(name="geo")
	private Object[][] getURLs() {
	  return new Object[][] {
	    {"IBMNA"},
	   // {"IBMLA"},
	   // {"IBMJP"},
	   // {"IBMEMEA"}
	  };
	}
	
	

	@Test(dataProvider="geo")
	public void SanityFlow(String geo)
	{
		Object_Common.BrowserCall(browser, Task_Common.getProperty(env));
		CT.ImplicitWait();
		IBMLoginTC(geo);
		IBMGUISanity(geo);	
	}
	
	@BeforeTest
	@Parameters({"browser","env"})
	public void IBMGUILaunchTC(String browser,String env) 
	{
		this.browser = browser;
		this.env = env;	
	}
	
	// Jacob add for group selection
//	@Parameters("flow")
	public void IBMLoginTC(String flow)
	{
//		String filename="new";
//		Task_Common.CreateNewFile(filename);
	 
		try { Thread.sleep(10000); } catch (InterruptedException e) { e.printStackTrace();}
		//LogWriter.writeLogs(" System tries to select the group");
		if (flow.equalsIgnoreCase("IBMJP")) 
		{			
			ibmcmtsk.IBMJPGroupSelection();
		}
		else if (flow.equalsIgnoreCase("IBMNA"))
		{
			ibmcmtsk.IBMNAGroupSelection();
		}
		else if (flow.equalsIgnoreCase("IBMEMEA"))
		{
			ibmcmtsk.IBMEMEAGroupSelection();
		}
		
		else if (flow.equalsIgnoreCase("IBMLA")) 
		{			
			ibmcmtsk.IBMLAGroupSelection();
		}
		
		else if (flow.equalsIgnoreCase("IBMAP")) 
		{			
			ibmcmtsk.IBMAPGroupSelection();
		}
		
		
		//LogWriter.writeLogs(" Group is selected. Please click launch button");
		ibmcmtsk.IBMLaunchButton();
	}
	
//	@Parameters("flow")
	//@Test
	public void IBMGUISanity(String flow)
	{
		CT.ThreadSleepMethod();
		
		ibmqetsk.QuoteCreationTask();
		CT.ThreadSleepMethod();
		ibmqetsk.QuoteCreationOverviewPageTask(flow);
		try { 
			Thread.sleep(5000); 
		  } catch (InterruptedException e) 
			{ 
				e.printStackTrace();
			}
		
		ibmqetsk.QuoteCreationOverviewCustomerTask(flow);
		try { 
			Thread.sleep(5000); 
		    } catch (InterruptedException e)
			 { e.printStackTrace();}
		
//		ibmqetsk.QuoteCreationManageConfigAddConfigFile(Task_Common.getProperty("CFRPath"));
	//	CT.ThreadSleepMethod();
		//ibmqetsk.AddManualComponent();
		ibmqetsk.QuoteCreationManageConfigAddConfigFile(Task_Common.getProperty("CFRPath"));
		
		//Object_Common.driver.findElement(By.xpath(".//*[@data-ng-click = 'showQuoteStep(quoteStepList[3])']")).click();
		
		//Object_Common.driver.findElement(By.linkText("Save & Continue"));
		

		if (flow.equalsIgnoreCase("IBMNA"))
		{
			//oc.driver.findElement(By.xpath(".//*[@id='ibm-pagetitle-h1']/div[3]/div[2]/quoteedit-page/div/div/quoteconfig-page/div/div/div[3]/button[2]")).click();
			if (CT.isAlertPResent())
			{
				//CT.closeAlertAndGetItsText();
				CT.closeAlert();
			}
			oc.driver.findElement(By.xpath(".//*[@id='ibm-pagetitle-h1']/div[3]/div[2]/quoteedit-page/div/div/quoteconfig-page/div/div/div[4]/button[2]")).click();
			//ibmqetsk.SaveMangeConfigNA();
		}

		if (flow.equalsIgnoreCase("IBMEMEA"))
		{
			ibmqetsk.SaveMangeConfigEMEA();
		}
		
		if (flow.equalsIgnoreCase("IBMAP"))
		{
				oc.driver.findElement(By.xpath(".//*[@id='ibm-pagetitle-h1']/div[3]/div[2]/quoteedit-page/div/div/quoteconfig-page/div/div/div[3]/button[2]")).click();
		}
		
		
		if (flow.equalsIgnoreCase("IBMLA"))
		{
				oc.driver.findElement(By.xpath(".//*[@id='ibm-pagetitle-h1']/div[3]/div[2]/quoteedit-page/div/div/quoteconfig-page/div/div/div[4]/button[2]")).click();
		}
		
		if (flow.equalsIgnoreCase("IBMJP"))
		{
			CT.ThreadSleepMethod();
				oc.driver.findElement(By.xpath(".//*[@id='ibm-pagetitle-h1']/div[3]/div[2]/quoteedit-page/div/div/quoteconfig-page/div/div/div[3]/button[2]")).click();
			//Object_Common.driver.findElement(By.xpath(".//*[@data-ng-click = 'showQuoteStep(quoteStepList[3])']")).click();
				                                        
		}
		
		


		System.out.println(" clicked the save button");
		try { Thread.sleep(5000); } catch (InterruptedException e) { e.printStackTrace();}
		
		//CT.ThreadSleepMethod();
		//ibmqetsk.ValidateAndCollectPricingAddedComponent();
		ibmqetsk.RequestforApprovaTask(flow);
		try { Thread.sleep(5000); } catch (InterruptedException e) { e.printStackTrace();}
		ibmqetsk.QuoteApprovalTask(flow);
		
		//ibmqetsk.RetrieveQuoteID();
		ibmqetsk.Reports();
		//ibmqetsk.CloseCurrentQuote();
		ibmqetsk.Search(flow);
		try { Thread.sleep(5000); } catch (InterruptedException e) { e.printStackTrace();}	
		ibmqetsk.MyQuotes();
		try { Thread.sleep(5000); } catch (InterruptedException e) { e.printStackTrace();}	
		ibmqetsk.CloseBrowser();
	}
	
	public void sendMail()
	{
		LogWriter.closeFile();
		CT.TestResultMail();
		
	}
	
	public void tinymce_Examples()
	{
		ibmptsk.Tinymce_Example();
	}

}