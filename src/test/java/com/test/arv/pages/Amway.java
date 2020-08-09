package com.test.arv.pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.*;
import org.openqa.selenium.WebDriver;
import org.sikuli.api.robot.Key;
import org.sikuli.script.ImagePath;
import org.sikuli.script.Screen;

//import com.test.arv.controller.ActionMethods;
import com.test.arv.controller.ActionMethods;
import com.test.arv.controller.FlowMethods;
import com.test.arv.controller.Report;
import com.test.arv.testData.ModuleTestData;
import com.test.arv.utility.Constant;

public class Amway extends FlowMethods{

	ActionMethods actionMethods = new ActionMethods();
	
	Logger log = LogManager.getLogger(Amway.class);
	FileInputStream fis=null;
	Properties prop=null;
	public Amway() throws IOException
	{
		 fis = new FileInputStream(System.getProperty("user.dir")+"//Objectrepo.Properties");
		 prop = new Properties();
		 prop.load(fis);
	}

	
	public void  navigateToHomeScreen(WebDriver driver)
	{
		try
		{
			//actionMethods.waitFor();
			actionMethods.click(driver,prop.getProperty("HOME_BT"));
			
			Report.getInstance().generateReport(Thread.currentThread().getStackTrace()[1].getMethodName()+"getScreenShot", Constant.statusFlag, driver);
		} catch (Exception e) 
		{
			Report.getInstance().generateReport(Thread.currentThread().getStackTrace()[1].getMethodName()+"getScreenShot", Constant.statusFlag, driver);
			log.error("Exception Occured : "+e.getMessage());
		}
	}
	
	
	public void  navigateToPromotions(WebDriver driver)
	{
		try
		{
			//actionMethods.waitFor();
			actionMethods.click(driver,prop.getProperty("PROMOTIONS_BT"));
			
			Report.getInstance().generateReport(Thread.currentThread().getStackTrace()[1].getMethodName()+"getScreenShot", Constant.statusFlag, driver);
		} catch (Exception e) 
		{
			Report.getInstance().generateReport(Thread.currentThread().getStackTrace()[1].getMethodName()+"getScreenShot", Constant.statusFlag, driver);
			log.error("Exception Occured : "+e.getMessage());
		}
	}
	public void  selectSort(WebDriver driver,String valueToselect)
	{
		try
		{      
			actionMethods.click(driver, prop.getProperty("SORT_BT"));
			actionMethods.dropDown(driver,prop.getProperty("SORT_LIST"),valueToselect);
			Report.getInstance().generateReport(Thread.currentThread().getStackTrace()[1].getMethodName()+"getScreenShot", Constant.statusFlag, driver);
		} catch (Exception e) 
		{
			Report.getInstance().generateReport(Thread.currentThread().getStackTrace()[1].getMethodName()+"getScreenShot", Constant.statusFlag, driver);
			log.error("Exception Occured : "+e.getMessage());
		}
	}
	
	public void  clickProduct(WebDriver driver)
	{
		try
		{
		System.out.println(prop.getProperty("PRODUCT_1").replace("dummy", ModuleTestData.ProductName));	
			actionMethods.click(driver,prop.getProperty("PRODUCT_1").replace("dummy", ModuleTestData.ProductName));
			Report.getInstance().generateReport(Thread.currentThread().getStackTrace()[1].getMethodName()+"getScreenShot", Constant.statusFlag, driver);
		} catch (Exception e) 
		{
			Report.getInstance().generateReport(Thread.currentThread().getStackTrace()[1].getMethodName()+"getScreenShot", Constant.statusFlag, driver);
			log.error("Exception Occured : "+e.getMessage());
		}
	}
	
