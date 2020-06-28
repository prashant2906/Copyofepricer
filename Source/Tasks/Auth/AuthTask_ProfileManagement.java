package Tasks.Auth;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import Tasks.Task_Common;
import WebElements.Object_Common;
import WebElements.Auth.AuthObj_GroupManagement;
import WebElements.Auth.AuthObj_ProfileManagement;

@SuppressWarnings("unused")
public class AuthTask_ProfileManagement

{
    	
  Task_Common CT  = new Task_Common();
	
	AuthObj_ProfileManagement AOP = new AuthObj_ProfileManagement();
	Object_Common AOC = new Object_Common();
	
	
	String UserSearchResultCount, NoUserSearch;
	
	  Date date=new Date();
	  DateFormat format=new SimpleDateFormat("yyyyMMddHHmm");
	  final String ProfileName = format.format(date);

	  
	 public void clickCreateProfile() {
		 AOP.CreateProfileLink().click();
		 }
	 
	 public void ClickCreateButton(){
		 AOP.ProfileCreateButton().click();
	 }
	 
	 
	 public void ClickViewPrintButton(){
		 AOP.ProfileViewPrintbutton().click();
		 System.out.println("click view button");
	 }
	 
	 public void ClickDeleteButton(){
		 AOP.ProfileDeletebutton().click();
		 System.out.println("click delete button");
	 }
	 
	 public void SelectProfile1(){
		 AOP.ProfileCheckbox1().click();
		 System.out.println("select a profile");
		 }
	 
	 public String updatetime(){
		 System.out.println("start to check the time");
		 String Oupdatetime = AOP.Profile1updatetime().getText(); 
			System.out.println(Oupdatetime);
			return Oupdatetime;
	 }
	 
	 public void SelectProfile2(){
		 AOP.ProfileCheckbox2().click();
	 }
	 
	 public void clickreturn(){
		 AOP.ProfileViewPagereturn().click();
	 }
	 
	 
	 //****create a profile*****

	 public void createprofile(String ProfileModule){
				 
		 AOP.CreateProfileLink().click();
		 AOP.newProfileName().sendKeys(ProfileName);
		 AOP.newprofileCode().sendKeys(ProfileName);
		 CT.ImplicitWait();
		 		 
		 switch(ProfileModule)
		 {
		 case "e-Pricer Transaction GUI":  
			 System.out.println("			Script will profile for 'e-Pricer Transaction GUI' module");
			new Select(AOP.ProfileModule()).selectByValue("60"); //e-Pricer Transaction GUI
			new Select(AOP.PricingOrg()).selectByValue("U01"); // select NA
			AOP.Gobutton().click();
			CT.ImplicitWait();
			new Select(AOP.ProfileDelegateLevel()).selectByValue("BTP");
			new Select(AOP.ProfileCLipDelegateLevel()).selectByValue("BTP");
			AOP.ProfileCreateSelectAllCheckBox().click();
			CT.ImplicitWait();
			AOP.SaveCloseButton().click();
			 break;
			 
		 case "e-Pricer authorizations":
			 System.out.println("			Script will profile for 'e-Pricer authorizations' module");
			 new Select(AOP.ProfileModule()).selectByValue("61"); //e-Pricer authorizations
			 AOP.ProfileRadioWW().click();
			 AOP.Gobutton().click();
			 CT.ImplicitWait();
			 AOP.ProfileCreateSelectAllCheckBox().click();
			 CT.ImplicitWait();
			AOP.SaveCloseButton().click();
			 break;
				 
		 case "e-Pricer settings module":
			 System.out.println("			Script will profile for 'e-Pricer settings' module");
			 new Select(AOP.ProfileModule()).selectByValue("62"); //e-Pricer settings module
			 AOP.ProfileRadioWW().click();
			 AOP.Gobutton().click();
			 CT.ImplicitWait();
			 AOP.ProfileCreateSelectAllCheckBox().click();
			 CT.ImplicitWait();
			AOP.SaveCloseButton().click();
			 break;
		 		 
		 case "e-Pricer BP TransactionGUI":
			 System.out.println("			Script will profile for 'e-Pricer BP TransactionGUI' module");
			 new Select(AOP.ProfileModule()).selectByValue("64"); //e-Pricer settings module
			 AOP.Gobutton().click();
			// CT.ImplicitWait();
			 AOP.ProfileCreateSelectAllCheckBox().click();
			 CT.ImplicitWait();
			AOP.SaveCloseButton().click();
			 break;
		 
		 case "e-Pricer Settings GDM":
			 System.out.println("			Script will profile for 'e-Pricer Settings GDM' module");
			 new Select(AOP.ProfileModule()).selectByValue("66"); //e-Pricer Settings GDM
			 AOP.ProfileRadioOrg().click();
			 AOP.Gobutton().click();
			 CT.ImplicitWait();
			 AOP.ProfileCreateSelectAllCheckBox().click();
			 CT.ImplicitWait();
			AOP.SaveCloseButton().click();
		 	break;	 
					 
		 default:
		 System.out.println("			Script will profile for 'e-Pricer Settings GDM profile by default'");
			new Select(AOP.ProfileModule()).selectByValue("60"); //e-Pricer Transaction GUI
			new Select(AOP.PricingOrg()).selectByValue("U01"); // select NA
			AOP.Gobutton().click();
			CT.ImplicitWait();
			new Select(AOP.ProfileDelegateLevel()).selectByValue("BTP");
			new Select(AOP.ProfileCLipDelegateLevel()).selectByValue("BTP");
			AOP.ProfileCreateSelectAllCheckBox().click();
			CT.ImplicitWait();
			AOP.SaveCloseButton().click();
			 break;
		 } 
		 
		 if(AOP.ProfileCreateMessage().isDisplayed()||"Profile successfully created!"==AOP.ProfileCreateMessage().getText())
		   {
		   		
			   System.out.println("			Profile Created Sucessfully");
		   }
	   else
		   {
			   System.out.println("			Failed to Create Profile ");
		   }
		 
	  }
	  
	 
//*************	 Profile successfully created!
	 
	 
	 
	 //****end Create a profile*****
	 
	 
	 
	 
	 
	 //********** Start of Delete Profile**********
	 public void DeleteProfile()
	 {
		 try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
		 
		 new Select(AOP.SearchOnList()).selectByValue("name"); // select profilename for select type
		 AOP.SearchForText().sendKeys(ProfileName);  //enter the text for profile name
		 AOP.ButtonGoforSearchProfile().click(); // click go button
		 //waiting for the search result
		 CT.ImplicitWait();
		 System.out.println("waiting for the result and check");
		 if (AOP.ProfileCheckbox1().isDisplayed())
		 {
			 System.out.println("waiting for the result and check");
			 SelectProfile1();   //select the search result
			 AOP.ProfileDeletebutton().click();
			 Assert.assertEquals("Do you really want to delete the selected profiles ?", CT.closeAlertAndGetItsText());
		        try {
		        		Assert.assertEquals("Profile deleted Successfully!.", AOP.ProfileCreateDeleteMessage().getText());
		        	} 
		        catch (Error e) 
		        	{
		        		//verificationErrors.append(e.toString());
		        	}
		 }
		 else{
			 System.out.println("The profile can not be searched out" + ProfileName);
			}
	  }
	 
	 
}



