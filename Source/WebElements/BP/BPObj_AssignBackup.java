package WebElements.BP;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import WebElements.Object_Common;

public class BPObj_AssignBackup extends Object_Common
{
	//***********Start of Assign Backup objects*****************
			public WebElement AssignBackupBreadCrumbs()
			{
				 return driver.findElement(By.xpath(".//*[@id='ibm-navigation-trail']/li[2]")); 
			}
			
			public WebElement AssignBackupMainDialog()
			{
				 return driver.findElement(By.xpath(".//*[@id='popupactioncancel']/span")); 
			}
			
			
			public WebElement AssignBackupTab()
			{
			   return driver.findElement(By.xpath(".//*[@id='ibm-leadspace-body']/div/div[2]/div/div[1]/table/tbody/tr[3]/td[5]/a")); 	 

			}
			public WebElement AssignBackupemailaddressTextBox()
			{
				 return driver.findElement(By.xpath(".//*[@id='mailid']")); 
			}
			
			public WebElement AssignBackupReturntoMyBackups()
			{
				return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div/div/div[2]/div/div/assignbackup-page/div/div[5]/div[1]/div[4]/a")); 
				
			}
			
			public WebElement AssignBackupemailaddressGOicon()
			{
				 return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div/div/div[2]/div/div/assignbackup-page/div/div[3]/div/a")); 
			}
			
			public WebElement AssignBackupAddBackupLink()
			{
					return driver.findElement(By.linkText("Add Backup"));		
			}
			
			public WebElement AssignBackupRemoveSelectedLink()
			{
				return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div/div/div[2]/div/div/assignbackup-page/div/div[5]/div[3]/div/a[1]/span[2]")); 
			}
			
			public WebElement AssignBackupEditLink()
			{
				 return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div/div/div[2]/div/div/assignbackup-page/div/div[5]/div[3]/div/a[2]/span[2]")); 
			}
			
			public WebElement AssignBackupResetLink()
			{
				 return driver.findElement(By.xpath(".//*[@id='popupmodal']/div/div[5]/a[2]")); 
			}
			
			public WebElement AssignBackupEditResetLink()
			{
				 return driver.findElement(By.xpath(".//*[@id='popupactionok']/div[5]/a[2]")); 
			}
			
			public WebElement AssignBackup_AddStartDate()
			{
				 return driver.findElement(By.xpath(".//*[@id='startDateStr_V17tmp']"));  
			}
			
			
			
			public WebElement AssignBackup_AddEndDate()
			{
				 return driver.findElement(By.xpath(".//*[@id='endDateStr_V17tmp']")); 
			}
			
			public WebElement AssignBackup_AddStartDateCalender()
			{
				 return driver.findElement(By.xpath(".//*[contains(@value,'Today')]"));  
			}
			

			public void AssignBackupForGrps_Add()
			{
				Select listbox = new Select(driver.findElement(By.xpath(".//*[@id='backupgroupnameid1']")));
				listbox.selectByIndex(0);

			}
			
			public void AssignBackup_AddSelectBackupUser()
			{
				Select listbox = new Select(driver.findElement(By.xpath(".//*[@id='backupgroupnameid']"))); 
				listbox.selectByIndex(0);
			}
			
			public void AssignBackup_AddCountry()
			{
				Select listbox =  new Select(driver.findElement(By.xpath(".//*[@id='countriesid1']"))); 
				listbox.selectByIndex(0);
			}
			
			public void AssignBackup_AddStateProvince()
			{
				Select listbox = new Select(driver.findElement(By.xpath(".//*[@id='stateprovinceid1']"))); 
				listbox.selectByIndex(0);		
			}
			
			
		
			public WebElement AssignBackup_SelectAllStateProvince()
			{
				return driver.findElement(By.xpath(".//*[@id='popupmodal']/div/div[4]/table/tbody/tr[3]/td[4]/a")); 
			
			}
			
			
			public WebElement AssignBackup_AddSave()
			{
				 return driver.findElement(By.xpath(".//*[@id='popupmodal']/div/div[5]/a[1]")); 
			}                                
			
			public WebElement AssignBackup_AddReset()
			{
				 return driver.findElement(By.xpath(".//*[@id='popupmodal']/div/div[5]/a[2]")); 
			}
			
