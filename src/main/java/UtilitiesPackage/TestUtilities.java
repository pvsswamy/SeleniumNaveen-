package UtilitiesPackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class TestUtilities 
 

{
	
	Workbook wb;
	
	public Object[][] getTestData(String sheetName ) 
	{
		
		try{
		   
	   FileInputStream fis=new FileInputStream("D:/selenium_automation/MavenProject/src/main/java/UtilitiesPackage/ExcelData.xlsx");
		
		
		Workbook wb=new WorkbookFactory().create(fis);
		 
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		Sheet sh=wb.getSheet(sheetName);
		
		Object [][] data=new Object[sh.getLastRowNum()][sh.getRow(0).getLastCellNum()];
		
		for(int i=0;i<sh.getLastRowNum();i++)
		{
			for(int k=0;k<sh.getRow(0).getLastCellNum();k++)
			{
				data[i][k]=sh.getRow(i+1).getLastCellNum();
			}
		}
		
		return data;
		
		
	}
	
	}

