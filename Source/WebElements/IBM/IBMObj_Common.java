package WebElements.IBM;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import WebElements.Object_Common;


public class IBMObj_Common extends Object_Common{
 
public WebElement LandingPageObjectsHeader()
{
	 return driver.findElement(By.xpath(".//*[@id='ibm-leadspace-body']/h1")); 
}


public void mousehover()
{
WebElement element = driver.findElement(By.xpath(".//button[contains(@data-ng-click,'showQuoteStep(quoteStepList[3]')]"));
Actions actions = new Actions(driver);
actions.moveToElement(element).perform();
//element.click();
}


public WebElement IBMGroupSelectionDropDown()
{
	
	return (driver.findElement(By.xpath(".//*[@id='ibm-leadspace-head']/div[3]/div/select")));
	
}

public WebElement SelectedGroupRoleLabel()
{
	 return driver.findElement(By.xpath(".//*[@id='role-text-large']")); 
}
public WebElement SelectedGroupCodeDropDown()
{
	 return driver.findElement(By.xpath(".//select[contains(@name,'SelectARole')]")); 
}
public WebElement LaunchLink()
{
	return driver.findElement(By.xpath("//span[contains(@data-ng-click,'selectGroup();')]")); 
}
	
public WebElement GOButton()
{
	
	return  driver.findElement(By.xpath(".//input[@class='ibm-btn-go'][@onclick='validate()']"));
}

public WebElement SignOutLink()
{
	return driver.findElement(By.xpath(".//*[@id='sign-in-out']")); 
}



//********** End of Launch App Page **********	


//********** Start of Left Navigation Menu **********
public WebElement ProfileManagementLink()
{
    return driver.findElement(By.xpath(".//*[@id='ibm-primary-links']/li[2]/a"));
}
	
public WebElement UserManagementLink()
{
    return driver.findElement(By.xpath(".//*[@id='ibm-primary-links']/li[3]/a"));
}
	
public WebElement GroupManagementLink()
{
    return driver.findElement(By.xpath(".//*[@id='ibm-primary-links']/li[4]/a"));
}
	
public WebElement ManageProfileLink()
{
		
	return  driver.findElement(By.xpath(".//a[@alt='Manage profile']"));
}

public WebElement ManageGroupLink()
{
	return  driver.findElement(By.xpath(".//a[@alt='Manage group']"));
}

public WebElement SelectGroupBreadCrumbs() {
	
	return driver.findElement(By.xpath(".//*[@id='ibm-navigation-trail']/li[2]")); 
}



//********** End of Left Navigation Menu **********
}
