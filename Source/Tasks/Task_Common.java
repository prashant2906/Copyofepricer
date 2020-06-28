package Tasks;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import org.apache.commons.io.FileUtils;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.BeforeClass;

import WebElements.Object_Common;

public class Task_Common extends Object_Common 
{
	boolean acceptNextAlert = true;
	TestReport tr= new TestReport();

	
	
//	public static void write(String message)
//	{
//		try {
//			FileWriter FW = new FileWriter(file);
//			BufferedWriter BW = new BufferedWriter(FW);
//			BW.write(message);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//	}
//	
	//*********************Start : Reading Test data from Property file***********************************************************
	private static Properties pro = new Properties();
		
	static {
		    try	{
		    		FileInputStream in = new FileInputStream("Source/TestData.Properties");
		    		pro.load(in);
		    		in.close();
		    	} catch (Exception e) {e.printStackTrace();}
			}
	
	public static String getProperty(String key) 
		  {
		    return pro.getProperty(key);
		  }
		//*********************End : Closing Input-stream file***********************************************************
	
	
	@BeforeClass
	public void ImplicitWait()
	{	
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//System.out.println("Implicit Wait Called");
	}

	/*public void BrowserCall(String browser, String AppURL)
		{
			if(browser.equalsIgnoreCase("IE"))
			{
					driver.manage().window().maximize();
					  if (driver == null )
					    {
						 //driver.manage().deleteAllCookies();
						  driver = new InternetExplorerDriver();
						  driver.get(AppURL); 
						}
					  else
					  {driver.get(AppURL); }
			}
			else if(browser.equalsIgnoreCase("FF"))
			{
				driver.manage().window().maximize();
				  if (driver == null)
				    {
					 //driver.manage().deleteAllCookies();
					  driver = new FirefoxDriver();
					  driver.get(AppURL); 
					}
				  else
				  {driver.get(AppURL); }
			}
			
		 }*/
	
	public void IEBrowserCall(String AppURL)
	{
		   
		   
	}
	// following method is to create a Snapshot during the script running
	   
