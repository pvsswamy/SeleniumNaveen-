package PageClassesPackages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClassPackage.BaseClass;

public class LoginPage extends BaseClass

{
	
	@FindBy(name="email")
	WebElement usermail;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//body/div[@id='ui']/div[1]/div[1]/form[1]/div[1]/div[3]")
	WebElement click;
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public HomePageClass loginmtd(String un,String ps)
	{
		usermail.sendKeys(un);
		password.sendKeys(ps);
		click.click();
		
		return new HomePageClass();
	}
	

}