	public void  clickAddtoCart(WebDriver driver)
	{
		try
		{
	
			actionMethods.click(driver,prop.getProperty("ADDTOCART_BT"));
			Report.getInstance().generateReport(Thread.currentThread().getStackTrace()[1].getMethodName()+"getScreenShot", Constant.statusFlag, driver);
		} catch (Exception e) 
		{
			Report.getInstance().generateReport(Thread.currentThread().getStackTrace()[1].getMethodName()+"getScreenShot", Constant.statusFlag, driver);
			log.error("Exception Occured : "+e.getMessage());
		}
	}
	public void  clickCart(WebDriver driver)
	{
		try
		{
	
			actionMethods.click(driver,prop.getProperty("CART"));
			Report.getInstance().generateReport(Thread.currentThread().getStackTrace()[1].getMethodName()+"getScreenShot", Constant.statusFlag, driver);
		} catch (Exception e) 
		{
			Report.getInstance().generateReport(Thread.currentThread().getStackTrace()[1].getMethodName()+"getScreenShot", Constant.statusFlag, driver);
			log.error("Exception Occured : "+e.getMessage());
		}
	}
	public void  deleteCart(WebDriver driver)
	{
		try
		{
	
			actionMethods.click(driver,prop.getProperty("DELETECART_BT"));
			Report.getInstance().generateReport(Thread.currentThread().getStackTrace()[1].getMethodName()+"getScreenShot", Constant.statusFlag, driver);
		} catch (Exception e) 
		{
			Report.getInstance().generateReport(Thread.currentThread().getStackTrace()[1].getMethodName()+"getScreenShot", Constant.statusFlag, driver);
			log.error("Exception Occured : "+e.getMessage());
		}
	}
	public void  verifyItem(WebDriver driver)
	{
		try
		{
	
			String verifyText=actionMethods.getText(driver,prop.getProperty("ITEAM_CART"));
			System.out.println(verifyText+"Excel"+ModuleTestData.ProductName);
			if(verifyText.equals(ModuleTestData.ProductName))
			 {
				Constant.statusFlag= "Passed";
		     }
			else
			{
			  Constant.statusFlag= "Failed";
			}
			Report.getInstance().generateReport(Thread.currentThread().getStackTrace()[1].getMethodName()+"getScreenShot", Constant.statusFlag, driver);
		} catch (Exception e) 
		{
			Report.getInstance().generateReport(Thread.currentThread().getStackTrace()[1].getMethodName()+"getScreenShot", Constant.statusFlag, driver);
			log.error("Exception Occured : "+e.getMessage());
		}
	}
	
	public void  verifyCartPage(WebDriver driver)
	{
		try
		{
	
			actionMethods.verifyText(driver, prop.getProperty("MYCART"));
			
			Report.getInstance().generateReport(Thread.currentThread().getStackTrace()[1].getMethodName()+"getScreenShot", Constant.statusFlag, driver);
		} catch (Exception e) 
		{
			Report.getInstance().generateReport(Thread.currentThread().getStackTrace()[1].getMethodName()+"getScreenShot", Constant.statusFlag, driver);
			log.error("Exception Occured : "+e.getMessage());
		}
	}
	public void  selectactiveCurrencyRate(Screen screen,String imgPath)
	{
		try
		{
			actionMethods.waitFor();
			actionMethods.scrollDown(screen, imgPath);
			Report.getInstance().generateReport(Thread.currentThread().getStackTrace()[1].getMethodName(), Constant.statusFlag, driver);
		} catch (Exception e) 
		{
			Report.getInstance().generateReport(Thread.currentThread().getStackTrace()[1].getMethodName(), Constant.statusFlag, driver);
			log.error("Exception Occured : "+e.getMessage());
		}
	}
	
/*	public void  selectViewAll(Screen screen,String imgPath)
	{
		try
		{
			//actionMethods.type(screen, Key.PAGE_DOWN);
			//actionMethods.scrollDown(screen, imgPath);
			actionMethods.click(screen, imgPath,1,0);
			Report.getInstance().generateReport(Thread.currentThread().getStackTrace()[1].getMethodName(), Constant.statusFlag, driver);
		} catch (Exception e) 
		{
			Report.getInstance().generateReport(Thread.currentThread().getStackTrace()[1].getMethodName(), Constant.statusFlag, driver);
			log.error("Exception Occured : "+e.getMessage());
		}
	}*/
	
	public void  selectCoreSGF(Screen screen,String imgPath1)
	{
		String status = "";
		try
		{
			actionMethods.scrollDown(screen, imgPath1);
			actionMethods.waitFor();
			Report.getInstance().generateReport(Thread.currentThread().getStackTrace()[1].getMethodName(), Constant.statusFlag, driver);
		} catch (Exception e) 
		{
			status = "Image not found : "+imgPath1;
			Report.getInstance().generateReport(Thread.currentThread().getStackTrace()[1].getMethodName(), Constant.statusFlag+status, driver);
			log.error("Exception Occured : "+e.getMessage());
		}
	}
	
