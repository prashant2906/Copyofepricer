package Tasks.Auth;

import org.openqa.selenium.support.ui.Select;
import WebElements.Auth.AuthObj_Common;

public class AuthTask_Common
{
	
	AuthObj_Common AOC = new AuthObj_Common();
	
	 public void GroupSelectionandLaunch() 
  	 {
  		System.out.println(AOC.LandingPageObjectsHeader().getText());
  		String AuthGroupList = AOC.AuthGroupSelectionDropDown().getText();
  		//System.out.println(AuthGroupList);
  		Select userGroup = new Select(AOC.AuthGroupSelectionDropDown());
			
  		if (AuthGroupList.contains("WW Administrator group"))
  			
  			{ 
  				userGroup.selectByValue("WWADG");
  			}
  		else 
  			{ userGroup.selectByIndex(0);}
  		
		AOC.LaunchAuthLink().click();
		System.out.println("			Auth application Launched");
		
	  }
	
  	
	 public void clickLaunchAuth() {
		 System.out.println("click");
		 AOC.LaunchAuthLink().click();
		 }
	 
	 public void clickUserManagerment() {
		 AOC.UserManagementLink().click();
		 }
	 
	 public void clickProfileManagerment() {
		 AOC.ManageProfileLink().click();
		 }
	 
	 public void clickGroupManagerment() {
		 AOC.ManageGroupLink().click();
		 }
  
	
}
