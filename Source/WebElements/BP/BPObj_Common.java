package WebElements.BP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import WebElements.Object_Common;

public class BPObj_Common extends Object_Common
{
		public WebElement IBMPricingToolLabel()
		{
			 return driver.findElement(By.xpath(".//*[@id='ibm-leadspace-body']/div/div[1]")); 
		}
		
		public WebElement ReturnToPSATLink()
		{
			 return driver.findElement(By.xpath(".//*[@id='returnPsat']")); 
		}
		public WebElement ReturnToPCSLink()
		{
			return driver.findElement(By.xpath(".//*[@id='returnPcs']"));	
		}
	//***********Select Group Section objects*****************
			
		public WebElement SelectGroupBreadCrumbs()
		{
			 return driver.findElement(By.xpath(".//*[@id='ibm-navigation-trail']/li[2]")); 
		}
		public WebElement WelcomeBar()
		{
			 return driver.findElement(By.xpath(".//*[@id='ibm-leadspace-body']/div/div[1]/div/div[1]")); 
		}
		 
		public WebElement WelcomeContent()
		{
			 return driver.findElement(By.xpath(".//*[@id='ibm-leadspace-body']/div/div[1]/div/div[2]")); 
		}
		public WebElement SelectedGroupRoleLabel()
		{
			 return driver.findElement(By.xpath(".//*[@id='role-text-large']")); 
		}
		public WebElement SelectedGroupCodeDropDown()
		{
			 return driver.findElement(By.xpath(".//select[contains(@name,'SelectARole')]")); 
		}
		public WebElement LaunchLink()
		{
			return driver.findElement(By.xpath("//span[contains(@data-ng-click,'selectGroup();')]")); 
		}
		
	//***********End of Select Group Section objects***************** 
		  
	// ****************** Start - BP Bypass section by PCS and PSAT **************************
		
		public WebElement ByPassPCSRadioButton()
		{
			return driver.findElement(By.xpath(".//*[@id='P']"));
		}
		public WebElement ByPassPCSSP2RadioButton()
		{
			return driver.findElement(By.xpath(".//*[@id='bpType_sp2']"));
		}
		public WebElement ByPassPCSDisRadioButton()
		{
			return driver.findElement(By.xpath(".//*[@id='bpType_dist']"));
		}
		public WebElement ByPassPCSSP1RadioButton()
		{
			return driver.findElement(By.xpath(".//*[@id='bpType_sp1']"));
		}
		public WebElement ByPassPSATRadioButton()
		{
			return driver.findElement(By.xpath(".//*[@id='S']"));
		}
		public WebElement ByPassXMLDisplaySection()
		{
			return driver.findElement(By.xpath(".//*[@id='data']"));
		}
		public WebElement ByPassePricerButton()
		{
			return driver.findElement(By.xpath("html/body/form/input[4]"));
		}
	// ****************** End - BP Bypass section by PCS and PSAT **************************

}