			public WebElement AssignBackup_AddStartDateCalander()
			{
				 return driver.findElement(By.xpath(".//*[@id='popupmodal']/div/div[2]/table/tbody/tr/td[3]/a/img")); 
			}
			
			public WebElement AssignBackup_AddEndDateCalander()
			{
				 return driver.findElement(By.xpath(".//*[@id='popupmodal']/div/div[2]/table/tbody/tr/td[6]/a/img")); 
			}
			
			public WebElement AssignBackup_AddSelectBackupFilter()
			{
				 return driver.findElement(By.xpath(".//*[@id='popupmodal']/div/div[3]/table/tbody/tr[2]/td[4]/input")); 
			}
			
			public WebElement AssignBackup_AddSelectBackup_SelectAll()
			{
				 return driver.findElement(By.xpath(".//*[@id='popupmodal']/div/div[3]/table/tbody/tr[5]/td[2]/a")); 
			}
			
			public WebElement AssignBackup_AddCountry_SelectAll()
			{
				 return driver.findElement(By.xpath(".//*[@id='popupmodal']/div/div[4]/table/tbody/tr[3]/td[2]/a")); 
			}
			
		
			public WebElement AssignBackup_EditStartDate()
			{
				 return driver.findElement(By.xpath(".//*[@id='editStartDateStr_V17tmp']")); 
			}
			
			public WebElement AssignBackup_EditEndDate()
			{
				 return driver.findElement(By.xpath(".//*[@id='editEndDateStr_V17tmp']"));  
			}
			
			public void AssignBackupForGrps_Edit()
			{
				Select listbox = new Select(driver.findElement(By.xpath(".//*[@id='backupgroupnameid2']")));         
				listbox.selectByIndex(1);

			}
			
			public void AssignBackup_EditSelectBackupUser()
			{
				Select listbox = new Select(driver.findElement(By.xpath(".//*[@id='backupgroupnameid']"))); 
				listbox.selectByIndex(1);
			}
			
			public void AssignBackup_EditCountry()
			{
				Select listbox =  new Select(driver.findElement(By.xpath(".//*[@id='countriesid2']"))); 
				listbox.deselectAll();
				listbox.selectByIndex(1);
			}
			
			public void AssignBackup_EditStateProvince()
			{
				Select listbox = new Select(driver.findElement(By.xpath(".//*[@id='stateprovinceid2']"))); 
				listbox.selectByIndex(1);
				
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			}
			
		
			
			public WebElement AssignBackup_EditSave()
			{
				//System.out.println("inside EDITSAVE");
				return driver.findElement(By.xpath(".//*[@id='popupactionok']/div[5]/a[1]"));  
			}
			
			public WebElement AssignBackup_EditReset()
			{
				 return driver.findElement(By.xpath(".//*[@id='popupmodal']/div/div[5]/a[2]")); 
			}
			
			public WebElement AssignBackup_EditStartDateCalander()
			{
				 return driver.findElement(By.xpath(".//*[@id='popupmodal']/div/div[2]/table/tbody/tr/td[3]/a/img")); 
			}
			
			public WebElement AssignBackup_EditEndDateCalander()
			{
				 return driver.findElement(By.xpath(".//*[@id='popupmodal']/div/div[2]/table/tbody/tr/td[6]/a/img")); 
			}
			
			public WebElement AssignBackup_EditSelectBackupFilter()
			{
				 return driver.findElement(By.xpath(".//*[@id='popupmodal']/div/div[3]/table/tbody/tr[2]/td[4]/input")); 
			}
			
			public WebElement AssignBackup_EditSelectBackup_SelectAll()
			{
				 return driver.findElement(By.xpath(".//*[@id='popupmodal']/div/div[3]/table/tbody/tr[5]/td[2]/a")); 
			}
			
