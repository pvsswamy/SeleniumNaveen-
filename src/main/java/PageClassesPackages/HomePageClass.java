package PageClassesPackages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClassPackage.BaseClass;

public class HomePageClass extends BaseClass

{
	
	@FindBy(xpath="//span[contains(text(),'swamy p')]")
	WebElement usenamelabel;
	
	@FindBy(xpath="//span[contains(text(),'Contacts')]")
	WebElement contactslink;
	
	
	@FindBy(xpath="//span[contains(text(),'Deals')]")
	WebElement dealslink;
	
	@FindBy(xpath="//span[contains(text(),'Tasks')]")
	WebElement tasklink;
	
	@FindBy(xpath="//body/div[@id='ui']/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/a[1]/button[1]")
	WebElement newContactLink;
	
	public HomePageClass()  
	{
		  
		PageFactory.initElements(driver, this);
		
	}
	
	public String verifyHomePageTitle()
	{
		 
		return driver.getTitle();
	}
	
	public boolean verifyusernamelabel()
	{
		 return usenamelabel.isDisplayed();
	}
	
	public ContactsPage clickonContactsLink()
	{
		
		contactslink.click();
		
		return new ContactsPage();
	}
	
	public DealsPage clickOnDealsLink()
	{
		dealslink.click();
		
	return new DealsPage();
	}
	
	public TasksPage clickOnTasksLink()
	{
		tasklink.click();
		
		return new TasksPage();
	}
	
	public ContactsPage ClickOnNewContactLink()	
	{
		newContactLink.click();
		
		return new ContactsPage();
	}
	

}
