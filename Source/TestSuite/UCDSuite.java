package TestSuite;


import TestScripts.AuthorizationScript;
import TestScripts.BPTestScript;
import TestScripts.SettingScript;


public class UCDSuite 
{
	
	
	public static void main(String[] args) 
	{
		AuthorizationScript authTC = new AuthorizationScript();
		SettingScript setTC= new SettingScript();
		BPTestScript bpTC = new BPTestScript();
		
		authTC.BrowserCallAuthLogin();
	}

}
