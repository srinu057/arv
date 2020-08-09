package com.test.arv.utility;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class Constant {
	
	//Browser:
			public static String environment="";		
	
			public static  String browser="";
			//NextGen URL:
			public static String URL ="";
			//MerchantDemoUrl
			public static String MerchantDemoUrl ="";
			//FPXUrl
			public static String FPXUrl ="";
			//unified logi url
			public static String UnifiedUrl ="";
			
			//Data Sheet Path:
			
			public static String Path_TestData =  System.getProperty("user.dir")+"//TestData//SikuliTestData.xlsx";

			//Screenshot path:
			public static  String screenshot_path = "";
		
			//Driver paths:	
			public static  String driverPath_chrome = "";
			public static  String driverPath_ie = "";
			public static String driverPath_FireFox= null;
			public static String dirverPath_edge= null;

			public static String browserType= null;
			
			//BackUp Folder paths:	
			
			public static  String TestData_BackUp_folderName = "";
			public static  String zipFolderName = "";
			public static  String TestResult_BackUp_folderName = "";
			public static  String TestResultData_BackUp_folderName = "";
			public static  String download_dir ="";
			public static  String backUp_download_dir ="";
				
			//Time in secs.
			public static int GLOBAL_MAX_TIMEOUT;
			public static int SLEEP;
			public static int LOADING_TIMEOUT;
			public static int reRun;
			
			//For reporting
	        public static String statusFlag = null;
	        public static String StatusOfMethod= null;
			public static String pathOfScreenshot="";
			public static String capturedScreenshot=null;
			public static ExtentReports extentReporter=null;
			public static ExtentTest extentTest=null;
			public static String pathOfReport = "";
			public static String logsPath= "";
			public static String extentReportConfigFile ="";
			public static String reportPath = "";
			public static String packagePath="";
			public static String pathOfPassedCasesScreePrints = "";
			public static String pathOfFailedCasesScreePrints = "";
			
}