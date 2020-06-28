package WebElements.Setting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import WebElements.Object_Common;

public class SetObj_Common extends Object_Common
{
	
	public WebElement SelectUserGroupDropdown()
	{
		return driver.findElement(By.xpath(".//*[@data-ng-model='selection']"));
	}
	public WebElement LaunchSettingLink()
	{
		return driver.findElement(By.linkText("Launch e-Pricer settings"));
	}	

}
	
