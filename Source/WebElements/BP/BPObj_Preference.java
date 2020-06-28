package WebElements.BP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import WebElements.Object_Common;

public class BPObj_Preference extends Object_Common
{
	
	//***********Start of Manage Preferences objects*****************
	public WebElement ManagePrefrenceBreadCrumbs()
	{
		 return driver.findElement(By.xpath(".//*[@id='ibm-navigation-trail']/li[2]")); 
	}
	public WebElement ManagePrefrenceTab()
	{
		 return driver.findElement(By.xpath(".//*[@id='ibm-primary-tabs']/ul/li[6]/a")); 
	}
	//***********End of Manage Preferences objects***************** 
	
	//************ Start - tinymce example objects ***************
	
	public WebElement tinymce()
	{
		driver.switchTo().frame("mce_0_ifr");
		return driver.findElement(By.id("tinymce"));
		//return driver.findElement(By.tagName("body"));
	}

}
