package com.FBAuto.BaseClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public BaseClass() {
		
		String PropfilePath= System.getProperty("user.dir")+"\\src\\main\\java\\com\\FBAuto\\Properties\\config.properties";
		try {
			FileInputStream fis = new FileInputStream(PropfilePath);
			prop = new Properties();
			try {
				prop.load(fis);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
	public static void initialize()
	{
		String Browsername = prop.getProperty("Browser");
	
		if (Browsername.equals("Chrome")) {
			/*
			 * System.setProperty("webdriver.chorme.driver",
			 * "D:\\Selenium\\POM NOV 2020\\chromedriver_win32\\chromedriver.exe");
			 */
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
			driver.get(prop.getProperty("URL"));
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
	}
		
		
		
	}

}
