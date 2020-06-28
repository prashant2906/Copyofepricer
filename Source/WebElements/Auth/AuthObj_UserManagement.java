package WebElements.Auth;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.base.Predicate;

import WebElements.Object_Common;

@SuppressWarnings("unused")
public class AuthObj_UserManagement extends Object_Common{
	
	WebDriverWait ExplicitWaitObj = new WebDriverWait(driver, 10);
	
public WebElement UserManageUserPageHeader()
	{
		return driver.findElement(By.xpath(".//*[@id='ibm-leadspace-body']/h1"));
	}
//***********************Start of Create User Object ****************************************************
public WebElement CreateUserLink()
	{
		return  driver.findElement(By.xpath(".//*[@id='ibm-primary-links']/li[3]/ul/li/a"));
	}

//*****************Start : User Create Mandatory Feild's messages ********************
public WebElement CreateUserTypeMsgLable ()
{
	return  driver.findElement(By.xpath(".//*[@id='create-category-01']/div[2]/div[2]/fieldset/legend/span"));
}
public WebElement CreateUserLastNameMsgLable ()
{
	return  driver.findElement(By.xpath(".//*[@id='create-category-01']/div[5]/div[2]/span"));
}
public WebElement CreateUserFirstNamesgLable ()
{
	return  driver.findElement(By.xpath(".//*[@id='create-category-01']/div[6]/div[2]/span"));
}
public WebElement CreateUserUserIDMsgLable ()
{
	return  driver.findElement(By.xpath(".//*[@id='create-category-01']/div[7]/div[2]/span[2]"));
}
public WebElement CreateUserEmailMsgLable ()
{
	return  driver.findElement(By.xpath(".//*[@id='create-category-01']/div[8]/div[2]/span[2]"));
}
public WebElement CreateUserCountryMsgLable ()
{
	return  driver.findElement(By.xpath(".//*[@id='create-category-01']/div[9]/span"));
}
public WebElement CreateUserIdentifierMsgLable ()
{
	return  driver.findElement(By.xpath(".//*[@id='create-category-01']/div[10]/div[2]/span[2]"));
}

public WebElement CreateUserErrorTextMsgLable ()
{
	return  driver.findElement(By.xpath(".//*[@id='CreateUserForm']/div[1]/div/div/span[1]"));
}
//*****************End : User Create Mandatory Feild's messages ********************

public WebElement CreateUserForm ()
{
	return  driver.findElement(By.xpath(".//*[@id='CreateUserForm']"));
}

public WebElement CreateUserErrorMsgLabel ()
	{
		return  driver.findElement(By.xpath(".//*[@id='ibm-content-main']"));
	}
public WebElement ExistingUserMessage()
{
	return driver.findElement(By.xpath(".//*[contains(text(),'This userid already exists in the database')]"));
}
public WebElement UserTypeInternalRadio()
	{
		return  driver.findElement(By.xpath(".//*[@id='userType_I']"));
	}
public WebElement UserTypeExternalRadio()
	{
		return  driver.findElement(By.xpath(".//*[@id='userType_E']"));
	}

public WebElement UserLastNameText()
	{
		return  driver.findElement(By.xpath(".//*[@id='lastname']"));
	}
public WebElement UserFirstNameText()
	{
		return  driver.findElement(By.xpath(".//*[@id='firstname']"));
	}

public WebElement UserIDText()
	{
		return  driver.findElement(By.xpath(".//*[@id='create-category-01']/div[7]/div[2]/input"));
	}
public WebElement UserEmailText()
	{
		return  driver.findElement(By.xpath(".//*[@id='emailid']"));
	}
public WebElement UserCountryDropDown()
	{
		return  driver.findElement(By.xpath(".//*[@id='countryCode']"));
	}
public WebElement UserIdentifierText()
	{
		return  driver.findElement(By.xpath(".//*[@id='identifier']"));
		
	}
public WebElement SaveAndCloseButton()
	{
		return  driver.findElement(By.xpath(".//*[@id='CreateUserForm']/div[4]/div[3]/div/p/a[1]"));
		
	}
public WebElement UserSucessCreateMessage()
	{
		return driver.findElement(By.xpath(".//*[@id='content']/div[1]/div[4]/div[1]/div/span"));
	}
public WebElement UserSucessDeleteMessage()
	{
		return driver.findElement(By.xpath(".//*[@id='content']/div[1]/div[4]/div[1]/div/span"));
	}


//***********************End of Create User ****************************************************

//***********************Start of User Search****************************************************
public WebElement UserSearchOnDropDown()
	{
		return  driver.findElement(By.xpath(".//*[@id='selectedSearchOnCriteria']"));
	}
public WebElement UserSearchForText()
{
	return    driver.findElement(By.xpath("(//input[@id='searchForCriterialabel'])[3]"));
}

//User Search Country drop-down method exists above in User Creation section

public WebElement UserTypeDropDown()
	{
		return  driver.findElement(By.xpath(".//*[@id='selectedUserTypeCriteria']"));
	}

public WebElement UserSearchGOButton()
	{
		return  driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div[4]/form/div[1]/div[2]/div[2]/p/a"));
	}

public WebElement UserSearchResultCountLabel()
	{
		return  driver.findElement(By.xpath(".//*[@id='content']/div[1]/div[1]/div/div/strong"));
	}


public WebElement UserSearchResultCheckBox()
	{
		return  driver.findElement(By.xpath(".//*[@id='chckBoxUserCode0']"));
	}

public WebElement NoUserSearchResultMessage()
	{
		return  driver.findElement(By.xpath(".//*[@id='content']/div[3]/div[1]/div/strong"));
	}

public WebElement SearchedUserUpdateLink()
	{
		return driver.findElement((By.xpath(".//*[@id='content']/div[1]/div[6]/div/div/table/tbody/tr[1]/td[3]/a")));
	}
public List<WebElement> UserViewPrintButton()
{
	return driver.findElements((By.xpath(".//*[@id='update']")));
}	
//***********************End of User Search****************************************************

//***********************Start : Update User **************************************************
public WebElement UserAssingedGroupsTable()
{
	return driver.findElement((By.xpath(".//*[@id='ibm-content-main']/table")));
}
public List <WebElement> UserUpdateAssingedGroupsCheckboxs()
{
	return driver.findElements((By.xpath(".//*[@id='assignedGroupCheckBox1']")));
}
public WebElement UserUpdateAssignedGroupsRemoveButton()
{
	return driver.findElement((By.xpath(".//*[@id='ibm-content-main']/table/tbody/tr[66]/td/p/a")));
}
//***********************End : Update User****************************************************


//*****************Start :  Search Group for User assignment ********************************     
 public WebElement UserGroupSearchOnDropDown()
 {
		return driver.findElement(By.xpath(".//*[@id='searchOn']"));
 }
 public WebElement UserGroupSearchForTextBox()
 {
		return driver.findElement(By.xpath(".//*[@id='searchFor']"));
 }
 public WebElement UserGroupAssignUserGOButton()
 {
		return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div[6]/div[3]/div[3]/div[1]/p/a"));
 }
 public WebElement UserGroupSearchResultTable()
 {
		return driver.findElement(By.xpath(".//*[@id='searchGroupResult']"));
 }
 
