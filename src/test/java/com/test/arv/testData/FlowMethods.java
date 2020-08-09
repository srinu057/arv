package com.test.arv.testData;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.sikuli.script.Key;
import org.sikuli.script.Pattern;
import org.sikuli.script.Region;
import org.sikuli.script.Screen;

import com.test.arv.controller.ActionMethods;
import com.test.arv.pages.Amway;

public class FlowMethods {

	static ActionMethods actions;
	public static void main(String[] args) throws Exception {
		createSampleTest();
		
	}
	Logger log = LogManager.getLogger(FlowMethods.class);
	public static WebDriver driver;
	Amway nseHomePage;
	Screen screen;
	String imgPath = System.getProperty("user.dir")+"\\src\\test\\resources\\screenshots\\";

	public static void createSampleTest() throws Exception
	{
		actions = new ActionMethods();
		System.setProperty("webdriver.chrome.driver", "C:\\Git_Sikuli\\sikuli\\Aussie\\lib\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("disable-extensions");
		co.addArguments("test-type");
		co.addArguments("--start-maximized");
		co.addArguments("disable-infobars");
		//co.setPageLoadStrategy(PageLoadStrategy.NONE);
		co.setExperimentalOption("useAutomationExtension", false);
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability(ChromeOptions.CAPABILITY, co);
		// To set download path
		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
		chromePrefs.put("profile.default_content_settings.popups", 0);
		co.setExperimentalOption("prefs", chromePrefs);
		capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		capabilities.setCapability(ChromeOptions.CAPABILITY, co);
		driver = new ChromeDriver(co);
		driver.manage().deleteAllCookies();
		driver.get("https://www.nseindia.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		Screen screen = new Screen();
		String img;
		/*String sourcePath = System.getProperty("user.dir");
		String imagePath = sourcePath+"\\src\\test\\resources\\Screenshots\\";
		Pattern fileInput = new Pattern(imagePath+"Investor.PNG");
		Pattern fileInput1 = new Pattern(imagePath+"MostActive.PNG");
		Region region = new Region(screen);
		screen.click("C:\\Git_Sikuli\\sikuli\\Aussie\\src\\test\\resources\\screenshots\\Home.PNG");
		Thread.sleep(2000);
		img = "C:\\Git_Sikuli\\sikuli\\Aussie\\src\\test\\resources\\screenshots\\MostActive.PNG";

		 actions.scrollDown(screen, img);
		 img = "C:\\Git_Sikuli\\sikuli\\Aussie\\src\\test\\resources\\screenshots\\ViewAll.PNG";
		 actions.scrollDown(screen, img);
		 actions.click(screen, img, 1, 1);*/
		 
		/* System.out.println("TestCase 2");
		 screen.click("C:\\Git_Sikuli\\sikuli\\Aussie\\src\\test\\resources\\screenshots\\Home.PNG");
		 img = "C:\\Git_Sikuli\\sikuli\\Aussie\\src\\test\\resources\\screenshots\\CoreSGF.PNG";
		 actions.scrollDown(screen, img);
		 Thread.sleep(6000);
		 img = "C:\\Git_Sikuli\\sikuli\\Aussie\\src\\test\\resources\\screenshots\\ContributeCoreSGF.PNG";
	     screen.click(img);
		 Thread.sleep(2000);
		 img = "C:\\Git_Sikuli\\sikuli\\Aussie\\src\\test\\resources\\screenshots\\DownloadBtn.PNG";
		 screen.type(Key.PAGE_UP);
		 Thread.sleep(2000);
		 screen.doubleClick(img);
		// Keyboard keyboard = new DesktopKeyboard();
		// keyboard.type("C:\\Git_Sikuli\\sikuli\\Aussie\\src\\test\\resources\\screenshots");
		 img = "C:\\Git_Sikuli\\sikuli\\Aussie\\src\\test\\resources\\screenshots\\Save.PNG";
		 Thread.sleep(2000);
		 screen.click(img);*/
		System.out.println("TestCase : 3");
		screen.click("C:\\Git_Sikuli\\sikuli\\Aussie\\src\\test\\resources\\screenshots\\Home.PNG");
		img = "C:\\Git_Sikuli\\sikuli\\Aussie\\src\\test\\resources\\screenshots\\Equity.PNG";
		Thread.sleep(4000);
		screen.click(img);
	    img = "C:\\Git_Sikuli\\sikuli\\Aussie\\src\\test\\resources\\screenshots\\CurrencyDerivaties.PNG";
	    screen.click(img);
	    img = "C:\\Git_Sikuli\\sikuli\\Aussie\\src\\test\\resources\\screenshots\\Search.PNG";
	    screen.click(img);
	    screen.type("in");
	    img = "C:\\Git_Sikuli\\sikuli\\Aussie\\src\\test\\resources\\screenshots\\USDoller.PNG";
	    screen.click(img);
	    img = "C:\\Git_Sikuli\\sikuli\\Aussie\\src\\test\\resources\\screenshots\\OrderBook.PNG";
	    screen.click(img);
	    img = "C:\\Git_Sikuli\\sikuli\\Aussie\\src\\test\\resources\\screenshots\\StockRB.PNG";
	    screen.click(img);
	    img = "C:\\Git_Sikuli\\sikuli\\Aussie\\src\\test\\resources\\screenshots\\InstrumentType.PNG";
	    screen.click(img);
	    img = "C:\\Git_Sikuli\\sikuli\\Aussie\\src\\test\\resources\\screenshots\\StockOptions.PNG";
	    screen.click(img);
	    img = "C:\\Git_Sikuli\\sikuli\\Aussie\\src\\test\\resources\\screenshots\\SymbolSelect.PNG";
	    screen.click(img);
	    img = "C:\\Git_Sikuli\\sikuli\\Aussie\\src\\test\\resources\\screenshots\\SymbolDropdown.PNG";
	    if(actions.imageExist(screen, img))
	    {
	    	img = "C:\\Git_Sikuli\\sikuli\\Aussie\\src\\test\\resources\\screenshots\\YESBANK.PNG";
	    	actions.scrollDown(screen, img);
	    	//screen.click("YESBANK");
	    	//actions.click(screen, img,1,0);
	    } else
	    	System.out.println("not found");
	}
	
	
	
	
	
	public void selectActiveStocks(String moduleNmae)
	{
		try
		{
			String imgPath = "";
			nseHomePage = new Amway();
			imgPath = System.getProperty("user.dir")+"\\";
		//	nseHomePage.navigateToHomeScreen(screen, imgPath);
		} catch (Exception e) {
		
			log.info("selectActiveStocks Failed : "+e.getMessage());
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
}


