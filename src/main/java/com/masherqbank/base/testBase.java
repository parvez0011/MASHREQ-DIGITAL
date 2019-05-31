package com.masherqbank.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import com.masherqbank.utility.TestUtil;

public class testBase {
	
	public static WebDriver driver;
	public static Properties prop;

	public testBase() {
		prop = new Properties();
		
		try {
			FileInputStream reader = new FileInputStream("src\\main\\java\\com\\masherqbank\\config\\config.properties");
			try {
				prop.load(reader);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void initialization () {
		String browserName = prop.getProperty("browser");
		TestUtil.log("browser name : "+browserName);
		if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","src\\test\\resources\\selenium-drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		else if(browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver","src\\test\\resources\\selenium-drivers\\geckodriver.exe");
			driver = new ChromeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
	    }
	
    public void launchApplication() {
        String appUrl = prop.getProperty("url");
        driver.get(appUrl);
        TestUtil.log("[INFO]: Product URL :::: " + appUrl);
	}
	
	public void closeBrowsers() {
		driver.quit();
		TestUtil.log("[INFO]: Session completed");
	}
	
}