	public void navigateToContributeCoreSGF(Screen screen,String imgPath)
	{
		String status = "";
		try
		{
			//actionMethods.click(screen, imgPath);
			Report.getInstance().generateReport(Thread.currentThread().getStackTrace()[1].getMethodName(), Constant.statusFlag, driver);
		} catch (Exception e) 
		{
			status = "Image not found : "+imgPath;
			Report.getInstance().generateReport(Thread.currentThread().getStackTrace()[1].getMethodName(), Constant.statusFlag+status, driver);
			log.error("Exception Occured : "+e.getMessage());
		}
	}
	
	public void  downloadReport(Screen screen,String imgPath)
	{
		String status = "";
		try
		{
			//actionMethods.click(screen, imgPath);
			Report.getInstance().generateReport(Thread.currentThread().getStackTrace()[1].getMethodName(), Constant.statusFlag, driver);
		} catch (Exception e) 
		{
			status = "Image not found : "+imgPath;
			Report.getInstance().generateReport(Thread.currentThread().getStackTrace()[1].getMethodName(), Constant.statusFlag+status, driver);
			log.error("Exception Occured : "+e.getMessage());
		}
	}
	
	public void doubleClickDownloadBtn(Screen screen,String imgPath)
	{
		String status = "";
		try
		{
			screen.doubleClick(imgPath);
			actionMethods.waitFor();
			Constant.statusFlag= "Passed";
			Report.getInstance().generateReport(Thread.currentThread().getStackTrace()[1].getMethodName(), Constant.statusFlag, driver);
		} catch (Exception e) 
		{
			status = "Image not found : "+imgPath;Constant.statusFlag= "Failed";
			Report.getInstance().generateReport(Thread.currentThread().getStackTrace()[1].getMethodName(), Constant.statusFlag+status, driver);
			log.error("Exception Occured : "+e.getMessage());
		}
	}
	
	public void pageUp()
	{
		try
		{
			actionMethods.pageUp();
			Thread.sleep(2000);
			Report.getInstance().generateReport(Thread.currentThread().getStackTrace()[1].getMethodName(), Constant.statusFlag, driver);
		} catch (Exception e) 
		{
			Report.getInstance().generateReport(Thread.currentThread().getStackTrace()[1].getMethodName(), Constant.statusFlag, driver);
			log.error("Exception Occured : "+e.getMessage());
		}
	}
	
	public void  bookOrder(Screen screen)
	{
		try
		{
			//actionMethods.click(screen, imgPath+"OrderBook.PNG");
			Report.getInstance().generateReport(Thread.currentThread().getStackTrace()[1].getMethodName(), Constant.statusFlag, driver);
		} catch (Exception e) 
		{
			Report.getInstance().generateReport(Thread.currentThread().getStackTrace()[1].getMethodName(), Constant.statusFlag, driver);
			log.error("Exception Occured : "+e.getMessage());
		}
	}
	
	public void selectCurrencyOption(Screen screen, String imgPath)
	{
		try
		{
			//actionMethods.click(screen, imgPath);
			Report.getInstance().generateReport(Thread.currentThread().getStackTrace()[1].getMethodName(), Constant.statusFlag, driver);
		} catch (Exception e) 
		{
			Report.getInstance().generateReport(Thread.currentThread().getStackTrace()[1].getMethodName(), Constant.statusFlag, driver);
			log.error("Exception Occured : "+e.getMessage());
		}
	}
	
	public void enterInputData(Screen screen, String input)
	{
		String status = "";
		try
		{
			actionMethods.type(screen, input);
			Report.getInstance().generateReport(Thread.currentThread().getStackTrace()[1].getMethodName(), Constant.statusFlag, driver);
		} catch (Exception e) 
		{
			status = "Image not found : "+imgPath;
			Report.getInstance().generateReport(Thread.currentThread().getStackTrace()[1].getMethodName(), Constant.statusFlag+status, driver);
			log.error("Exception Occured : "+e.getMessage());
		}
	}
	
	
	public void selectEquityOptions(Screen screen, String imgPath)
	{
		String status = "";
		try
		{
			actionMethods.waitFor();
		//	actionMethods.click(screen, imgPath);
			Thread.sleep(2000);
			Report.getInstance().generateReport(Thread.currentThread().getStackTrace()[1].getMethodName(), Constant.statusFlag, driver);
		} catch (Exception e) 
		{
			status = "Image not found : "+imgPath;Constant.statusFlag= "Failed";
			Report.getInstance().generateReport(Thread.currentThread().getStackTrace()[1].getMethodName(), Constant.statusFlag+status, driver);
			log.error("Exception Occured : "+e.getMessage());
		}
	}
	
