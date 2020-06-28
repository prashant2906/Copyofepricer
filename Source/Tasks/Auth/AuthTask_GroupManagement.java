package Tasks.Auth;

//import org.testng.annotations.Test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import Tasks.Task_Common;
import WebElements.Object_Common;
import WebElements.Auth.AuthObj_GroupManagement;

public class AuthTask_GroupManagement extends Task_Common

{
  
	Task_Common CT = new Task_Common();
	AuthObj_GroupManagement AOG = new AuthObj_GroupManagement();
	Object_Common AOC = new Object_Common();
	 
	// Generate a random group code and name during executing as current system time.
	  Date date=new Date();
	  DateFormat format=new SimpleDateFormat("yyyyMMddHHmm");
	  final String GroupNameCode = format.format(date);
	
	  
	  //********** Start of Create Group**********
	public void ClickCreateGroup()
	{
		AOG.CreateGroupLink().click();
	}
  
	public void CreateGroup()
	{
		AOG.CreateGroupCodeField().sendKeys(GroupNameCode);
		AOG.CreateGroupNameField().sendKeys(GroupNameCode);
		AOG.CreateGroupCommentsField().sendKeys("Creating Group for Sanity");
		
//		String Module[] = {"e-Pricer Transaction GUI", "e-Pricer authorizations",
//				"e-Pricer settings module", "e-Pricer BP TransactionGUI","e-Pricer Settings GDM"};

		
		new Select(AOG.CreateGroupModuleDropdown()).selectByVisibleText("e-Pricer Transaction GUI");
		new Select(AOG.PricingOrgDrpdown()).selectByVisibleText("North America"); //Selecting for 'North America'
		try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
		new Select(AOG.ProfileDrpdown()).selectByVisibleText("GITC TRN NA"); //  	Any Profile which is 2nd index
		try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
		
		if(AOG.UserCountryRadioBtn().isDisplayed())
			{
				//System.out.println("radio buttton is  displayed ");
				try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
				AOG.UserCountryRadioBtn().click();
				if (AOG.UserCountryRadioBtn().isSelected())
					System.out.println("			Radio button selected");
				else
					System.out.println("			Radio button NOT selected");
			}
	
		try
		{
			AOG.CreateGroupButton().click();
			
			if(AOG.GroupCreateSucessMessage().isDisplayed())
			{
				System.out.println("Group Created sucssfully");
			}
			else
			{
				System.out.println("Some error has occured during Group Creation");
			}
		}catch(Exception e)
		{
			
		}
		
	}
	 //********** End of Create Group**********
	

	//********** Start of Delete Group**********
	 public void DeleteGroup(){
		 new Select(AOG.SearchonDropdown()).selectByValue("name"); // select profile name for select type
		 AOG.SearchforField().sendKeys(GroupNameCode);  //enter the text for profile name
		 AOG.GroupSearchGoButton().click(); // click go button
		 //waiting for the search result
		 
		 if(AOG.GroupNoResultLabel().isDisplayed())
		 {
			 System.out.println("The profile can not be searched out" + GroupNameCode);
		 }
		 else{
			 AOG.GroupResultCheckbox0().click();   //select the search result
			 AOG.GroupDeleteButton().click();
			 
			 Assert.assertEquals("Do you really want to delete the selected groups ?", CT.closeAlertAndGetItsText());
		        try {
		        		Assert.assertEquals("Group deleted Successfully!.", AOG.GroupCreateDeleteMessage().getText());
		        	} 
		        catch (Error e) 
		        	{
		        		//verificationErrors.append(e.toString());
		        	}
			}
	  }
	
}
