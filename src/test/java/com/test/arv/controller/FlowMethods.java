package com.test.arv.controller;

import java.io.IOException;
import java.net.MalformedURLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.sikuli.script.Screen;

import com.test.arv.pages.Amway;
import com.test.arv.pages.LoginPage;

public class FlowMethods {


	Logger log = LogManager.getLogger(FlowMethods.class);
	public static RemoteWebDriver driver;
	Amway nseHomePage;
	LoginPage loginpage;
	Screen screen;
	public static String imgPath = System.getProperty("user.dir")+"\\src\\test\\resources\\screenshots\\";

	public void login(String moduleName)
	{
		ActionMethods actionMethods = new ActionMethods();

		driver = actionMethods.openBrowser();
		actionMethods.launchURL();
		actionMethods.waitFor();
	}
	public void loginMobile(String moduleName) throws IOException
	{
		ActionMethods actionMethods = new ActionMethods();

		driver = actionMethods.openMobile();
		//actionMethods.launchURL();
		actionMethods.waitFor();
	}

	public void addItemtoCart(String moduleNmae)
	{
		try
		{
			nseHomePage = new Amway();
			nseHomePage.navigateToHomeScreen(driver);
			nseHomePage.navigateToPromotions(driver);
			nseHomePage.selectSort(driver,"Price: Low to High");
			nseHomePage.clickProduct(driver);
			nseHomePage.clickAddtoCart(driver);
			nseHomePage.clickCart(driver);
			nseHomePage.verifyCartPage(driver);
			nseHomePage.verifyItem(driver);
		
		} catch (Exception e) {

			log.info("selectCurrencyRates Failed : "+e.getMessage());
		}
	}
	
	public void deleteItemFromCart(String moduleNmae)
	{
		try
		{
			nseHomePage = new Amway();
			nseHomePage.navigateToHomeScreen(driver);
			nseHomePage.navigateToPromotions(driver);
			nseHomePage.selectSort(driver,"Price: Low to High");
			nseHomePage.clickProduct(driver);
			nseHomePage.clickAddtoCart(driver);
			nseHomePage.clickCart(driver);
			nseHomePage.verifyCartPage(driver);
			nseHomePage.verifyItem(driver);
			nseHomePage.deleteCart(driver);

		} catch (Exception e) {

			log.info("selectCurrencyRates Failed : "+e.getMessage());
		}
	}
	
	public void mobileFreshItems(String moduleNmae)
	{
		try
		{
			loginpage = new LoginPage();
			loginpage.navigateToFreshItems(driver);
			
		

		} catch (Exception e) {

			log.info("selectCurrencyRates Failed : "+e.getMessage());
		}
	}
	public void downloadCoreSGFReports(String moduleNmae)
	{
		try
		{
			nseHomePage = new Amway();
			screen = new Screen();
		//	nseHomePage.navigateToHomeScreen(screen, imgPath+"Home.PNG");
			nseHomePage.selectCoreSGF(screen, imgPath+"CoreSGF.PNG");
			Thread.sleep(2000);
			nseHomePage.navigateToContributeCoreSGF(screen, imgPath+"ContributeCoreSGF.PNG");
			nseHomePage.doubleClickDownloadBtn(screen, imgPath+"DownloadBtn.PNG");
			nseHomePage.downloadReport(screen,imgPath+"Save.PNG");

		} catch (Exception e) {

			log.info("downloadCoreSGFReports Failed : "+e.getMessage());
		}
	}
	public void selectStockDerivatives(String moduleNmae)
	{
		try
		{
			nseHomePage = new Amway();
			screen = new Screen();
		//	nseHomePage.navigateToHomeScreen(screen, imgPath+"Home.PNG");
			nseHomePage.selectEquityOptions(screen, imgPath+"Equity.PNG");
			nseHomePage.selectcurrencyDrivatives(screen, imgPath+"CurrencyDerivaties.PNG");
			nseHomePage.clickOnSearchIcon(screen, imgPath);
			nseHomePage.enterInputData(screen, "in");
			nseHomePage.selectCurrencyOption(screen, imgPath+"USDoller.PNG");
			nseHomePage.bookOrder(screen);
			nseHomePage.selectStocksOption(screen, imgPath+"StockRB.PNG");
			nseHomePage.clickonInstrumentTypeDropdown(screen, imgPath+"InstrumentType.PNG");
			nseHomePage.stockOption(screen, imgPath+"StockOptions.PNG");
			nseHomePage.selectStockOptionDropdown(screen);
			nseHomePage.selectStockOption(screen);
            
			//screen.click("YESBANK");
		} catch (Exception e) {

			log.info("downloadCoreSGFReports Failed : "+e.getMessage());
		}

	}


}


