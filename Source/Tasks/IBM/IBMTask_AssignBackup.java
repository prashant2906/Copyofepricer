package Tasks.IBM;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import org.testng.Assert;
import Tasks.Task_Common;
import WebElements.IBM.IBMObj_AssignBackup;

public class IBMTask_AssignBackup {
	IBMObj_AssignBackup ibmabobj = new IBMObj_AssignBackup();
	Task_Common CT= new Task_Common();
	
	
	//*********************Start - Tasks for Assign Backup tab*************************
	
	/* Open Assign Backup Tab */
	
	public void AssignedBackupTabClick()
	{
		
		ibmabobj.AssignBackupTab().click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	


	public void EditAssignBackup()
	{
		
		ibmabobj.AssignBackup_FirstCheckbox();
		ibmabobj.AssignBackupEditLink().click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	
		ibmabobj.AssignBackupEditResetLink().click();
		AssignBackup_EditDates();
		AssignBackup_EditAssignBackupGroup();
		AssignBackup_GroupListBox_TasksEdit();
		AssignBackup_EditAssignBackupUser();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		AssignBackup_EditAssignBackupCountry();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		ibmabobj.AssignBackup_EditStateProvince();
		System.out.println("			AssignBackup record edited in GUI");
		ibmabobj.AssignBackup_EditSave().click();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		AssignBackup_GOClick();
		System.out.println("			AssignBackup record edit operation completed");
		
		
	}
	
	
	public void AssignBackup_EditDates()
	{
		Date date = Calendar.getInstance().getTime();
		System.out.println(date);
		SimpleDateFormat formatter = new SimpleDateFormat("dd MMM yyyy");
		System.out.println(date);
		String startdate = formatter.format(date);  
		String enddate = formatter.format(date); 
	ibmabobj.AssignBackup_EditStartDate().sendKeys(startdate);
	System.out.println("			AssignBackupStartDate added in GUI");
	ibmabobj.AssignBackup_EditEndDate().sendKeys(enddate);
	System.out.println("			AssignBackupEndDate added in GUI");
	}
	

	
	
	public void AssignBackup_EditAssignBackupGroup()
	{
		ibmabobj.AssignBackupForGrps_Edit();
	}
	
	
	public void AssignBackup_EditAssignBackupUser()
	{
	ibmabobj.AssignBackup_EditSelectBackupUser();
	System.out.println("			AssignBackupUser first element added in GUI");
	}
	
	
	public void AssignBackup_EditAssignBackupCountry()
	{

	ibmabobj.AssignBackup_EditCountry();
	System.out.println("			AssignBackupCountry first country added in GUI");
	}
	
	
	public void AssignBackup_SaveEdit()
	{
	ibmabobj.AssignBackup_EditSave().click();
	
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	
	System.out.println("			AssignBackupGroup Save in DB");

	}
	
	public void AssignBackup_GOClick()
	{	
	ibmabobj.AssignBackupemailaddressGOicon().click();
	
	try {
		Thread.sleep(2500);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	
	System.out.println("			AssignBackup arrow icon clicked");
	}
	
	public void AssignBackup_AnotherPerson()
	{

		ibmabobj.AssignBackupemailaddressTextBox().sendKeys("shweta.vikas@in.ibm.com");
		AssignBackup_GOClick();
		System.out.println("			AssignBackup for another person");
	    AssignBackup_ReturntoMyBackups();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		AssignBackup_GOClick();
	    System.out.println("			AssignBackup for mybackup");
	
	}

	public void AssignBackup_ReturntoMyBackups()
	{	
		ibmabobj.AssignBackupReturntoMyBackups().click();
		System.out.println("			AssignBackup for another person done");
	}
	
	public void AssignBackup_RemoveBackup()
	{
	System.out.println("			Start RemoveBackup code");
	ibmabobj.AssignBackup_FirstCheckbox();
    

	System.out.println("			AssignBackup record selected");
	AssignBackup_RemovingfromGUIDB();
	
	AssignBackup_GOClick();
	
	  try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	
	}
	
	public void AssignBackup_RemovingfromGUIDB()
	{
		
		ibmabobj.AssignBackupRemoveSelectedLink().click();
		System.out.println("			AssignBackup Remove link is clicked");
		ibmabobj.AssignBackup_AcceptAlert();
		System.out.println("			Backup record is now removed");
		
	}
				
	
	public void AssignBackup_GroupsSelectAll()
	{
		ibmabobj.AssignBackup_GroupsSelectAll().click();
    }
		
	public void AssignBackup_GroupListBox_Tasks()
	{

		ibmabobj.AssignBackup_GroupsListboxSelectElement();
		System.out.println("			First Group Selected");
		ibmabobj.AssignBackup_GroupsGOIcon().click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	
		System.out.println("			Groups GO icon clicked");
    }
	
	
	public void AssignBackup_GroupListBox_TasksEdit()
	{

		ibmabobj.AssignBackup_GroupsListboxSelectElementEdit();
		System.out.println("			Second Group Selected");
		ibmabobj.AssignBackup_GroupsGOIconEdit().click();
	
		System.out.println("			Groups GO icon clicked");
    }

	public void AddAssignBackup()
	{

		//String group,user,country,state;
		ibmabobj.AssignBackupAddBackupLink().click();
		AssignBackup_AddDates();	
		AssignBackup_AddAssignBackupGroup();
		AssignBackup_GroupListBox_Tasks();
		AssignBackup_AddAssignBackupUser();
		AssignBackup_AddAssignBackupCountry();
		AssignBackup_AddAssignBackupStateProvince();
		AssignBackup_SaveAdd();
		AssignBackup_GOClick();
		
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	
		System.out.println("			AssignBackup record added in GUI");

	}

	
	public void AssignBackup_AddDates()
	{

		Date date = Calendar.getInstance().getTime();
		System.out.println(date);
		SimpleDateFormat formatter = new SimpleDateFormat("dd MMM yyyy");
		System.out.println(date);
		String startdate = formatter.format(date);   
		String enddate = formatter.format(date);  
		/*ibmabobj.AssignBackup_EditStartDateCalander().click();
		CT.aleart();
		ibmabobj.AssignBackup_AddEndDateCalander();*/
		ibmabobj.AssignBackup_AddStartDate().sendKeys(startdate);
		System.out.println("			AssignBackupStartDate added in GUI");
		
		/*ibmabobj.AssignBackup_EditEndDateCalander().click();
		CT.aleart();
		ibmabobj.AssignBackup_AddEndDateCalander();
		*/
		ibmabobj.AssignBackup_AddEndDate().sendKeys(enddate);
		
		System.out.println("			AssignBackupEndDate added in GUI");
	}
	
	
	
	
	public void AssignBackup_AddAssignBackupGroup()
	{

		ibmabobj.AssignBackupForGrps_Add();
	}
	
	
	public void AssignBackup_AddAssignBackupUser()
	{
		ibmabobj.AssignBackup_AddSelectBackupUser();
	System.out.println("			AssignBackupUser first element added in GUI");
	}
	
	
	public void AssignBackup_AddAssignBackupCountry()
	{

	ibmabobj.AssignBackup_AddCountry();
	System.out.println("			AssignBackupCountry first country added in GUI");
	
	}
	
	
	public void AssignBackup_AddAssignBackupStateProvince()
	{
	ibmabobj.AssignBackup_AddStateProvince();
	System.out.println("			AssignBackupState added in GUI");
	}
	
	
	public void AssignBackupMainDialog_Close()
	{
	ibmabobj.AssignBackupMainDialog().click();
	}
	
	
	public void AssignBackup_Reset()
	{
		ibmabobj.AssignBackupResetLink().click();
	}
	
	
	public void AssignBackup_SaveAdd()
	{
	ibmabobj.AssignBackup_AddSave().click();
	
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	
	System.out.println("			AssignBackupGroup Save in DB");

	}
	

	
	
	public void CheckValidations()
	{

		ibmabobj.AssignBackupAddBackupLink().click();
		AssignBackup_SaveAdd();
		Assert.assertEquals("Please select the backup period above", CT.closeAlertAndGetItsText());    
		AssignBackup_AddDates();
		AssignBackup_SaveAdd();
		Assert.assertEquals("Please select atleast one group from above", CT.closeAlertAndGetItsText()); 
		AssignBackup_AddAssignBackupGroup();
		AssignBackup_GroupListBox_Tasks();
		AssignBackup_SaveAdd();
		Assert.assertEquals("Please select atleast one user from above", CT.closeAlertAndGetItsText()); 
		AssignBackup_AddAssignBackupUser();
		AssignBackup_SaveAdd();
		Assert.assertEquals("Please select atleast one country from above", CT.closeAlertAndGetItsText()); 
		AssignBackup_AddAssignBackupCountry();
		AssignBackup_SaveAdd();
		Assert.assertEquals("Please select atleast one state from above", CT.closeAlertAndGetItsText()); 
		AssignBackup_AddAssignBackupStateProvince();
		AssignBackup_Reset();
		System.out.println("Assign Backup Reset done");
		AssignBackupMainDialog_Close();

	}

	//*********************End - Tasks for Assign Backup tab*************************

}

