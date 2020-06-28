package Tasks.IBM;


import org.openqa.selenium.support.ui.Select;

import Tasks.LogWriter;
import Tasks.Task_Common;
import WebElements.IBM.IBMObj_Common;

public class IBMTask_Common
{
	Task_Common CT= new Task_Common();
	IBMObj_Common ibmcmobj = new IBMObj_Common();
	
	
	public void IBMLaunchButton() 
	  {
		if(ibmcmobj.SelectedGroupRoleLabel().isDisplayed())
		{
			ibmcmobj.LaunchLink().click();
		  System.out.println("			<Pass>Appliction launch with selected Group value");
		  //LogWriter.writeLogs(" Clicked on Launch Button ");
		}	
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CT.ImplicitWait();
		
	  }
	
	
	
	public void IBMNAGroupSelection()
	{
		if(ibmcmobj.SelectedGroupRoleLabel().isDisplayed())
		{
			new Select(ibmcmobj.SelectedGroupCodeDropDown()).selectByVisibleText("GITC TRN NA [View New Delegation Levels]");
			//new Select(ibmcmobj.SelectedGroupCodeDropDown()).selectByVisibleText("GITC TRN NA");
			//System.out.println("Group Value set ");	
		}
	}
	
	public void IBMLAGroupSelection()
	{
		if(ibmcmobj.SelectedGroupRoleLabel().isDisplayed())
		{
			new Select(ibmcmobj.SelectedGroupCodeDropDown()).selectByVisibleText("GITC TRN LA [View New Delegations]");
			//System.out.println("Group Value set ");
		}
	}
	
	public void IBMEMEAGroupSelection()
	{
		if(ibmcmobj.SelectedGroupRoleLabel().isDisplayed())
		{
			new Select(ibmcmobj.SelectedGroupCodeDropDown()).selectByVisibleText("GITC TRN EMEA [View New Delegations]");
			//System.out.println("Group Value set ");
		}
	}
	
	public void IBMAPGroupSelection()
	{
		if(ibmcmobj.SelectedGroupRoleLabel().isDisplayed())
		{
			new Select(ibmcmobj.SelectedGroupCodeDropDown()).selectByVisibleText("GITC TRN AP [View New Delegations]");
			//System.out.println("Group Value set ");
		}
	}
	
	
	public void IBMJPGroupSelection()
	{
		if(ibmcmobj.SelectedGroupRoleLabel().isDisplayed())
		{
			new Select(ibmcmobj.SelectedGroupCodeDropDown()).selectByVisibleText("GITC TRN AP-Japan");
			System.out.println("Group Value set ");
		
		}
	}
	
	 
	
	
}
