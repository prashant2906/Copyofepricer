package WebElements.IBM;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import WebElements.Object_Common;


@SuppressWarnings("unused")
public class IBMObj_Preference extends Object_Common{
	
 // public WebElement PreferenceTab()
//	{
	//   return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div[3]/div/div[1]/table/tbody/tr[3]/td[8]/a")); 	 
//	} 
	
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
