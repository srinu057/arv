package com.test.arv.pages;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.test.arv.controller.ActionMethods;
import com.test.arv.controller.FlowMethods;
import com.test.arv.controller.Report;
import com.test.arv.utility.Constant;

public class LoginPage extends FlowMethods {

	//public WebDriver driver;

	ActionMethods actionMethods = new ActionMethods();
	Logger log = LogManager.getLogger(Amway.class);
	FileInputStream fis=null;
	Properties prop=null;
	public LoginPage() throws IOException
	{
		 fis = new FileInputStream(System.getProperty("user.dir")+"//Objectrepo.Properties");
		 prop = new Properties();
		 prop.load(fis);
	}

	
	public void  navigateToFreshItems(RemoteWebDriver driver)
	{
		try
		{
			//actionMethods.waitFor();
			actionMethods.click(driver,prop.getProperty("Fresh_BT"));
			Report.getInstance().generateReport(Thread.currentThread().getStackTrace()[1].getMethodName()+"getScreenShot", Constant.statusFlag, driver);
		} catch (Exception e) 
		{
			Report.getInstance().generateReport(Thread.currentThread().getStackTrace()[1].getMethodName()+"getScreenShot", Constant.statusFlag, driver);
			log.error("Exception Occured : "+e.getMessage());
		}
	}
	

}