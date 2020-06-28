package WebElements.Auth;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import WebElements.Object_Common;

@SuppressWarnings("unused")
public class AuthObj_ProfileManagement extends Object_Common{
	// *********************Jacob Updated ***********************
	 
	
	//********************** Profile management ****************
		
	

	public WebElement CreateProfileLink(){
		return  driver.findElement(By.xpath(".//a[@alt='Create profile']"));
	}	

	public WebElement ProfileCreateButton(){
		return  driver.findElement(By.xpath(".//a[@id='Create']"));
	}	
		
	public WebElement ProfileViewPrintbutton(){
		return  driver.findElement(By.xpath(".//a[@id='View/Print']"));
	}	

	public WebElement ProfileDeletebutton(){
		return  driver.findElement(By.xpath(".//a[@id='Delete']"));
	}	
	
		
	public WebElement ProfileCheckbox1(){
		return  driver.findElement(By.xpath(".//table[@class='ibm-data-table']/tbody/tr[1]/td[1]/input"));
	}	
	public WebElement ProfileCheckbox2(){
		return  driver.findElement(By.xpath(".//table[@class='ibm-data-table']/tbody/tr[2]/td[1]/input"));
	}

	public WebElement Profile1updatetime(){
		return  driver.findElement(By.xpath(".//table[@class='ibm-data-table']/tr[1]/td[8]"));
	}	

	public WebElement Profile1updatetimeN(){
		return  driver.findElement(By.xpath(".//table[@class='white'][@summary='layout table for displaying profile report']/tbody/tr[2]/td[4]"));
	}

	public WebElement ProfileViewPageTitle(){
		return  driver.findElement(By.xpath(".//h2[@class='center']"));
	}

	public WebElement ProfileViewPagereturn(){
		return  driver.findElement(By.linkText("Return to previous page"));
	}
	public WebElement ProfileNoResult()
	{
		return  driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div[5]/div[1]/div/strong"));
		}
	

	//***************************End Profile Management ********************

	//***************************Create Profile ***************************
	public WebElement CreateProfilePageTile(){
		return  driver.findElement(By.xpath(".//*[@id='ibm-leadspace-body']/h1"));
	}

	

	//***************************End Create Profile*************************
		
	


	//******************create profile*************

	public WebElement newprofileCode(){
			return driver.findElement(By.id("profileCode"));
	}
	public WebElement newProfileName(){
	  return driver.findElement(By.id("ProfileName_2"));
	}
	public WebElement SaveCloseButton(){
	//  return driver.findElement(By.xpath(".//*[@data-ng-click='saveAndClose('backToManageProfile');']"));
	  return driver.findElement(By.xpath(".//form[@id='CreateProfileForm']/div[10]/div/p/a[1]"));
	  	}

	public WebElement filter(){
	  return driver.findElement(By.id("Searchkey"));
	}

	public WebElement ProfileCreateMessage(){
		  return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div[5]/div[2]/div/span/font"));
		}
	
	public WebElement ProfileCreateDeleteMessage(){
		  return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div[6]/div[2]/div/span/font"));
		}
	
	
	// following web elements used during create new profile
	
	public WebElement ProfileModule(){
		  return driver.findElement(By.id("selectedModule"));
		}  //value as 60,61,62,64,66
	
	
	
	//Pricing Orgnization dropdown list under Transaction GUI module
	public WebElement PricingOrg(){
		  return driver.findElement(By.id("selectedPricingOrganisation"));
		}  //value as E01,L01,U01,J01,A01
	
	//Checkbox and Radio button 
	public WebElement GDMAuthProCheckbox(){
		  return driver.findElement(By.id("Auth_level_check_gdm"));
		}  
	
	public WebElement ProfileRadioWW(){
		  return driver.findElement(By.id("Pro_level_radio_world"));
		}  
	
	public WebElement ProfileRadioGEO(){
		  return driver.findElement(By.id("Pro_level_radio_geo"));
		}  
	
	public WebElement ProfileRadioCty(){
		  return driver.findElement(By.id("Pro_level_radio_ctry"));
		}  
	
	public WebElement ProfileRadioOrg(){
		  return driver.findElement(By.id("Pro_level_radio_org"));
		}  
	
	public WebElement ProfileRadioReg(){
		  return driver.findElement(By.id("Pro_level_radio_reg"));
		}  
	
	public WebElement Gobutton(){
		  return driver.findElement(By.xpath(".//a[@data-ng-click='findModuleFunctions();']"));
		} 
	
	public WebElement ProfileDelegateLevel(){
		  return driver.findElement(By.id("selectedDelegationLevel_10"));
		}  
	
	public WebElement ProfileCLipDelegateLevel(){
		  return driver.findElement(By.id("clipLevelDelegation0"));
		} 
	
	public WebElement ProfileCreateSelectAllCheckBox(){
		  return driver.findElement(By.id("chckBoxSelectAll"));
		} 
	// above web elements used during create new profile
	
	  // *********************End Jacob Updated ***********************
	
	// ********** Start of Delete Profile **********
	
	public WebElement SearchOnList(){
		  return driver.findElement(By.id("selectedSearchOn"));
		}
	
	public WebElement SearchForText(){
		  return driver.findElement(By.id("searchFor"));
		}
	
	public WebElement ButtonGoforSearchProfile(){
		  return driver.findElement(By.xpath(".//a[@data-ng-click='searchProfiles();']"));
		}
	
	public WebElement ProfileDeleteMessage(){
		  return driver.findElement(By.xpath(".//a[@id='ibm-content-main']/div[6]/div[2]/div/span/font"));
		}
	
	public WebElement searchkeyInput()
	{
		return  driver.findElement(By.id("Searchkey"));
		}
	
	// ********** End of Delete Profile **********
	
}
