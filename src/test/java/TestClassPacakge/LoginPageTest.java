package TestClassPacakge;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseClassPackage.BaseClass;
import PageClassesPackages.LoginPage;


public class LoginPageTest extends BaseClass

{
	LoginPage lgnpage;

	public LoginPageTest()
	{
		super();
	}
	
	
	@BeforeMethod
	public void setup()
	{
		intitialization();
		
		 lgnpage=new LoginPage();
		
		}
	
	@Test
	
	public void LoginTest()
	{
		lgnpage.loginmtd(pro.getProperty("username"),pro.getProperty("password"));
	}
	
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
}






