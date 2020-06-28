package Tasks.BP;

import Tasks.Task_Common;
import WebElements.BP.BPObj_Dashboard;

public class BPTask_Dashboard 
{
	BPObj_Dashboard bpdbobj = new BPObj_Dashboard();
	Task_Common CT= new Task_Common();
	
	//*********************Start - Tasks for Dashboard tab***********************
	public void QuotePanel()
	{
		if (bpdbobj.DashboardQuotesWidget().isDisplayed())
		{
			System.out.println("			<Pass>Quote Panel is displayed");				
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}	
		}
		else 
		{
			System.out.println("			<Failed>Quote Panel is not displayed");
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}	
		}
	// Expanding Quote section 
		
		if (!bpdbobj.ViewOtherLink().isDisplayed())
		{
			bpdbobj.MyQuotesExpandButton().click();
		}else 
		{
			bpdbobj.ViewOtherLink().click();
		}
		
			try
			{
				if (bpdbobj.MyQuotesLink().isDisplayed())
					System.out.println("			<Pass>MyQuotesLink is displayed");
				else System.out.println("			<Failed>MyQuotesLink is not displayed");
				if (bpdbobj.IBMApprovedLink().isDisplayed())
					System.out.println("			<Pass>IBMApproved Link is displayed");
				else System.out.println("			<Failed>IBMApproved is not displayed");
				if (bpdbobj.SubmitToDistributorLink().isDisplayed())
					System.out.println("			<Pass>SubmitToDistributorLink is displayed");
				else System.out.println("			<Failed>SubmitToDistributorLink is not displayed");
				if (bpdbobj.PrepareForDistributorLink().isDisplayed())
					System.out.println("			<Pass>PrepareForDistributorLink is displayed");
				else System.out.println("			<Failed>PrepareForDistributorLink is not displayed");
				if (bpdbobj.ReturnToDistributorLink().isDisplayed())
					System.out.println("			<Pass>ReturnToDistributorLink is displayed");
				else System.out.println("			<Failed>ReturnToDistributorLink is not displayed");
				if (bpdbobj.RequestPricingLink().isDisplayed())
					System.out.println("			<Pass>RequestPricingLink is displayed");
				else System.out.println("			<Failed>RequestPricingLink is not displayed");
				if (bpdbobj.OnHoldLink().isDisplayed())
					System.out.println("			<Pass>OnHoldLink is displayed");
				else System.out.println("			<Failed>OnHoldLink is not displayed");
				if (bpdbobj.IBMWithdrawnLink().isDisplayed())
					System.out.println("			<Pass>IBMWithdrawnLink is displayed");
				else System.out.println("			<Failed>IBMWithdrawnLink is not displayed");
				/*if (bpdbobj.BPWithdrawnLink().isDisplayed())
					System.out.println("			<Pass>BPWithdrawnLink is displayed");
				else System.out.println("			<Failed>BPWithdrawnLink is not displayed");*/
			}catch (Exception e){};
		
	}
	//Expiring Quotes Panel
	public void ExpriringQuotePanel()
	{
		if (bpdbobj.DashboardExpiringQuotesWidget().isDisplayed())
		{
			System.out.println("			<Pass>Expiring Quotes Panel is displayed");				
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}	
		}
		else 
		{
			System.out.println("			<Failed>Expiring Quotes Panel is not displayed");
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}	
		}
		if (bpdbobj.DashboardExpiringQuotesRefresh().isDisplayed())
			System.out.println("			<Pass>Refresh Button is displayed");
		else System.out.println("			<Failed>Refresh Button is not displayed");
		if (bpdbobj.DashboardExpiringQuotesDays().isDisplayed())
			System.out.println("			<Pass>Days are displayed");
		else System.out.println("			<Failed>Days are not displayed");
		if (bpdbobj.DashboardExpiringQuotesDisplay().isDisplayed())
			System.out.println("			<Pass>Display number  is displayed");
		else System.out.println("			<Failed>Display number is not displayed");
		
	}
	
	//NEWS Panel
	public void NewsPanel()
	{
		if (bpdbobj.DashboardNewsWidget().isDisplayed())
			System.out.println("			<Pass>NEWS Panel is displayed");
		else System.out.println("			<Failed>NEWS Panel is not displayed");
	}
	
	
	
	//*********************End - Tasks for Dashboard tab*************************
}