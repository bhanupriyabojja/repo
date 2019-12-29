package com.gcrShop.CommonMethods;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class GcrShopMethods {
	public static void captureScreenShot(WebDriver ldriver, String value, String folder) throws IOException{
		// Take screenshot and store as a file format             
		 File src=((TakesScreenshot)ldriver).getScreenshotAs(OutputType.FILE);  
 		try {
		// now copy the  screenshot to desired location using copyFile method		 
		FileUtils.copyFile(src, new File("//Users//bhanupriyabojja//eclipse-workspace//GcrShopProject//"+folder+"//"+value+".png"));                              
		}
		catch (IOException e)		 
		{
		  System.out.println(e.getMessage()); 
		}
		  }

}
