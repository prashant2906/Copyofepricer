package Tasks.IBM;

import Tasks.Task_Common;
import WebElements.IBM.IBMObj_SearchQuote;

/* 
 * Search quote 
 * */
public class IBMTask_SearchQuote {

		IBMObj_SearchQuote ibmsqobj = new IBMObj_SearchQuote();
		Task_Common CT= new Task_Common();
		
		//*********************Start - Tasks for Search tab***********************
				public void SearchQuoteTabClick()
				{
					ibmsqobj.SearchButton().click();
					
				}
			//*********************End - Tasks for Search tab*************************
}
