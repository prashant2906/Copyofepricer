package Tasks.Setting;

import org.openqa.selenium.support.ui.Select;

import Tasks.Task_Common;
import WebElements.Setting.SetObj_Common;

public class SettingTask_Common
{
	SetObj_Common stcmobj = new SetObj_Common();

	public void selectSettingGroupandLaunch() 
	{
		System.out.println("Setting:select Group from Dropdown");
		
		try
		{
			stcmobj.SelectUserGroupDropdown().sendKeys(Task_Common.getProperty("SettingSanityGroup"));
		
		}catch(Exception e)
		{
			
		}finally
		{
			new Select(stcmobj.SelectUserGroupDropdown()).selectByVisibleText("GITC SETTINGS");
		}
		
		
		System.out.println("Setting:Set Group successfully");
		
		stcmobj.LaunchSettingLink().click();
		System.out.println("Setting:Log on Setting app successfully");
	}
		
}
