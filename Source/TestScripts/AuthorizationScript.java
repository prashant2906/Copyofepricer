package TestScripts;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Tasks.Task_Common;
import Tasks.TestReport;
import Tasks.Auth.AuthTask_Common;
import Tasks.Auth.AuthTask_GroupManagement;
import Tasks.Auth.AuthTask_ProfileManagement;
import Tasks.Auth.AuthTask_UserManagement;
import WebElements.Object_Common;


//@Listeners(TestReport.class)
public class AuthorizationScript {
	Object_Common CO = new Object_Common();
	Task_Common CT = new Task_Common();
	AuthTask_ProfileManagement ATP = new AuthTask_ProfileManagement();
	AuthTask_Common ATC = new AuthTask_Common();
	AuthTask_UserManagement ATU = new AuthTask_UserManagement();
	AuthTask_GroupManagement ATG = new AuthTask_GroupManagement();

	//Browser call-up and Group selection for Auth module sanity for all 3 sections 
	
	@BeforeTest
	@Parameters("browser")
	 public void BrowserCallAuthLogin()
	 {
		Object_Common.BrowserCall("browser", Task_Common.getProperty("AUTHDev"));
		//	CT.BrowserCall(Task_Common.getProperty("AUTHlocal"));
			CT.ImplicitWait();
	 	//Selecting Group for Authorization module sanity for all 3 section 
			ATC.GroupSelectionandLaunch();
	  
	 }
//*********************Start : Script for Profile Management ***************************
	 
 @Test
	public void AuthProfileScript()
		{
			ATC.clickProfileManagerment();
			ATP.createprofile(Task_Common.getProperty("ProfileModule"));
			//ATP.DeleteProfile();
		}

//*********************End : Script for Profile Management ***************************  

//*********************Start : Script for User Management ***************************
  @Test
	public void AuthUserScript()
		{
	  		ATU.UserCreate();
		//	ATU.GroupAssignedtoUser();
		//	ATU.UserDelete();
		}
//*********************End : Script for User Management ***************************  

//*********************Start : Script for Group Management ***************************
 @Test
	//open GroupManagement page
	public void AuthGroupScript()
		{
			ATC.clickGroupManagerment();
			ATG.ClickCreateGroup();
			ATG.CreateGroup();
		}
	
//*********************End : Script for Group Management ***************************  

@AfterSuite
public void TestReportResultMail()
	{
		//CT.TestResultMail();
		
	}
	
}
