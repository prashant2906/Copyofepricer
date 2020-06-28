package Tasks.IBM;

import Tasks.Task_Common;
import WebElements.IBM.IBMObj_Dashboard;

public class IBMTask_Dashboard 

{
	IBMObj_Dashboard ibmdbobj = new IBMObj_Dashboard();
	Task_Common CT= new Task_Common();
	
	//*********************Start - Tasks for Dashboard tab***********************
		public void QuotePanel()
		{
			if (ibmdbobj.DashboardQuotesWidget().isDisplayed())
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
			
			if (!ibmdbobj.ViewOtherLink().isDisplayed())
			{
				ibmdbobj.MyQuotesExpandButton().click();
			}else 
			{
				ibmdbobj.ViewOtherLink().click();
			}
			
				try
				{
					if (ibmdbobj.MyQuotesLink().isDisplayed())
						System.out.println("			<Pass>MyQuotesLink is displayed");
					else System.out.println("			<Failed>MyQuotesLink is not displayed");
					if (ibmdbobj.IBMApprovedLink().isDisplayed())
						System.out.println("			<Pass>IBMApproved Link is displayed");
					else System.out.println("			<Failed>IBMApproved is not displayed");
					if (ibmdbobj.SubmitToDistributorLink().isDisplayed())
						System.out.println("			<Pass>SubmitToDistributorLink is displayed");
					else System.out.println("			<Failed>SubmitToDistributorLink is not displayed");
					if (ibmdbobj.PrepareForDistributorLink().isDisplayed())
						System.out.println("			<Pass>PrepareForDistributorLink is displayed");
					else System.out.println("			<Failed>PrepareForDistributorLink is not displayed");
					if (ibmdbobj.ReturnToDistributorLink().isDisplayed())
						System.out.println("			<Pass>ReturnToDistributorLink is displayed");
					else System.out.println("			<Failed>ReturnToDistributorLink is not displayed");
					if (ibmdbobj.RequestPricingLink().isDisplayed())
						System.out.println("			<Pass>RequestPricingLink is displayed");
					else System.out.println("			<Failed>RequestPricingLink is not displayed");
					if (ibmdbobj.OnHoldLink().isDisplayed())
						System.out.println("			<Pass>OnHoldLink is displayed");
					else System.out.println("			<Failed>OnHoldLink is not displayed");
					if (ibmdbobj.IBMWithdrawnLink().isDisplayed())
						System.out.println("			<Pass>IBMWithdrawnLink is displayed");
					else System.out.println("			<Failed>IBMWithdrawnLink is not displayed");
					/*if (ibmdbobj.BPWithdrawnLink().isDisplayed())
						System.out.println("			<Pass>BPWithdrawnLink is displayed");
					else System.out.println("			<Failed>BPWithdrawnLink is not displayed");*/
				}catch (Exception e){};
			
		}
		//Expiring Quotes Panel
		public void ExpriringQuotePanel()
		{
			if (ibmdbobj.DashboardExpiringQuotesWidget().isDisplayed())
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
			if (ibmdbobj.DashboardExpiringQuotesRefresh().isDisplayed())
				System.out.println("			<Pass>Refresh Button is displayed");
			else System.out.println("			<Failed>Refresh Button is not displayed");
			if (ibmdbobj.DashboardExpiringQuotesDays().isDisplayed())
				System.out.println("			<Pass>Days are displayed");
			else System.out.println("			<Failed>Days are not displayed");
			if (ibmdbobj.DashboardExpiringQuotesDisplay().isDisplayed())
				System.out.println("			<Pass>Display number  is displayed");
			else System.out.println("			<Failed>Display number is not displayed");
			
		}
		
		//NEWS Panel
		public void NewsPanel()
		{
			if (ibmdbobj.DashboardNewsWidget().isDisplayed())
				System.out.println("			<Pass>NEWS Panel is displayed");
			else System.out.println("			<Failed>NEWS Panel is not displayed");
		}
		
		
		
		//*********************End - Tasks for Dashboard tab*************************
}
