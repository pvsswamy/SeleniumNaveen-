package TestClassPacakge;

import org.junit.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import BaseClassPackage.BaseClass;
import PageClassesPackages.ContactsPage;
import PageClassesPackages.HomePageClass;
import PageClassesPackages.LoginPage;
import UtilitiesPackage.TestUtilities;

public class ContactsPageTest extends BaseClass

{
	
	LoginPage loginPage;
	HomePageClass homePage;
	ContactsPage contactsPage;
	TestUtilities testUtils=new TestUtilities();
	String sheetName="Contacts";
	
	public ContactsPageTest()
	{
		super();
	}
	
	@BeforeMethod
	
	public void setUp()
	{
		intitialization();
		
		loginPage= new LoginPage();
		
		homePage=new HomePageClass();
		
		contactsPage=new ContactsPage();
		
		homePage=loginPage.loginmtd(pro.getProperty("username"),pro.getProperty("password"));
		
		contactsPage=homePage.clickonContactsLink();
		
		
		
	}
	
	@Test
	
	public void verifyContactsLabelTest()
	{
		Assert.assertTrue(contactsPage.verifyContactsLabel());;
	}
	
	@Test
	
	public void clickOnContactByNameTest() throws Exception
	{
		
		
		Thread.sleep(4000);
		contactsPage.clickOnContactByName("p swa dddddd");
		Thread.sleep(4000);
		
		
	}
	
	@DataProvider
	
	public Object[][] getContactsTestData()
	{
		
		Object data[][]=testUtils.getTestData(sheetName);
		return data;
	}
	
	@Test(dataProvider="getContactsTestData")
	
	public void createNewContactTest(String firstName,String lastName,String companyName,String email,String position,String department)
	{
	
			
		homePage.ClickOnNewContactLink();
	
		
		contactsPage.createNewContact(firstName, lastName, companyName, email, position, department);
		
	}
		
	
	
	
	
	
	 
	
	
	
	@AfterMethod
	
	public void tearDown()
	{
		driver.quit();
	}
	
	

}
