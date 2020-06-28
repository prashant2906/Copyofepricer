package WebElements;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import Tasks.LogWriter;
import Tasks.LoggerExample;
public class Object_Common 
{
	
//	public static ProfilesIni profile = new ProfilesIni();
//	public static FirefoxProfile myprofile = profile.getProfile("SelProfile");

	//public static WebDriver IEdriver = new InternetExplorerDriver();

	//public static WebDriver driver=new FirefoxDriver();
	
	public static WebDriver driver;
    //public static WebDriver FFDriver;
    
	public static WebDriver BrowserCall(String browser, String env) 
	{
		
		if(browser.equalsIgnoreCase("IE"))
		{
			System.setProperty("webdriver.ie.driver", "C:\\epricer\\Selenium\\IEDriverServer_x64_2.48.0\\IEDriverServer.exe");
			 driver = new InternetExplorerDriver();
			 driver.manage().window().maximize();
			 driver.get(env);
			 return driver;	  
		}
		
		if(browser.equalsIgnoreCase("FF"))
		{
//			
//			  if (driver == null)
//			    {
				 //driver.manage().deleteAllCookies();
				  driver = new FirefoxDriver();
				  driver.manage().window().maximize();
				  driver.get(env); 
//				}
//			  else
//			  {driver.get(env);}
			
	//		driver = new FirefoxDriver();
	//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		LoggerExample.loger("System opens the browser");
		 LogWriter.writeLogs("System opens the browser");
	//		driver.get(AppURL); 
			return driver;
		}
		else
		{
			System.out.println("Could not identify the Browser");
			return null;
		}
		
		
	 }

	public void Refresh()
	{
		driver.navigate().refresh();
	}
	
	//public static WebDriver driver = new InternetExplorerDriver();
}
