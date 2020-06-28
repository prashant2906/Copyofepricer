package WebElements.Auth;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import WebElements.Object_Common;


public class AuthObj_Common extends Object_Common{
 
public WebElement LandingPageObjectsHeader()
{
	 return driver.findElement(By.xpath(".//*[@id='ibm-leadspace-body']/h1")); 
}

public WebElement AuthGroupSelectionDropDown()
{
	
	return (driver.findElement(By.xpath(".//*[@id='ibm-leadspace-head']/div[3]/div/select")));
	
}

public WebElement LaunchAuthLink()
{
	
	
	return driver.findElement(By.linkText("Launch authorization"));
}

public WebElement SelectCountry()
{
	
	return driver.findElement(By.id("selectedCountry"));
	
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


//********** End of Left Navigation Menu **********
}
