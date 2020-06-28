package WebElements.BP;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import WebElements.Object_Common;

public class BPObj_Dashboard extends Object_Common 
{
	//***********Start of Dashboard objects*****************
	public WebElement DashboardBreadCrumbs()
	{
		 return driver.findElement(By.partialLinkText("Dashboard")); 
	}
	public WebElement DashboardTab()
	{
		 return driver.findElement(By.xpath(".//*[@id='ibm-leadspace-body']/div/div[2]/div/div[1]/table/tbody/tr[3]/td[1]/a")); 
	}
	
	public WebElement DashboardQuotesWidget()
	{
		 return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div/div/div[2]/div/div/dashboard-page/div/div[1]")); 
		
	}
	public WebElement MyQuotesExpandButton()
	{
		 return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div/div/div[2]/div/div/dashboard-page/div/div[1]/div[1]/span[1]")); 
	}

	public WebElement ViewOtherLink() 
	{
		return driver.findElement(By.xpath(".//*[contains(text(),'View More')]")); 
	}

	public WebElement MyQuotesLink() {
		return driver.findElement(By.xpath(".//*[contains(text(),'My Quotes(')]")); 
	}

	public WebElement IBMApprovedLink() {
		return driver.findElement(By.xpath(".//*[contains(text(),'IBM approved (')]")); 
	}

	public WebElement SubmitToDistributorLink() {
		return driver.findElement(By.xpath(".//*[contains(text(),'Submitted to distributor (')]")); 
	}

	public WebElement PrepareForDistributorLink() {
		return driver.findElement(By.xpath(".//*[contains(text(),'Prepare for distributor (')]")); 
	}

	public WebElement ReturnToDistributorLink() {
		return driver.findElement(By.xpath(".//*[contains(text(),'Returned from distributor (')]")); 
	}

	public WebElement RequestPricingLink() {
		return driver.findElement(By.xpath(".//*[contains(text(),'Request pricing (')]")); 
	}

	public WebElement OnHoldLink() 
	{
		return driver.findElement(By.xpath(".//*[contains(text(),'On hold (')]")); 
	}

	public WebElement IBMWithdrawnLink() {
		return driver.findElement(By.xpath(".//*[contains(text(),'IBM withdrawn (')]")); 
	}

	public WebElement BPWithdrawnLink() {
		return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div/div/div[2]/div/div/dashboard-page/div/div[2]/div[3]/div/table/tbody/tr[4]/td/a")); 
	}
	
	public WebElement DashboardExpiringQuotesWidget()
	{
		 return driver.findElement(By.xpath(".//*[contains(text(),'Expiring Quotes')]")); 
	}
	public WebElement DashboardExpiringQuotesRefresh() 
	{
		return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div/div/div[2]/div/div/dashboard-page/div/div[2]/table[1]/tbody/tr/td[2]/a"));
	}
	public WebElement DashboardExpiringQuotesDays() 
	{
		return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div/div/div[2]/div/div/dashboard-page/div/div[2]/table[1]/tbody/tr/td[3]/input[1]"));
	}
	public WebElement DashboardExpiringQuotesDisplay()
	{
		return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div/div/div[2]/div/div/dashboard-page/div/div[2]/table[1]/tbody/tr/td[3]/input[2]"));
	}
	
	public WebElement DashboardNewsWidget()
	{
		 return driver.findElement(By.xpath(".//*[contains(text(),'News')]")); 
	}
	
	public WebElement DashboardCreateQuote()
	{
		return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div/div/div[2]/div/div/dashboard-page/div/table/tbody/tr/td[1]/div/span"));	
	}
//			
		//***********End of Dashboard objects***************** 
			
	
}