	public void selectcurrencyDrivatives(Screen screen, String imgPath)
	{
		String status = "";
		try
		{
			//actionMethods.click(screen, imgPath);
			Report.getInstance().generateReport(Thread.currentThread().getStackTrace()[1].getMethodName(), Constant.statusFlag, driver);
		} catch (Exception e) 
		{
			status = "Image not found : "+imgPath;
			Report.getInstance().generateReport(Thread.currentThread().getStackTrace()[1].getMethodName(), Constant.statusFlag+status, driver);
			log.error("Exception Occured : "+e.getMessage());
		}
	}
	
	public void clickOnSearchIcon(Screen screen, String imgPath)
	{
		String status = "";
		try
		{
			//actionMethods.click(screen, imgPath+"Search.PNG");
			Thread.sleep(2000);
			Report.getInstance().generateReport(Thread.currentThread().getStackTrace()[1].getMethodName(), Constant.statusFlag, driver);
		} catch (Exception e) 
		{
			status = "Image not found : "+imgPath;
			Report.getInstance().generateReport(Thread.currentThread().getStackTrace()[1].getMethodName(), Constant.statusFlag+status, driver);
			log.error("Exception Occured : "+e.getMessage());
		}
	}
	
	public void selectStockOption(Screen screen)
	{
		try
		{
			/*
			actionMethods.click(screen, imgPath+"ARAVIND.PNG");
			actionMethods.click(screen, imgPath+"GetData.PNG");
			actionMethods.click(screen, imgPath+"OK.PNG");*/
			//actionMethods.scrollDown(screen, imgPath+"BEL.PNG");
			//actionMethods.scrollDown(screen, imgPath+"YESBANK.PNG");
			//actionMethods.click(screen, imgPath+"YESBANK.PNG",1,0);
			Report.getInstance().generateReport(Thread.currentThread().getStackTrace()[1].getMethodName(), Constant.statusFlag, driver);
		} catch (Exception e) 
		{
			Report.getInstance().generateReport(Thread.currentThread().getStackTrace()[1].getMethodName(), Constant.statusFlag, driver);
			log.error("Exception Occured : "+e.getMessage());
		}
	}
	
	public void selectStocksOption(Screen screen, String imgPath)
	{
		String status = "";
		try
		{
		//	actionMethods.click(screen, imgPath);
			Report.getInstance().generateReport(Thread.currentThread().getStackTrace()[1].getMethodName(), Constant.statusFlag, driver);
		} catch (Exception e) 
		{
			status = "Image not found : "+imgPath;
			Report.getInstance().generateReport(Thread.currentThread().getStackTrace()[1].getMethodName(), Constant.statusFlag+status, driver);
			log.error("Exception Occured : "+e.getMessage());
		}
	}
	
	public void clickonInstrumentTypeDropdown(Screen screen, String imgPath)
	{
		String status = "";
		try
		{
			//actionMethods.click(screen, imgPath);
			Report.getInstance().generateReport(Thread.currentThread().getStackTrace()[1].getMethodName(), Constant.statusFlag, driver);
		} catch (Exception e) 
		{
			status = "Image not found : "+imgPath;
			Report.getInstance().generateReport(Thread.currentThread().getStackTrace()[1].getMethodName(), Constant.statusFlag+status, driver);
			log.error("Exception Occured : "+e.getMessage());
		}
	}
	
	public void stockOption(Screen screen, String imgPath)
	{
		String status = "";
		try
		{
			//actionMethods.click(screen, imgPath);
			Report.getInstance().generateReport(Thread.currentThread().getStackTrace()[1].getMethodName(), Constant.statusFlag, driver);
		} catch (Exception e) 
		{
			status = "Image not found : "+imgPath;
			Report.getInstance().generateReport(Thread.currentThread().getStackTrace()[1].getMethodName(), Constant.statusFlag+status, driver);
			log.error("Exception Occured : "+e.getMessage());
		}
	}
	
	public void selectStockOptionDropdown(Screen screen)
	{
		String status = "";
		try
		{
		//	actionMethods.click(screen, imgPath+"SymbolSelect.PNG");
			actionMethods.waitFor();
			Report.getInstance().generateReport(Thread.currentThread().getStackTrace()[1].getMethodName(), Constant.statusFlag, driver);
		} catch (Exception e) 
		{
			status = "Image not found : "+imgPath;
			Report.getInstance().generateReport(Thread.currentThread().getStackTrace()[1].getMethodName(), Constant.statusFlag+status, driver);
			log.error("Exception Occured : "+e.getMessage());
		}
	}
	
}


