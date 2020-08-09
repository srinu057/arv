package com.test.arv.controller;
import org.apache.logging.log4j.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.test.arv.excelAPI.*;
import com.test.arv.utility.*;

public class Runner {

	public RemoteWebDriver driver;
	static Logger log = LogManager.getLogger(Runner.class);

  public static void main(String args[]) throws InterruptedException {
		ExcelOperation excelOpr = new ExcelOperation();
		try 
		{
			log.info("Before Temp File Creation in First Iteration :");
			excelOpr.createTempFile(0);
			log.info("After Temp File Creation in First Iteration :");
			ExcelOperation.readExecutionVariables(0);

			log.info("Actual Execution in First Iteration is started");
			excelOpr.readTestSuite();
			log.info("Actual Execution in First Iteration is started");

			//Generate Report and Close the Report
			exitMethod();		

			//Update Passed and Failed Journeys count - As per extent report data
			//excelOpr.updateResultSetCount();

			int failedCaseCount=0;
		//	failedCaseCount = excelOpr.markFailedCasesAlone();
			int value = Constant.reRun;

			for(int iteration=1;iteration <= value;iteration++)
			{
				if(failedCaseCount>0)
				{
					excelOpr.createTempFile(iteration);
					ExcelOperation.readExecutionVariables(iteration);
					excelOpr.readTestSuite();

					//Generate Report and Close the Report
					exitMethod();
					//Update Passed and Failed Journeys count - As per extent report data
					//excelOpr.updateResultSetCount();
					failedCaseCount = excelOpr.markFailedCasesAlone();
				}
				else
					break;
			}

		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

		public static void exitMethod()	{
			log.info("Generating Report Started in :" + Thread.currentThread().getName());
			Constant.extentReporter.flush();
			Constant.extentReporter.close();
			log.info("Report Generated successfully");
		}

		public static void execute_Actions(String flowID,String testSuiteModuleName) throws Exception {
			FlowMethods flowMethods = new FlowMethods();
			flowMethods.getClass().getMethod(flowID.trim(), String.class).invoke(flowMethods, testSuiteModuleName);
		}		
}


