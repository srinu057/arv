package com.test.arv.controller;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;

public class Android {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		// TODO Auto-generated method stub
		
	    RemoteWebDriver driver;
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("BROWSER_NAME", "Android");
		capabilities.setCapability("VERSION", "6.0.1"); 
		capabilities.setCapability("deviceName","320064ecf04a55c5");
		capabilities.setCapability("platformName","Android");
	 
		capabilities.setCapability("appPackage", "in.amazon.mShop.android.shopping");
		capabilities.setCapability("appActivity","com.amazon.mShop.android.home.HomeActivity");
		driver = new RemoteWebDriver(new URL("http://0.0.0.0:4721/wd/hub"), capabilities);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);	
		WebDriverWait wait=new WebDriverWait(driver, 20);
		
		
		//android.view.View[@content-desc="Fresh"]
		//android.view.View[@content-desc="Pantry"]
		//android.view.View[@content-desc="Video"]
		//android.view.View[@content-desc="Funzone"]
		//android.view.View[@content-desc="eBooks"]
		//android.widget.ImageView[@content-desc="Home"]

		
		 WebElement two=driver.findElement(By.xpath("//android.view.View[@content-desc=\"Fresh\"]"));
		 two.click();
		 WebElement plus=driver.findElement(By.xpath("//android.view.View[@content-desc=\"Pantry\"]"));
		 plus.click();
		 WebElement four=driver.findElement(By.xpath("//android.view.View[@content-desc=\"Video\"]"));
		 four.click();
	
		 WebElement equalTo=driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Equal\"]"));
		 equalTo.click();
	
		   
		   
	}
}