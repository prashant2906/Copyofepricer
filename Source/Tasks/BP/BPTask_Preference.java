package Tasks.BP;

import Tasks.Task_Common;
import WebElements.BP.BPObj_Preference;

public class BPTask_Preference 
{
	BPObj_Preference bpprobj = new BPObj_Preference();
	Task_Common CT= new Task_Common();
	
	//*********************Start - Tasks for ManagePrefrence tab*************************
		public void ManagePreferenceTabClick()
		{
			bpprobj.ManagePrefrenceTab().click();
		}
		//*********************End - Tasks for ManagePrefrence tab*************************
		
	public void Tinymce_Example()
	{
		bpprobj.tinymce().sendKeys("Hello kgjadgdakjg akjgadkga d kgajkgdkajdgajkd gajdg kjdk,sjkdadkjagda ajk");
	}

}