			public WebElement AssignBackup_EditCountry_SelectAll()
			{
				 return driver.findElement(By.xpath(".//*[@id='popupmodal']/div/div[4]/table/tbody/tr[3]/td[2]/a")); 
			}
			
			
			public WebElement AssignBackup_SelectCheckbox()
			{

				return (WebElement) driver.findElements(By.xpath(".//*[@id='0']"));
			}
			
			
			public WebElement AssignBackup_FirstCheckbox()
			{

				boolean isChecked;
					
				String checkboxXPath = ".//input[contains(@id, '0')]" ;
						WebElement elementToClick = driver.findElement(By.xpath(checkboxXPath));
						driver.findElement(By.xpath(checkboxXPath));
						elementToClick.click();
						driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

						isChecked = driver.findElement(By.xpath(checkboxXPath)).getAttribute("checked").equals("true");
						System.out.println(isChecked);
						return elementToClick;
					
			}
			
			
			public WebElement AssignBackup_FirstCheckbox1()
			{
				
				String checkboxXPath = "//input[contains(@id, 'checkBoxassignbackup')]" ;
						WebElement elementToClick = driver.findElement(By.xpath(checkboxXPath));
						driver.findElement(By.xpath(checkboxXPath));
						elementToClick.click();
						return elementToClick;
				
			}
		
			public WebElement AssignBackup_WAIT()
			{
				
				 return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div/div/div[2]/div/div/assignbackup-page/div/div[5]")); 
					
			}
			
			
			public void AssignBackup_AcceptAlert()
			{
				driver.switchTo().alert().accept();
				//System.out.println("Alert accepted");	

			}
			
			public WebElement AssignBackup_getStartDate()
			{
				 return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div/div/div[2]/div/div/assignbackup-page/div/div[5]/div[2]/table/tbody/tr[1]/td[2]")); 
			}
			
			public WebElement AssignBackup_getEndDate()
			{
				 return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div/div/div[2]/div/div/assignbackup-page/div/div[5]/div[2]/table/tbody/tr[1]/td[3]"));			 
			}
			
			public WebElement AssignBackup_getSelectBackupforGroups()
			{
				 return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div/div/div[2]/div/div/assignbackup-page/div/div[5]/div[2]/table/tbody/tr[1]/td[4]/span[1]"));			 
			}
			
			public WebElement AssignBackup_getCriteriaByCountry()
			{
				 return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div/div/div[2]/div/div/assignbackup-page/div/div[5]/div[2]/table/tbody/tr[1]/td[5]"));			 
			}
			
			public WebElement AssignBackup_getCriteriaByStateProvince()
			{
				 return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div/div/div[2]/div/div/assignbackup-page/div/div[5]/div[2]/table/tbody/tr[1]/td[6]"));			 
			}
			
			public WebElement AssignBackup_NoBackuptextFirstLabel()
			{
				 return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div/div/div[2]/div/div/assignbackup-page/div/div[5]/div[2]/div/div[1]"));			 
			}
			
			public WebElement AssignBackup_NoBackuptextSecondLabel()
			{
				 return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div/div/div[2]/div/div/assignbackup-page/div/div[5]/div[2]/div/div[2]"));			 
			}
			
			public WebElement AssignBackup_GroupsSelectAll()
			{
				 return driver.findElement(By.xpath(".//*[@id='popupmodal']/div/div[3]/table/tbody/tr[5]/td[2]/a[1]"));			 
			}
			
			public void AssignBackup_GroupsListboxSelectElement()
			{
				 
				Select listbox = new Select (driver.findElement(By.xpath(".//*[@id='backupgroupnameid1']"))); 
				listbox.selectByIndex(0);	 
			}
			
			public void AssignBackup_GroupsListboxSelectElementEdit()
			{
				 
				Select listbox = new Select (driver.findElement(By.xpath(".//*[@id='backupgroupnameid2']"))); 
				listbox.selectByIndex(1);	 
			}
			
			public WebElement AssignBackup_GroupsGOIcon()
			{
				 return driver.findElement(By.xpath(".//*[@id='popupmodal']/div/div[3]/table/tbody/tr[5]/td[2]/a[2]"));			 
			}	
			
			public WebElement AssignBackup_GroupsGOIconEdit()
			
			{
				 return driver.findElement(By.xpath(".//*[@id='popupactionok']/div[3]/table/tbody/tr[5]/td[2]/a[2]"));			 
			}			 
		
			
		//***********End of Assign backup objects***************** 
}
