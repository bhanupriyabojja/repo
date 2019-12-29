
package com.gcrShop.Testscripts;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import com.gcrShop.CommonMethods.GcrShopMethods;
import com.gcrShop.Excelutilities.ExcelUtilities;
import com.gcrShop.Weblocators.GcrShopLocators;

public class NewGcrTest {
	WebDriver driver;	
	
	  @Test(priority=1) 
	  public void contactInformation(){
		  try {	
	 
		driver.get(ExcelUtilities.getURL("//Users//bhanupriyabojja//eclipse-workspace//GcrShopProject//TestData//TestData1.xlsx", 1, 0, "URL"));
		System.out.println("my account page is displayed");
		GcrShopMethods.captureScreenShot(driver,"Step2_AccountPage_Displayed","TC1_Screenshots");
		ExcelUtilities.writeresult("//Users//bhanupriyabojja//eclipse-workspace//GcrShopProject//TestData//Results.xlsx", 1, 0, 1, "Step2_Accountpage_displayed");
		
		
		
	    driver.findElement(By.name(GcrShopLocators.telephone_number)).sendKeys(ExcelUtilities.getData("//Users//bhanupriyabojja//eclipse-workspace//GcrShopProject//TestData//TestData1.xlsx",0, 1, 1));
		System.out.println("telephone Number entered");
		driver.findElement(By.name(GcrShopLocators.fax_number)).sendKeys(ExcelUtilities.getData("//Users//bhanupriyabojja//eclipse-workspace//GcrShopproject//TestData//TestData1.xlsx",0, 1, 2));
		System.out.println("Fax number  entered");
		
		driver.findElement(By.name(GcrShopLocators.news_letter )).click();
		System.out.println("newsletter clicked");	
		
		driver.findElement(By.name(GcrShopLocators.company_name)).sendKeys(ExcelUtilities.getData("//Users//bhanupriyabojja//eclipse-workspace//GcrShopproject//TestData//TestData1.xlsx",0, 1, 3));
		System.out.println("company name entered");	
		
		
		String gender = ExcelUtilities.getData("//Users//bhanupriyabojja//eclipse-workspace//GcrShopproject//TestData//TestData1.xlsx",0,1,4);
		if(gender.equalsIgnoreCase("FeMale"))
		{
			driver.findElement(By.xpath(GcrShopLocators.Female_xpath)).click();
		}else
		{
			driver.findElement(By.xpath(GcrShopLocators.Male_xpath)).click();
		}
		
		driver.findElement(By.name(GcrShopLocators.FirstName_name)).sendKeys(ExcelUtilities.getData("//Users//bhanupriyabojja//eclipse-workspace//GcrShopproject//TestData//TestData1.xlsx",0, 1, 5));
		System.out.println("first name entered");
		
		driver.findElement(By.name(GcrShopLocators.LastName_name)).sendKeys(ExcelUtilities.getData("//Users//bhanupriyabojja//eclipse-workspace//GcrShopproject//TestData//TestData1.xlsx",0, 1, 6));
		System.out.println("last name entered");
		
		driver.findElement(By.name(GcrShopLocators.DateOfBirth_name)).sendKeys(ExcelUtilities.getData("//Users//bhanupriyabojja//eclipse-workspace//GcrShopproject//TestData//TestData1.xlsx",0, 1, 7));
		System.out.println("dob entered");
		
		driver.findElement(By.name(GcrShopLocators.Emailaddress_name)).sendKeys(ExcelUtilities.getData("//Users//bhanupriyabojja//eclipse-workspace//GcrShopproject//TestData//TestData1.xlsx",0, 1, 8));
		System.out.println("email entered");
		
		driver.findElement(By.name(GcrShopLocators.StreetAddress_name)).sendKeys(ExcelUtilities.getData("//Users//bhanupriyabojja//eclipse-workspace//GcrShopproject//TestData//TestData1.xlsx",0, 1, 9));
		System.out.println("street entered");

		driver.findElement(By.name(GcrShopLocators.Suburb_name)).sendKeys(ExcelUtilities.getData("//Users//bhanupriyabojja//eclipse-workspace//GcrShopproject//TestData//TestData1.xlsx",0, 1, 10));
		System.out.println("suburb entered");

		driver.findElement(By.name(GcrShopLocators.PostCode_name)).sendKeys(ExcelUtilities.getData("//Users//bhanupriyabojja//eclipse-workspace//GcrShopproject//TestData//TestData1.xlsx",0, 1, 11));
		System.out.println("postcode entered");
		
		driver.findElement(By.name(GcrShopLocators.City_name)).sendKeys(ExcelUtilities.getData("//Users//bhanupriyabojja//eclipse-workspace//GcrShopproject//TestData//TestData1.xlsx",0, 1, 12));
		System.out.println("city name entered");
		
		driver.findElement(By.name(GcrShopLocators.StateProvince_name)).sendKeys(ExcelUtilities.getData("//Users//bhanupriyabojja//eclipse-workspace//GcrShopproject//TestData//TestData1.xlsx",0, 1, 13));
		System.out.println("state entered");
		
		driver.findElement(By.name(GcrShopLocators.Country_name)).sendKeys(ExcelUtilities.getData("//Users//bhanupriyabojja//eclipse-workspace//GcrShopproject//TestData//TestData1.xlsx",0, 1, 14));
		System.out.println("country entered");
		
		driver.findElement(By.name(GcrShopLocators.Password_name)).sendKeys(ExcelUtilities.getData("//Users//bhanupriyabojja//eclipse-workspace//GcrShopproject//TestData//TestData1.xlsx",0, 1, 15));
		System.out.println("password entered");
		
		driver.findElement(By.name(GcrShopLocators.PasswordConfirmation_name)).sendKeys(ExcelUtilities.getData("//Users//bhanupriyabojja//eclipse-workspace//GcrShopproject//TestData//TestData1.xlsx",0, 1, 16));
		System.out.println("pcw entered");
		
		GcrShopMethods.captureScreenShot(driver,"Step3_all_Details_entered","TC1_Screenshots");
		ExcelUtilities.writeresult("//Users//bhanupriyabojja//eclipse-workspace//GcrShopProject//TestData//Results.xlsx", 2, 0, 1, "Step3_all__Details_entered");
		
		driver.findElement(By.xpath(GcrShopLocators.Con_tinue )).click();
		System.out.println("continue clicked");	
		
		
		GcrShopMethods.captureScreenShot(driver,"Step4_continue_clicked","TC1_Screenshots");
		ExcelUtilities.writeresult("//Users//bhanupriyabojja//eclipse-workspace//GcrShopProject//TestData//Results.xlsx", 3, 0, 1, "Step4_continue_clicked");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}  
		  
		  
		  catch(Exception e) {
	          e.printStackTrace();
	          System.out.println("Exception undergone");
	  }
	  }
	  
	  
	  