 public WebElement UserGroupSearchResultRow()
 {
		return driver.findElement(By.xpath(".//*[@id='searchGroupResult']/tbody/tr[1]"));
 }
 public WebElement UserAssignedGroupLastRow()
 {
		return driver.findElement(By.xpath(".//*[@id='ibm-content-main']/table/tbody/tr[last()-1]"));
 }
 
 public WebElement UserGroupSearchResultCheckbox()
 {
		return driver.findElement(By.xpath(".//*[@id='foundGroupCheckBox0']"));
 }
 public WebElement UserGroupAssignedUserButton()
 {
		return driver.findElement(By.xpath(".//*[@id='searchGroupResult']/tbody/tr[last()]/td/p/a"));
 }

  
 
 public WebElement UserGroupSaveButton()
 {
		return driver.findElement(By.xpath(".//*[@id='ibm-content-body']/div[2]/div/p/a[2]"));
 }
 public WebElement UserGroupCancelButton()
 {
		return driver.findElement(By.xpath(".//*[@id='ibm-content-body']/div[2]/div/p/a[3]"));
 }
 public WebElement UserGroupPrintButton()
 {
		return driver.findElement(By.xpath(".//*[@id='ibm-content-body']/div[2]/div/p/a[1]"));
 }
 public WebElement UserGroupSucessMsgBox()
 {
		return driver.findElement(By.xpath(".//*[@id='content']/div[1]/div[4]/div[1]/div/span"));
 }
//*****************End :  Search Group for User assignment ********************************


//***********************Start of Delete User ****************************************************
public WebElement UserDeleteButton()
	{
		return  driver.findElement(By.xpath(".//*[@id='delete']"));
	}
public WebElement UserDeleteMessage()
	{
		return  driver.findElement(By.xpath(".//*[@id='content']/div[1]/div[4]/div[1]/div/span"));
	}

//***********************End of Delete User ****************************************************

}
