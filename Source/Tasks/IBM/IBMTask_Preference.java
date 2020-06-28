package Tasks.IBM;

import Tasks.Task_Common;
import WebElements.IBM.IBMObj_Preference;

public class IBMTask_Preference {

	IBMObj_Preference ibmprobj = new IBMObj_Preference();
	Task_Common CT= new Task_Common();
	
	//*********************Start - Tasks for ManagePrefrence tab*************************
		public void ManagePreferenceTabClick()
		{
			ibmprobj.ManagePrefrenceTab().click();
		}
		//*********************End - Tasks for ManagePrefrence tab*************************
		
	public void Tinymce_Example()
	{
		ibmprobj.tinymce().sendKeys("Hello kgjadgdakjg akjgadkga d kgajkgdkajdgajkd gajdg kjdk,sjkdadkjagda ajk");
	}

}
