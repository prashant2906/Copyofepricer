package Tasks.IBM;

import org.openqa.selenium.support.ui.Select;

import Tasks.Task_Common;
import WebElements.IBM.IBMObj_MyQuotes;

public class IBMTask_MyQuotes {

	IBMObj_MyQuotes ibmmqobj = new IBMObj_MyQuotes();
	Task_Common CT= new Task_Common();
	
	// ******************** Start - Tasks for My Quote Screen *********
	
	public void MyQuotePage()
	{
		ibmmqobj.MyQuotesTab().click();
		try { Thread.sleep(10000); } catch (InterruptedException e) {e.printStackTrace();}
		ibmmqobj.LNMQuoteStatusCheckbox().click();
		new Select(ibmmqobj.QuoteActionsDropDown()).selectByVisibleText("Open");
		ibmmqobj.QuoteActionsGo().click();
		System.out.println("----> Pass <---- My Quotes Screen checks are done!");	
	}
	
	// ******************** End - Tasks for My Quote Screen *********
	

}
