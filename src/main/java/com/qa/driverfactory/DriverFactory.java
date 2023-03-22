package com.qa.driverfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {

	 public WebDriver driver;
	 
	 public WebDriver initDriver(String browser) {
		 
		 System.out.println("Running the automation script on : "+browser);
		 
		 if(browser.trim().equalsIgnoreCase("chrome")) {
			 WebDriverManager.chromedriver().setup();
			 driver=new ChromeDriver();
		 }
		 
		 else if(browser.trim().equalsIgnoreCase("edge")) {
			 WebDriverManager.edgedriver().setup();
			 driver=new EdgeDriver();
		 }
		 
		 else if(browser.trim().equalsIgnoreCase("firefox")) {
			 WebDriverManager.firefoxdriver().setup();
			 driver=new FirefoxDriver();
		 }
		 else {
			 System.out.println("Pass the right driver");
		 }
		 
		 driver.manage().deleteAllCookies();
		 driver.manage().window().maximize();
		 driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		 return driver;
	 }
}
