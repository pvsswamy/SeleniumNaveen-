package PageClassesPackages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClassPackage.BaseClass;

public class ContactsPage extends BaseClass

{
	
	@FindBy(xpath="//body/div[@id='ui']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]")
	WebElement Contactslabel;
	
	@FindBy(name="first_name")
	WebElement firstName;
	
	
	@FindBy(name="last_name")
	WebElement lastName;
	
	
	@FindBy(xpath="//body/div[@id='ui']/div[1]/div[2]/div[2]/div[1]/div[2]/form[1]/div[2]/div[2]/div[1]/div[1]/input[1]")
	WebElement companyName;
	
	@FindBy(xpath="//input[@name='value' and @placeholder='Email address']")
	WebElement email;
	
	
	@FindBy(name="position")
	WebElement position;
	
	
	@FindBy(name="department")
	WebElement department;
	
	@FindBy(xpath="//body/div[@id='ui']/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/button[2]")
	WebElement savebtn;
	
	
	
	
	
	//td[contains(text(),'p swa dddddd')]//preceding::td
	
    public ContactsPage()
    
    {
    	PageFactory.initElements(driver, this);
    }
    
    public boolean verifyContactsLabel()
    {
    	return Contactslabel.isDisplayed();
    }
    
    public void clickOnContactByName(String name)
    {
    	driver.findElement(By.xpath("//td[contains(text(),'"+name+"')]//preceding::td")).click();
    }
     public void createNewContact(String fname,String lname,String compname,String eml,String positionenter,String dapart)
     
     {
    	 firstName.sendKeys(fname);
    	 lastName.sendKeys(lname);
    	 companyName.sendKeys(compname);
    	 email.sendKeys(eml);
    	 position.sendKeys(positionenter);
    	 department.sendKeys(dapart);
    	 savebtn.click();
    	 
     }
    
    
    
}
