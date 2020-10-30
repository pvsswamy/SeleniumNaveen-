package BaseClassPackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	public static WebDriver driver;
	public static Properties pro;
	
	
	
	public BaseClass() 
	{
	try{
		
		 pro=new Properties();
		
	 FileInputStream fi=new FileInputStream("D:/selenium_automation/MavenProject/src/main/java/PropertiesPackage/Config.Properties");
		
	 pro.load(fi);
	}
			catch(Exception e)
	{
		System.out.println(e);		
	}
	 
	}
	
	public static void intitialization()
	
	{
		
		String browserName= pro.getProperty("browser");
		
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "G:/Swamy/chrome driver latest/chromedriver.exe");
			
			driver=new ChromeDriver();
		}
		else if(browserName.equals("ie"))
		{
			System.setProperty("webdriver.chrome.driver", "G:/Swamy/chrome driver latest/chromedriver.exe");
		}
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get(pro.getProperty("url"));
	}
	
	
	
	

}
