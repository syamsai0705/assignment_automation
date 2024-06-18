package com.base;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.FileInputStream;
import java.util.Properties;



public class Util  {
	static FileInputStream fis = null;
	static Properties prop;
	
	//takeScreenshot code
	public static byte[] takeScreenShot()
	{
		return ((TakesScreenshot) BrowserDriverFactory.getDriver()).getScreenshotAs(OutputType.BYTES);
	}
	
	//creating a read property file method or code
	public static String readProperties(String key)
	{
		String path = System.getProperty("user.dir")+"/src/main/resources/config.properties";
		Properties prop= new Properties();
		
		try {
			fis=new FileInputStream(path);
			
			prop.load(fis);
		} 
		catch (Exception e) {
		e.printStackTrace();
		}
		
		return prop.getProperty(key);
	}

}
