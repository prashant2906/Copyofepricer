//updated by Mike Cepe
// defining the objects for Auth module

package WebElements.Auth;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import WebElements.Object_Common;

public class AuthObj_GroupManagement extends Object_Common {
  
  //Search criteria dropdown	
  public WebElement GroupSearchOnDropdown(){
	return driver.findElement(By.xpath(".//*[@id='selectedSearchOn']"));

  }

  //Search textbox
   public WebElement GoupSearchForTextbox(){
	return driver.findElement(By.xpath(".//*[@id='searchFor']"));

  }

   //Go Button
   public WebElement GroupSearchGoButton(){
	return driver.findElement(By.xpath(".//*[@id='group-search-btn']"));
	
  }

   //Search filter
   public WebElement SearchFilterText(){
	return driver.findElement(By.xpath(".//*[@id='Searchkey']"));

  }

   //View/Print button
   public WebElement ViewPrintButton(){
	return driver.findElement(By.xpath(".//*[@id='view']"));
  }
   
   //Previous link
   public WebElement PreviousButton(){
	return driver.findElement(By.xpath(".//*[@id='GroupManagementForm']/div[2]/div[1]/div/div/p/span/span/ibm-pagination/p/span/span'ibm-table-navigation-links'/a[1]"));
  }

   //Next link
   public WebElement NextButton(){
	return driver.findElement(By.xpath(".//*[@id='GroupManagementForm']/div[2]/div[1]/div/div/p/span/span/ibm-pagination/p/span/span'ibm-table-navigation-links'/a[2]"));
  }

   //Text field for number of records per page
   public WebElement NumberRecordsPerPage(){
	return driver.findElement(By.xpath(".//*[@id='GroupManagementForm']/div[2]/div[1]/div/div/p/span/span/ibm-pagination/p/span/span'ibm-table-navigation-links'/input"));
  }

   //Create Group Link
   public WebElement CreateGroupLink(){
		return driver.findElement(By.xpath(".//*[@id='ibm-primary-links']/li[4]/ul/li/a"));
	  }

   //Objects in Create Group page -- updated by Mike 08/06
   public WebElement CreateGroupCodeField(){
		return driver.findElement(By.xpath(".//*[@id='groupCode']"));
	  }
   
   public WebElement CreateGroupNameField(){
		return driver.findElement(By.xpath(".//*[@id='groupName']"));
	  }
   
   public WebElement CreateGroupCommentsField(){
		return driver.findElement(By.xpath(".//*[@id='groupComments']"));
	  }
   
   public WebElement CreateGroupModuleDropdown(){
		return driver.findElement(By.xpath(".//*[@id='profileModuleCode']"));
	  }
   
   public WebElement CreateGroupGeoDropdown()
	   {
		 return driver.findElement((By.xpath(".//*[@id='countryprofile2']/tbody/tr[2]/td[2]/select")));
	   }
   public WebElement CreateGroupButton(){
		return driver.findElement(By.xpath(".//*[@id='Create']"));
	  }

   public WebElement CancelCreateButton(){
		return driver.findElement(By.xpath(".//*[@id='createButton']/div/p/a[2]"));
	  }

   //Objects when ePricer Transaction GUI is selected
   
   public WebElement PricingOrgDrpdown(){
		return driver.findElement(By.xpath(".//*[@id='tableprofileparent']/tbody/tr[3]/td[2]/select"));
	  }


   public WebElement ProfileDrpdown(){
		return driver.findElement(By.xpath(".//*[@id='profileCode1']"));
	  }


   public WebElement SubsetRadioButton(){
		return driver.findElement(By.xpath(".//*[@id='areaSubLevelRadioButtonSome']"));
	  }

   public WebElement CountryList(){
		return driver.findElement(By.xpath(".//*[@id='areaCountriesCode']/option[2]"));
	  }

   public WebElement UserCountryRadioBtn(){
		return driver.findElement(By.xpath(".//*[@id='areaSubLevelRadioButtonAll'][@data-ng-model='userCtrySelected'][@name='areaSubLevelRadioButton'][@value='Y']"));
	  }
   
   //Brand Selection
   
   public WebElement ExpandCollapse1(){
		return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/form/div[4]/div[2]/h2/a"));
	  }

   public WebElement Brandcheckbox(){
		return driver.findElement(By.xpath(".//*[@id='brandSelection1']/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[1]/input"));
	  }
   
   //Distribution List 

   public WebElement ExpandCollapse2(){
		return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/form/div[4]/div[2]/h2/a"));
	  }
   
   public WebElement DistributionListGeo(){
		return driver.findElement(By.xpath(".//*[@id='tableotherdistribution']/tbody/tr[5]/td/select"));
	  }
   
   public WebElement DistributionListCountry(){
		return driver.findElement(By.xpath(".//*[@id='distributionCountry']"));
	  }
   
   public WebElement DistributionListType(){
		return driver.findElement(By.xpath(".//*[@id='distributionType']"));
	  }
   
   
   public WebElement DistributionNameList(){
		return driver.findElement(By.xpath(".//*[@id='disNameList']"));
	  }
  
   public WebElement DistributionAddBtn(){
		return driver.findElement(By.xpath(".//*[@id='Add']"));
	  }
   
   //Group visibility elements
   public WebElement VisibilityType(){
		return driver.findElement(By.xpath(".//*[@id='visibilityQuoteIBMType']"));
	  }
   
   
   public WebElement VisibilityIBMType(){
 		return driver.findElement(By.xpath(".//*[@id='visibilityQuoteIBMType']"));
 	  }
    
   public WebElement VisibilityBPType(){
		return driver.findElement(By.xpath(".//*[@id='visibilityQuoteBPType']"));
	  }
   
   public WebElement SearchonDropdown(){
		return driver.findElement(By.id("selectedSearchOn"));
	  }
   
   public WebElement SearchforField(){
		return driver.findElement(By.id("searchFor"));
	  }
   
   public WebElement GroupNoResultLabel()
	{
		return  driver.findElement(By.xpath(".//form[@id='GroupManagementForm']div[3]/div[2]/div/strong"));
		}
  
   public WebElement GroupResultCheckbox0()
  	{
  		return  driver.findElement(By.id("chckBoxGroupCode0"));
  		}
   
   public WebElement GroupDeleteButton()
 	{
 		return  driver.findElement(By.id("delete"));
 		}
   
	public WebElement GroupCreateDeleteMessage(){
		  return driver.findElement(By.xpath(".//form[@id='GroupManagementForm']/div[2]/div[2]/div/span/font"));
		}
   
	public WebElement GroupCreateSucessMessage(){
		  return driver.findElement(By.xpath(".//*[@id='GroupManagementForm']/div[2]/div[2]/div/span/font"));
		}
 

 
   
}


