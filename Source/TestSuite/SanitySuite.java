package TestSuite;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Tasks.Task_Common;

public class SanitySuite 
{
	Task_Common CT = new Task_Common();
	
	//Authorization Module 
	 @Parameters ({"browser","AppURL"})
	 
	 @Test (priority=0)
	 public void Browsercall(String AppURL)
	 {
			CT.BrowserCall("browser",AppURL);
			CT.ImplicitWait();
	 }
	 //Setting Module 
	 //BP Module 
	//IBM Module 
	 
}
