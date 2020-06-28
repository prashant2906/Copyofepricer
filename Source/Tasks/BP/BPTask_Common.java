package Tasks.BP;

import org.openqa.selenium.support.ui.Select;

import Tasks.Task_Common;
import WebElements.BP.BPObj_Common;

public class BPTask_Common 
{
	BPObj_Common bpcmobj = new BPObj_Common();
	Task_Common CT= new Task_Common();
	
	
	//***************Start - ePricer Redirection
	
	public void BPByPassPCSPSATTask(String flow)
	{
		if (flow.equalsIgnoreCase("PCS"))
		{
			bpcmobj.ByPassPCSRadioButton().click();
		   CT.ImplicitWait();
			callprofile("Dis");
			bpcmobj.ByPassePricerButton().click();
		}
		if (flow.equalsIgnoreCase("PSATEM") || flow.equalsIgnoreCase("PSATJP"))
		{
			bpcmobj.ByPassPSATRadioButton().click();
			bpcmobj.ByPassePricerButton().click();
		}
	}
	
	public void callprofile(String profile)
	{	
		if (profile.equalsIgnoreCase("Dis"))
		{
			bpcmobj.ByPassPCSDisRadioButton().click();
		}
	}
	
	
	//***************End - ePricer Redirection
		
	 public void LabelValidationSelectGroupScreen()
	 {
		
		 if( bpcmobj.SelectGroupBreadCrumbs().getText().equalsIgnoreCase("Select Group"))
			{
				System.out.println("Select Group Section displayed " + bpcmobj.SelectGroupBreadCrumbs().getText());
				if(bpcmobj.IBMPricingToolLabel().isDisplayed())
				{
					System.out.println("Select Group Section displayed " + bpcmobj.IBMPricingToolLabel().getText());
				}
			}
			
	}
	
	public void PCSGroupSelection()
	{
		if(bpcmobj.SelectedGroupRoleLabel().isDisplayed())
		{
			new Select(bpcmobj.SelectedGroupCodeDropDown()).selectByVisibleText("NA Distributor: Avnet Hall-Mark, all quotes");
			//System.out.println("Group Value set ");	
		}
	}
	
	public void PSATGBGroupSelection()
	{
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(bpcmobj.SelectedGroupRoleLabel().isDisplayed())
		{
			new Select(bpcmobj.SelectedGroupCodeDropDown()).selectByVisibleText("Distributor TR GB Computacenter, all quotes [18z7gixb]");
			//System.out.println("Group Value set ");
		}
	}
	
	public void PSATJPGroupSelection()
	{
		if(bpcmobj.SelectedGroupRoleLabel().isDisplayed())
		{
			new Select(bpcmobj.SelectedGroupCodeDropDown()).selectByVisibleText("JP Distributor Networld Corporation, all quotes [18z7bqgx]");
			//System.out.println("Group Value set ");
		}
	}
	public void BPLaunchButton() 
	  {
		if(bpcmobj.SelectedGroupRoleLabel().isDisplayed())
		{
		  bpcmobj.LaunchLink().click();
		  System.out.println("			<Pass>Appliction launch with selected Group value");
		}	
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CT.ImplicitWait();
		
	  }
	
	public void ReturnToPCS() 
	{
		if(bpcmobj.ReturnToPCSLink().isDisplayed())
			System.out.println("			<Pass>Return to PCS Link is displayed");
		else System.out.println("			<Failed>Return to PCS Link is not displayed");
	}
	
	public void ReturnToPSAT()
	{
		if(bpcmobj.ReturnToPSATLink().isDisplayed())
			System.out.println("			<Pass>Return to PSAT Link is displayed");
		else System.out.println("			<Failed>Return to PSAT Link is not displayed");
	}
	
}