	  @Test(priority=2)  
	  /* Checking the confirmation message */  
	  public void Check() throws IOException {	  
	   String ConfirmTitle;  
	  ConfirmTitle = "GCR Shop"; 
	  
	  boolean flag = false;  
	  if(driver.getTitle().equalsIgnoreCase(ConfirmTitle)){	  
	  flag = true;
	  System.out.println("registering successfully");
	GcrShopMethods.captureScreenShot(driver, "Step5_Registration_Confirmation_Message","TC1_Screenshots");
	  ExcelUtilities.writeresult("//Users//bhanupriyabojja//eclipse-workspace//GcrShopProject//TestData//Results.xlsx", 1, 2, 0, "Passed"); 
	  ExcelUtilities.writeresult("//Users//bhanupriyabojja//eclipse-workspace//GcrShopProject//TestData//Results.xlsx", 4, 0,1, "Step5_Registration_Confirmed"); 
	  }
	  Assert.assertTrue(flag, "Page title is not matching with expected"); 
	  }
	    
	  
	  @BeforeTest
	  public void beforeTest() throws IOException{  	
		  File dir1 = new File("TC1_Screenshots");  //Specify the Folder name here
			dir1.mkdir( );  
		
		System.setProperty("webdriver.gecko.driver", "//Users/bhanupriyabojja//Downloads//geckodriver");
		driver= new FirefoxDriver();
		
	      driver.manage().window().maximize();
	      System.out.println("Browser initialized");
	      ExcelUtilities.writeresult("//Users//bhanupriyabojja//eclipse-workspace//GcrShopProject//TestData//Results.xlsx", 0, 0, 1, "Step1_Browser_Initialized");
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      GcrShopMethods.captureScreenShot(driver, "Step1_Browser_initialization","TC1_Screenshots");
	} 
	  
	  
	  
	  
	  
	  
	/*@AfterTest()  
	public void afterTest() throws IOException 
	{
		
		driver.close();
	  
	}*/


}