	public void screenShot(String Name) 
	{
		//String dir_name = "SoETest-output/Screenshot"; // define the storage directory of snapshot 
		String dir_name = "TestOutPut/"+Name; 
		if (!(new File(dir_name).isDirectory())) { // check is the folder is existed
			new File(dir_name).mkdir(); // new a folder
		}
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd-HHmmss");
		String time = sdf.format(new Date()); // format the time, etc 20120406-165210
		try {
			File source_file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE); // take the snapshot
			
			FileUtils.copyFile(source_file, new File(dir_name + File.separator + Name+"  "+ time + ".png")); // save the snapshot. etc screenshot\20120406-165210.png
		} catch (IOException e) {
			System.out.println("exception");
			e.printStackTrace();
		} 
	}
    
	 //*****Start : Browser Close call method***** 
		public void exitbrowser()
		{
			driver.quit();
		}
	//*****End : Browser Close call method*****
		
		public void maximizebrowser()
		{
			driver.manage().window().maximize();
		}
		
	public Boolean isAlertPResent()
		{
			try
			{
				driver.switchTo().alert();
				return true;
			}
			catch(Exception e)
			{
				return false;
			}
		}
		
	//*********** close pop-up window **********
	@SuppressWarnings("unused")
	public void acceptalert(){
	Alert confirmaleart = driver.switchTo().alert();
	confirmaleart.accept();
	}
	
	public void scrollwindow(){
	Alert confirmaleart = driver.switchTo().alert();
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("window.scrollBy(250,250)", "");
	}
	
	//*********** End close pop-up window ***********
	  
	public String closeAlertAndGetItsText() 
		{
		
		    try {
		      
		    	Alert alert = driver.switchTo().alert();
			    
		    	String alertText = alert.getText();
		
			      if (acceptNextAlert) 
				      {
				    	  alert.accept();
				    	  //acceptNextAlert=true;
				    	  alert.dismiss();
				    	  return alertText;
				    	  
				    	  	
				      } 
			      else{
			    	  	//acceptNextAlert=false;
			    	  	return alertText;
			    	  	//alert.dismiss();
		      		  }
			      
			   //return alertText;
		   } 
		   
		   finally 
		   {
		      acceptNextAlert = true;
		   }
		}
	
	public void closeAlert() 
	{
	
	    	Alert alert = driver.switchTo().alert();
	    	alert.dismiss();
		    
	}
	//*********************Start of Creating Tasks for DataPool using Excel(xlsx) ********************************
	//@Test
	//@Parameters ("SheetName")
	@SuppressWarnings("unused")
	public void applicationDataPool(String SheetName, String expectedValue)
		{
		
			//File file = new File();
			//FileInputStream finputstream = new FileInputStream(file);
			Workbook TestDP;
				try {
					TestDP = new XSSFWorkbook(new File("Source/ePricerTestDataPool.xlsx"));
				
				
				if( SheetName.equalsIgnoreCase("BPInputs"))
				{
					Sheet testsheet = TestDP.getSheet(SheetName);
					Row row = testsheet.getRow(3);
					System.out.println(row.getCell(1).getStringCellValue());
					
				}
				
				if( SheetName.equalsIgnoreCase("IBMInputs"))
				{
					
					Sheet testsheet = TestDP.getSheet(SheetName);
				}
				
				if( SheetName.equalsIgnoreCase("AuthInputs"))
				{
					Sheet testsheet = TestDP.getSheet(SheetName);
				}
				
				if( SheetName.equalsIgnoreCase("SettingInputs"))
				{
					Sheet testsheet = TestDP.getSheet(SheetName);
				}
				
				TestDP.close();
				
				
				} catch (InvalidFormatException | IOException e) {
				
				e.printStackTrace();
			}
		}
	
	
	//*********************End of DataPool ***********************************************************************
	
	//*********************Start : Test Result Mailing ***********************************************************
	
	@SuppressWarnings("static-access")
	public void TestResultMail()
	   {
	      
	      // Recipient's email ID needs to be mentioned.
		 /*String[] to = {"ansshriv@in.ibm.com", "mbhatna2@in.ibm.com", "meendixi@in.ibm.com", 
		  			"pradeepkumar08@in.ibm.com", "prashgoe@in.ibm.com", "rajdugga@in.ibm.com", 
		  			"cuienwei@cn.ibm.com", "kejundl@cn.ibm.com", "zwenijiao@cn.ibm.com", "zhaoxiaz@cn.ibm.com", "dlhying@cn.ibm.com",
		  			"vergarec@ph.ibm.com", "delosg@ph.ibm.com", "lamiom@ph.ibm.com"};*/
		
		
		 String[] to = {"taggarw2@in.ibm.com", "taggarw2@in.ibm.com"};
		 
	      // Sender's email ID needs to be mentioned
	      String from = "prashgoe@in.ibm.com";

	      // Sending email from SMTP server
	      String host = "oop.de.relay.ibm.com";

	      // Get system properties
	      Properties properties = System.getProperties();
	      

	      // Setup mail server
	      properties.setProperty("mail.smtp.host", host);

	      // Get the default Session object.
	      Session session = Session.getDefaultInstance(properties);

	      try{
	         // Create a default MimeMessage object.
	         MimeMessage message = new MimeMessage(session);

	         // Set From: header field of the header.
	         message.setFrom(new InternetAddress(from));

         
	         // Set To: header field of the header.
	         for (int i=0;i<to.length;i++ )
	             message.addRecipient(Message.RecipientType.TO,
	                                      new InternetAddress(to[i]));

	         // Set Subject: header field
	         Date date = new Date();
	         message.setSubject("ePricer Test Report executed @ "+date);

	         // Create the message part 
	         BodyPart messageBodyPart = new MimeBodyPart();

	         // Fill the message
	         
	         messageBodyPart.setText("<< Please find attached the testing report for ePricer-RW >>\n\n\n"+tr.trs);
	         
	         // Create a multipart message
	         Multipart multipart = new MimeMultipart();

	         // Set text message part
	         multipart.addBodyPart(messageBodyPart);

	         // Part two is attachment
	         messageBodyPart = new MimeBodyPart();
	         String filename1 = System.getProperty("user.dir")+"\\Source\\emailable-report.html";
	    
	         //System.out.println(filename);
	         DataSource source1 = new FileDataSource(filename1);
	         messageBodyPart.setDataHandler(new DataHandler(source1));
	         messageBodyPart.setFileName(filename1);
	         multipart.addBodyPart(messageBodyPart);

	         //Attaching the log file 
	         
	         String filename = "C:\\Users\\IBM_ADMIN\\Desktop\\logs.txt";
	 	    
	         //System.out.println(filename);
	         BodyPart messageBodyPart1 = new MimeBodyPart();
	         DataSource source = new FileDataSource(filename);
	         messageBodyPart1.setDataHandler(new DataHandler(source));
	         messageBodyPart1.setFileName(filename);
	         multipart.addBodyPart(messageBodyPart1);
	         
	         // Send the complete message parts
	         message.setContent(multipart);
	         // Send message
	         Transport.send(message);
	         System.out.println("Message sent successfully....");
	      }catch (MessagingException mex) {
	         mex.printStackTrace();
	      }
	   }
	//*********************End : Test Result Mailing ***********************************************************
	public void BrowserWait() 
	{
		int i=0;
		boolean findgroup = false;
		while (findgroup == false && i<3) {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			try{
				
			findgroup = driver.findElement(
					By.xpath(".//*[@data-ng-model='selection']")).isDisplayed();
			}
			catch(Exception e)
			{
				driver.navigate().refresh();
				i++;
			}
		System.out.println("Setting:Log on refresh time" + i );	
		}
	}
	
	public void ThreadSleepMethod()
	{
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String BrowseCFR()
	{
		String filename = System.getProperty("user.dir")+"\\Source\\TestData\\Aegon GB VEBsnH6064 FC4016nFC4017mes 24aug15.cfr";
		
		//C:\\Users\\IBM_ADMIN\\Desktop\\BPCFRs\\rewrite cfr\\system z\\881B7 Upgrade.cfr
		
		return filename;
	}
	
	
	public String BrowseCFR1()
	{
	//String filename = System.getProperty("user.dir")+"\\Source\\TestData\\881B7 Upgrade.cfr";
		String filename = System.getProperty("user.dir")+"\\Source\\TestData\\Aegon GB .cfr";
		
		//C:\\Users\\IBM_ADMIN\\Desktop\\BPCFRs\\rewrite cfr\\system z\\881B7 Upgrade.cfr
		
		return filename;
	}

}	
