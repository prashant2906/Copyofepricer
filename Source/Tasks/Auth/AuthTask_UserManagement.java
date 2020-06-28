package Tasks.Auth;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import org.openqa.selenium.support.ui.Select;

import Tasks.Task_Common;
import WebElements.Auth.AuthObj_Common;
import WebElements.Auth.AuthObj_UserManagement;


public class AuthTask_UserManagement 
{
	
	Task_Common CT  = new Task_Common();
	AuthObj_UserManagement AOU = new AuthObj_UserManagement();
	AuthObj_Common AOC = new AuthObj_Common();

	
	String UserSearchResultCount, NoUserSearch, PageHeaderUserUpdate;
	boolean acceptNextAlert = true;
	Random rdn = new Random();
	
	final String UID ="testid"+rdn.nextInt(100);
	
	  Date date=new Date();
	  DateFormat format=new SimpleDateFormat("yyyyMMddHHmmss");
	  final String user = format.format(date);

	
//******Start of User Create Method***************************

public void UserCreate() 
	{
	
		
		AOC.UserManagementLink().click();
		AOU.CreateUserLink().click();

	  	AOU.UserTypeInternalRadio().click();
	  	AOU.UserLastNameText().clear();
	  
	  	//AOU.UserLastNameText().sendKeys("test"+rdn.nextInt(100));
	  	AOU.UserLastNameText().sendKeys(user);
	  	
	  	AOU.UserFirstNameText().clear();
	  	//AOU.UserFirstNameText().sendKeys("test"+rdn.nextInt(100));
	  	AOU.UserFirstNameText().sendKeys(user);
	  	AOU.UserIDText().clear();
	  System.out.println("			UID to be used for creating - "+UID);
	  	//AOU.UserIDText().sendKeys(UID);
	  	AOU.UserIDText().sendKeys(user);
	  	
	  	
	  	AOU.UserEmailText().clear();
	  //	AOU.UserEmailText().sendKeys(rdn.nextInt(100)+"@in.ibm.com");
	 	AOU.UserEmailText().sendKeys(user+"@in.ibm.com");
	    new Select(AOU.UserCountryDropDown()).selectByVisibleText("India");
	    AOU.UserIdentifierText().clear();
	    AOU.UserIdentifierText().sendKeys(user);
	    do
	    	{
	    		AOU.SaveAndCloseButton().click();
	    		try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
	    	}
	    while(CreateUserErrorValidations());
	    
	   //System.out.println(AOU.UserManageUserPageHeader().getText());
	   
	   if(AOU.UserManageUserPageHeader().isDisplayed())
		   {
			   	if(AOU.UserSucessCreateMessage().isDisplayed())
			   	{
			   		System.out.println("			User Created Sucessfully");
			   	}
		   }
	   else
		   {
			   System.out.println("			Failed to Create User ");
		   }
	 
	    
	}

//******End of User Create Method***************************
//******Start : Assigned Group to User ***************************
public void UserSearchofEdit()
{
	AOC.UserManagementLink().click();
	new Select(AOU.UserSearchOnDropDown()).selectByVisibleText("User Id");
	//System.out.println("UID to be use for deleting "+UID);
	
	//AOU.UserSearchForText().sendKeys(UID);
	AOU.UserSearchForText().sendKeys(user);
	new Select (AOU.UserCountryDropDown()).selectByVisibleText("India");
	new Select (AOU.UserTypeDropDown()).selectByVisibleText("Internal");
	AOU.UserSearchGOButton().click();
	try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
	
	AOU.SearchedUserUpdateLink().click();
	try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
	 PageHeaderUserUpdate = AOU.UserManageUserPageHeader().getText();
	
}	
public void GroupAssignedtoUser()
{
	UserSearchofEdit();
	if(PageHeaderUserUpdate.equals("Update user"))
	{
		System.out.println("User udpate pages opended");
		AOU.UserGroupSearchOnDropDown().sendKeys("Group code");
		AOU.UserGroupSearchForTextBox().sendKeys("test7");
		AOU.UserGroupAssignUserGOButton().click();
		if(AOU.UserGroupSearchResultRow().isDisplayed())
		{
			System.out.println("Record found for Group");
			AOU.UserGroupSearchResultCheckbox().click();
			AOU.UserGroupAssignedUserButton().click();
			if(AOU.UserGroupSearchResultRow().getText().equals(AOU.UserAssignedGroupLastRow().getText()))
			{
				AOU.UserGroupSaveButton().click();
				try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
				if(AOU.UserGroupSucessMsgBox().isDisplayed())
				{System.out.println("Group sucessfully assinged");}
			}
			else
			{
				System.out.println("User goup not assigned");
			}
		}
		
		
	}
	else
	{
		System.out.println("Error occured while opening searched User for editing");
	}
}

public void GroupRemoveFromUser()
{	
	UserSearchofEdit();
	
	if(PageHeaderUserUpdate.equals("Update user"))
	{
		
	}
}
//******End :  Assigned Group to User ***************************

//***********************************************************************************************************************
//******Start of User Create Error Message validations ***************************
public Boolean CreateUserErrorValidations()
	{
		
		String UserErrorMessage = AOU.CreateUserForm().getText();
		if ( UserErrorMessage.contains("User type required.") || 
				UserErrorMessage.contains("Last name required.") || 
				 UserErrorMessage.contains("First name required.") ||
				 UserErrorMessage.contains(" Email id required.") || 
				 UserErrorMessage.contains("Country code required.") ||
				 UserErrorMessage.contains("Employee id required.") || 
				 UserErrorMessage.contains("Please enter valid email id.") || 
				 UserErrorMessage.contains("This userid already exists in the database") 
			)	
			{
				System.out.println("			Please check field remain to be filled");
				return false;
			}
		else 
		{
			
			System.out.println("			No error found while creation ");
			return true;
		}
	}
//******End of User Create Error Message validations ***************************
//***********************************************************************************************************************

//******Start of User Delete Method***************************

public void UserDelete()
{
	AOC.UserManagementLink().click();
	new Select(AOU.UserSearchOnDropDown()).selectByVisibleText("User Id");
	System.out.println("UID to be use for deleting "+UID);
	
	AOU.UserSearchForText().sendKeys(UID);
	new Select (AOU.UserCountryDropDown()).selectByVisibleText("India");
	new Select (AOU.UserTypeDropDown()).selectByVisibleText("Internal");
	AOU.UserSearchGOButton().click();

	
       //wait for search result to be displayed down in the table
	try {Thread.sleep(5000);} catch (InterruptedException e) {e.printStackTrace();}

		if(AOU.UserSearchResultCountLabel().isDisplayed())
		{
		
			UserSearchResultCount = AOU.UserSearchResultCountLabel().getText();
		
			if(Integer.parseInt(UserSearchResultCount)==1)
				{
					System.out.println("Searched User count displayed on screen is :"+ UserSearchResultCount);
					AOU.UserSearchResultCheckBox().click();
		            AOU.UserDeleteButton().click();
		            
		            CT.closeAlertAndGetItsText();
					
//			        Assert.assertEquals("Do you really want to delete selected users", CT.closeAlertAndGetItsText());
//			        try {
//			        		Assert.assertEquals("User(s) successfully deleted.", AOU.UserDeleteMessage().getText());
//			        	} 
//			        catch (Error e) 
//			        	{
//			        		//verificationErrors.append(e.toString());
//			        	}
				}
			else if (Integer.parseInt(UserSearchResultCount)>1)
			{
				System.out.println("Multiple recored fetched, Search criteria need to be updated to delete the specific user");
				UserDelete();
			}
			
			}
		
		
		else if (AOU.NoUserSearchResultMessage().isDisplayed())	
		{
				System.out.println("No User found");
			}

}
//******End of User Delete Method***************************
  
}
