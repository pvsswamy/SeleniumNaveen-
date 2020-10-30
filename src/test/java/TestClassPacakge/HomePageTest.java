package TestClassPacakge;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseClassPackage.BaseClass;
import PageClassesPackages.ContactsPage;
import PageClassesPackages.HomePageClass;
import PageClassesPackages.LoginPage;
import junit.framework.Assert;

public class HomePageTest extends BaseClass

{
	LoginPage loginPage;
	HomePageClass homePage;
	ContactsPage contactsPage=new ContactsPage();
	
	public HomePageTest() 
	{
		super();
	}
	
	
	@BeforeMethod
	
	public void setUp()
	{
		intitialization();
		
		loginPage=new LoginPage();
		
		homePage=loginPage.loginmtd(pro.getProperty("username"),pro.getProperty("password"));
		
	}
	
	@Test
	
	public void verifyHomePageTitleTest()
	{
		String title=homePage.verifyHomePageTitle();
		
		Assert.assertEquals(title,"Cogmento CRM");
	}
	
	
	@Test
	public void verifyusernamelabelTest()
	{
		Assert.assertTrue(homePage.verifyusernamelabel());;
	}
	
	@Test
	
	public void clickOnContactsLinkTest()
	{
		contactsPage=homePage.clickonContactsLink();
	}
	
	@Test
	
	public void ClickOnNewContactLinkTest()
	{
		contactsPage=homePage.ClickOnNewContactLink();
	}
	
	
	
	
	@AfterMethod
	
	public void tearDowm()
	{ 
		driver.quit();
	}
	
	
	
	
	
	

}
