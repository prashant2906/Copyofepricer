package Tasks.BP;

import Tasks.Task_Common;
import WebElements.BP.BPObj_SearchQuote;

/* 
 * Search quote is to be developed in Sprint 7 and 11 
 * */
public class BPTask_SearchQuote 
{
	BPObj_SearchQuote bpsqobj = new BPObj_SearchQuote();
	Task_Common CT= new Task_Common();
	
	//*********************Start - Tasks for Search tab***********************
			public void SearchQuoteTabClick()
			{
				bpsqobj.SearchQuoteLink().click();
				
			}
		//*********************End - Tasks for Search tab*************************

}
