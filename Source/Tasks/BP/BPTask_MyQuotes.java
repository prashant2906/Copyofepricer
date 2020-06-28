package Tasks.BP;

import org.openqa.selenium.support.ui.Select;

import Tasks.Task_Common;
import WebElements.BP.BPObj_MyQuotes;

public class BPTask_MyQuotes 
{
	BPObj_MyQuotes bpmqobj = new BPObj_MyQuotes();
	Task_Common CT= new Task_Common();
	
	// ******************** Start - Tasks for My Quote Screen *********
	
	public void MyQuotePage()
	{
		bpmqobj.MyQuotesTab().click();
		try { Thread.sleep(10000); } catch (InterruptedException e) {e.printStackTrace();}
		bpmqobj.MyQuoteResultCheckSingleCheckBox().click();
		new Select(bpmqobj.MyQuotesQuoteActionsDropDown()).selectByVisibleText("Open");
		bpmqobj.MyQuoteGOButton().click();
		System.out.println("----> Pass <---- My Quotes Screen checks are done!");	
	}
	
	// ******************** End - Tasks for My Quote Screen *********
	
}
