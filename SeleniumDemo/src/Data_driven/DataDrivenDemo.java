package Data_driven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DataDrivenDemo
{
	WebDriver driver; 
      String data;
      public void getData() throws IOException
      {
    	  FileInputStream fs=new FileInputStream("F:\\Selenimum software\\Logindata.xlsx");
    	//Access Workbook
  		  XSSFWorkbook wb=new XSSFWorkbook(fs);
  		
  		//Access sheet from workbook
  		  XSSFSheet sheet=wb.getSheet("Login");
  		
  		//Access row from the work sheet
  		int count=sheet.getLastRowNum();
  		System.out.println("Total number of rows=" +count);
  		
  		XSSFRow row=sheet.getRow(0);
  		
  		//Fetch row from 0 row
  		XSSFCell cell=row.getCell(0);
  		data=cell.getStringCellValue();
  		System.out.println("data is:" +data); 
 	}
  	public static void main(String[] args) throws IOException {
  		DataDrivenDemo ddf=new DataDrivenDemo();
  		ddf.getData();
  	}

  }


